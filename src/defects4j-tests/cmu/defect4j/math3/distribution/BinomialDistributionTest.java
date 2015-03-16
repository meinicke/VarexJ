package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BinomialDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BinomialDistributionTest object = new org.apache.commons.math3.distribution.BinomialDistributionTest();
               object.setUp();
               object.testMoments();
        }
    }

    @Test(timeout=120000)
    public void testDegenerate0() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BinomialDistributionTest object = new org.apache.commons.math3.distribution.BinomialDistributionTest();
               object.setUp();
               object.testDegenerate0();
        }
    }

    @Test(timeout=120000)
    public void testDegenerate1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BinomialDistributionTest object = new org.apache.commons.math3.distribution.BinomialDistributionTest();
               object.setUp();
               object.testDegenerate1();
        }
    }

    @Test(timeout=120000)
    public void testMath718() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BinomialDistributionTest object = new org.apache.commons.math3.distribution.BinomialDistributionTest();
               object.setUp();
               object.testMath718();
        }
    }

    @Test(timeout=120000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BinomialDistributionTest object = new org.apache.commons.math3.distribution.BinomialDistributionTest();
               object.setUp();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=120000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BinomialDistributionTest object = new org.apache.commons.math3.distribution.BinomialDistributionTest();
               object.setUp();
               object.testDensities();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BinomialDistributionTest object = new org.apache.commons.math3.distribution.BinomialDistributionTest();
               object.setUp();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BinomialDistributionTest object = new org.apache.commons.math3.distribution.BinomialDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testConsistencyAtSupportBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BinomialDistributionTest object = new org.apache.commons.math3.distribution.BinomialDistributionTest();
               object.setUp();
               object.testConsistencyAtSupportBounds();
        }
    }

    @Test(timeout=120000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.BinomialDistributionTest object = new org.apache.commons.math3.distribution.BinomialDistributionTest();
               object.setUp();
               object.testSampling();
        }
    }

}