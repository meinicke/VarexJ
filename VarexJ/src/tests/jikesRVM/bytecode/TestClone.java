/*
 *  This file is part of the Jikes RVM project (http://jikesrvm.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License. You
 *  may obtain a copy of the License at
 *
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  See the COPYRIGHT.txt file distributed with this work for information
 *  regarding copyright ownership.
 */
package jikesRVM.bytecode;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class TestClone extends TestJPF {
	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	@Test
	public void test() throws CloneNotSupportedException {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			TestClone2.main(null);
		}
	}
}

class TestClone2 implements Cloneable {
	String id;

	TestClone2(String id) {
		this.id = id;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		final TestClone2 a = new TestClone2("a");
		final TestClone2 b = (TestClone2) a.clone();
		runTest(a, b, false);
		a.id = "aa";
		System.out.println();
		System.out.println("Changing clones value.");
		runTest(a, b, true);

		System.out.println();
		System.out.println("Testing arrays.");
		System.out.println();

		TestClone2[][] c = new TestClone2[2][3];
		for (int i = 0; i < 2; ++i)
			for (int j = 0; j < 3; ++j)
				c[i][j] = new TestClone2(i + "" + j);
		final TestClone2[][] d = c.clone();

		runTest(c, d, false);

		System.out.println();
		System.out.println("after changing object value");
		c[1][1].id = "xx";
		runTest(c, d, false);

		System.out.println();
		System.out.println("after changing element");
		c[1][1] = new TestClone2("zz");
		runTest(c, d, false);

		System.out.println();
		System.out.println("after changing row");
		c[1] = new TestClone2[] { new TestClone2("a"), new TestClone2("b"), new TestClone2("c") };
		runTest(c, d, true);
	}

	private static String output(final Object o) {
		StringBuilder values = new StringBuilder();
		if (o instanceof TestClone2[][]) {
			final TestClone2[][] c = (TestClone2[][]) o;
			for (int i = 0; i < 2; ++i) {
				for (int j = 0; j < 3; ++j) {
					System.out.print(c[i][j].id + " ");
					values.append(c[i][j].id);
				}
				System.out.println();
			}
		} else {
			System.out.println(((TestClone2) o).id);
			values.append(((TestClone2) o).id);
		}
		return values.toString();
	}

	private static void runTest(final Object a, final Object b, boolean valuesChanged) {
		System.out.println("Original:");
		String valuesA = output(a);
		System.out.println("Clone:");
		String valuesB = output(b);
		if (valuesChanged) {
			TestJPF.assertFalse(valuesA.equals(valuesB));
		} else {
			TestJPF.assertEquals(valuesA, valuesB);			
		}
		System.out.println("a.equals(b) = " + a.equals(b));
		TestJPF.assertFalse(a.equals(b));
		System.out.println("a == b      = " + (a == b));
		TestJPF.assertFalse((a == b));
	}
}
