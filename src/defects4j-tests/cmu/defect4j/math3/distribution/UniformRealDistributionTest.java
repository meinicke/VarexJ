package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class UniformRealDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testPreconditions1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testPreconditions1();
        }
    }

    @Test(timeout=1000000)
    public void testPreconditions2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testPreconditions2();
        }
    }

    @Test(timeout=1000000)
    public void testInverseCumulativeDistribution() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testInverseCumulativeDistribution();
        }
    }

    @Test(timeout=1000000)
    public void testMeanVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testMeanVariance();
        }
    }

    @Test(timeout=1000000)
    public void testGetLowerBound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testGetLowerBound();
        }
    }

    @Test(timeout=1000000)
    public void testGetUpperBound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testGetUpperBound();
        }
    }

    @Test(timeout=1000000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=1000000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testSampling();
        }
    }

    @Test(timeout=1000000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testConsistency();
        }
    }

    @Test(timeout=1000000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=1000000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=1000000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=1000000)
    public void testDistributionClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testDistributionClone();
        }
    }

    @Test(timeout=1000000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.UniformRealDistributionTest object = new org.apache.commons.math3.distribution.UniformRealDistributionTest();
               object.testIllegalArguments();
        }
    }

}