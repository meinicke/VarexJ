package cmu;

import gov.nasa.jpf.annotation.MyAnnotation;
import gov.nasa.jpf.util.test.TestJPF;

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

}
