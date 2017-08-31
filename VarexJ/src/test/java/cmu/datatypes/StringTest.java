package cmu.datatypes;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class StringTest extends TestJPF {

	static String[] JPF_CONFIGURATION = new String[]{"+stack=DefaultStackHandler" + "+invocation=true", "+search.class= .search.RandomSearch", "+choice=TreeChoice"};

	@Conditional
	static boolean x = true;
	@Conditional
	static boolean y = true;
	@Conditional
	static boolean z = true;

	@Test
	public void printlnTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			System.out.println("Start");
			if (x) {
				System.out.println("X");
			}
			if (y) {
				System.out.println("Y");
			}
		}
	}

	@Test
	public void printConditionalTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int i = 1;
			if (x) {
				i++;
			}
			System.out.println(i);
		}
	}

	@Test
	public void printlnTest_2() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (y) {
				int strongComponentNumber = 1;
				if (x) {
					strongComponentNumber = 0;
				}
				System.out.println("SCCNo: " + strongComponentNumber);
				System.out.println("---------------");
				print("SCCNo: " + strongComponentNumber);
				System.out.println("---------------");
				Main.print("SCCNo: " + strongComponentNumber);
			}
		}
	}

	private void print(String s) {
		System.out.println(s);
	}

	@Test
	public void printlnTest_3() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			System.out.println("Start");
			System.out.println("\n");
			System.out.println("End");
		}
	}
	
	@Test
	public void concatenationTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String s = "A";
			if (x) {
				s = s + "X";
			}

			if (x) {
				assertEquals("AX", s);
				System.out.println(s);
			} else {
				assertEquals("A", s);
				System.out.println(s);
			}
			System.out.println("----------------------");

			System.out.println(y);
			System.out.println(s);
		}
	}

	@Test
	public void concatenationTest2() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			System.out.println(y + "");
		}
	}

	@Test
	public void concatenationTest3() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String s1 = "A";
			if (x) {
				s1 = "X";
			}

			String s2 = "1";
			if (y) {
				s2 = "2";
			}

			String s = s1 + s2;

			System.out.println(s);
		}
	}

	@Test
	public void concatenationTest4() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String s1 = "A";
			if (x) {
				s1 = "X";
			}

			String s2 = "1";
			if (y) {
				s2 = "2";
			}

			String s = s1 + s2;
			if (z) {
				s = s + "Z";
			} else {
				s = s + "!Z";
			}
			System.out.println(s);
		}
	}

	@Test
	public void concatenationTest5() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			System.out.println(x + "|" + y + "|" + z);
		}
	}

	@Test
	public void longStringConcatentationTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String s1 = "A";
			if (x) {
				s1 = "XXXXXXXXXXXXXXXXX";
			}
			String s = "BBBBBBBBBBBBBBB" + s1;
			System.out.println(s);
		}
	}

	@Test
	public void longStringConcatentationTest2() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String s1 = "A";
			if (x) {
				s1 = s1 + "XXXXXXXXXXXXXXXXX";
			}
			if (y) {
				s1 = s1 + "YYYYYYYYYYYYYYYYYYYYYYYYYY";
			}
			if (z) {
				s1 = s1 + "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ";
			}
			String s = "BBBBBBBBBBBBBBB" + s1;
			System.out.println(s);
		}
	}
	
	@Test
	public void lengthTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String s1 = "A";
			if (x) {
				s1 = s1 + "XXXX";
			}
			String s = s1 + "1234567890";			
			if (x) {
				assertEquals(15, s.length());
			} else {
				assertEquals(11, s.length());
			}
			for (int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(i) + "");
			}
		}
	}

	@Test
	public void doubleTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			double d = 1;
			if (x) {
				d += 100;
				if (y) { 
					d++; 
				}
			}
			System.out.println(d);
		}
	}
	
	@Test
	public void testChach() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String s;
			if (x) {
				s = getString(2);
			} else {
				s = getString(2);
				System.out.print("");
			}
			System.out.println(s);
		}
	}
	
	private String getString(int i) {
		String s = "";
		while (i-- > 0) {
			s += i; 
		}
		return s.intern();
	}
	
	@Test
	public void lenthTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			String s = "A";
			if (x) {
				s = s + "B";
			}
			assertEquals(x ? 2 : 1, s.length());
		}
	}
	
	@Test
	public void printfTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int i = 0;
			if (x) {
				i = 1;
			}
			int j = 2;
			if (y) {
				j = 3;
			}
			System.out.printf("%d%d", i,j);
			
		}
	}
	
	@Test
	public void printfTestFloat() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			float f = 0.12345f;
			if (x) {
				f = 0.2f;
			}
			int j = 2;
			if (y) {
				j = 3;
			}
			System.out.printf("%.3f - %d", f, j);
			
		}
	}
	
	@Test
	public void printfTestLong() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			long l = 12345;
			if (x) {
				l = 34567;
			}
			long l2 = -12345;
			if (y) {
				l2 = -34567;
			}
			System.out.printf("%d%d", l,l2);
			
		}
	}
	
	@Test
	public void printfTestByte() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Byte b = 1;
			if (x) {
				b = 2;
			}
			byte b2 = -3;
			if (y) {
				b2 = -4;
			}
			System.out.printf("%d%d", b,b2);
			
		}
	}
	
	@Test
	public void printfTestDouble() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			double d = Math.PI;;
			if (x) {
				d = 2;
			}
			double d2 = -3;
			if (y) {
				d2 = -4;
			}
			System.out.printf("%f%f", d,d2);
			
		}
	}
	
	@Test
	public void printfTestChar() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			char c = 'a';
			if (x) {
				c = 'b';
			}
			char c2 = 'A';
			if (y) {
				c2 = 'B';
			}
			System.out.printf("%c%c", c, c2);
		}
	}
	
	@Test
	public void printfTestShort() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			short s = 1;
			if (x) {
				s = 2;
			}
			short s2 = 3;
			if (y) {
				s2 = 4;
			}
			System.out.printf("%d%d", s, s2);
		}
	}
}

class Main {
	public static void print(String s) {
		System.out.println(s);
	}
}
