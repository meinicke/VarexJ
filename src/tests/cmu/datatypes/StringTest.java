package cmu.datatypes;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Ignore;
import org.junit.Test;

public class StringTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	@Conditional
	static boolean x = true;
	@Conditional
	static boolean y = true;
	@Conditional
	static boolean z = true;

	@Test
	public void printlnTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			System.out.println("Start");
			if (x) {
				System.out.println("X");
			}
			if (y) {
				System.out.println("Y");
			}
		}
	}
	
	@Test
	public void printConditionalTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int i = 1;
			if (x) {
				i++;
			}
			System.out.println(i);		
		}
	}
	
	@Test
	public void concatenationTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String s = "A";
			if (x) {
				s = s + "X";
			}
			
			if (x) {
				assertEquals("AX", s);
				System.out.println(s);
			} else {
				assertEquals("A", s);
				System.out.println(s);
			}
			System.out.println("----------------------");
			
			System.out.println(y);
			System.out.println(s);
		}
	}
	
	@Ignore @Test// TODO implement
	public void concatenationTest2() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String s = "A";
			if (x) {
				s = s + "X";
			}
			
			System.out.println(y + s);
		}
	}
	
	@Ignore @Test// TODO implement
	public void concatenationTest3() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String s1 = "A";
			if (x) {
				s1 = "X";
			}
			
			String s2 = "1";
			if (y) {
				s2 = "2";
			}
			
			String s = s1 + s2;
			
			System.out.println(s);
		}
	}

	@Ignore @Test// TODO implement
	public void doubleTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			double d = 1;
			if (x) {
				d += 100;
			}
					
			System.out.println(d);
		}
	}
}
