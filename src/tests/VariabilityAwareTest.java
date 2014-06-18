

import gov.nasa.jpf.annotation.MyAnnotation;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class VariabilityAwareTest extends TestJPF {

	@MyAnnotation
	static boolean a = true;
	@MyAnnotation
	static boolean b = true;
	@MyAnnotation
	static boolean c = true;
//	@MyAnnotation
//	static boolean d = true;
//	@MyAnnotation
//	static boolean e = true;
//	@MyAnnotation
//	static boolean f = true;
//	@MyAnnotation
//	static boolean g = true;
//	@MyAnnotation
//	static boolean h = true;
//	@MyAnnotation
//	static boolean j = true;
//	@MyAnnotation
//	static boolean k = true;
//	@MyAnnotation
//	static boolean l = true;
//	@MyAnnotation
//	static boolean m = true;
//	@MyAnnotation
//	static boolean n = true;
//	@MyAnnotation
//	static boolean o = true;
//	@MyAnnotation
//	static boolean p = true;
//	@MyAnnotation
//	static boolean q = true;
//	@MyAnnotation
//	static boolean r = true;
//	@MyAnnotation
//	static boolean s = true;
//	@MyAnnotation
//	static boolean t = true;
//	@MyAnnotation
//	static boolean u = true;
//	@MyAnnotation
//	static boolean v = true;
//	@MyAnnotation
//	static boolean w = true;
	@MyAnnotation
	static boolean x = true;
	@MyAnnotation
	static boolean y = true;
	@MyAnnotation
	static boolean z = true;

	@Test
	public void forTest() throws Exception {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch")) {
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
				assert a * a == 16;
				if (y) {
					assert a == -4;
				} else {
					assert a == 4;
				}
			} else {
				assert a * a == 1;
				if (y) {
					assert a == -1;
				} else {
					assert a == 1;
				}
			}
		}
	}

	@Test
	public void forTest_2() throws Exception {
		if (verifyAssertionError("+search.class= .search.RandomSearch")) {
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
				assert a * a == 16;
				if (y) {
					assert a == -4;
				} else {
					assert a == 4;
				}
			} else {
				assert a * a == 1;
				if (y) {
					assert a == 1;
				} else {
					assert a == 1;
				}
			}
		}
	}

	@Test// TODO has to work completely one day
	public void forEfficencyTest() throws Exception {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch")) {
			int i = 1;
			int j = 10;
			if (x) {
				i*= 2;
			}
			if (y) {
				i*= 2;
			}
			if (z) {
				i*= 2;
			}
			if (a) {
				i*=2;
			}
			 if (b) {
				 i *= 2;
			 }
//			 if (c) {
//			 i *= 2;
//			 }
			// if (d) {
			// i *= 3;
			// }
			// if (e) {
			// i *= 3;
			// }
			// if (f) {
			// i *= 3;
			// }
			// if (g) {
			// i *= 3;
			// }
			// if (h) {
			// i *= 3;
			// }
			// if (j) {
			// i *= 3;
			// }
			int sum = 0;
			for (int start = 1; start <= i; start++) {
				sum++;			}
			
			if (x && y && z && a && b) {
				System.out.println(sum);
			}
		}
	}
	
	@Test
	public void testPint() throws Exception {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch")) {
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
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch")) {
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
		if (verifyAssertionError("+search.class= .search.RandomSearch")) {
			assert !z;
		}
	}

	@Test
	public void assertTest_2() throws Exception {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch")) {
			if (z) {
				if (!z) {
					assert false;
				}
			}
		}
	}

	@Test
	public void returnTest() throws Exception {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch")) {
			if (z) {
				return;
			}
			if (!z) {
				return;
			}
			assert false;
		}
	}

	@Test
	public void returnTest_2() throws Exception {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch")) {
			if (x || !x) {
				return;
			}
			assert false;
		}
	}

	@Test
	public void classTest_1() throws Exception {
		if (verifyAssertionError("+search.class= .search.RandomSearch")) {
			new Main(z);
		}
	}

	@Test
	public void classTest_2() throws Exception {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch")) {
			new Main(z, y);
		}
	}

	@Test
	public void classTest_3() throws Exception {
		if (verifyAssertionError("+search.class= .search.RandomSearch")) {
			new Main(false);
			new Main(true);
		}
	}
	
	@SuppressWarnings("static-access")
	@Test
	public void classMethodTest() throws Exception {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch")) {
			boolean z = this.z;
			boolean y = this.y;
			Main main = new Main(z, y);
			main.method(z, y);
		}
	}
	
	@Test
	public void ifTest() throws Exception {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch")) {
			if (VariabilityAwareTest.valid()) {
				
			}
		}
	}

	private static boolean valid() {
		return a && (!b || c);
	}

}

class Main {
	
	boolean z = false;
	boolean y = false;

	public Main(boolean z) {
		if (!z) {
			assert false;
		}
	}

	public Main(boolean z, boolean y) {
		this.z = z;
		this.y = y;
	}
	
	void method(boolean z, boolean y) {
		assert this.z == z;
		assert this.y == y;
	}

}
