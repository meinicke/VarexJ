package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LevyDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testParameters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LevyDistributionTest object = new org.apache.commons.math3.distribution.LevyDistributionTest();
               object.setUp();
               object.testParameters();
        }
    }

    @Test(timeout=120000)
    public void testSupport() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LevyDistributionTest object = new org.apache.commons.math3.distribution.LevyDistributionTest();
               object.setUp();
               object.testSupport();
        }
    }

    @Test(timeout=120000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LevyDistributionTest object = new org.apache.commons.math3.distribution.LevyDistributionTest();
               object.setUp();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=120000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LevyDistributionTest object = new org.apache.commons.math3.distribution.LevyDistributionTest();
               object.setUp();
               object.testDensities();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LevyDistributionTest object = new org.apache.commons.math3.distribution.LevyDistributionTest();
               object.setUp();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LevyDistributionTest object = new org.apache.commons.math3.distribution.LevyDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LevyDistributionTest object = new org.apache.commons.math3.distribution.LevyDistributionTest();
               object.setUp();
               object.testSampling();
        }
    }

    @Test(timeout=120000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LevyDistributionTest object = new org.apache.commons.math3.distribution.LevyDistributionTest();
               object.setUp();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LevyDistributionTest object = new org.apache.commons.math3.distribution.LevyDistributionTest();
               object.setUp();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LevyDistributionTest object = new org.apache.commons.math3.distribution.LevyDistributionTest();
               object.setUp();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testDistributionClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LevyDistributionTest object = new org.apache.commons.math3.distribution.LevyDistributionTest();
               object.setUp();
               object.testDistributionClone();
        }
    }

    @Test(timeout=120000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.LevyDistributionTest object = new org.apache.commons.math3.distribution.LevyDistributionTest();
               object.setUp();
               object.testConsistency();
        }
    }

}