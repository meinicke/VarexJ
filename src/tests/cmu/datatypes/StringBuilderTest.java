package cmu.datatypes;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class StringBuilderTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	@Conditional
	static boolean x = true;
	@Conditional
	static boolean y = true;
	@Conditional
	static boolean z = true;

	@Test
	public void appendTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			StringBuilder sb = new StringBuilder();
			sb.append("A");
			if (x) {
				sb.append("X");
			}
			sb.append("B");

			if (x) {
				assertEquals("AXB", sb.toString());
			} else {
				assertEquals("AB", sb.toString());
			}
		}
	}

	@Test
	public void substringTestJava() throws Exception {
		StringBuilder sb = new StringBuilder();
		sb.append("AAA");
		sb.append("X");
		sb.append("BBB");
		String ss = sb.substring(2, 5);
		assertEquals("AXB", ss);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("AAA");
		sb2.append("BBB");
		String ss2 = sb2.substring(2, 5);
		assertEquals("ABB", ss2);
	}

	@Test
	public void substringTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			StringBuilder sb = new StringBuilder();
			sb.append("AAA");
			if (x) {
				sb.append("X");
			}
			sb.append("BBB");
			String ss = sb.substring(2, 5);
			System.out.println(ss);
			if (x) {
				assertEquals("AXB", ss);
			} else {
				assertEquals("ABB", ss);
			}
		}
	}
	
	@Test
	public void deleteTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			StringBuilder sb = new StringBuilder();
			sb.append("AAA");
			if (x) {
				sb.append("X");
			}
			sb.append("BBB");
			sb.delete(2, 5);
			System.out.println(sb);
			if (x) {
				assertEquals("AABB", sb.toString());
			} else {
				assertEquals("AAB", sb.toString());
			}
		}
	}
	
	@Test
	public void indexOfTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			StringBuilder sb = new StringBuilder();
			sb.append("A");
			if (x) {
				sb.append("X");
			}
			sb.append("B");
			int index = sb.indexOf("B"); 
			if (x) {
				assertEquals(2, index);
			} else {
				assertEquals(1, index);
			}
		}
	}

}
