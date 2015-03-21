package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class WeibullDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testMoments();
        }
    }

    @Test(timeout=1000000)
    public void testAlpha() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testAlpha();
        }
    }

    @Test(timeout=1000000)
    public void testBeta() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testBeta();
        }
    }

    @Test(timeout=1000000)
    public void testInverseCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=1000000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testDensities();
        }
    }

    @Test(timeout=1000000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testSampling();
        }
    }

    @Test(timeout=1000000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testConsistency();
        }
    }

    @Test(timeout=1000000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=1000000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=1000000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=1000000)
    public void testDistributionClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testDistributionClone();
        }
    }

    @Test(timeout=1000000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.WeibullDistributionTest object = new org.apache.commons.math3.distribution.WeibullDistributionTest();
               object.setUp();
               object.testIllegalArguments();
        }
    }

}