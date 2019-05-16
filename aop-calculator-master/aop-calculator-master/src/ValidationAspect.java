package com.capgemini.spring.aspect;

import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;

@Component
@Aspect
public class ValidationAspect{

	
	/*@Around("execution(* com.capgemini.spring.math.CalculatorExample.add(..))")
	public void validateAdd(ProceedingJoinPoint pjp) throws Throwable{
		Object[] args=pjp.getArgs();
		int firstArg = Integer.parseInt(args[0].toString());
		int secondArg= Integer.parseInt(args[1].toString());
		if(firstArg>0 && secondArg>0){
			pjp.proceed();
		}
		else {
			System.out.println("Parameter cannot be zero or less");
		}
	}
	
	@Around("execution(* com.capgemini.spring.math.CalculatorExample.divide(..))")
	public void validateDivide(ProceedingJoinPoint pjp) throws Throwable{
		Object[] args= pjp.getArgs();
		int secondArg= Integer.parseInt(args[1].toString());
		if(secondArg != 0) {
			pjp.proceed();
		}
		else {
			System.out.println("parameter cannot be zero");
		}
	} */

	/*@AfterReturning(pointcut="execution(* com.capgemini.spring.math.CalculatorExample.add(..))",returning="result")
	public void validateAdd(JoinPoint jp , int result) throws Throwable{
		System.out.println(+result);
	}

	@AfterReturning(pointcut="execution(* com.capgemini.spring.math.CalculatorExample.divide(..))",returning="result")
	public void validateDivide(JoinPoint jp ,int result) throws Throwable{
			System.out.println(+result);
	} */



}