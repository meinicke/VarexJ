//
// Copyright (C) 2006 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
// 
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
// 
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//
package gov.nasa.jpf.test.java.lang;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

/**
 * test of java.lang.String APIs
 */
@SuppressWarnings({ "unused" })
public class StringTest extends TestJPF {

	@Conditional
	public static boolean A = true; 
	
	@Test
	public void testIntern() {
		if (verifyNoPropertyViolation()) {
			boolean c1 = Verify.getBoolean(); // to do some state storing / backtracking
			String a = "Blah".intern();
			String b = new String("Blah");

			assert (a != b) : "'new String(intern) != intern' failed";

			boolean c2 = Verify.getBoolean(); // to do some more storing / backtracking

			String c = b.intern();

			assert (a == c) : "'(new String(intern)).intern() == intern' failed";
		}
	}

	@Test
	public void testToCharArray() {
		if (verifyNoPropertyViolation()) {
			String s = "42";
			char[] c = s.toCharArray();

			assert c.length == 2;
			assert c[0] == '4';
			assert c[1] == '2';
		}
	}

	@Test
	public void testEquals() {
		if (verifyNoPropertyViolation()) {
			String a = "one two";
			String b = "one" + " two";
			String c = "one three";

			assert a.equals(b);
			assert !a.equals(c);
		}
	}

	@Test
	public void testIndexOf() {
		if (verifyNoPropertyViolation()) {
			String a = "bla.bla";
			int i1 = a.indexOf('.');
			int i2 = a.indexOf('@');

			assert i1 == 3;
			assert i2 == -1;
		}
	}

	@Test
	public void testCompareTo() {
		if (verifyNoPropertyViolation()) {
			String a = "aaa";
			String b = "bbb";

			assert a.compareTo(b) < 0;
			assert b.compareTo(a) > 0;
			assert a.compareTo(a) == 0;

			String longer = "aaaaaa";

			assert a.compareTo(longer) < 0;
		}
	}

	@Test
	public void testStartsWith() {
		if (verifyNoPropertyViolation()) {
			String str = "TestString";

			assert str.startsWith("Test") == true;
			assert str.startsWith("String", 4) == true;
			assert str.startsWith("StringString", 4) == false;
			assert str.startsWith("StrUng", 4) == false;
			assert str.startsWith("Test", -5) == false;
		}
	}

	@Test
	public void testEndsWith() {
		if (verifyNoPropertyViolation()) {
			String str = "TestString";

			assert str.endsWith("String") == true;
			assert str.endsWith("") == true;
			assert str.endsWith("StrUng") == false;
		}
	}

	@Test
	public void testTrim() {
		if (verifyNoPropertyViolation()) {
			assert "   Test    ".trim().equals("Test");
			assert "   Test".trim().equals("Test");
			assert "Test    ".trim().equals("Test");
			assert "Test".trim().equals("Test");
			assert "       ".trim().equals("");

		}
	}

	@Test
	public void testReplace() {
		if (verifyNoPropertyViolation()) {
			assert "hello".replace('l', 'a').equals("heaao") == true;
			assert "".replace('l', 'a').equals("") == true;
			assert "hello".replace('f', 'a').equals("hello") == true;
			assert "eve".replace('e', 'a').equals("ava") == true;
		}
	}

	@Test
	public void testNullChar(){
		if (verifyNoPropertyViolation()){
			String s = "\u0000";
			assertTrue( s.length() == 1);
			char c = s.charAt(0);
			assertTrue( Character.isISOControl(c));
		}
	}

	@Test
  @SuppressWarnings("deprecation")
  public void testConstructors(){
		if (verifyNoPropertyViolation()){
			String s=new String();
			new String(s);
			assertTrue("empty test",s.isEmpty());
			char[]value=new char[]{'a','b','c','d','e'};
			assertTrue("String([]abcde=abcde","abcde".equals(new String(value)));
			assertTrue("String([]abcde,2,3)=cde","cde".equals(new String(value,2,3)));
			int[]codePoints=new int[]{48,49,50,51,52,53,54,55,56,57};
			assertTrue("codePoints0,4=0123","0123".equals(new String(codePoints,0,4)));
			byte[]bytes=new byte[]{65,66,67,68};
			byte[]data=new byte[]{69,70,71,72};
			byte[]more=new byte[]{73,74,75,76};
			byte[]yow=new byte[]{77,78,79};
			assertTrue("bytes0,1,3=BCD","BCD".equals(new String(bytes,0,1,3)));
			assertTrue("bytes=ABCD","ABCD".equals(new String(bytes,0)));
			try {
				Charset d = Charset.forName("ISO-8859-1");
				String dname=d.name();
				assertTrue("bytes1,2,ISO=BC","BC".equals(new String(bytes,1,2,dname)));
				assertTrue("bytes2,2,ISO=CD","CD".equals(new String(bytes,2,2,d)));

				assertTrue("data,ISO=EFGH","EFGH".equals(new String(data,dname)));
				assertTrue("more,ISO=IJKL","IJKL".equals(new String(more,d)));
			} catch (UnsupportedEncodingException e) {
				fail("default encoding failure");
			}
			assertTrue("more1,3=JKL","JKL".equals(new String(more,1,3)));
			assertTrue("yow=MNO","MNO".equals(new String(yow)));
			StringBuffer buf=new StringBuffer();
			buf.append("yogi");
			assertTrue("buf=yogi","yogi".equals(new String(buf)));
			StringBuilder build=new StringBuilder();
			build.append("boo-boo");
			assertTrue("build=boo-boo","boo-boo".equals(new String(build)));
		}
	}
  
  
	// Test new modelled methods
	@Test
  @SuppressWarnings("deprecation")
  public void testMethods() {
    if (verifyNoPropertyViolation()) {
      // 97 ...
      String x = new String("abcdefg");
      assertTrue("abcdefg[3]=100", x.codePointAt(3) == 100);
      assertTrue("abcdefg[2]=99", x.codePointBefore(3) == 99);
      assertTrue("abcdefg(2,4)", x.codePointCount(2, 4) == 2);
      assertTrue("abcdefg(2+2)", x.offsetByCodePoints(2, 2) == 4);
      char[] dst = new char[]{0, 0, 0, 0, 0};
      x.getChars(4, 7, dst, 1);
      assertTrue("abcdefg(4,7->1)=0efg0", dst[0] == 0);
      assertTrue("abcdefg(4,7->1)=0efg0", dst[1] == 'e');
      assertTrue("abcdefg(4,7->1)=0efg0", dst[2] == 'f');
      assertTrue("abcdefg(4,7->1)=0efg0", dst[3] == 'g');
      assertTrue("abcdefg(4,7->1)=0efg0", dst[4] == 0);
      byte[] bdst = new byte[]{0, 0, 0, 0, 0};
      x.getBytes(3, 6, bdst, 1);
      assertTrue("abcdefg(4,7->1)=0efg0", bdst[0] == 0);
      assertTrue("abcdefg(4,7->1)=0efg0", bdst[1] == 'd');
      assertTrue("abcdefg(4,7->1)=0efg0", bdst[2] == 'e');
      assertTrue("abcdefg(4,7->1)=0efg0", bdst[3] == 'f');
      assertTrue("abcdefg(4,7->1)=0efg0", bdst[4] == 0);
      String y = new String("qrs");
      try {
        bdst = y.getBytes("ISO-8859-1");
      } catch (UnsupportedEncodingException e) {
        fail("getBytes failed: " + e);
      }
      assertTrue("qrs 0", bdst[0] == 'q');
      assertTrue("qrs 1", bdst[1] == 'r');
      assertTrue("qrs 2", bdst[2] == 's');
      Charset charSet = Charset.forName("ISO-8859-1");
      String z = new String("tuv");
      bdst = z.getBytes(charSet);
      assertTrue("tuv 0", bdst[0] == 't');
      assertTrue("tuv 1", bdst[1] == 'u');
      assertTrue("tuv 2", bdst[2] == 'v');
      String s = new String("wxy");
      bdst = s.getBytes();
      assertTrue("wxy 0", bdst[0] == 'w');
      assertTrue("wxy 1", bdst[1] == 'x');
      assertTrue("wxy 2", bdst[2] == 'y');
      StringBuffer buf = new StringBuffer();
      buf.append("xyz");
      assertTrue("xyz".contentEquals(buf));
      assertTrue("a<b", "a".compareTo("b") < 0);
      TreeSet<String> set = new TreeSet<String>();
      set.add("b");
      set.add("a");
      Iterator<String> iter = set.iterator();
      String a = iter.next();
      assertTrue("set0=a", a.equals("a"));
      String b = iter.next();
      assertTrue("set1=b", b.equals("b"));
      assertTrue("AaBb=aabb", "AaBb".compareToIgnoreCase("aabb") == 0);
      assertTrue("abcdef1,3-->bcdef", "abcde".regionMatches(2, "bcdef", 1, 3));
      assertTrue("abcdef1,3-->BCDEF", "abcde".regionMatches(true, 2, "BCDEF", 1, 3));
      assertTrue("xyz->yz", "xyz".startsWith("yz", 1));
      assertTrue("abc->a", "abc".startsWith("a"));
      assertTrue("xyz->yz", "xyz".endsWith("yz"));
      buf.delete(0, buf.length());
      buf.append("hash");
      assertTrue("hashCode", "hash".hashCode() == buf.toString().hashCode());
      assertTrue("abc->1", "abc".indexOf('b') == 1);
      assertTrue("ababa->3", "ababa".indexOf('b', 2) == 3);
      assertTrue("ababa(z)->-1", "ababa".lastIndexOf('z') == -1);
      assertTrue("aacdabcd(a,3)", "aacdabcd".lastIndexOf('a', 3) == 1);
      assertTrue("abcabca->bca so 1", "abcabca".indexOf("bca") == 1);
      assertTrue("abcabca->bca 2, so 4", "abcabca".indexOf("bca", 2) == 4);
      assertTrue("lovelovelove->8", "lovelovelove".lastIndexOf("love") == 8);
      assertTrue("crazycrazy->0", "crazycrazy".lastIndexOf("crazy", 4) == 0);
      assertTrue("yellowblue->6", "yellowblue".substring(6).equals("blue"));
      assertTrue("yellowbluebluegreen->6,14", "yellowbluebluegreen".substring(6, 14).equals("blueblue"));
      assertTrue("x+y", "x".concat("y").equals("xy"));
      assertTrue("xyz(xy)", "xyz".contains("xy"));
      assertTrue("abcabc->abaaba", "abcabc".replace("c", "a").equals("abaaba"));
      Locale l = Locale.ENGLISH;
      String result = String.format(l, "Gimme the %s and save my soul", "FORTRAN");
      assertTrue("fortran", result.equals("Gimme the FORTRAN and save my soul"));
      assertTrue("1", String.valueOf(1).equals("1"));
      assertTrue("1111111111111111111L", String.valueOf(1111111111111111111L).equals("1111111111111111111"));
      assertTrue("3.14159", String.valueOf(3.14159).equals("3.14159"));
      System.out.println(String.valueOf(3.14159265358979324D));
      assertTrue("3.141592653589793", String.valueOf(3.141592653589793D).equals("3.141592653589793"));
    }
  }
  
	@Test
	public void testContentEquals() {
		if (verifyNoPropertyViolation()) {
			String s = "fortyTwo";
			StringBuilder sb = new StringBuilder();
			sb.append("fortyTwo");

			assertTrue(s.contentEquals(sb));
		}
	}

	@Test
	public void testSubstring() {
		if (verifyNoPropertyViolation()) {
			Verify.setCounter(0, 0);
			String str = "foo";
			try {
				str = str.substring(1, A ? str.length() - 1 : 0);
				assertEquals("o", str);
				Verify.incrementCounter(0);
			} catch (StringIndexOutOfBoundsException e) {
				Verify.incrementCounter(0);
			}
			if (A) {
				Verify.incrementCounter(0);
			} else {
				Verify.incrementCounter(0);
			}
			assertEquals(4, Verify.getCounter(0));
		}
	}

	@Test
	public void testSubstring2() {
		if (verifyNoPropertyViolation()) {
			Verify.setCounter(0, 0);
			String str = "foo";
			assertEquals("fo", str.substring(0, 2));
		}
	}
}
