package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testInverseCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testInverseCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=120000)
    public void testPreconditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testPreconditions();
        }
    }

    @Test(timeout=120000)
    public void testMath785() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testMath785();
        }
    }

    @Test(timeout=120000)
    public void testLargeDegreesOfFreedom() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testLargeDegreesOfFreedom();
        }
    }

    @Test(timeout=120000)
    public void testSmallDegreesOfFreedom() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testSmallDegreesOfFreedom();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=120000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testMoments();
        }
    }

    @Test(timeout=120000)
    public void testDfAccessors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testDfAccessors();
        }
    }

    @Test(timeout=120000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=120000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testSampling();
        }
    }

    @Test(timeout=120000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testDistributionClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testDistributionClone();
        }
    }

    @Test(timeout=120000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.FDistributionTest object = new org.apache.commons.math3.distribution.FDistributionTest();
               object.testConsistency();
        }
    }

}