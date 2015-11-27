package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ExponentialDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testDensity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testDensity();
        }
    }

    @Test(timeout=1000000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testMoments();
        }
    }

    @Test(timeout=1000000)
    public void testPreconditions() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testPreconditions();
        }
    }

    @Test(timeout=1000000)
    public void testMeanAccessors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testMeanAccessors();
        }
    }

    @Test(timeout=1000000)
    public void testCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=1000000)
    public void testCumulativeProbability2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testCumulativeProbability2();
        }
    }

    @Test(timeout=1000000)
    public void testInverseCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testInverseCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=1000000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=1000000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testSampling();
        }
    }

    @Test(timeout=1000000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testConsistency();
        }
    }

    @Test(timeout=1000000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=1000000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=1000000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=1000000)
    public void testDistributionClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testDistributionClone();
        }
    }

    @Test(timeout=1000000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.ExponentialDistributionTest object = new org.apache.commons.math3.distribution.ExponentialDistributionTest();
               object.testIllegalArguments();
        }
    }

}