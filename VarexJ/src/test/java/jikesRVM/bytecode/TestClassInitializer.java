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

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class TestClassInitializer extends TestJPF {
	private static class TypeA {
		static {
			initOrder.add("TypeA.<clinit>()");
		}

		static int f() {
			initOrder.add("TypeA.f()");
			return 123;
		}

		static int i = f();
	}

	private static class TypeB {
		static {
			initOrder.add("TypeB.<clinit>()");
		}

		int f() {
			initOrder.add("TypeB.f()");
			return 456;
		}
	}

	private static class TypeC {
		static {
			initOrder.add("TypeC.<clinit>()");
		}
	}

	private static class TypeD extends TypeC {
		static {
			initOrder.add("TypeD.<clinit>()");
		}

		static int i = 123;
	}

	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	@Test
	public void test() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int i = TypeA.i;
			initOrder.add(i); // test initialization before first field
									// reference
			initOrder.add(new TypeB().f()); // test initialization before
													// first instance creation
			initOrder.add(TypeD.i); // test order of superclass
											// initialization
			
			assertEquals("TypeA.<clinit>()", initOrder.get(0).toString());
			assertEquals("TypeA.f()", initOrder.get(1).toString());
			assertEquals("123", initOrder.get(2).toString());
			assertEquals("TypeB.<clinit>()", initOrder.get(3).toString());
			assertEquals("TypeB.f()", initOrder.get(4).toString());
			assertEquals("456", initOrder.get(5).toString());
			assertEquals("TypeC.<clinit>()", initOrder.get(6).toString());
			assertEquals("TypeD.<clinit>()", initOrder.get(7).toString());
			assertEquals("123", initOrder.get(8).toString());
		}
	}
	
	static List<Object> initOrder = new ArrayList<>(9);
	
}
