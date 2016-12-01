package cmu.defect4j.math3.fitting;

import org.junit.Ignore;
import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class PolynomialFitterTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testMath798() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testMath798();
        }
    }

    @Test(timeout=1800000)
    public void testFit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testFit();
        }
    }

    @Ignore@Test(timeout=1800000)
    public void testSmallError() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testSmallError();
        }
    }

    @Ignore@Test(timeout=1800000)
    public void testMath798WithToleranceTooLow() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.TooManyEvaluationsException", config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testMath798WithToleranceTooLow();
        }
    }

    @Ignore@Test(timeout=1800000)
    public void testMath798WithToleranceTooLowButNoException() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testMath798WithToleranceTooLowButNoException();
        }
    }

    @Ignore@Test(timeout=1800000)
    public void testRedundantSolvable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testRedundantSolvable();
        }
    }

    @Test(timeout=1800000)
    public void testRedundantUnsolvable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testRedundantUnsolvable();
        }
    }

    @Ignore@Test(timeout=1800000)
    public void testLargeSample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testLargeSample();
        }
    }

    @Test(timeout=1800000)
    public void testNoError() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testNoError();
        }
    }

}