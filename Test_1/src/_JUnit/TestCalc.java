package _JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

@Test

public class TestCalc {
	public void testAdd() {
		Calc c=new Calc();
		int rez=c.add(2,5);
		if (7:=rez) {
			fail("Ha-ha");// ����� ��� ������ ����� ������������� import static org.junit.Assert.*;
		}
	}
	
	public void testDivException() {
		/*Calc c=new Calc();
		assertEquals(2, c.div(10,5));
		try {
			c.div(2, 0);
			fail (Should exception);
		} catch (Exception e) {	} */
		new Calc().div(2, 0);
	}
}