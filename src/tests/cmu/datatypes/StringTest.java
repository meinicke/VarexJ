package cmu.datatypes;

import gov.nasa.jpf.annotation.MyAnnotation;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Ignore;
import org.junit.Test;

public class StringTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	@MyAnnotation
	static boolean x = true;
	@MyAnnotation
	static boolean y = true;
	@MyAnnotation
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

}
