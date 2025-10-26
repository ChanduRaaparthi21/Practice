package com.chandu.Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator calculator;
	
	@BeforeEach
	void setUp() {
		 calculator = new Calculator();
	}
	
	
	@Test
	void addTest() {
		
		assertEquals(22, calculator.add(12, 10));
		
	}

}
