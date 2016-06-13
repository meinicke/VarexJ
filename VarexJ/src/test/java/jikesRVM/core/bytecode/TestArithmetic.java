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

public class TestArithmetic extends TestJPF {
  private static int int_3 = -3;
  private static int int1 = 1;
  private static int int3 = 3;
  private static int int5 = 5;
  private static int int33 = 33;
  private static int int65 = 65;
  private static long long_3 = -3;
  private static long long_1 = -1;
  private static long long0 = 0;
  private static long long2 = 2;
  private static long long10000000000 = 10000000000L;
  private static long long0x0110000000000011 = 0x0110000000000011L;
  private static long long0x1010000000000101 = 0x1010000000000101L;
  private static long long0xBEEFBEEFCAFEBABE = 0xBEEFBEEFCAFEBABEL;

  
  static String[] JPF_CONFIGURATION = new String[]{"+stack=HybridStackHandler", "+nhandler.delegateUnhandledNative", "+search.class=.search.RandomSearch", "+choice=MapChoice"};

  @Conditional
  static boolean a = true;
  
	@Test
	public void test() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (a) {
				System.out.println();
				System.out.println("-- itest --");
				itest();
				System.out.println();
				System.out.println("-- ltest --");
				ltest();
				System.out.println();
				System.out.println("-- ftest --");
				ftest();
				System.out.println();
				System.out.println("-- dtest --");
				dtest();
				System.out.println();
				System.out.println("-- nanTestFloat --");
				nanTestFloat();
				System.out.println();
				System.out.println("-- nanTestDouble --");
				nanTestDouble();
				System.out.println();
				System.out.println("-- remTest --");
				remTest();
			}
		}
	}

  private static void itest() {
    int a = int3;
    assertEquals(4, a + 1);// iadd  
    assertEquals(2, a - 1);// isub  
    assertEquals(9, a * 3);// imul
    assertEquals(1, a / 2);// idiv
    assertEquals(1, a % 2);// irem
    assertEquals(-3, -a);// ineg
    assertEquals(4, ++a);// iinc
    a = int_3;
    assertEquals(-2, a + 1);// iadd
    assertEquals(-4, a - 1);// isub
    assertEquals(-9, a * 3);// imul
    assertEquals(-1, a / 2);// idiv
    assertEquals(-1, a % 2);// irem
    assertEquals(3, -a);// ineg 
    assertEquals(-2, ++a); // iinc
    
    a = int3;     // 0x00000011j
    int b = int5; // 0x00000101

    assertEquals(1, a & b);// iand
    assertEquals(7, a | b);// ior
    assertEquals(6, a ^ b);// ixor
    
    a = int_3; // 0xfffffffd;

    assertEquals(-6, a << 1);// ishl
    assertEquals(-2, a >> 1);// ishr
    assertEquals(2147483646, a >>> 1);// iushr

    // funny Java shift cases
    a = int1;

    assertEquals(1, a << 32);
    assertEquals(0, (a << 16) << 16);
    assertEquals(2, a << 33);
    assertEquals(-2147483648, a << -1);
    assertEquals(1, a << -32);
    assertEquals(-2147483648, a << -33);
    assertEquals(2, 1 << int33);
    
    assertEquals(1, a >> 32);
    assertEquals(0, (a >> 16) >> 16);
    assertEquals(0, a >> 33);
    assertEquals(0, a >> -1);
    assertEquals(1, a >> -32);
    assertEquals(0, a >> -33);
    assertEquals(-2, -4 >> int33);

    assertEquals(1, a >>> 32);
    assertEquals(0, (a >>> 16) >>> 16);
    assertEquals(0, a >>> 33);
    assertEquals(0, a >>> -1);
    assertEquals(1, a >>> -32);
    assertEquals(0, a >>> -33);
    assertEquals(2147483646, -4 >>> int33);

    // IA32 bit test patterns
    assertEquals(true, ((1 << int1) & int3) != 0);
    assertEquals(false, ((1 << int1) & int3) == 0);
    assertEquals(true, ((1 << int33) & int3) != 0);
    
    assertEquals(true, (int3 & (1 << int1)) != 0);
    assertEquals(false, (int3 & (1 << int1)) == 0);
    assertEquals(true, (int3 & (1 << int33)) != 0);
    if (((1 << int1) & int3) != 0) {
      System.out.println("taken");
    } else {
    	fail();
    }

    assertEquals(true, ((int3 >> int1) & 1) == 1);
    assertEquals(false, ((int3 >> int1) & 1) != 1);
    assertEquals(true, ((int3 >> int1) & 1) != 0);
    assertEquals(false, ((int3 >> int1) & 1) == 0);
    assertEquals(true, ((int3 >> int33) & 1) == 1);
    if (((int3 >> int1) & 1) != 0) {
      System.out.println("taken");
    } else {
    	fail();
    }

    assertEquals(true, ((int3 >>> int1) & 1) == 1);
    assertEquals(false, ((int3 >>> int1) & 1) != 1);
    assertEquals(true, ((int3 >>> int1) & 1) != 0);
    assertEquals(false, ((int3 >>> int1) & 1) == 0);
    assertEquals(true, ((int3 >>> int33) & 1) == 1);
    if (((int3 >>> int1) & 1) == 1) {
      System.out.println("taken");
    } else {
    	fail();
    }

    // Rotate tests
    assertEquals(10, (int5 << 1)|(int5 >>> -1)); // Rotate left by 1
    assertEquals(10, (int5 >>> -1)|(int5 << 1));// Rotate left by 1
    assertEquals(-2147483646 , (int5 << -1)|(int5 >>> 1));// Rotate right by 1
    assertEquals(-2147483646 , (int5 >>> 1)|(int5 << -1));// Rotate right by 1
    assertEquals(10, (int5 << int1)|(int5 >>> -int1));// Rotate left by 1
    assertEquals(10, (int5 >>> -int1)|(int5 << int1));// Rotate left by 1
    assertEquals(-2147483646, (int5 << -int1)|(int5 >>> int1));// Rotate right by 1 
    assertEquals(-2147483646, (int5 >>> int1)|(int5 << -int1));// Rotate right by 1
  }

  private static void ltest() {
    long a = long10000000000;
    long b = long2;

    assertEquals(10000000002l ,a + b);  // ladd
    assertEquals(9999999998l ,a - b);  // lsub
    assertEquals(20000000000l ,a * b);  // lmul
    assertEquals(5000000000l ,a / b);  // ldiv
    assertEquals(0l ,a % b);  // lrem
    assertEquals(-2l ,-b);  // lneg
    assertEquals(-10000000000l ,-a);  // lneg

    a = long_3;

    assertEquals(-1l ,a + 2);  // ladd
    assertEquals(-5l ,a - 2);  // lsub
    assertEquals(-9l ,a * 3);  // lmul
    assertEquals(-1l ,a / 2);  // ldiv
    assertEquals(-1l ,a % 2);  // lrem
    assertEquals(3l ,-a);  // lneg

    a = long0x0110000000000011;
    b = long0x1010000000000101;

    assertEquals(4503599627370497l ,a & b);  // land
    assertEquals(1229482698272145681l ,a | b);  // lor
    assertEquals(1224979098644775184l ,a ^ b);  // lxor

    // bit patterns that can be optimized for certain operators if converting
    // long operators into int operators
    long long0x00000000FFFFFFFF = 0x00000000FFFFFFFFL;
    long long0xFFFFFFFF00000000 = 0xFFFFFFFF00000000L;
    long long0x00000001FFFFFFFF = 0x00000001FFFFFFFFL;
    long long0xFFFFFFFF00000001 = 0xFFFFFFFF00000001L;
    long long0x0000000100000000 = 0x0000000100000000L;
    long long0x0000000100000001 = 0x0000000100000001L;

    a = long_1;

    assertEquals(-4294967295l ,a * long0x00000000FFFFFFFF);
    assertEquals(4294967296l ,a * long0xFFFFFFFF00000000);
    assertEquals(-8589934591l ,a * long0x00000001FFFFFFFF);
    assertEquals(4294967295l ,a * long0xFFFFFFFF00000001);
    assertEquals(-4294967296l ,a * long0x0000000100000000);
    assertEquals(-4294967297l ,a * long0x0000000100000001);

    assertEquals(4294967295l ,a & long0x00000000FFFFFFFF);
    assertEquals(-4294967296l ,a & long0xFFFFFFFF00000000);
    assertEquals(8589934591l ,a & long0x00000001FFFFFFFF);
    assertEquals(-4294967295l ,a & long0xFFFFFFFF00000001);
    assertEquals(4294967296l ,a & long0x0000000100000000);
    assertEquals(4294967297l ,a & long0x0000000100000001);

    a = long0;

    assertEquals(4294967295l ,a | long0x00000000FFFFFFFF);
    assertEquals(-4294967296l ,a | long0xFFFFFFFF00000000);
    assertEquals(8589934591l ,a | long0x00000001FFFFFFFF);
    assertEquals(-4294967295l ,a | long0xFFFFFFFF00000001);
    assertEquals(4294967297l ,a | long0x0000000100000001);

    assertEquals(4294967295l ,a ^ long0x00000000FFFFFFFF);
    assertEquals(-4294967296l ,a ^ long0xFFFFFFFF00000000);
    assertEquals(8589934591l ,a ^ long0x00000001FFFFFFFF);
    assertEquals(-4294967295l ,a ^ long0xFFFFFFFF00000001);
    assertEquals(4294967297l ,a ^ long0x0000000100000001);

    a = long0xBEEFBEEFCAFEBABE;

    assertEquals(9070106573795063164l ,a << 1);  // lshl
    assertEquals(-306530926119425288l ,a << 2);
    assertEquals(-613061852238850576l ,a << 3);
    assertEquals(-1226123704477701152l ,a << 4);
    assertEquals(-1171235197933666816l ,a << 8);
    assertEquals(-4688305491665879040l ,a << 16);
    assertEquals(-3819410108757049344l ,a << 32);
    assertEquals(-7638820217514098688l ,a << 33);
    assertEquals(3169103638681354240l ,a << 34);
    assertEquals(6338207277362708480l ,a << 35);
    assertEquals(-5770329518984134656l ,a << 36);
    assertEquals(-91551935198396416l ,a << 40);
    assertEquals(-4990551337079930880l ,a << 48);
    assertEquals(-4755801206503243776l ,a << 56);
    assertEquals(0l ,a << 63);
    assertEquals(-4688318749957244226l ,a << 64);
    assertEquals(9070106573795063164l ,a << 65);
    assertEquals(9070106573795063164l ,a << int65);

    assertEquals(-2344159374978622113l ,a >> 1);  // lshr
    assertEquals(-1172079687489311057l ,a >> 2);
    assertEquals(-586039843744655529l ,a >> 3);
    assertEquals(-293019921872327765l ,a >> 4);
    assertEquals(-18313745117020486l ,a >> 8);
    assertEquals(-71538066863362l ,a >> 16);
    assertEquals(-1091584273l ,a >> 32);
    assertEquals(-545792137l ,a >> 33);
    assertEquals(-272896069l ,a >> 34);
    assertEquals(-136448035l ,a >> 35);
    assertEquals(-68224018l ,a >> 36);
    assertEquals(-4264002l ,a >> 40);
    assertEquals(-16657l ,a >> 48);
    assertEquals(-66l ,a >> 56);
    assertEquals(-1l ,a >> 63);
    assertEquals(-4688318749957244226l ,a >> 64);
    assertEquals(-2344159374978622113l ,a >> 65);
    assertEquals(-2344159374978622113l ,a >> int65);

    assertEquals(6879212661876153695l ,a >>> 1);  // lushr
    assertEquals(3439606330938076847l ,a >>> 2);
    assertEquals(1719803165469038423l ,a >>> 3);
    assertEquals(859901582734519211l ,a >>> 4);
    assertEquals(53743848920907450l ,a >>> 8);
    assertEquals(209936909847294l ,a >>> 16);
    assertEquals(3203383023l ,a >>> 32);
    assertEquals(1601691511l ,a >>> 33);
    assertEquals(800845755l ,a >>> 34);
    assertEquals(400422877l ,a >>> 35);
    assertEquals(200211438l ,a >>> 36);
    assertEquals(12513214l ,a >>> 40);
    assertEquals(48879l ,a >>> 48);
    assertEquals(190l ,a >>> 56);
    assertEquals(1l ,a >>> 63);
    assertEquals(-4688318749957244226l ,a >>> 64);
    assertEquals(6879212661876153695l ,a >>> 65);
    assertEquals(6879212661876153695l ,a >>> int65);
  }

  private static float float0 = 0.0f;
  private static float float0_9 = 0.9f;
  private static float float1 = 1.0f;
  private static float float1_5 = 1.5f;
  private static float float2 = 2.0f;
  private static float float_maxint = (float)Integer.MAX_VALUE;
  private static float float_minint = (float)Integer.MIN_VALUE;
  private static double double0 = 0.0f;
  private static double double1 = 1.0f;
  private static double double2 = 2.0f;
  private static double double_maxint = (double)Integer.MAX_VALUE;
  private static double double_minint = (double)Integer.MIN_VALUE;
  private static float float_maxlong = (float)Long.MAX_VALUE;
  private static float float_minlong = (float)Long.MIN_VALUE;
  private static double double_maxlong = (double)Long.MAX_VALUE;
  private static double double_minlong = (double)Long.MIN_VALUE;

  private static void ftest() {
    // f2i, d2i, f2l and d2l tests
    assertEquals(0f ,(int)float0);
    assertEquals(1f ,(int)float1);
    assertEquals(0f ,(int)double0);
    assertEquals(1f ,(int)double1);
    assertEquals(0f ,(int)Float.NaN);
    assertEquals(0f ,(int)-Float.NaN);
    assertEquals(0f ,(int)Double.NaN);
    assertEquals(0f ,(int)-Double.NaN);
    float positiveInfinity = Float.POSITIVE_INFINITY;
	assertEquals(2147483647f ,(int)positiveInfinity);
    assertEquals(-2147483648f ,(int)Float.NEGATIVE_INFINITY);
    assertEquals(2147483647f ,(int)float_maxint);
    assertEquals(-2147483648f ,(int)float_minint);
    assertEquals(2147483647f ,(int)double_maxint);
    assertEquals(-2147483648f ,(int)double_minint);

    assertEquals(0f ,(long)float0);
    assertEquals(1f ,(long)float1);
    assertEquals(0f ,(long)double0);
    assertEquals(1f ,(long)double1);
    assertEquals(0f ,(long)Float.NaN);
    assertEquals(0f ,(long)-Float.NaN);
    assertEquals(0f ,(long)Double.NaN);
    assertEquals(0f ,(long)-Double.NaN);
    assertEquals(9223372036854775807f ,(long)positiveInfinity);
    assertEquals(-9223372036854775808f ,(long)Float.NEGATIVE_INFINITY);
    assertEquals(9223372036854775807f ,(long)float_maxlong);
    assertEquals(-9223372036854775808f ,(long)float_minlong);
    assertEquals(9223372036854775807f ,(long)double_maxlong);
    assertEquals(-9223372036854775808f ,(long)double_minlong);

    float a = float1;
    float b = float2;

    assertEquals(Integer.toHexString(Float.floatToIntBits(3.0F)) ,Integer.toHexString(Float.floatToIntBits(a + b)));  // fadd
    assertEquals(Integer.toHexString(Float.floatToIntBits(-1.0F)) ,Integer.toHexString(Float.floatToIntBits(a - b)));  // fsub
    assertEquals(Integer.toHexString(Float.floatToIntBits(2.0F)) ,Integer.toHexString(Float.floatToIntBits(a * b)));  // fmul
    assertEquals(Integer.toHexString(Float.floatToIntBits(0.5F)) ,Integer.toHexString(Float.floatToIntBits(a / b)));  // fdiv
    assertEquals(Integer.toHexString(Float.floatToIntBits(-1.0F)) ,Integer.toHexString(Float.floatToIntBits(-a)));  // fneg

    a = float1_5;
    b = float0_9;
    assertEquals(Integer.toHexString(Float.floatToIntBits(0.6F)) ,Integer.toHexString(Float.floatToIntBits(a % b)));  // frem

    assertTrue(Float.isNaN(Float.NaN));
    assertTrue(Float.isNaN(float0/float0));
    assertTrue(Float.isNaN(Float.NaN + Float.NaN));
    assertTrue(Float.isNaN(Float.NaN + float2));
    assertTrue(Float.isNaN(Float.NaN * float2));
    assertTrue(Float.isNaN((float0 / 0.0f) * positiveInfinity));
    assertTrue(Float.isNaN((float1 / 0.0f) * 0.0f));
    assertTrue(Float.isNaN((float1 / 0.0f) - (float1 / 0.0f)));
    assertTrue(Float.isNaN((float1 / 0.0f) / (float1 / 0.0f)));
    assertTrue(Float.isNaN((-float1 / 0.0f) * 0.0f));
    assertTrue(Float.isNaN((-float1 / 0.0f) - (-float1 / 0.0f)));
    assertFalse(Float.NaN > float1);
    assertFalse(Float.NaN < float1);
    assertFalse(Float.NaN == float1);
    assertFalse(Float.NaN == -float1);
    assertFalse(Float.NaN > positiveInfinity);
    assertFalse(Float.NaN < positiveInfinity);
    assertTrue(positiveInfinity == positiveInfinity);
    assertTrue((-positiveInfinity == Float.NEGATIVE_INFINITY));
    assertTrue(Float.NEGATIVE_INFINITY < float1);
    assertTrue((-float1/0.0) == (-float1/0.0));
    assertEquals(positiveInfinity,float1/0.0);
    assertEquals(positiveInfinity ,(float1/0.0) + 2.0);
    assertEquals(positiveInfinity ,(float1/0.0) * 0.5);
    assertEquals(positiveInfinity ,(float1/0.0) + (float1/0.0));
    assertEquals(positiveInfinity ,(float1/0.0) * (float1/0.0));
    assertEquals(positiveInfinity ,Math.abs(-float1/0.0));
    assertEquals(Float.NEGATIVE_INFINITY ,-float1/0.0);
    assertEquals(Float.NEGATIVE_INFINITY ,(-float1/0.0) + 2.0);
    assertEquals(Float.NEGATIVE_INFINITY ,(-float1/0.0) * 0.5);
    assertEquals(2147483647f ,(int)(float1/0.0));
    assertEquals(-2147483648f ,(int)(-float1/0.0));
    assertEquals(0f ,(int)Float.NaN);
  }

  private static void dtest() {
    double a = 1;
    double b = 2;

    assertEquals(Long.toHexString(Double.doubleToLongBits(3.0D)), Long.toHexString(Double.doubleToLongBits(a + b)));  // dadd
    assertEquals(Long.toHexString(Double.doubleToLongBits(-1.0D)),Long.toHexString(Double.doubleToLongBits(a - b)));  // dsub
    assertEquals(Long.toHexString(Double.doubleToLongBits(2.0D)),Long.toHexString(Double.doubleToLongBits(a * b)));  // dmul
    assertEquals(Long.toHexString(Double.doubleToLongBits(0.5D)),Long.toHexString(Double.doubleToLongBits(a / b)));  // ddiv
    assertEquals(Long.toHexString(Double.doubleToLongBits(-1.0D)),Long.toHexString(Double.doubleToLongBits(-a)));  // dneg
    a = 1.5;
    b = 0.9;
    assertEquals(Long.toHexString(Double.doubleToLongBits(0.6D)),Long.toHexString(Double.doubleToLongBits(a % b)));  // drem

    assertTrue(Double.isNaN(double0/double0));
    assertTrue(Double.isNaN(Double.NaN + Double.NaN));
    assertTrue(Double.isNaN(Double.NaN + double2));
    assertTrue(Double.isNaN(Double.NaN * double2));
    double positiveInfinity = Double.POSITIVE_INFINITY;
	assertTrue(Double.isNaN((double0 / 0.0) * positiveInfinity));
    assertTrue(Double.isNaN((double1 / 0.0) * 0.0));
    assertTrue(Double.isNaN((double1 / 0.0) - (double1 / 0.0)));
    assertTrue(Double.isNaN((double1 / 0.0) / (double1 / 0.0)));
    assertTrue(Double.isNaN((-double1 / 0.0) * 0.0));
    assertTrue(Double.isNaN((-double1 / 0.0) - (-double1 / 0.0)));
    assertFalse(Double.NaN > double1);
    assertFalse(Double.NaN < double1);
    assertFalse(Double.NaN == double1);
    assertFalse(Double.NaN == -double1);
    assertFalse(Double.NaN > positiveInfinity);
    assertFalse(Double.NaN < positiveInfinity);
    assertTrue(positiveInfinity == positiveInfinity);
    assertTrue(-positiveInfinity == Double.NEGATIVE_INFINITY);
    assertTrue(Double.NEGATIVE_INFINITY < double1);
    assertTrue((-double1/0.0) == (-double1/0.0));
    assertEquals(positiveInfinity ,double1/0.0);
    assertEquals(positiveInfinity,(double1/0.0) + 2.0);
    assertEquals(positiveInfinity,(double1/0.0) * 0.5);
    assertEquals(positiveInfinity,(double1/0.0) + (double1/0.0));
    assertEquals(positiveInfinity,(double1/0.0) * (double1/0.0));
    assertEquals(positiveInfinity,Math.abs(-double1/0.0));
    assertEquals(Double.NEGATIVE_INFINITY ,-double1/0.0);
    assertEquals(Double.NEGATIVE_INFINITY,(-double1/0.0) + 2.0);
    assertEquals(Double.NEGATIVE_INFINITY,(-double1/0.0) * 0.5);
    assertEquals(2147483647 ,(int)(double1/0.0));
    assertEquals(-2147483648 ,(int)(-double1/0.0));
    assertEquals(0 ,(int)Double.NaN);
  }

  private static void nanTestFloat() {
    float zero = float0;
    float NaN = zero / zero;

    assertFalse(NaN < NaN);
    assertFalse(NaN <= NaN);
    assertFalse(NaN == NaN);
    assertTrue(NaN != NaN);
    assertFalse(NaN >= NaN);
    assertFalse(NaN > NaN);
  }

  private static void nanTestDouble() {
    double zero = 0;
    double NaN = zero / zero;

    assertFalse(NaN < NaN);
    assertFalse(NaN <= NaN);
    assertFalse(NaN == NaN);
    assertTrue(NaN != NaN);
    assertFalse(NaN >= NaN);
    assertFalse(NaN > NaN);
  }

  private static void remTest() {
    rem(+2, +3);
    rem(+2, -3);
    rem(-2, +3);
    rem(-2, -3);
  }

  private static void rem(final double a, final double b) {
    System.out.println(a + "  /  " + b + "=" + Long.toHexString(Double.doubleToLongBits(a / b)));
    System.out.println(a + "  %  " + b + "=" + Long.toHexString(Double.doubleToLongBits(a % b)));
    System.out.println(a + " rem " + b + "=" + Long.toHexString(Double.doubleToLongBits(Math.IEEEremainder(a, b))));
    System.out.println();
  }
}
