package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EnumeratedRealDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testSample();
        }
    }

    @Test(timeout=120000)
    public void testIssue942() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testIssue942();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testExceptions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testExceptions();
        }
    }

    @Test(timeout=120000)
    public void testProbability() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testProbability();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbability() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testCumulativeProbability();
        }
    }

    @Test(timeout=120000)
    public void testGetNumericalMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testGetNumericalMean();
        }
    }

    @Test(timeout=120000)
    public void testGetNumericalVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testGetNumericalVariance();
        }
    }

    @Test(timeout=120000)
    public void testGetSupportLowerBound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testGetSupportLowerBound();
        }
    }

    @Test(timeout=120000)
    public void testGetSupportUpperBound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testGetSupportUpperBound();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportConnected() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testIsSupportConnected();
        }
    }

    @Test(timeout=120000)
    public void testDensity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedRealDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedRealDistributionTest();
               object.testDensity();
        }
    }

}