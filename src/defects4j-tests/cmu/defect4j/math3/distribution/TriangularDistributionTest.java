package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class TriangularDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testPreconditions3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testPreconditions3();
        }
    }

    @Test(timeout=120000)
    public void testPreconditions4() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testPreconditions4();
        }
    }

    @Test(timeout=120000)
    public void testMeanVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testMeanVariance();
        }
    }

    @Test(timeout=120000)
    public void testPreconditions1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testPreconditions1();
        }
    }

    @Test(timeout=120000)
    public void testPreconditions2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testPreconditions2();
        }
    }

    @Test(timeout=120000)
    public void testGetLowerBound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testGetLowerBound();
        }
    }

    @Test(timeout=120000)
    public void testGetUpperBound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testGetUpperBound();
        }
    }

    @Test(timeout=120000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=120000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testSampling();
        }
    }

    @Test(timeout=120000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testDistributionClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testDistributionClone();
        }
    }

    @Test(timeout=120000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.TriangularDistributionTest object = new org.apache.commons.math3.distribution.TriangularDistributionTest();
               object.testConsistency();
        }
    }

}