package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class TDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testInverseCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testInverseCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=120000)
    public void nistData() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.nistData();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbabilityAgainstStackOverflow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testCumulativeProbabilityAgainstStackOverflow();
        }
    }

    @Test(timeout=120000)
    public void testPreconditions() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testPreconditions();
        }
    }

    @Test(timeout=120000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testMoments();
        }
    }

    @Test(timeout=120000)
    public void testSmallDf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testSmallDf();
        }
    }

    @Test(timeout=120000)
    public void testDfAccessors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testDfAccessors();
        }
    }

    @Test(timeout=120000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=120000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testSampling();
        }
    }

    @Test(timeout=120000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testDistributionClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testDistributionClone();
        }
    }

    @Test(timeout=120000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TDistributionTest object = new org.apache.commons.math3.distribution.TDistributionTest();
               object.testConsistency();
        }
    }

}