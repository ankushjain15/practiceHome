package com.junitTest;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestCalculator {

	@Test
	public void testAdd()
	{
		Calculator calc = new Calculator();
		assertEquals(28,calc.add(11,13,4));
	}
	
	@Test
	public void testMultiply()
	{
		Calculator calc = new Calculator();
		assertEquals(81, calc.multiply(9,3,3));
	}
}
