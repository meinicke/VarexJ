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
package jikesRVM.core.bytecode;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class TestFieldAccess extends TestJPF {
	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	static boolean s0 = true;
	static byte s1 = -1;
	static char s2 = 'A';
	static short s3 = -3;
	static int s4 = -4;
	static long s5 = -5;
	static float s6 = -6;
	static double s7 = -7;
	static Object s8 = new TestFieldAccess();

	boolean x0 = true;
	byte x1 = -1;
	char x2 = 'A';
	short x3 = -3;
	int x4 = -4;
	long x5 = -5;
	float x6 = -6;
	double x7 = -7;
	Object x8 = this;

	public String toString() {
		return "Instance of " + getClass().getName();
	}

	@Conditional
	static boolean a = true;

	@Test
	public void main() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (a) {
				boolean x0 = true;
				byte x1 = -1;
				char x2 = 'A';
				short x3 = -3;
				int x4 = -4;
				long x5 = -5;
				float x6 = -6;
				double x7 = -7;

				System.out.println(TestFieldAccess.s0);
				assertEquals(x0, TestFieldAccess.s0);
				System.out.println(TestFieldAccess.s1);
				assertEquals(x1, TestFieldAccess.s1);
				System.out.println(TestFieldAccess.s2);
				assertEquals(x2, TestFieldAccess.s2);
				System.out.println(TestFieldAccess.s3);
				assertEquals(x3, TestFieldAccess.s3);
				System.out.println(TestFieldAccess.s4);
				assertEquals(x4, TestFieldAccess.s4);
				System.out.println(TestFieldAccess.s5);
				assertEquals(x5, TestFieldAccess.s5);
				System.out.println(TestFieldAccess.s6);
				assertEquals(x6, TestFieldAccess.s6);
				System.out.println(TestFieldAccess.s7);
				assertEquals(x7, TestFieldAccess.s7);
				System.out.println(TestFieldAccess.s8);

				TestFieldAccess b = new TestFieldAccess();
				System.out.println(b.x0);
				assertEquals(x0, b.x0);
				System.out.println(b.x1);
				assertEquals(x1, b.x1);
				System.out.println(b.x2);
				assertEquals(x2, b.x2);
				System.out.println(b.x3);
				assertEquals(x3, b.x3);
				System.out.println(b.x4);
				assertEquals(x4, b.x4);
				System.out.println(b.x5);
				assertEquals(x5, b.x5);
				System.out.println(b.x6);
				assertEquals(x6, b.x6);
				System.out.println(b.x7);
				assertEquals(x7, b.x7);
				System.out.println(b.x8);
				assertSame(b, b.x8);
			}
		}
	}
}
