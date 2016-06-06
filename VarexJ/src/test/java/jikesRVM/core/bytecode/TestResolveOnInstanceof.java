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

/**
 * According the the definition of instanceof the method must be resolved prior to any other checks.
 * See http://java.sun.com/docs/books/jvms/second_edition/html/Instructions2.doc6.html#instanceof.Description
 *
 * Also described in [ 1147107 ]  unresolved instanceof etc. on &lt;null&gt; not compliant.
 */
public class TestResolveOnInstanceof extends TestJPF {
	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	@Conditional
	static boolean a = true;

	@Test
	public void main() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (a) {
				assertFalse(doInstanceOf(new Object()));
			}
		}
	}

  static interface A {
    String genString();
  }

  public static void main(String[] args) {
    System.out.println(doInstanceOf(new Object()));
  }

  static boolean doInstanceOf(final Object a) {
    return a instanceof A;
  }
}
