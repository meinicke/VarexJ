package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultivariateNormalDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testGetMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.MultivariateNormalDistributionTest object = new org.apache.commons.math3.distribution.MultivariateNormalDistributionTest();
               object.testGetMean();
        }
    }

    @Test(timeout=1000000)
    public void testGetCovarianceMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.MultivariateNormalDistributionTest object = new org.apache.commons.math3.distribution.MultivariateNormalDistributionTest();
               object.testGetCovarianceMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testUnivariateDistribution() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.MultivariateNormalDistributionTest object = new org.apache.commons.math3.distribution.MultivariateNormalDistributionTest();
               object.testUnivariateDistribution();
        }
    }

    @Test(timeout=1000000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.MultivariateNormalDistributionTest object = new org.apache.commons.math3.distribution.MultivariateNormalDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=1000000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.MultivariateNormalDistributionTest object = new org.apache.commons.math3.distribution.MultivariateNormalDistributionTest();
               object.testSampling();
        }
    }

}