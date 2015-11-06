package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ChiSquaredDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testDensity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testDensity();
        }
    }

    @Test(timeout=1000000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testMoments();
        }
    }

    @Test(timeout=1000000)
    public void testSmallDf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testSmallDf();
        }
    }

    @Test(timeout=1000000)
    public void testDfAccessors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testDfAccessors();
        }
    }

    @Test(timeout=1000000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=1000000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testSampling();
        }
    }

    @Test(timeout=1000000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testConsistency();
        }
    }

    @Test(timeout=1000000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=1000000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=1000000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=1000000)
    public void testDistributionClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testDistributionClone();
        }
    }

    @Test(timeout=1000000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ChiSquaredDistributionTest object = new org.apache.commons.math3.distribution.ChiSquaredDistributionTest();
               object.testIllegalArguments();
        }
    }

}