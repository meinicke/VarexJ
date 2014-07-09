package cmu;

import gov.nasa.jpf.annotation.MyAnnotation;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class VariabilityAwareTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	static boolean RUN_WITH_JPF = true;

	@MyAnnotation
	static boolean a = true;
	@MyAnnotation
	static boolean b = true;
	@MyAnnotation
	static boolean c = true;
	@MyAnnotation
	static boolean d = true;
	@MyAnnotation
	static boolean e = true;
	@MyAnnotation
	static boolean f = true;
	@MyAnnotation
	static boolean g = true;
	@MyAnnotation
	static boolean h = true;
	@MyAnnotation
	static boolean j = true;

	@MyAnnotation
	static boolean x = true;
	@MyAnnotation
	static boolean y = true;
	@MyAnnotation
	static boolean z = true;

	@Test
	public void simpleForTest() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int rounds = 1;
			if (z) {
				rounds = 4;
			}
			if (y) {
				rounds = 2;
			}
			int a = 0;
			for (int start = 0; start <= rounds; start++) {
				a++;
			}
		}
	}

	@Test
	public void forTest() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int rounds = 1;
			int increment = 1;
			if (z) {
				rounds = 4;
			}
			if (y) {
				increment = -1;
			}
			int a = 0;
			for (int start = 1; start <= rounds; start++) {
				a += increment;
			}

			if (z) {
				check(a * a == 16);
				if (y) {
					check(a == -4);
				} else {
					check(a == 4);
				}
			} else {
				check(a * a == 1);
				if (y) {
					check(a == -1);
				} else {
					check(a == 1);
				}
			}
		}
	}

	@Test
	public void forTest_2() throws Exception {
		if (RUN_WITH_JPF && verifyAssertionError(JPF_CONFIGURATION)) {
			int rounds = 1;
			int increment = 1;
			if (z) {
				rounds = 4;
			}
			if (y) {
				increment = -1;
			}
			int a = 0;
			for (int start = 1; start <= rounds; start++) {
				a += increment;
			}

			if (z) {
				check(a * a == 16);
				if (y) {
					check(a == -4);
				} else {
					check(a == 4);
				}
			} else {
				check(a * a == 1);
				if (y) {
					check(a == 1);
				} else {
					check(a == 1);
				}
			}
		}
	}

	@Test
	public void earlyJoinTest() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int i = 1;
			if (x) {
				i *= 2;
			}
			if (y) {
				i *= 2;
			}
			if (z) {
				i *= 2;
			}
			if (a) {
				i *= 2;
			}
			if (b) {
				i *= 2;
			}
			i = 10;// early join
			if (c) {
				i *= 2;
			}
			if (d) {
				i *= 2;
			}
			if (e) {
				i *= 2;
			}
			if (f) {
				i *= 2;
			}

			if (g) {
				i *= 3;
			}
			if (h) {
				i *= 3;
			}
			if (j) {
				i *= 3;
			}

			i = 1000;// early join
			int sum = 0;
			for (int start = 1; start <= i; start++) {
				sum++;
			}
			System.out.println(sum);
		}
	}

	@Test
	public void testPrint() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int i = 0;
			if (z) {
				i++;
			}
			if (z) {
				System.out.println(i);
			} else {
				System.out.println(i);
			}
		}
	}

	@Test
	public void testPint_2() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int i = 0;
			if (z) {
				i++;
			}
			if (z) {
				System.out.println("some text " + i);
			} else {
				System.out.println(i + " some other text");
			}
		}
	}

	@Test
	public void assertTest_1() throws Exception {
		if (RUN_WITH_JPF && verifyAssertionError(JPF_CONFIGURATION)) {
			check(!z);
		}
	}

	@Test
	public void assertTest_2() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (z) {
				if (!z) {
					check(false);
				}
			}
		}
	}

	@Test
	public void returnTest() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (z) {
				return;
			}
			if (!z) {
				return;
			}
			check(false);
		}
	}

	@Test
	public void returnTest2() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {

			if (method()) {

			} else {

			}
			return;
		}
	}

	boolean method() {
		if (z) {
			return false;
		}
		if (method2()) {

		} else {
			return false;
		}
		return true;
	}

	private boolean method2() {
		return true;
	}

	@Test
	public void returnTest_2() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (x || !x) {
				return;
			}
			check(false);
		}
	}

	@Test
	public void classTest_1() throws Exception {
		if (RUN_WITH_JPF && verifyAssertionError(JPF_CONFIGURATION)) {
			new Main(z);
		}
	}

	@Test
	public void classTest_2() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			new Main(z, y);
		}
	}

	@Test
	public void classTest_3() throws Exception {
		if (RUN_WITH_JPF && verifyAssertionError(JPF_CONFIGURATION)) {
			new Main(false);
			new Main(true);
		}
	}

	@Test
	public void classMethodTest() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Main main = new Main(z, y);
			main.method(z, y);
		}
	}

	@Test
	public void classMethodTest2() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			boolean z = VariabilityAwareTest.z;
			boolean y = VariabilityAwareTest.y;
			Main main = new Main(z, y);
			main.method(z, y);
		}
	}

//	@Test
	public void classMethodTest3() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			boolean z = VariabilityAwareTest.z;
			boolean y = VariabilityAwareTest.y;
			Main main = new Main(z, y);

			int value = 4;
			if (a) {
				value = value + 10;
			}
			if (b) {
				main.method2(value);
			}
		}
	}

	@Test
	public void ConditionalTest() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (a && (!b || c)) {

			}
		}
	}

	@Test
	public void multipleReturnTest() throws Exception {
		if (RUN_WITH_JPF && verifyAssertionError(JPF_CONFIGURATION)) {
			if (a) {
				return;
			}
			if (b) {
				return;
			}
			check(a);
		}
	}

	@Test
	public void elseTest_3() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (VariabilityAwareTest.valid()) {
				check(a);
				return;
			}
			check(!a);
			return;
		}
	}

	@Test
	public void elseTest_2() throws Exception {
		if (RUN_WITH_JPF && verifyAssertionError(JPF_CONFIGURATION)) {
			if (a) {
				check(a);
				return;
			}
			check(a);
		}
	}

	@Test
	public void elseTest() throws Exception {
		if (RUN_WITH_JPF && verifyAssertionError(JPF_CONFIGURATION)) {
			if (a) {
				check(a);
			} else {
				check(a);
			}
		}
	}

	private static boolean valid() {
		return a;
	}

	static void check(boolean cond) {
		if (RUN_WITH_JPF) {
			assert cond;
		} else {
			System.out.println(cond);
			assertTrue(cond);
		}

	}

//	@Test
	public void classExtendTest() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			boolean z = VariabilityAwareTest.z;
			boolean y = VariabilityAwareTest.y;
			Main main = new Main(z, y);
			if (x) {
				main = new Main2(z, y);
			}
			
			main.method2(0);
			
			int value = 4;
			if (a) {
				value = value + 10;
			}
			if (b) {
				main.method2(value);
				
			}
//			int i = 0;

		}
	}
	
}

class Main {

	final int x = VariabilityAwareTest.x ? 10 : 0;

	boolean z = false;
	boolean y = false;

	public Main(boolean z) {
		if (!z) {
			VariabilityAwareTest.check(false);
		}
	}

	public Main(boolean z, boolean y) {
		this.z = z;
		this.y = y;
	}

	void method(boolean z, boolean y) {
		VariabilityAwareTest.check(z == this.z);
		VariabilityAwareTest.check(y == this.y);
	}

	boolean method2(int value) {
		if (value < 10) {
			return true;
		}
		return false;
	}

}

class Main2 extends Main {

	public Main2(boolean z, boolean y) {
		super(z, y);
	}
	
	@Override
	boolean method2(int value) {
		return super.method2(value);
	}
	
}
