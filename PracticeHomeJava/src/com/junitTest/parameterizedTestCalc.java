package com.junitTest;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class parameterizedTestCalc {
	
	private int multiplier;

	public parameterizedTestCalc(int testParameter)
	{
		this.multiplier = testParameter;
	}
	
	@Parameters
	public static Collection<Object[]> data()
	{
		Object[][] data = new Object[][]{{1},{3},{4}};
		return Arrays.asList(data);
	}
	
	@Test
	public void testParameterizedCalc() {
		Calculator calc = new Calculator();
		assertEquals(multiplier*multiplier, calc.multiply(multiplier,multiplier));
	}

}
