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

public class TestArrayAccess extends TestJPF {
	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	@Test
	public void test() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			boolean_array();
			byte_array();
			char_array();
			short_array();
			int_array();
			long_array();
			float_array();
			double_array();
			object_array();
			array_array();
			multi_int_array();
			multi_object_array();
			multi_partial_array();
		}
	}

	private static void boolean_array() {
		final boolean[] array = new boolean[] { false, true };
		assertFalse(array[0]);
		assertTrue(array[1]);
	}

	private static void byte_array() {
		final byte[] array = new byte[] { 127, -1 };
		assertEquals(127, array[0]);
		assertEquals(-1, array[1]);
	}

	private static void char_array() {
		final char[] array = new char[] { 'c', '$' };
		assertEquals('c', array[0]);
		assertEquals('$', array[1]);
	}

	private static void short_array() {
		final short[] array = new short[] { 32767, -1 };
		assertEquals(32767, array[0]);
		assertEquals(-1, array[1]);
	}

	private static void int_array() {
		final int[] array = new int[] { 0, 1 };
		assertEquals(0, array[0]);
		assertEquals(1, array[1]);
	}

	private static void long_array() {
		final long[] array = new long[] { 0, 1 };
		assertEquals(0l, array[0]);
		assertEquals(1l, array[1]);
	}

	private static void float_array() {
		final float[] array = new float[] { 0, 1 };
		assertEquals(0f, array[0]);
		assertEquals(1f, array[1]);
	}

	private static void double_array() {
		final double[] array = new double[] { 0, 1 };
		assertEquals(0d, array[0]);
		assertEquals(1d, array[1]);
	}

	private static void object_array() {
		final Object[] array = new Object[] { null, "s" };
		assertNull(array[0]);
		assertEquals("s", array[1]);
		
	}

	private static void array_array() {
		final Object[] array = new Object[] { null, new Object[2] };
		assertNull(array[0]);
		assertEquals("[Ljava.lang.Object;", array[1].getClass().getName());
		
	}

	private static void multi_int_array() {
		final int outer = 2;
		final int middle = 3;
		final int inner = 4;

		final int[][][] ary = new int[outer][middle][inner]; // multianewarray

		int n = 0;
		for (int i = 0; i < outer; ++i)
			for (int j = 0; j < middle; ++j)
				for (int k = 0; k < inner; ++k)
					ary[i][j][k] = n++;

		int expectedValue = 0;
		for (int i = 0; i < outer; ++i) {
			for (int j = 0; j < middle; ++j) {
				for (int k = 0; k < inner; ++k) {
					assertEquals(expectedValue++, ary[i][j][k]);
				}
				
			}
			
		}

		
	}

	private static void multi_object_array() {
		final int outer = 2;
		final int middle = 3;
		final int inner = 4;

		final Integer[][][] ary = new Integer[outer][middle][inner]; // multianewarray

		int n = 0;
		for (int i = 0; i < outer; ++i)
			for (int j = 0; j < middle; ++j)
				for (int k = 0; k < inner; ++k)
					ary[i][j][k] = n++;

		Integer expectedValue = 0;
		for (int i = 0; i < outer; ++i) {
			for (int j = 0; j < middle; ++j) {
				for (int k = 0; k < inner; ++k) {
					assertEquals(expectedValue++, ary[i][j][k]);
				}
				
			}
			
		}

		
	}

	private static void multi_partial_array() {
		final int outer = 2;
		final int middle = 3;

		final int[][][] ary = new int[outer][middle][]; // multianewarray

		for (int i = 0; i < outer; ++i) {
			for (int j = 0; j < middle; ++j) {
				assertEquals("null", String.valueOf(ary[i][j]));
			}
			
		}
	}
}
