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

public class TestReturn extends TestJPF {
	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	@Test
	public void main() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			assertEquals(true, boolean_f());
			assertEquals((byte)2, byte_f());
			assertEquals('a', char_f());
			assertEquals((short)4, short_f());
			assertEquals(5, int_f());
			assertEquals(6l, long_f());
			assertEquals(7.0f, float_f());
			assertEquals(8.0d, double_f());
			assertEquals(null, object_f());
			assertEquals(null, primitive_array_f());
			assertEquals(null, object_array_f());
		}
	}

  private static boolean boolean_f() { return true; }

  private static byte byte_f() { return 2; }

  private static char char_f() { return 'a'; }

  private static short short_f() { return 4; }

  private static int int_f() { return 5; }

  private static long long_f() { return 6L; }

  private static float float_f() { return 7.0F; }

  private static double double_f() { return 8.0; }

  private static Object object_f() { return null; }

  private static int[] primitive_array_f() { return null; }

  private static Object[] object_array_f() { return null; }
}
