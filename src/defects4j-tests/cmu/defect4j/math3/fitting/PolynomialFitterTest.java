package cmu.defect4j.math3.fitting;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PolynomialFitterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testFit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testFit();
        }
    }

    @Test(timeout=1000000)
    public void testMath798() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testMath798();
        }
    }

    @Test(timeout=1000000)
    public void testNoError() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testNoError();
        }
    }

    @Test(timeout=1000000)
    public void testSmallError() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testSmallError();
        }
    }

    @Test(timeout=1000000)
    public void testMath798WithToleranceTooLow() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.TooManyEvaluationsException", config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testMath798WithToleranceTooLow();
        }
    }

    @Test(timeout=1000000)
    public void testMath798WithToleranceTooLowButNoException() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testMath798WithToleranceTooLowButNoException();
        }
    }

    @Test(timeout=1000000)
    public void testRedundantSolvable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testRedundantSolvable();
        }
    }

    @Test(timeout=1000000)
    public void testRedundantUnsolvable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testRedundantUnsolvable();
        }
    }

    @Test(timeout=1000000)
    public void testLargeSample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.PolynomialFitterTest object = new org.apache.commons.math3.fitting.PolynomialFitterTest();
               object.testLargeSample();
        }
    }

}