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
package jikesRVM.java.lang;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

/*
 */
public class TestMath extends TestJPF {

	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	public static void main(String[] args) {
		new TestMath().test();
	}
	
	@Conditional
	static boolean a = true;
	
	@Test
	public void test() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (a) {
				runFloorTest(1.6, 1.0);
				runFloorTest(1.5, 1.0);
				runFloorTest(1.4, 1.0);
				runFloorTest(1.0, 1.0);

				runFloorTest(-2.0, -2.0);
				runFloorTest(-1.6, -2.0);
				runFloorTest(-1.5, -2.0);
				runFloorTest(-1.4, -2.0);

				System.out.println(Double.NaN == Double.NaN);

				runFloorTest(Double.NaN, Double.NaN);
				runFloorTest(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
				runFloorTest(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
				runFloorTest(-0, -0);
				runFloorTest(0, 0);

				runCeilTest(1.6, 2.0);
				runCeilTest(1.5, 2.0);
				runCeilTest(1.4, 2.0);
				runCeilTest(1.0, 1.0);

				runCeilTest(-2.0, -2.0);
				runCeilTest(-1.6, -1.0);
				runCeilTest(-1.5, -1.0);
				runCeilTest(-1.4, -1.0);

				runCeilTest(Double.NaN, Double.NaN);
				runCeilTest(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);
				runCeilTest(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
				runCeilTest(-0, -0);
				runCeilTest(0, 0);
			}
		}
	}

	private static void runCeilTest(final double value, final double expected) {
		System.out.println("Math.ceil(" + value + ") Expected: " + expected + " Actual: " + Math.ceil(value));
		checkExpected(Math.ceil(value), expected );
	}

	private static void runFloorTest(final double value, final double expected) {
		System.out.println("Math.floor(" + value + ") Expected: " + expected + " Actual: " + Math.floor(value));
		checkExpected(Math.floor(value), expected );
	}
	
	private static void checkExpected (final double value, final double expected) {
		if (Double.isNaN(expected)) {
			assertTrue(Double.isNaN(expected));
		} else {
			assertEquals(expected, value);
		}
	}
}
