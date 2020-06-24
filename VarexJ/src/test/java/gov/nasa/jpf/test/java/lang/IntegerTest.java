package gov.nasa.jpf.test.java.lang;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

public class IntegerTest extends TestJPF {

	@Conditional
	private static boolean z = true;
	@Conditional
	private static boolean y = true;
	@Conditional
	private static boolean w = true;

	@Test
	public void testParseInt() {
		if (verifyNoPropertyViolation()) {
			int x = Integer.parseInt("1");
			assert x == 1;
		}
	}

	@Test
	public void testParseIntConsitional() {
		if (verifyNoPropertyViolation()) {
			String s = "";
			if (z) {
				s += "1";
			}
			String numberString = "1" + s;
			int x = Integer.parseInt(numberString);
			if (z) {
				assert x == 11;
			} else {
				assert x == 1;
			}
		}
	}

	@Test
	public void testParseIntConsitional2() {
		if (verifyNoPropertyViolation()) {
			String s = "";
			if (z) {
				s += "1";
			}
			String numberString = "1" + s;
			if (y) {
				numberString = "0";
			}
			int x = Integer.parseInt(numberString);
			if (y) {
				assert x == 0;
			} else {
				if (z) {
					assert x == 11;
				} else {
					assert x == 1;
				}
			}
		}
	}

	@Test
	public void testParseIntConsitional3() {
		if (verifyNoPropertyViolation()) {
			if (w) {
				String s = "";
				if (z) {
					s += "1";
				}
				String numberString = "1" + s;
				if (y) {
					numberString = "0";
				}
				int x = Integer.parseInt(numberString);
				if (y) {
					assert x == 0;
				} else {
					if (z) {
						assert x == 11;
					} else {
						assert x == 1;
					}
				}
			}
		}
	}
	
	@Test
	public void testParseIntNumberFormatException() {
		if (verifyUnhandledException(NumberFormatException.class.getName())) {
			Integer.parseInt("no number");
		}
	}
	
	@Test
	public void testParseIntNumberFormatExceptionVarex() {
		if (verifyNoPropertyViolation()) {
			Verify.setCounter(0, 0);
			String s = z ? "1" :" no number";
			try {
				int x = Integer.parseInt(s);
				assert x == 1;
				assert z;
				Verify.incrementCounter(0);
			} catch (NumberFormatException e) {
				assert !z; 
				Verify.incrementCounter(0);
			}
			assert Verify.getCounter(0) == 2;
		}
	}
}
