package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LogNormalDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testQuantiles() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testQuantiles();
        }
    }

    @Test(timeout=120000)
    public void testGetScale() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testGetScale();
        }
    }

    @Test(timeout=120000)
    public void testGetShape() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testGetShape();
        }
    }

    @Test(timeout=120000)
    public void testExtremeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testExtremeValues();
        }
    }

    @Test(timeout=120000)
    public void testMeanVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testMeanVariance();
        }
    }

    @Test(timeout=120000)
    public void testInverseCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testInverseCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=120000)
    public void testPreconditions() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testPreconditions();
        }
    }

    @Test(timeout=120000)
    public void testDensity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testDensity();
        }
    }

    @Test(timeout=120000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=120000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testSampling();
        }
    }

    @Test(timeout=120000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testDistributionClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testDistributionClone();
        }
    }

    @Test(timeout=120000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LogNormalDistributionTest object = new org.apache.commons.math3.distribution.LogNormalDistributionTest();
               object.testConsistency();
        }
    }

}