package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ArithmeticUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testPow();
        }
    }

    @Test(timeout=120000)
    public void testAddAndCheck() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testAddAndCheck();
        }
    }

    @Test(timeout=120000)
    public void testAddAndCheckLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testAddAndCheckLong();
        }
    }

    @Test(timeout=120000)
    public void testGcd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testGcd();
        }
    }

    @Test(timeout=120000)
    public void testGcdConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testGcdConsistency();
        }
    }

    @Test(timeout=120000)
    public void testGcdLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testGcdLong();
        }
    }

    @Test(timeout=120000)
    public void testLcm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testLcm();
        }
    }

    @Test(timeout=120000)
    public void testLcmLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testLcmLong();
        }
    }

    @Test(timeout=120000)
    public void testMulAndCheck() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testMulAndCheck();
        }
    }

    @Test(timeout=120000)
    public void testMulAndCheckLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testMulAndCheckLong();
        }
    }

    @Test(timeout=120000)
    public void testSubAndCheck() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testSubAndCheck();
        }
    }

    @Test(timeout=120000)
    public void testSubAndCheckErrorMessage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testSubAndCheckErrorMessage();
        }
    }

    @Test(timeout=120000)
    public void testSubAndCheckLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testSubAndCheckLong();
        }
    }

    @Test(timeout=120000)
    public void testIsPowerOfTwo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ArithmeticUtilsTest object = new org.apache.commons.math3.util.ArithmeticUtilsTest();
               object.testIsPowerOfTwo();
        }
    }

}