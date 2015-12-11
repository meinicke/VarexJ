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

import java.io.Serializable;

import org.junit.Ignore;
import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class TestInstanceOf extends TestJPF {
	static String[] JPF_CONFIGURATION = new String[] { "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice" };

	@Test
	public void main() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			main(null);
		}
	}
	
	@Test
	@Ignore// TODO
	public void defectsTest1() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Magic[] magic = new Magic[2];
			Serializable s = (Serializable) magic;
			if (!(s instanceof Serializable)) {
				fail();
			}
		}
	}
	@Test
	public void defectsTest2() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			
			Object[] objectArray = new Object[1];
			objectArray[0] = new Magic();
			
			Object[][] objectArray2 = new Object[1][1];
			objectArray2[0][0] = new Magic();
			objectArray2[0] = new Magic[1];
			
			Object[][] x3 = new Object[][]{new Magic[4], new Magic[4]};
			runTest("Object[][]{new Magic[4],new Magic[4]}", x3);
		}
	}

  static class Science {}
  static class Magic extends Science {}

  public static void main(String[] args) {
    runTest("Magic()", new Magic());
    runTest("Magic[2]", new Magic[2]);
    runTest("Object[][]{new Magic[4],new Magic[4]}", new Object[][]{new Magic[4], new Magic[4]});
    runTest("Magic[][]{new Magic[4],new Magic[4]}", new Magic[][]{new Magic[4], new Magic[4]});
    runTest("int[2]", new int[2]);
  }

  private static void runTest(final String name, final Object x3) {
    System.out.println("Testing " + name + " - instanceof: ");
    testInstanceOf(x3);
    System.out.println(" casts: ");
    testCasts(x3);
    System.out.println();
  }

  @SuppressWarnings("unused")
private static void testCasts(final Object x) {
    try { final Object o = (Object) x; success(); } catch (final ClassCastException cce) { failure(); }
    try { final Science o = (Science) x; success(); } catch (final ClassCastException cce) { failure(); }
    try { final Magic o = (Magic) x; success(); } catch (final ClassCastException cce) { failure(); }
    try { final Object[] o = (Object[]) x; success(); } catch (final ClassCastException cce) { failure(); }
    try { final Magic[] o = (Magic[]) x; success(); } catch (final ClassCastException cce) { failure(); }
    try { final Science[] o = (Science[]) x; success(); } catch (final ClassCastException cce) { failure(); }
    try { final Object[][] o = (Object[][]) x; success(); } catch (final ClassCastException cce) { failure(); }
    try { final Magic[][] o = (Magic[][]) x; success(); } catch (final ClassCastException cce) { failure(); }
    try { final Science[][] o = (Science[][]) x; success(); } catch (final ClassCastException cce) { failure(); }
    try { final int[] o = (int[]) x; success(); } catch (final ClassCastException cce) { failure(); }
//    try { final Serializable o = (Serializable) x; success(); } catch (final ClassCastException cce) { failure(); }
//    try { final Cloneable o = (Cloneable) x; success(); } catch (final ClassCastException cce) { failure(); }
  }

  private static void failure() {System.out.print("0");}

  private static void success() {System.out.print("1");}

  private static void testInstanceOf(final Object x) {
    io(Object.class, (x instanceof Object));
    io(Science.class, (x instanceof Science));
    io(Magic.class, (x instanceof Magic));
    io(Object[].class, (x instanceof Object[]));
    io(Science[].class, (x instanceof Science[]));
    io(Magic[].class, (x instanceof Magic[]));
    io(Object[][].class, (x instanceof Object[][]));
    io(Science[][].class, (x instanceof Science[][]));
    io(Magic[][].class, (x instanceof Magic[][]));
    io(int[].class, (x instanceof int[]));
//    io(Serializable.class, (x instanceof Serializable));
//    io(Cloneable.class, (x instanceof Cloneable));
  }

  @SuppressWarnings("rawtypes")
private static void io(final Class type, final boolean test) {
    System.out.print(test ? "1" : "0");
  }
}
