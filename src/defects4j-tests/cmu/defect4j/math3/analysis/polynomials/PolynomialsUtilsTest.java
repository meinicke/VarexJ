package cmu.defect4j.math3.analysis.polynomials;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PolynomialsUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testChebyshevBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testChebyshevBounds();
        }
    }

    @Test(timeout=1000000)
    public void testFirstChebyshevPolynomials() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testFirstChebyshevPolynomials();
        }
    }

    @Test(timeout=1000000)
    public void testChebyshevDifferentials() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testChebyshevDifferentials();
        }
    }

    @Test(timeout=1000000)
    public void testChebyshevOrthogonality() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testChebyshevOrthogonality();
        }
    }

    @Test(timeout=1000000)
    public void testFirstHermitePolynomials() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testFirstHermitePolynomials();
        }
    }

    @Test(timeout=1000000)
    public void testHermiteDifferentials() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testHermiteDifferentials();
        }
    }

    @Test(timeout=1000000)
    public void testHermiteOrthogonality() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testHermiteOrthogonality();
        }
    }

    @Test(timeout=1000000)
    public void testFirstLaguerrePolynomials() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testFirstLaguerrePolynomials();
        }
    }

    @Test(timeout=1000000)
    public void testLaguerreDifferentials() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testLaguerreDifferentials();
        }
    }

    @Test(timeout=1000000)
    public void testLaguerreOrthogonality() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testLaguerreOrthogonality();
        }
    }

    @Test(timeout=1000000)
    public void testFirstLegendrePolynomials() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testFirstLegendrePolynomials();
        }
    }

    @Test(timeout=1000000)
    public void testLegendreDifferentials() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testLegendreDifferentials();
        }
    }

    @Test(timeout=1000000)
    public void testLegendreOrthogonality() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testLegendreOrthogonality();
        }
    }

    @Test(timeout=1000000)
    public void testHighDegreeLegendre() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testHighDegreeLegendre();
        }
    }

    @Test(timeout=1000000)
    public void testJacobiLegendre() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testJacobiLegendre();
        }
    }

    @Test(timeout=1000000)
    public void testJacobiEvaluationAt1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testJacobiEvaluationAt1();
        }
    }

    @Test(timeout=1000000)
    public void testJacobiOrthogonality() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testJacobiOrthogonality();
        }
    }

    @Test(timeout=1000000)
    public void testShift() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialsUtilsTest();
               object.testShift();
        }
    }

}