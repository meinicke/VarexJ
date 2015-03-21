package cmu.defect4j.math3.ode.nonstiff;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DormandPrince54IntegratorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testMinStep() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest();
               object.testMinStep();
        }
    }

    @Test(timeout=1000000)
    public void testIncreasingTolerance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest();
               object.testIncreasingTolerance();
        }
    }

    @Test(timeout=1000000)
    public void testDimensionCheck() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest();
               object.testDimensionCheck();
        }
    }

    @Test(timeout=1000000)
    public void testSmallLastStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest();
               object.testSmallLastStep();
        }
    }

    @Test(timeout=1000000)
    public void testEvents() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest();
               object.testEvents();
        }
    }

    @Test(timeout=1000000)
    public void testVariableSteps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest();
               object.testVariableSteps();
        }
    }

    @Test(timeout=1000000)
    public void testBackward() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest();
               object.testBackward();
        }
    }

    @Test(timeout=1000000)
    public void testKepler() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince54IntegratorTest();
               object.testKepler();
        }
    }

}