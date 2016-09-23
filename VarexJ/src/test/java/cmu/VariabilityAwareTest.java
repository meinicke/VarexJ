package cmu;

import java.util.Arrays;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

/**
 * 
 * Some small test cases to test the basic behavior of variability-aware execution. 
 * 
 * @author Jens Meinicke
 *
 */
@SuppressWarnings("unused")
public class VariabilityAwareTest extends TestJPF {

	static String[] JPF_CONFIGURATION = new String[]{/*"+interaction=frame",*/ "+search.class=.search.RandomSearch", "+choice=MapChoice"};
	static boolean RUN_WITH_JPF = true;

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
	@Conditional
	static boolean f = true;
	@Conditional
	static boolean g = true;
	@Conditional
	static boolean h = true;
	@Conditional
	static boolean j = true;

	@Conditional
	static boolean x = true;
	@Conditional
	static boolean y = true;
	@Conditional
	static boolean z = true;

	@Test
	public void simpleForTest() {
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
			System.out.println(a);
		}
	}

	@Test
	public void forTest() {
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
	public void forTest_2() {
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
				i += 1;
			}
			if (y) {
				i += 1;
			}
			if (z) {
				i += 1;
			}
			if (a) {
				i += 1;
			}
			if (b) {
				i += 1;
			}
//			i = 10;// early join
			if (c) {
				i += 1;
			}
			if (d) {
				i += 1;
			}
			if (e) {
				i += 1;
			}
			if (f) {
				i += 1;
			}

			if (g) {
				i += 1;
			}
			if (h) {
				i += 1;
			}
			if (j) {
				i += 1;
			}

//			i = 1000;// early join
			int sum = 0;
			for (int start = 1; start <= i; start++) {
				sum++;
			}
			if (sum > 15) {
				throw new Exception();
			}
			System.out.println(sum);
			
		}
	}

	@Test
	public void testPrint() {
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
	public void testPint_2() {
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
	public void assertTest_1() {
		if (RUN_WITH_JPF && verifyAssertionError(JPF_CONFIGURATION)) {
			check(!z);
		}
	}

	@Test
	public void assertTest_2() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (z) {
				if (!z) {
					check(false);
				}
			}
		}
	}

	@Test
	public void returnTest() {
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
	public void returnTest2() {
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
	public void returnTest_2() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (x || !x) {
				return;
			}
			check(false);
		}
	}

	@Test
	public void classTest_1() {
		if (RUN_WITH_JPF && verifyAssertionError(JPF_CONFIGURATION)) {
			new Main(z);
		}
	}

	@Test
	public void classTest_2() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			new Main(z, y);
		}
	}

	@Test
	public void classTest_3() {
		if (RUN_WITH_JPF && verifyAssertionError(JPF_CONFIGURATION)) {
			new Main(false);
			new Main(true);
		}
	}

	@Test
	public void classMethodTest() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Main main = new Main(z, y);
			main.method(z, y);
		}
	}

	@Test
	public void classMethodTest2() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			boolean z = VariabilityAwareTest.z;
			boolean y = VariabilityAwareTest.y;
			Main main = new Main(z, y);
			main.method(z, y);
		}
	}

	 @Test
	public void classMethodTest3() {
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
	public void ConditionalTest() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (a && (!b || c)) {

			}
		}
	}

	@Test
	public void multipleReturnTest() {
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
	public void elseTest_3() {
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
	public void elseTest_2() {
		if (RUN_WITH_JPF && verifyAssertionError(JPF_CONFIGURATION)) {
			if (a) {
				check(a);
				return;
			}
			check(a);
		}
	}

	@Test
	public void elseTest() {
		if (RUN_WITH_JPF && verifyAssertionError(JPF_CONFIGURATION)) {
			if (a) {
				check(a);
			} else {
				check(a);
			}
		}
	}

	@Test
	public void classExtendTest() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			boolean z = VariabilityAwareTest.z;
			boolean y = VariabilityAwareTest.y;
			Main main = new Main(z, y);
			if (x) {
				main = new Main2(z, y);
			}
			main.method2(0);
		}
	}

	@Test
	public void classExtendTest_2() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			boolean z = VariabilityAwareTest.z;
			boolean y = VariabilityAwareTest.y;
			Main main = new Main(z, y);
			if (x) {
				main = new Main2(z, y);
			}

			int v = VariabilityAwareTest.b ? 10 : 2;
			main.method2(v);

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
	public void testCatchConditionalException() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Main m = new Main(true);
			try {
				m.conditionalException();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void testCatchException() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Main m = new Main(true);
			try {
				m.exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void testCatchException2() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Main m = new Main(true);
			try {
				m.exception(10);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

	@Test
	public void testCatchException3() {
		if (!RUN_WITH_JPF || verifyAssertionError(JPF_CONFIGURATION)) {
			new Main(true).exception2();

		}
	}
	
	@Test
	public void testThrowException() throws Exception {
		if (!RUN_WITH_JPF || verifyUnhandledException(Exception.class.getName(), JPF_CONFIGURATION)) {
			Main m = new Main(true);
			m.conditionalException();
		}
	}
	
	@Test
	public void testProjectExample() throws Exception {
		if (!RUN_WITH_JPF || verifyAssertionError(JPF_CONFIGURATION)) {
			int x = 1;
			int y = 1;
			if (c) {
				y = 0;
			}
			if (x * y < 3) {
				x = x + 1;
			}
			if (y == 1) {
				x = -1;
			}
			if (d) {
				x = 0;
			}
			while (x > 0) {
				x = x - 1;
			}
			check(x == 0);
		}
	}
	
	int field = 1;
	
	@Test
	public void testField() throws Exception {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (x) {
				field = 2;
			}
			if (y) {
				field *= 3;
			}
			field = 1;
		}
	}
	
	@Test
	public void testDivisionByZero() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Verify.setCounter(0, 0);
			Verify.setCounter(1, 0);
			Verify.setCounter(2, 0);
			try {
				System.out.println(devisionByZeroCall(b ? 0 : 1));
				Verify.incrementCounter(1);
			} catch (Exception e) {
				Verify.incrementCounter(2);
				e.printStackTrace();
			}
			Verify.incrementCounter(0);
			assertEquals(1, Verify.getCounter(0));
			assertEquals(1, Verify.getCounter(1));
			assertEquals(1, Verify.getCounter(2));
		}
	}

	private int devisionByZeroCall(int i) {
		return devisionByZero(i);
	}

	private int devisionByZero(int i) {
		int k = 3;
		if (a) {
			k = k / i;
		} else {
			k = k +i;
		}
		k++;
		return k;
	}
	
	@Test
	public void testDivisionByZeroMultiple() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Verify.setCounter(0, 0);
			Verify.setCounter(1, 0);
			Verify.setCounter(2, 0);
			try {
				System.out.println(devisionByZeroCall(b ? 0 : c ? 3 : d ? 1 : 0));
				Verify.incrementCounter(1);
			} catch (Exception e) {
				Verify.incrementCounter(2);
				e.printStackTrace();
			}
			Verify.incrementCounter(0);
			assertEquals(1, Verify.getCounter(0));
			assertEquals(1, Verify.getCounter(1));
			assertEquals(1, Verify.getCounter(2));
		}
	}
	
	@Test
	public void testNullPointer() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Verify.setCounter(0, 0);
			Verify.setCounter(1, 0);
			Verify.setCounter(2, 0);
			try {
				String s = "TEST";
				nullpointerException(s);
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				Verify.incrementCounter(1);
			}
			Verify.incrementCounter(0);
			assertEquals(1, Verify.getCounter(0));
			assertEquals(1, Verify.getCounter(1));
			assertEquals(1, Verify.getCounter(2));
		}
	}

	private void nullpointerException(String s) {
		Verify.incrementCounter(2);
		System.out.println(s);
		Object main = null;
		if (a) {
			main = new Object();
		}
//		System.out.println("Object " + main + " created");
		int hash = main.hashCode();
//		System.out.println("Hash:" + hash);
	}
	
	@Test
	public void peerExceptionTest() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Verify.setCounter(0, 0);
			Verify.setCounter(1, 0);
			Verify.setCounter(2, 0);
			try {
				char[] c = new char[10];
				System.out.println(a);
				if (!a) {
					Verify.incrementCounter(0);
					c[1] = 'A';
				} else {
					Verify.incrementCounter(1);
					c[20] = 'B';
				}
			} catch (Exception e) {
				Verify.incrementCounter(2);
				e.printStackTrace();
			}
			System.out.println("JOIN");
			assertEquals(1, Verify.getCounter(0));
			assertEquals(1, Verify.getCounter(1));
			assertEquals(1, Verify.getCounter(2));
		}
	}
	
	@Test
	public void charAtExceptionTest() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			try {
				String s = "TEST";
				if (a) {
					System.out.println(s.charAt(5));
				} else {
					System.out.println(s.charAt(1));
				}
				if (b) {
					System.out.println(s.charAt(-1));
				} else {
					System.out.println(s.charAt(3));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("JOIN");
		}
	}
	
	@Conditional
	private static boolean REVERSE = true;
	@Conditional
	private static boolean LETTERS = true;
	
	/**
	 * An example of my presentation to show how features causing exceptions can be found with VarexJ.
	 */
	@Test
	public void exampleExceptions() {
		if (!RUN_WITH_JPF || verifyAssertionError(JPF_CONFIGURATION)) {
			try {
				char[] chars = exampleMethod();
				System.out.println(new String(chars));
				char prev = chars[0];
				for (int i = 1; i < chars.length; i++) {
					if (REVERSE) {
						check(prev > chars[i]);
					} else {
						check(prev < chars[i]);
					}
					prev = chars[i];
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("JOIN");
		}
	}

	private char[] exampleMethod() {
		char[] chars = new char[10];
		String s = LETTERS ? "ABCDEFGHI" : "0123456789";
		for (int i = 0; i < chars.length; i++) {
			chars[i] = s.charAt(i);
		}
		if (REVERSE) {
			char[] old = chars;
			for (int i = 0; i < chars.length; i++) {
				chars[i] = old[chars.length - 1 - i];
			}
		}
		return chars;
	}
	
	@Test
	public void testRuntimeException() {
		if (!RUN_WITH_JPF || verifyUnhandledException(RuntimeException.class.getName(), JPF_CONFIGURATION)) {
			Integer i = null;
			if (a) {
				i = 1;
			}
			if (i == null) {
				throw new RuntimeException("i == null");
			}
			System.out.println(i);
		}
	}
	
	/**
	 * Tests that stack overflow is found. 
	 */
	@Test
	public void testStackOverFlow() {
		if (!RUN_WITH_JPF || verifyUnhandledException(StackOverflowError.class.getName(), JPF_CONFIGURATION)) {
			int i = a ? 10 : 10000;
			i = recursive(i);
			System.out.println(i);
		}
	}
	
	/**
	 * Tests that stack overflow is found, but the other path is still executed.
	 */
	@Test
	public void testStackOverFlow2() {
		if (!RUN_WITH_JPF || verifyAssertionError(JPF_CONFIGURATION)) {
			int i = a ? 10 : 10000;
			try {
				i = recursive(i);
				System.out.println(i);
			} catch (StackOverflowError e) {
				// ignore the stack overflow error
				e.printStackTrace();
			}
			check(i == 1);
		}
	}

	private int recursive(int i) {
		if (i == 0) {
			return 0;
		}
		return i + recursive(i - 1);
	}
	
	@Test
	public void testMultipleExceptions() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			try {
				int i = a ? 3 : 2;
				int[] array = new int[2];
				
				System.out.println(array[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			
		}
	
	}
	
	@Test
	public void testGetChars() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation(JPF_CONFIGURATION)) {

			char[] dst = new char[10];
			if (a) {
				dst = new char[11];
			}
			int dstBegin = 2;
			if (b) {
				dstBegin = 3;
			}
			int begin = 0;
			if (c) {
				begin = 1;
			}
			int length = 4;
			String obj = "ABCDEFGHIJK";
			if (d) {
				obj = "Z" + obj;
			}
			obj.getChars(begin, begin + length, dst, dstBegin);

			for (int index = 0;index < length;index++) {
				char dstValue = dst[dstBegin + index];
				char srcValue = obj.charAt(begin + index);
				assertEquals(srcValue, dstValue);
			}
			System.out.println(Arrays.toString(dst));
			
		}
	
	}
	
	class C {
		int i;
		public C(int i) {
			this.i = i;
		}
		
		void method() {
			i++;
			Verify.incrementCounter(0);
		}
		@Override
		public String toString() {
			return "C" + i;
		}
	}
	
	@Test
	public void invokationTest() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation("+invocation=true", "+search.class= .search.RandomSearch", "+choice=MapChoice")) {
			Verify.setCounter(0, 0);
			C o = new C(0);
			if (a) {
				o = new C(1);
			}
			o.method();
			check(Verify.getCounter(0) == 1);
			if (a) {
				check(o.i == 2);
			} else {
				check(o.i == 1);
			}
			System.out.println(o);
		}
	}
	
	@Test
	public void invokationMJITest() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation("+invocation=true", "+search.class= .search.RandomSearch", "+choice=MapChoice")) {
			StringBuilder b = new StringBuilder();
			if (a) {
				b = new StringBuilder();
			}
			b.append("A");
			System.out.println(b);
		}
	}
	
	@Test
	public void invokationMJITest2() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation("+invocation=true", "+search.class= .search.RandomSearch", "+choice=MapChoice")) {
			double stop = 2;
			double start = 3;
			System.out.println("" + " build "+(stop-start));
		}
	}
	
	@Test
	public void invokationClassesTest() {
		if (!RUN_WITH_JPF || verifyNoPropertyViolation("+invocation=true", "+search.class= .search.RandomSearch", "+choice=MapChoice")) {
			C1 c = new C1();
			if (a) {
				c = new C2();
			}
			c.method();
			c.method2().method();
		}
	}
	
	class C1 {
		
		void method() {
			System.out.println("BLUB");
		}
		
		C1 method2() {
			return new C1();
		}
	}
	class C2 extends C1 {
		
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

	public void conditionalException() throws Exception {
		if (VariabilityAwareTest.a) {
			throw new Exception("EXCEPTION");
		}
	}
	
	public void exception() throws Exception {
		throw new Exception("EXCEPTION");
	}
	
	public void exception2() {
		VariabilityAwareTest.check(VariabilityAwareTest.a);
	}
	
	public void exception(int i) throws Exception {
		if (i < 0) {
			if (VariabilityAwareTest.a) {
				throw new Exception("EXCEPTION");
			}
			method2(10);
			return;
		}
		exception(i-1);
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
