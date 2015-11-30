package cmu.peers;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class NativeBenchmark extends TestJPF {

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
	static boolean e = true;

	@Test
	public void intTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			byte b1 = 0;
			if (a) {
				b1 += 1;
			}
			if (b) {
				b1 += 2;
			}
			if (c) {
				b1 += 4;
			}
			if (d) {
				b1 += 8;
			}
			if (e) {
				b1 += 16;
			}
			Byte.valueOf(b1);
		}
	}
}
