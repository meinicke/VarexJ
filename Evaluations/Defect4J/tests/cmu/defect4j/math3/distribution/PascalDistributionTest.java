package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PascalDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PascalDistributionTest object = new org.apache.commons.math3.distribution.PascalDistributionTest();
               object.testMoments();
        }
    }

    @Test(timeout=1000000)
    public void testDegenerate0() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PascalDistributionTest object = new org.apache.commons.math3.distribution.PascalDistributionTest();
               object.testDegenerate0();
        }
    }

    @Test(timeout=1000000)
    public void testDegenerate1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PascalDistributionTest object = new org.apache.commons.math3.distribution.PascalDistributionTest();
               object.testDegenerate1();
        }
    }

    @Test(timeout=1000000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PascalDistributionTest object = new org.apache.commons.math3.distribution.PascalDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=1000000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PascalDistributionTest object = new org.apache.commons.math3.distribution.PascalDistributionTest();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PascalDistributionTest object = new org.apache.commons.math3.distribution.PascalDistributionTest();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testConsistencyAtSupportBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PascalDistributionTest object = new org.apache.commons.math3.distribution.PascalDistributionTest();
               object.testConsistencyAtSupportBounds();
        }
    }

    @Test(timeout=1000000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PascalDistributionTest object = new org.apache.commons.math3.distribution.PascalDistributionTest();
               object.testSampling();
        }
    }

    @Test(timeout=1000000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.PascalDistributionTest object = new org.apache.commons.math3.distribution.PascalDistributionTest();
               object.testIllegalArguments();
        }
    }

}