package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BigRealTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testDivide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testDivide();
        }
    }

    @Test(timeout=1000000)
    public void testCompareTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testCompareTo();
        }
    }

    @Test(timeout=1000000)
    public void testDoubleValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testDoubleValue();
        }
    }

    @Test(timeout=1000000)
    public void testBigDecimalValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testBigDecimalValue();
        }
    }

    @Test(timeout=1000000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=1000000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testSerial();
        }
    }

    @Test(timeout=1000000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testConstructor();
        }
    }

    @Test(timeout=1000000)
    public void testDivisionByZero() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathArithmeticException", config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testDivisionByZero();
        }
    }

    @Test(timeout=1000000)
    public void testReciprocalOfZero() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathArithmeticException", config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testReciprocalOfZero();
        }
    }

    @Test(timeout=1000000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testAdd();
        }
    }

    @Test(timeout=1000000)
    public void testSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testSubtract();
        }
    }

    @Test(timeout=1000000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testMultiply();
        }
    }

    @Test(timeout=1000000)
    public void testNegate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testNegate();
        }
    }

    @Test(timeout=1000000)
    public void testReciprocal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.BigRealTest object = new org.apache.commons.math3.util.BigRealTest();
               object.testReciprocal();
        }
    }

}