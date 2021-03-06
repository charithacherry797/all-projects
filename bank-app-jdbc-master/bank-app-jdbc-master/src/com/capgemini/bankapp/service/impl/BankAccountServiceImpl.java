package com.capgemini.bankapp.service.impl;

import java.util.List;

import org.apache.log4j.Logger;

import com.cagemini.bankapp.exception.BankAccountNotFoundException;
import com.cagemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.dao.impl.BankAccountDaoImpl;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.BankAccountService;
import com.capgemini.bankapp.util.DbUtil;

public class BankAccountServiceImpl implements BankAccountService {

	private BankAccountDao bankAccountDao;
	static final Logger logger = Logger.getLogger(BankAccountServiceImpl.class);

	public BankAccountServiceImpl() {
		bankAccountDao = new BankAccountDaoImpl();
	}

	@Override
	public double checkBalance(long accountId) throws BankAccountNotFoundException {

		double balance = bankAccountDao.getBalance(accountId);
		if (balance >= 0)
			return balance;
		throw new BankAccountNotFoundException("BankAccount doesn't exist..");
	}

	@Override
	public double withdraw(long accountId, double amount) throws LowBalanceException, BankAccountNotFoundException {
		double balance = bankAccountDao.getBalance(accountId);
		if (balance < 0)
			throw new BankAccountNotFoundException("Bank Account doesn't exist..");
		else if (balance - amount >= 0) {
			balance = balance - amount;
			bankAccountDao.updateBalance(accountId, balance);
			DbUtil.commit();
			return balance;
		} else {
			throw new LowBalanceException("You don't have sufficient fund");
		}
	}

	public double withdrawForFundTransfer(long accountId, double amount)
			throws LowBalanceException, BankAccountNotFoundException {
		double balance = bankAccountDao.getBalance(accountId);
		if (balance < 0)
			throw new BankAccountNotFoundException("Bank Account doesn't exist..");
		else if (balance - amount >= 0) {
			balance = balance - amount;
			bankAccountDao.updateBalance(accountId, balance);
			return balance;
		} else {
			throw new LowBalanceException("You don't have sufficient fund");
		}
	}

	@Override
	public double deposit(long accountId, double amount) throws BankAccountNotFoundException {
		double balance = bankAccountDao.getBalance(accountId);
		if (balance < 0)
			throw new BankAccountNotFoundException("Bank Account doesn't exist");
		balance = balance + amount;
		bankAccountDao.updateBalance(accountId, balance);
		DbUtil.commit();
		return balance;
	}

	@Override
	public boolean deleteBankAccount(long accountId) throws BankAccountNotFoundException {
		boolean result= bankAccountDao.deleteBankAccount(accountId);
		if(result) {
			DbUtil.commit();
			return result;
		}
		throw new BankAccountNotFoundException("Bank Account doesn't exist.");
	}

	@Override
	public double fundTransfer(long fromAccount, long toAccount, double amount)
			throws LowBalanceException, BankAccountNotFoundException {
		try {
			double newBalance = withdrawForFundTransfer(fromAccount, amount);
			deposit(toAccount, amount);
			DbUtil.commit();
			return newBalance;
		} catch (LowBalanceException | BankAccountNotFoundException e) {
			DbUtil.rollback();
			logger.error("Exception", e);
			throw e;
		}
	}

	@Override
	public boolean addNewBankAccount(BankAccount account) {
		boolean result=bankAccountDao.addNewBankAccount(account);
		if(result)
			DbUtil.commit();
		return result;
	}

	@Override
	public List<BankAccount> findAllBankAccounts() {
		return bankAccountDao.findAllBankAccounts();
	}

	@Override
	public BankAccount searchAccount(long accountId) throws BankAccountNotFoundException {
		BankAccount account= bankAccountDao.searchAccount(accountId);
		if(account == null)
			throw new BankAccountNotFoundException("Bank Account doesn't exist");
		return account;
	}

	@Override
	public boolean updateAccount(long accountId, String accountHolderName, String accountType) {
		return bankAccountDao.updateAccountDetails(accountId, accountHolderName, accountType);
	}

}
