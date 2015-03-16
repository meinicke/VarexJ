package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class NormalDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testQuantiles() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testQuantiles();
        }
    }

    @Test(timeout=120000)
    public void testExtremeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testExtremeValues();
        }
    }

    @Test(timeout=120000)
    public void testGetStandardDeviation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testGetStandardDeviation();
        }
    }

    @Test(timeout=120000)
    public void testMath280() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testMath280();
        }
    }

    @Test(timeout=120000)
    public void testInverseCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testInverseCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=120000)
    public void testPreconditions() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testPreconditions();
        }
    }

    @Test(timeout=120000)
    public void testDensity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testDensity();
        }
    }

    @Test(timeout=120000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testMoments();
        }
    }

    @Test(timeout=120000)
    public void testGetMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testGetMean();
        }
    }

    @Test(timeout=120000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=120000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testSampling();
        }
    }

    @Test(timeout=120000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testDistributionClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testDistributionClone();
        }
    }

    @Test(timeout=120000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.NormalDistributionTest object = new org.apache.commons.math3.distribution.NormalDistributionTest();
               object.testConsistency();
        }
    }

}