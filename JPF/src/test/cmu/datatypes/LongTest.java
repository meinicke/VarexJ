package cmu.datatypes;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

@SuppressWarnings("unused")
public class LongTest extends TestJPF {

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
	public void testLong() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			long i = 13;
			long j = 36;
			if (z) {
				i = 2;
			}
			if (y) {
				j = 4;
			}

			long k = 0;
			k = i + j;
			k = i - j;
			k = i * j;
			k = i / j;
			k = i % j;
		}
	}

	@Test
	public void testLongReturn() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			long i = method();
		}
	}

	private long method() {
		if (c) {
			return 1;
		}
		long g = 1;
		return 0;
	}
}
