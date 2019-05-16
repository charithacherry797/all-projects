package com.capgemini.inheritanceperhierarchy.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contractemployee")  
public class ContractEmployee extends Employee {

	@Column(name="pay_per_hour")
	private float payPerHour;
	
	@Column(name="contract_duration")
	private String contractDuration;
	
	public ContractEmployee() {
		super();
	}
	
	
	public ContractEmployee(int employeeId, String employeeName,float payPerHour, String contractDuration) {
		super(employeeId, employeeName);
		this.payPerHour = payPerHour;
		this.contractDuration = contractDuration;
	}


	public float getPayPerHour() {
		return payPerHour;
	}


	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}


	public String getContractDuration() {
		return contractDuration;
	}


	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}


	@Override
	public String toString() {
		return "ContractEmployee [payPerHour=" + payPerHour + ", contractDuration=" + contractDuration + "]";
	}
	
	
	
	
}
