package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class Decimal64Test extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testAdd();
        }
    }

    @Test(timeout=120000)
    public void testSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testSubtract();
        }
    }

    @Test(timeout=120000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testMultiply();
        }
    }

    @Test(timeout=120000)
    public void testNegate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testNegate();
        }
    }

    @Test(timeout=120000)
    public void testReciprocal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testReciprocal();
        }
    }

    @Test(timeout=120000)
    public void testIsNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testIsNaN();
        }
    }

    @Test(timeout=120000)
    public void testIsInfinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testIsInfinite();
        }
    }

    @Test(timeout=120000)
    public void testDivide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testDivide();
        }
    }

    @Test(timeout=120000)
    public void testExp() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testExp();
        }
    }

    @Test(timeout=120000)
    public void testLog() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testLog();
        }
    }

    @Test(timeout=120000)
    public void testAtan2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testAtan2();
        }
    }

    @Test(timeout=120000)
    public void testAbs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testAbs();
        }
    }

    @Test(timeout=120000)
    public void testSignum() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testSignum();
        }
    }

    @Test(timeout=120000)
    public void testAddField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testAddField();
        }
    }

    @Test(timeout=120000)
    public void testAddDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testAddDouble();
        }
    }

    @Test(timeout=120000)
    public void testSubtractField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testSubtractField();
        }
    }

    @Test(timeout=120000)
    public void testSubtractDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testSubtractDouble();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testMultiplyField();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testMultiplyDouble();
        }
    }

    @Test(timeout=120000)
    public void testMultiplyInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testMultiplyInt();
        }
    }

    @Test(timeout=120000)
    public void testDivideField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testDivideField();
        }
    }

    @Test(timeout=120000)
    public void testDivideDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testDivideDouble();
        }
    }

    @Test(timeout=120000)
    public void testRemainderField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testRemainderField();
        }
    }

    @Test(timeout=120000)
    public void testRemainderDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testRemainderDouble();
        }
    }

    @Test(timeout=120000)
    public void testCos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testCos();
        }
    }

    @Test(timeout=120000)
    public void testAcos() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testAcos();
        }
    }

    @Test(timeout=120000)
    public void testSin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testSin();
        }
    }

    @Test(timeout=120000)
    public void testAsin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testAsin();
        }
    }

    @Test(timeout=120000)
    public void testTan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testTan();
        }
    }

    @Test(timeout=120000)
    public void testAtan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testAtan();
        }
    }

    @Test(timeout=120000)
    public void testCosh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testCosh();
        }
    }

    @Test(timeout=120000)
    public void testAcosh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testAcosh();
        }
    }

    @Test(timeout=120000)
    public void testSinh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testSinh();
        }
    }

    @Test(timeout=120000)
    public void testAsinh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testAsinh();
        }
    }

    @Test(timeout=120000)
    public void testTanh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testTanh();
        }
    }

    @Test(timeout=120000)
    public void testAtanh() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testAtanh();
        }
    }

    @Test(timeout=120000)
    public void testSqrt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testSqrt();
        }
    }

    @Test(timeout=120000)
    public void testCbrt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testCbrt();
        }
    }

    @Test(timeout=120000)
    public void testHypot() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testHypot();
        }
    }

    @Test(timeout=120000)
    public void testRootN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testRootN();
        }
    }

    @Test(timeout=120000)
    public void testPowField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testPowField();
        }
    }

    @Test(timeout=120000)
    public void testPowDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testPowDouble();
        }
    }

    @Test(timeout=120000)
    public void testPowInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testPowInt();
        }
    }

    @Test(timeout=120000)
    public void testExpm1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testExpm1();
        }
    }

    @Test(timeout=120000)
    public void testLog1p() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testLog1p();
        }
    }

    @Test(timeout=120000)
    public void testCeil() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testCeil();
        }
    }

    @Test(timeout=120000)
    public void testFloor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testFloor();
        }
    }

    @Test(timeout=120000)
    public void testRint() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testRint();
        }
    }

    @Test(timeout=120000)
    public void testRound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testRound();
        }
    }

    @Test(timeout=120000)
    public void testCopySignField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testCopySignField();
        }
    }

    @Test(timeout=120000)
    public void testCopySignDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testCopySignDouble();
        }
    }

    @Test(timeout=120000)
    public void testScalb() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testScalb();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationFaFa() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testLinearCombinationFaFa();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationDaFa() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testLinearCombinationDaFa();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationFF2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testLinearCombinationFF2();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationDF2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testLinearCombinationDF2();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationFF3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testLinearCombinationFF3();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationDF3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testLinearCombinationDF3();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationFF4() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testLinearCombinationFF4();
        }
    }

    @Test(timeout=120000)
    public void testLinearCombinationDF4() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testLinearCombinationDF4();
        }
    }

    @Test(timeout=120000)
    public void testGetField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testGetField();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testHash() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.Decimal64Test object = new org.apache.commons.math3.util.Decimal64Test();
               object.testHash();
        }
    }

}