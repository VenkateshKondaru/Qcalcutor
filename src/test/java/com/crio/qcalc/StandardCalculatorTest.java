package com.crio.qcalc;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.crio.qcalc.business.StandardCalculator;


public class StandardCalculatorTest {

	private StandardCalculator standardCalculator;


	@BeforeEach
	void setup(){
		standardCalculator = new StandardCalculator();
	}


	@Test
	@DisplayName("Test Addition of Two Integers")
	void testAdditionOperation(){
		standardCalculator.add(1,1);
		Assertions.assertEquals(2, standardCalculator.getResult());
	}


	@Test
	@DisplayName("Test Subtraction of Two Integers")
	void testSubtractionOperation(){
		standardCalculator.subtract(1,1);
		Assertions.assertEquals(0, standardCalculator.getResult());
	}

	@Test
	@DisplayName("Test Multiplication of Two Integers")
	void testMultiplicationOperation() {
		standardCalculator.multiply(10,2);
		Assertions.assertEquals(20, standardCalculator.getResult());
	}

	@Test
	@DisplayName("Test Division of Two Integers")
	void testDivisionOperation() {
		standardCalculator.divide(10,2);
		Assertions.assertEquals(5, standardCalculator.getResult());
	}


	@Test
	@DisplayName("Test Addition of Two Doubles")
	void testAdditionOperationForDoubles(){
		standardCalculator.add(1.0,1.5);
		Assertions.assertEquals(2.5, standardCalculator.getResult());
	}


	@Test
	@DisplayName("Test Subtraction of Two Doubles")
	void testSubtractionOperationForDoubles(){
		standardCalculator.subtract(10.0,20.5);
		Assertions.assertEquals(-10.5, standardCalculator.getResult());
	}


	@Test
	@DisplayName("Test Multiplication of Two Doubles")
	void testMultiplicationOperationForDoubles() {
		standardCalculator.multiply(10.0,20.0);
		Assertions.assertEquals(200.00, standardCalculator.getResult());	
	}


	@Test
	@DisplayName("Test Division of Two Doubles")
	void testDivisionOperationForDoubles() {
		standardCalculator.divide(10.0,2.0);
		Assertions.assertEquals(5.00, standardCalculator.getResult());	
	}



	@Test
	@DisplayName("Test Division of 0 by 2")
	void testDivisionOperationOf0by2() {
		standardCalculator.divide(0,2);
		Assertions.assertEquals(0, standardCalculator.getResult());
	}

	@Test
	@DisplayName("Test Addition Overflow of Two Doubles")
	void testAdditionOverflowForDoubles(){
		Assertions.assertThrows(ArithmeticException.class,new Executable(){
			@Override
			public void execute() throws Throwable{
				standardCalculator.add(Double.MAX_VALUE, Double.MAX_VALUE);
			}
		});
	}


	@Test
	@DisplayName("Test Subtraction Overflow of Two Doubles")
	void testSubtractionOverflowForDoubles(){
		
		Assertions.assertThrows(ArithmeticException.class,new Executable(){
			@Override
			public void execute() throws Throwable{
				standardCalculator.subtract(-Double.MAX_VALUE, Double.MAX_VALUE);
			}
		});
	}

	@Test
	@DisplayName("Test Division Overflow of Two Doubles")
	void testDivisionOverflowForDoubles(){
		Assertions.assertThrows(ArithmeticException.class,new Executable(){
			@Override
			public void execute() throws Throwable{
				standardCalculator.divide(Double.MAX_VALUE, Double.MIN_VALUE);
			}
		});
		Assertions.assertThrows(ArithmeticException.class,new Executable(){
			@Override
			public void execute() throws Throwable{
				standardCalculator.divide(Double.MAX_VALUE, 0);
			}
		});
		Assertions.assertThrows(ArithmeticException.class,new Executable(){
			@Override
			public void execute() throws Throwable{
				standardCalculator.divide(20, 0);
			}
		});
	}


	@Test
	@DisplayName("Test Multiplication Overflow of Two Doubles")
	void testMultiplicationOverflowForDoubles(){
		
		Assertions.assertThrows(ArithmeticException.class,new Executable(){
			@Override
			public void execute() throws Throwable{
				standardCalculator.multiply(Double.MAX_VALUE, Double.MAX_VALUE);
			}
		});
		Assertions.assertThrows(ArithmeticException.class,new Executable(){
			@Override
			public void execute() throws Throwable{
				standardCalculator.multiply(Double.MAX_VALUE, 2);
			}
		});
	}
}

