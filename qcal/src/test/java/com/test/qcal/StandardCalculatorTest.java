package com.crio.qcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class StandardCalculatorTest {

	@Test
	void testAdd() {
		StandardCalculator calc = new StandardCalculator();
		calc.add(1, 1);
		assertEquals(2, calc.getResult());
	}

	@Test
	void testSubtract() {
		StandardCalculator calc = new StandardCalculator();
		calc.subtract(1, 1);
		assertEquals(0, calc.getResult());
	}


	


}

