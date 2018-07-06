package _JUnit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalc {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println( "DEFORE CLASS");//dopisali dly informativnoste
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AFTER CLASS"); //dopisali dly informativnoste
	}

	private Calc c; //chtobe ne rugalsy pre vedelenee "new Calc"

	@Before
	public void setUp() throws Exception {
		System.out.println("Before");//dopisali dly informativnoste
		
		c=new Calc();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");//dopisali dly informativnoste
	}

	@Test
	public void testAdd() {
		assertEquals(7, c.add(5, 2));//assertEquals(expected, actual); zdes pravilno napesale

	}
 
	@Test
	public void testDiv() {
		assertEquals(4, c.div(10, 5));//zdes NE pravilno napesale
	}
    
	@Test (expected=ArithmeticException.class)                            // posle slova Test dopesevaem "expected=ArithmeticException.class", to est' to chego ojedaem
	public void testDiv2() {
		
		c.div(4, 0);
	}
}
