package cmu.datatypes;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class ListTest extends TestJPF {
	static String[] JPF_CONFIGURATION = {"+choice=MapChoice", "+search.class= .search.RandomSearch"};
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
	static boolean i = true;
	@Conditional
	static boolean j = true;
	@Conditional
	static boolean k = true;
	@Conditional
	static boolean l = true;
	@Conditional
	static boolean m = true;
	@Conditional
	static boolean n = true;


	@Test
	public void linkedListTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			List<Character> list = new LinkedList<>();
			if (a) {
				list.add('a');
			}
			if (b) {
				list.add('b');
			}
			if (c) {
				list.add('c');
			}
			if (d) {
				list.add('d');
			}
			if (e) {
				list.add('e');
			}
			if (f) {
				list.add('f');
			}
			if (g) {
				list.add('g');
			}
			if (h) {
				list.add('h');
			}
			if (i) {
				list.add('i');
			}
			if (j) {
				list.add('j');
			}
			if (k) {
				list.add('k');
			}
			if (l) {
				list.add('l');
			}
			if (m) {
				list.add('m');
			}
			if (n) {
				list.add('n');
			}
			System.out.println(list);
			System.out.println();
			System.out.println(list.size());
		}
	}
}
