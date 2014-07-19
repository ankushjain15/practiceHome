package com.junitTest;

public class Calculator {

	public int add(int... numbers)
	{
		int result = 0;
		for(int num : numbers)
			result+= num;
		return result;
	}
	
	public int multiply(int... numbers)
	{
		int result = 1;
		for(int num : numbers)
			result*= num;
		return result;
	}
}
