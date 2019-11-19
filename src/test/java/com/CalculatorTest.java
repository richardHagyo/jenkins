package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calc;
	
	@BeforeEach
	public void init()
	{
		calc = new Calculator();
	}
	
	@Test
	public void testAdd()
	{
		long result = calc.add(12, 6);
		
		assertEquals(18, result);
	}
	
}
