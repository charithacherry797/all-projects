package com.capgemini.spring.math;

import org.springframework.stereotype.*;

@Component
public class CalculatorExample implements Calculator{
	public int add(int num1,int num2){
		return num1+num2;
	}
	
	public int divide(int num1,int num2){
		return num1/num2;
	}
}