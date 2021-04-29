package com.tyss.junit.project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.tyss.project.MathUtial;

class MathUnitTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		MathUtial mu = new MathUtial();
		int exp= 10;
		int act = mu.addNumber(5, 5);
		assertEquals(exp, act,"this the error becouse of the input is not matcing");
		
	}
	void testAreaofCircle() {
		MathUtial mathu = new MathUtial();
		
	}

}
