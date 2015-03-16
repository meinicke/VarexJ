package cmu.defect4j.math3.analysis.polynomials;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PolynomialFunctionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testQuadratic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest();
               object.testQuadratic();
        }
    }

    @Test(timeout=120000)
    public void testLinear() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest();
               object.testLinear();
        }
    }

    @Test(timeout=120000)
    public void testConstants() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest();
               object.testConstants();
        }
    }

    @Test(timeout=120000)
    public void testQuintic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest();
               object.testQuintic();
        }
    }

    @Test(timeout=120000)
    public void testfirstDerivativeComparison() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest();
               object.testfirstDerivativeComparison();
        }
    }

    @Test(timeout=120000)
    public void testString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest();
               object.testString();
        }
    }

    @Test(timeout=120000)
    public void testAddition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest();
               object.testAddition();
        }
    }

    @Test(timeout=120000)
    public void testSubtraction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest();
               object.testSubtraction();
        }
    }

    @Test(timeout=120000)
    public void testMultiplication() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest();
               object.testMultiplication();
        }
    }

    @Test(timeout=120000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest();
               object.testSerial();
        }
    }

    @Test(timeout=120000)
    public void testMath341() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionTest();
               object.testMath341();
        }
    }

}