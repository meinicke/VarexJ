package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PoissonDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testNormalApproximateProbability() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testNormalApproximateProbability();
        }
    }

    @Test(timeout=120000)
    public void testDegenerateInverseCumulativeProbability() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testDegenerateInverseCumulativeProbability();
        }
    }

    @Test(timeout=120000)
    public void testNegativeMean() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testNegativeMean();
        }
    }

    @Test(timeout=120000)
    public void testMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testMean();
        }
    }

    @Test(timeout=120000)
    public void testLargeMeanCumulativeProbability() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testLargeMeanCumulativeProbability();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbabilitySpecial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testCumulativeProbabilitySpecial();
        }
    }

    @Test(timeout=120000)
    public void testLargeMeanInverseCumulativeProbability() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testLargeMeanInverseCumulativeProbability();
        }
    }

    @Test(timeout=120000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testMoments();
        }
    }

    @Test(timeout=120000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=120000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testDensities();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testConsistencyAtSupportBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testConsistencyAtSupportBounds();
        }
    }

    @Test(timeout=120000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PoissonDistributionTest object = new org.apache.commons.math3.distribution.PoissonDistributionTest();
               object.setUp();
               object.testSampling();
        }
    }

}