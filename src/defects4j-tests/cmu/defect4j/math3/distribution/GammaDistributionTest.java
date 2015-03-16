package cmu.defect4j.math3.distribution;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class GammaDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testInverseCumulativeProbabilityExtremes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testInverseCumulativeProbabilityExtremes();
        }
    }

    @Test(timeout=120000)
    public void testPreconditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testPreconditions();
        }
    }

    @Test(timeout=120000)
    public void testParameterAccessors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testParameterAccessors();
        }
    }

    @Test(timeout=120000)
    public void testProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testMath753Shape1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testMath753Shape1();
        }
    }

    @Test(timeout=120000)
    public void testMath753Shape8() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testMath753Shape8();
        }
    }

    @Test(timeout=120000)
    public void testMath753Shape10() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testMath753Shape10();
        }
    }

    @Test(timeout=120000)
    public void testMath753Shape100() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testMath753Shape100();
        }
    }

    @Test(timeout=120000)
    public void testMath753Shape142() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testMath753Shape142();
        }
    }

    @Test(timeout=120000)
    public void testMath753Shape1000() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testMath753Shape1000();
        }
    }

    @Test(timeout=120000)
    public void testValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testValues();
        }
    }

    @Test(timeout=120000)
    public void testDensity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testDensity();
        }
    }

    @Test(timeout=120000)
    public void testMoments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testMoments();
        }
    }

    @Test(timeout=120000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testIllegalArguments();
        }
    }

    @Test(timeout=120000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testDensities();
        }
    }

    @Test(timeout=120000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=120000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testSampling();
        }
    }

    @Test(timeout=120000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=120000)
    public void testDistributionClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testDistributionClone();
        }
    }

    @Test(timeout=120000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.distribution.GammaDistributionTest object = new org.apache.commons.math3.distribution.GammaDistributionTest();
               object.testConsistency();
        }
    }

}