package com.coforge.training.mockitoDemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class MathApplicationTest {
	
	
@InjectMocks//It is uesd to creaate and used mock object
MathApplication mathApplication;

@Mock//
CalculatorService calcService;
	
	@BeforeEach
	void setUp() throws Exception {
	
		mathApplication=new MathApplication();
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testSetCalcService() {

	
	}

	@Test
	void testAdd() {
		//add the behavior of calculator service to add two no
when(calcService.add(10.0, 20.0)).thenReturn(30.00);

//test the add functionality
assertEquals(mathApplication.add(10.0, 20.0), 30.0);

//verify the behavior
verify(calcService).add(10.0,20.0);
System.out.println(verify(calcService).add(10.0, 20.0));
	}

	@Test
	void testSubtract() {
		//subtract the behavior of calculator service to subtract two no
		when(calcService.subtract(20.0, 10.0)).thenReturn(10.00)	;

		//test the add functionality
		assertEquals(mathApplication.subtract(20.0, 10.0), 10.0);

		//verify the behavior
		verify(calcService).subtract(20.0, 10.0);
		System.out.println(verify(calcService).subtract(20.0, 10.0));	}

	@Test
	void testMultiply() {
		//Multiply the behavior of calculator service to multiply two no
			when(calcService.multiply(10.0, 20.0)).thenReturn(200.0);
		
		//test the add functionality
			assertEquals(mathApplication.multiply(10.0, 20.0), 200.0);
		
		//verify the behavior

		verify(calcService).multiply(10.0, 20.0);
		System.out.println(verify(calcService).multiply(10.0, 20.0));
		}
	

	@Test
	void testDivide() {
		//divide the behavior of calculator service to divide two no
		when(calcService.divide(20.0, 10.0)).thenReturn(2.0)	;

		//test the add functionality
		assertEquals(mathApplication.divide(20.0, 10.0), 2.0);

		//verify the behavior
		verify(calcService).divide(20.0, 10.0);
		System.out.println(verify(calcService).divide(20.0, 10.0));	}
	}


