package cmu.datatypes;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

@SuppressWarnings("unused")
public class IntTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";
	
	@Conditional
	static boolean a = true;
	@Conditional
	static boolean b = true;
	@Conditional
	static boolean c = true;
	@Conditional
	static boolean d = true;
	
	@Conditional
	static boolean x = true;
	@Conditional
	static boolean y = true;
	@Conditional
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
		
	@Test
	public void testValueOf() throws Exception {
		if (verifyNoPropertyViolation("+invocation=true", JPF_CONFIGURATION)) {
			Integer i = Integer.valueOf(0);
			if (a) i = Integer.valueOf(1);
			System.out.println(i.intValue());
		}
	}
	
	@Test
	public void conditionalNulpointerReturnTest() throws Exception {
		if (verifyUnhandledException(NullPointerException.class.getName(), JPF_CONFIGURATION)) {
			conditionalNulpointerReturn();
		}
	}
	
	@SuppressWarnings("null")
	private static int conditionalNulpointerReturn() {
		Integer err = null;
		if (a) {
			return err;
		}
		return 1;
	}
	
	@Test
	public void conditionalNulpointerReturnTest2() throws Exception {
		if (verifyUnhandledException(NullPointerException.class.getName(), JPF_CONFIGURATION)) {
			conditionalNulpointerReturn2();
		}
	}
	
	private static int conditionalNulpointerReturn2() {
		Integer err = null;
		boolean ipv4 = true;
		boolean flag = true;
		
		if (a) {
			flag = false;
		}
		if (b) {
			if (flag) {
				err = -1;
			}
		}
		if (c) {
			if (ipv4) {
				return err;
			}
		}
		return 1;
	}
	
}
