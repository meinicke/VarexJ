package cmu.datatypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class LinkedListTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";
	
	@Conditional
	static boolean a = true;
	@Conditional
	static boolean b = true;
	@Conditional
	static boolean c = true;
	@Conditional
	static boolean d = true;

	@Test
	public void testSameList() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			LinkedList<Integer> list = new LinkedList<>();
			if (a) {
				list.add(1);
			} else {
				list.add(2);
			}
			System.out.println(list.getFirst());
		}
	}
	
	@Test
	public void testDifferentList() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			LinkedList<Integer> list = new LinkedList<>();
			if (a) {
				list.add(1);
			} else {
				list = new LinkedList<>();
				list.add(1);
			}
			assertEquals(new Integer(1), list.getFirst());
			System.out.println(list.getFirst());
		}
	}
	
	@Test
	public void testDifferentList2() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			List<Integer> list = new LinkedList<>();
			list.add(1);
			if (b) {
				list.add(2);
			}
			list.get(0);
			
		}
	}
}
