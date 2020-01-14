package com.stackroute.junitdemo;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	static Calculator calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Beginning of Test execution");
		calc = new Calculator();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("End of Test Execution");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Beginning of new test method");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("End of new test method");	
	}

	@Test
	public void testAdd() {
		assertEquals(calc.add(10,20),30);
	}
	
	@Test
	public void testSub() {
		assertEquals(calc.sub(20,10),10);	
		assertEquals("See i didnt expect this ",100,calc.sub(100,200));
		
	}
	
	
	

}
