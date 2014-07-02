package cmu.datatypes;

import gov.nasa.jpf.annotation.MyAnnotation;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class IntTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";
	
	@MyAnnotation
	static boolean a = true;
	@MyAnnotation
	static boolean b = true;
	@MyAnnotation
	static boolean c = true;
	@MyAnnotation
	static boolean d = true;
	
	@MyAnnotation
	static boolean x = true;
	@MyAnnotation
	static boolean y = true;
	@MyAnnotation
	static boolean z = true;

	@Test
	public void testAll() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int i = 1;
			int j = 3;
			if (z) {
				i = 2;
			}
			if (y) {
				j = 4;
			}
			
			int k = 0;
			k = i + j;
			k = i - j;
			k = i * j;
			k = i / j;
			k = i % j;
		}
	}
	
	@Test
	public void testDivNull() throws Exception {
		if (verifyUnhandledException("java.lang.ArithmeticException", JPF_CONFIGURATION)) {
			int i = 1;
			int j = 3;
			if (z) {
				i = 2;
			}
			if (y) {
				j = 0;
			}
			
			int k = 0;
			k = i / j;
		}
	}
	
	@Test
	public void testModNull() throws Exception {
		if (verifyUnhandledException("java.lang.ArithmeticException", JPF_CONFIGURATION)) {
			int i = 1;
			int j = 3;
			if (z) {
				i = 2;
			}
			if (y) {
				j = 0;
			}
			
			int k = 0;
			k = i % j;
		}
	}
}
