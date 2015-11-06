package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Ignore;
import org.junit.Test;

public class NormalDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testDensity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
               object.setUp();
               object.testDensity();
        }
    }

//    @Test(timeout=1000000)
//    public void testMoments() throws Exception {
//        if (verifyNoPropertyViolation(config)) {
//               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
//               object.testMoments();
//        }
//    }

//    @Test(timeout=1000000)
//    public void testPreconditions() throws Exception {
//        if (verifyUnhandledException("org.apache.commons.math.exception.NotStrictlyPositiveException", config)) {
//               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
//               object.testPreconditions();
//        }
//    }

    @Test(timeout=1000000)
    public void testGetMean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
            object.setUp();
               object.testGetMean();
        }
    }

    @Test(timeout=1000000)
    public void testMath280() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
            object.setUp();
               object.testMath280();
        }
    }

    @Test(timeout=1000000)
    public void testGetStandardDeviation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
            object.setUp();
               object.testGetStandardDeviation();
        }
    }

    @Test(timeout=1000000)
    public void testInverseCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
            object.setUp();
               object.testInverseCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=1000000)
    public void testQuantiles() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
            object.setUp();
               object.testQuantiles();
        }
    }

    @Test(timeout=1000000)
    public void testExtremeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
            object.setUp();
               object.testExtremeValues();
        }
    }

//    @Test(timeout=1000000)
//    public void testDensities() throws Exception {
//        if (verifyNoPropertyViolation(config)) {
//               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
//               object.testDensities();
//        }
//    }

    @Test(timeout=1000000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
            object.setUp();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
            object.setUp();
               object.testInverseCumulativeProbabilities();
        }
    }

//    @Test(timeout=1000000)
//    public void testSampling() throws Exception {
//        if (verifyNoPropertyViolation(config)) {
//               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
//               object.testSampling();
//        }
//    }

    @Test(timeout=1000000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
            object.setUp();
               object.testConsistency();
        }
    }

//    @Test(timeout=1000000)
//    public void testDensityIntegrals() throws Exception {
//        if (verifyNoPropertyViolation(config)) {
//               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
//               object.testDensityIntegrals();
//        }
//    }

//    @Test(timeout=1000000)
//    public void testIsSupportLowerBoundInclusive() throws Exception {
//        if (verifyNoPropertyViolation(config)) {
//               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
//               object.testIsSupportLowerBoundInclusive();
//        }
//    }

//    @Test(timeout=1000000)
//    public void testIsSupportUpperBoundInclusive() throws Exception {
//        if (verifyNoPropertyViolation(config)) {
//               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
//               object.testIsSupportUpperBoundInclusive();
//        }
//    }

//    @Test(timeout=1000000)
//    @Ignore
//    public void testDistributionClone() throws Exception {
//        if (verifyNoPropertyViolation(config)) {
//               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
//               object.testDistributionClone();
//        }
//    }

    @Test(timeout=1000000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math.distribution.NormalDistributionTest object = new org.apache.commons.math.distribution.NormalDistributionTest("hola");
            object.setUp();
               object.testIllegalArguments();
        }
    }

}