package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CombinatoricsUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void test0Choose0() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.CombinatoricsUtilsTest object = new org.apache.commons.math3.util.CombinatoricsUtilsTest();
               object.test0Choose0();
        }
    }

    @Test(timeout=1000000)
    public void testBinomialCoefficient() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.CombinatoricsUtilsTest object = new org.apache.commons.math3.util.CombinatoricsUtilsTest();
               object.testBinomialCoefficient();
        }
    }

    @Test(timeout=1000000)
    public void testBinomialCoefficientFail() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.CombinatoricsUtilsTest object = new org.apache.commons.math3.util.CombinatoricsUtilsTest();
               object.testBinomialCoefficientFail();
        }
    }

    @Test(timeout=1000000)
    public void testBinomialCoefficientLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.CombinatoricsUtilsTest object = new org.apache.commons.math3.util.CombinatoricsUtilsTest();
               object.testBinomialCoefficientLarge();
        }
    }

    @Test(timeout=1000000)
    public void testFactorial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.CombinatoricsUtilsTest object = new org.apache.commons.math3.util.CombinatoricsUtilsTest();
               object.testFactorial();
        }
    }

    @Test(timeout=1000000)
    public void testFactorialFail() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.CombinatoricsUtilsTest object = new org.apache.commons.math3.util.CombinatoricsUtilsTest();
               object.testFactorialFail();
        }
    }

    @Test(timeout=1000000)
    public void testStirlingS2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.CombinatoricsUtilsTest object = new org.apache.commons.math3.util.CombinatoricsUtilsTest();
               object.testStirlingS2();
        }
    }

    @Test(timeout=1000000)
    public void testStirlingS2NegativeN() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotPositiveException", config)) {
               org.apache.commons.math3.util.CombinatoricsUtilsTest object = new org.apache.commons.math3.util.CombinatoricsUtilsTest();
               object.testStirlingS2NegativeN();
        }
    }

    @Test(timeout=1000000)
    public void testStirlingS2LargeK() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.util.CombinatoricsUtilsTest object = new org.apache.commons.math3.util.CombinatoricsUtilsTest();
               object.testStirlingS2LargeK();
        }
    }

    @Test(timeout=1000000)
    public void testStirlingS2Overflow() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathArithmeticException", config)) {
               org.apache.commons.math3.util.CombinatoricsUtilsTest object = new org.apache.commons.math3.util.CombinatoricsUtilsTest();
               object.testStirlingS2Overflow();
        }
    }

    @Test(timeout=1000000)
    public void testCombinationsIterator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.CombinatoricsUtilsTest object = new org.apache.commons.math3.util.CombinatoricsUtilsTest();
               object.testCombinationsIterator();
        }
    }

    @Test(timeout=1000000)
    public void testCombinationsIteratorFail() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.CombinatoricsUtilsTest object = new org.apache.commons.math3.util.CombinatoricsUtilsTest();
               object.testCombinationsIteratorFail();
        }
    }

}