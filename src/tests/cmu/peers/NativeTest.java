package cmu.peers;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;


public class NativeTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	@Conditional
	static boolean a = true;
	@Conditional
	static boolean b = true;
	@Conditional
	static boolean c = true;
	@Conditional
	static boolean d = true;

	@Test
	public void intTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int i = a ? 1 : 3;
			int j = b ? 2 : 4;
			int max = Math.max(i, j);
			System.out.println(max);
			if (b) {
				if (a) {
					assertEquals(2, max);
				} else {
					assertEquals(3, max);
				}
			} else {
				assertEquals(4, max);
			}
		}
	}
	
	@Test
	public void floatTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			float i = a ? 1 : 3;
			float j = b ? 2 : 4;
			float max = Math.max(i, j);
			System.out.println(max);
			if (b) {
				if (a) {
					assertEquals(2, max);
				} else {
					assertEquals(3, max);
				}
			} else {
				assertEquals(4, max);
			}
		}
	}
	
	@Test
	public void doubleTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			double i = a ? 1 : 3;
			double j = b ? 2 : 4;
			double max = Math.max(i, j);
			System.out.println(max);
			if (b) {
				if (a) {
					assertEquals(2, max);
				} else {
					assertEquals(3, max);
				}
			} else {
				assertEquals(4, max);
			}
		}
	}
	
	@Test
	public void longTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			long i = a ? 1 : 3;
			long j = b ? 2 : 4;
			long max = Math.max(i, j);
			System.out.println(max);
			if (b) {
				if (a) {
					assertEquals(2, max);
				} else {
					assertEquals(3, max);
				}
			} else {
				assertEquals(4, max);
			}
		}
	}

	@Test
	public void sinTest() throws Exception{
		if (verifyNoPropertyViolation("+nhandler.delegateUnhandledNative")) {
			double a = Math.PI/2;
			double b = StrictMath.sin(a);
			assertEquals(b, 1.0);
			System.out.println("hello world");
			double c = Math.sin(a);
			assertEquals(c, 1.0);
		}
	}
}
