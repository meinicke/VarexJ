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

public class TestFinally extends TestJPF {
	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	@SuppressWarnings({ "finally" })
	private static int foo() {
		try {
			int a = 1;
			int b = 0;
			return a / b;
		} catch (Exception e) {
			return 1;
		} finally {
			return 2;
		}
	}

	@SuppressWarnings({ "finally" })
	private static int foo2() {
		try {
			throw new Exception();
		} finally {
			return 3;
		}
	}

	@Conditional
	static boolean a = true;

	@Test
	public void main() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (a) {
				System.out.println("TestFinally.main()");
				System.out.println(TestFinally.foo());
				System.out.println(TestFinally.foo2());
				try {
					System.out.println("hi"); // jsr
					return;
				} finally {
					System.out.println("bye");
				} // ret
			}
		}
	}
}
