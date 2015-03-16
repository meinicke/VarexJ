package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EnumeratedIntegerDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest();
               object.testSample();
        }
    }

    @Test(timeout=120000)
    public void testExceptions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest();
               object.testExceptions();
        }
    }

    @Test(timeout=120000)
    public void testProbability() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest();
               object.testProbability();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbability() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest();
               object.testCumulativeProbability();
        }
    }

    @Test(timeout=120000)
    public void testGetNumericalMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest();
               object.testGetNumericalMean();
        }
    }

    @Test(timeout=120000)
    public void testGetNumericalVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest();
               object.testGetNumericalVariance();
        }
    }

    @Test(timeout=120000)
    public void testGetSupportLowerBound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest();
               object.testGetSupportLowerBound();
        }
    }

    @Test(timeout=120000)
    public void testGetSupportUpperBound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest();
               object.testGetSupportUpperBound();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportConnected() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest object = new org.apache.commons.math3.distribution.EnumeratedIntegerDistributionTest();
               object.testIsSupportConnected();
        }
    }

}