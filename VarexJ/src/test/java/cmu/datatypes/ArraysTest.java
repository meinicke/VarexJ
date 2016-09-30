package cmu.datatypes;

import java.util.Arrays;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

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
}
