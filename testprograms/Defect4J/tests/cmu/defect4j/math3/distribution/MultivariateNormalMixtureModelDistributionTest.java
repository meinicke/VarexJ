package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultivariateNormalMixtureModelDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testNonUnitWeightSum() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest object = new org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest();
               object.testNonUnitWeightSum();
        }
    }

    @Test(timeout=1000000)
    public void testWeightSumOverFlow() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathArithmeticException", config)) {
               org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest object = new org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest();
               object.testWeightSumOverFlow();
        }
    }

    @Test(timeout=1000000)
    public void testPreconditionPositiveWeights() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotPositiveException", config)) {
               org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest object = new org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest();
               object.testPreconditionPositiveWeights();
        }
    }

    @Test(timeout=1000000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest object = new org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=1000000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest object = new org.apache.commons.math3.distribution.MultivariateNormalMixtureModelDistributionTest();
               object.testSampling();
        }
    }

}