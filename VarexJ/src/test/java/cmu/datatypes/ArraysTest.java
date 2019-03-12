package cmu.datatypes;

import java.util.Arrays;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

/**
 * Test for java.util.Arrays and the peer implementations.
 * 
 * @author Jens Meinicke
 *
 */
public class ArraysTest extends TestJPF {// TODO actually test the results

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	@Conditional
	static boolean a = true;

	@Test
	public void intArraysFillTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int[] array = new int[30_000_000];
			Arrays.fill(array, 1);

			int[] array2 = new int[30];
			if (a) {
				Arrays.fill(array2, 1);
			}
		}
	}

	@Test
	public void byteArraysFillTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			byte[] array = new byte[20];
			Arrays.fill(array, 1, 10, (byte) 1);
			if (a) {
				Arrays.fill(array, 5, 15, (byte) 2);
			}
		}
	}

	@Test
	public void objectArraysFillTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Object[] array = new Object[20];
			Object o = new Integer(1);

			Arrays.fill(array, o);
			if (a) {
				Arrays.fill(array, new Integer(2));
			}
		}
	}

	@Test
	public void charArraysFillTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int length = 100;
			char[] array = new char[length];
			char[] array2 = new char[length];

			Arrays.fill(array, 'a');
			if (a) {
				Arrays.fill(array2, 'b');
			}
			if (a) {
				assertFalse(Arrays.equals(array2, new char[length]));
			} else {
				assertTrue(Arrays.equals(array2, new char[length]));
			}
			Arrays.fill(array, 'b');
			if (!a) {
				Arrays.fill(array2, 'b');
			}
			assertTrue(Arrays.equals(array, array2));
		}
	}
	
	@Test
	public void booleanArraysFillTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int length = 100;
			boolean[] array = new boolean[length];
			boolean[] array2 = new boolean[length];

			Arrays.fill(array, true);
			if (a) {
				Arrays.fill(array2, true);
			}
		}
	}
	

	@Test
	public void doublenArraysFillTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION, "+stack=StackHandler")) {
			int length = 100;
			double[] array = new double[length];
			double[] array2 = new double[length];

			Arrays.fill(array, 2.2);
			if (a) {
				Arrays.fill(array2, 2.1);
			}
			for (int i = 0; i < array2.length; i++) {
				array[i] = array2[i];
			}
		}
	}
	
	@Test
	public void doublenArraysTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION, "+stack=StackHandler")) {
			double[] array = new double[a ? 10: 12];
			array[0] = 1.0;
			assertEquals(array[0], 1.0);
			assertEquals(array[1], 0.0);
			double x = array[0];
			array[0] = x;
			assertEquals(array[0], 1.0);
		}
	}
	
	@Test
	public void conditionalNullPointerDoubleArrayTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION, "+stack=StackHandler")) {
			double[] array = null;
			if (a) {
				array = new double[1];
			}
			
			Verify.resetCounter(0);
			try {
				Verify.incrementCounter(0);
				array[0] = 1;
			} catch (NullPointerException e) {
				e.printStackTrace();
				Verify.incrementCounter(0);
			}
			Verify.incrementCounter(0);
			assertEquals(3, Verify.getCounter(0));
			
		}
	}
	
	@Test
	public void conditionalNullPointerObjectArrayTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION, "+stack=StackHandler")) {
			Object[] array = null;
			if (a) {
				array = new Object[1];
			}
			Verify.resetCounter(0);
			try {
				Verify.incrementCounter(0);
				array[0] = new Object();
			} catch (NullPointerException e) {
				e.printStackTrace();
				Verify.incrementCounter(0);
			}
			Verify.incrementCounter(0);
			assertEquals(3, Verify.getCounter(0));
		}
	}
	
	@Test
	public void conditionalArrayStoreExceptionTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION, "+stack=StackHandler")) {
			Number[] array = new Double[2]; 
			Number o = new Double(1.9);
			if (a) {
				o = new Integer(1);
			}
			Verify.resetCounter(0);
			try {
				method(array, o);
				assertEquals(o, array[0]);
				Verify.incrementCounter(0);
			} catch (ArrayStoreException e) {
				e.printStackTrace();
				Verify.incrementCounter(0);
			}
			Verify.incrementCounter(0);
			assertEquals(3,	Verify.getCounter(0));
			Verify.resetCounter(0);
		}
	}

	private void method(Number[] array, Number object) {
		array[0] = object;
	}
	
}
