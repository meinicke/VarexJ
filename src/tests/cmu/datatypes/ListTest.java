package cmu.datatypes;

import java.util.LinkedList;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class ListTest extends TestJPF {
	static String[] JPF_CONFIGURATION = {/*"+interaction=interaction",*/"+choice=MapChoice", "+search.class= .search.RandomSearch", "+invocation=true"};
	@Conditional static boolean a1 = true;
	@Conditional static boolean a2 = true;
	@Conditional static boolean a3 = true;
	@Conditional static boolean a4 = true;
	@Conditional static boolean a5 = true;
	@Conditional static boolean a6 = true;
	@Conditional static boolean a7 = true;
	@Conditional static boolean a8 = true;
	@Conditional static boolean a9 = true;
	@Conditional static boolean a10 = true;
	@Conditional static boolean a11 = true;
	@Conditional static boolean a12 = true;
	@Conditional static boolean a13 = true;
	@Conditional static boolean a14 = true;
	@Conditional static boolean a15 = true;
	@Conditional static boolean a16 = true;
	@Conditional static boolean a17 = true;
	@Conditional static boolean a18 = true;
	@Conditional static boolean a19 = true;
	@Conditional static boolean a20 = true;
	@Conditional static boolean a21 = true;
	@Conditional static boolean a22 = true;
	@Conditional static boolean a23 = true;
	@Conditional static boolean a24 = true;
	@Conditional static boolean a25 = true;
	@Conditional static boolean a26 = true;
	@Conditional static boolean a27 = true;
	@Conditional static boolean a28 = true;
	@Conditional static boolean a29 = true;
	@Conditional static boolean a30 = true;


	@Test
	public void linkedListTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			LinkedList<Character> list = new LinkedList<>();
			if (a1) list = new LinkedList<>();
			list.add('0');
			if (a1) {list.add('c');}else{list.add('c');}
			if (a2) {list.add('c');}else{list.add('c');}
			if (a3) {list.add('c');}else{list.add('c');}
			if (a4) {list.add('c');}else{list.add('c');}
			if (a5) {list.add('c');}else{list.add('c');}
			if (a6) {list.add('c');}else{list.add('c');}
			if (a7) {list.add('c');}else{list.add('c');}
			if (a8) {list.add('c');}else{list.add('c');}
			if (a9) {list.add('c');}else{list.add('c');}
			if (a10) {list.add('c');}else{list.add('c');}
			if (a11) {list.add('c');}else{list.add('c');}
			if (a12) {list.add('c');}else{list.add('c');}
			if (a13) {list.add('c');}else{list.add('c');}
			if (a14) {list.add('c');}else{list.add('c');}
			if (a15) {list.add('c');}else{list.add('c');}
			if (a16) {list.add('c');}else{list.add('c');}
			if (a17) {list.add('c');}else{list.add('c');}
			if (a18) {list.add('c');}else{list.add('c');}
			if (a19) {list.add('c');}else{list.add('c');}
			if (a20) {list.add('c');}else{list.add('c');}
			if (a21) {list.add('c');}else{list.add('c');}
			if (a22) {list.add('c');}else{list.add('c');}
			if (a23) {list.add('c');}else{list.add('c');}
			if (a24) {list.add('c');}else{list.add('c');}
			if (a25) {list.add('c');}else{list.add('c');}
			if (a26) {list.add('c');}else{list.add('c');}
			if (a27) {list.add('c');}else{list.add('c');}
			if (a28) {list.add('c');}else{list.add('c');}
			if (a29) {list.add('c');}else{list.add('c');}
			if (a30) {list.add('c');}else{list.add('c');}
			list.removeFirst();
			System.out.println(list.size());
			for (Character e : list) {
				System.out.println(e);
			}
//			list.toString();
			System.out.println(list);
////			System.out.println();
//			System.out.println(list);
		}
	}
	
	@Test
	public void invocationTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			C c = new C(0);
			if (a1) {c = new C(c);}
			if (a2) {c = new C(c);}
			if (a3) {c = new C(c);}
			if (a4) {c = new C(c);}
			if (a5) {c = new C(c);}
			if (a6) {c = new C(c);}
			if (a7) {c = new C(c);}
			if (a8) {c = new C(c);}
			if (a9) {c = new C(c);}
			if (a10) {c = new C(c);}
			if (a11) {c = new C(c);}
			if (a12) {c = new C(c);}
			if (a13) {c = new C(c);}
			if (a14) {c = new C(c);}
			if (a15) {c = new C(c);}
			if (a16) {c = new C(c);}
			if (a17) {c = new C(c);}
			if (a18) {c = new C(c);}
			if (a19) {c = new C(c);}
			if (a20) {c = new C(c);}
			if (a21) {c = new C(c);}
			if (a22) {c = new C(c);}
			if (a23) {c = new C(c);}
			if (a24) {c = new C(c);}
			if (a25) {c = new C(c);}
			if (a26) {c = new C(c);}
			if (a27) {c = new C(c);}
			if (a28) {c = new C(c);}
			if (a29) {c = new C(c);}
			if (a30) {c = new C(c);}
			c.method();
		}
	}
	
	class C {
		int i = 0;
		public C(C c) {
			i = c.i + 1;
		}
		public C(int i) {
			this.i = i;
		}

		void method() {
			for (int i = 0; i < 1000; i++) {}
			System.out.println("ListTest.C.method()");
		}
	}
}
