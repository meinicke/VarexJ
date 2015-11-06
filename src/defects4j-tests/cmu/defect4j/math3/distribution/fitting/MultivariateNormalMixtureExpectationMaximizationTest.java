package cmu.defect4j.math3.distribution.fitting;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultivariateNormalMixtureExpectationMaximizationTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testNonJaggedData() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest object = new org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest();
               object.testNonJaggedData();
        }
    }

    @Test(timeout=1000000)
    public void testMultipleColumnsRequired() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest object = new org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest();
               object.testMultipleColumnsRequired();
        }
    }

    @Test(timeout=1000000)
    public void testNonEmptyData() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest object = new org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest();
               object.testNonEmptyData();
        }
    }

    @Test(timeout=1000000)
    public void testMaxIterationsPositive() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest object = new org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest();
               object.testMaxIterationsPositive();
        }
    }

    @Test(timeout=1000000)
    public void testThresholdPositive() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest object = new org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest();
               object.testThresholdPositive();
        }
    }

    @Test(timeout=1000000)
    public void testConvergenceException() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.ConvergenceException", config)) {
               org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest object = new org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest();
               object.testConvergenceException();
        }
    }

    @Test(timeout=1000000)
    public void testIncompatibleIntialMixture() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest object = new org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest();
               object.testIncompatibleIntialMixture();
        }
    }

    @Test(timeout=1000000)
    public void testInitialMixture() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest object = new org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest();
               object.testInitialMixture();
        }
    }

    @Test(timeout=1000000)
    public void testFit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest object = new org.apache.commons.math3.distribution.fitting.MultivariateNormalMixtureExpectationMaximizationTest();
               object.testFit();
        }
    }

}