package cmu.defect4j.math3.analysis.interpolation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BicubicSplineInterpolatingFunctionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testPreconditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest object = new org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest();
               object.testPreconditions();
        }
    }

    @Test(timeout=1000000)
    public void testPlane() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest object = new org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest();
               object.testPlane();
        }
    }

    @Test(timeout=1000000)
    public void testParaboloid() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest object = new org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest();
               object.testParaboloid();
        }
    }

    @Test(timeout=1000000)
    public void testSplinePartialDerivatives() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest object = new org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest();
               object.testSplinePartialDerivatives();
        }
    }

    @Test(timeout=1000000)
    public void testMatchingPartialDerivatives() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest object = new org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest();
               object.testMatchingPartialDerivatives();
        }
    }

    @Test(timeout=1000000)
    public void testInterpolation1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest object = new org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest();
               object.testInterpolation1();
        }
    }

    @Test(timeout=1000000)
    public void testInterpolation2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest object = new org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest();
               object.testInterpolation2();
        }
    }

    @Test(timeout=1000000)
    public void testIsValidPoint() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest object = new org.apache.commons.math3.analysis.interpolation.BicubicSplineInterpolatingFunctionTest();
               object.testIsValidPoint();
        }
    }

}