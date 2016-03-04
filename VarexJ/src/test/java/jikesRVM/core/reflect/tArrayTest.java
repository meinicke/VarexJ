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
package jikesRVM.core.reflect;

import java.lang.reflect.Array;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class tArrayTest extends TestJPF {
	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	@Test
	public void main() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			tArray.main(null);
		}
	}
}

class tArray {

	private int i;

	tArray(int i) {
		this.i = i;
	}

	public String toString() {
		return "tArray " + i;
	}

	public static void main(String[] args) throws Exception {
		Class<?> elementType = Class.forName("jikesRVM.core.reflect.tArray");
		int length = 10;
		Object[] array = (Object[]) Array.newInstance(elementType, length);

		for (int i = 0, n = array.length; i < n; ++i)
			array[i] = new tArray(i);

		for (int i = 0, n = array.length; i < n; ++i) {
			System.out.println(i + ": " + array[i]);
			TestJPF.assertEquals("tArray " + i, array[i].toString());
		}
	}
}
