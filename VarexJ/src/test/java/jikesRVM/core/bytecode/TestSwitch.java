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

import gov.nasa.jpf.util.test.TestJPF;

public class TestSwitch extends TestJPF {
	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	@Test
	public void main() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int j;

			// tableswitch
			StringBuilder actual = new StringBuilder();
			System.out.print("tableswitch Expected: 99101112 Actual: ");
			for (int i = 9; i < 13; i += 1) {
				switch (i) {
				case 10:
					j = 10;
					break;
				case 11:
					j = 11;
					break;
				case 12:
					j = 12;
					break;
				case 13:
					j = 13;
					break;
				case 14:
					j = 14;
					break;
				case 15:
					j = 15;
					break;
				case 16:
					j = 16;
					break;
				case 17:
					j = 17;
					break;
				case 18:
					j = 18;
					break;
				default:
					j = 99;
					break;
				}

				System.out.print(j);
				actual.append(j);
			}
			assertEquals("99101112", actual.toString());
			System.out.println();

			actual = new StringBuilder();
			// lookupswitch
			System.out.print("lookupswitch Expected: 99102030405099 Actual: ");
			for (int i = 0; i < 70; i += 10) {
				switch (i) {
				case 10:
					j = 10;
					break;
				case 20:
					j = 20;
					break;
				case 30:
					j = 30;
					break;
				case 40:
					j = 40;
					break;
				case 50:
					j = 50;
					break;
				default:
					j = 99;
					break;
				}
				System.out.print(j);
				actual.append(j);
			}
			assertEquals("99102030405099", actual.toString());
			System.out.println();
		}
	}
}
