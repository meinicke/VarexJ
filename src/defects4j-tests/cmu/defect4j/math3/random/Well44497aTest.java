package cmu.defect4j.math3.random;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class Well44497aTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testReferenceCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testReferenceCode();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntDirect() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextIntDirect();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntIAE2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextIntIAE2();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongDirect() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextLongDirect();
        }
    }

    @Test(timeout=1000000)
    public void testNextBooleanDirect() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextBooleanDirect();
        }
    }

    @Test(timeout=1000000)
    public void testNextFloatDirect() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextFloatDirect();
        }
    }

    @Test(timeout=1000000)
    public void testDoubleDirect() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testDoubleDirect();
        }
    }

    @Test(timeout=1000000)
    public void testFloatDirect() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testFloatDirect();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntNeg() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextIntNeg();
        }
    }

    @Test(timeout=1000000)
    public void testNextInt2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextInt2();
        }
    }

    @Test(timeout=1000000)
    public void testNextLong2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextLong2();
        }
    }

    @Test(timeout=1000000)
    public void testNexBoolean2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNexBoolean2();
        }
    }

    @Test(timeout=1000000)
    public void testNexBytes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNexBytes();
        }
    }

    @Test(timeout=1000000)
    public void testSeeding() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testSeeding();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntIAE() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextIntIAE();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntExtremeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextIntExtremeValues();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongExtremeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextLongExtremeValues();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformExtremeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextUniformExtremeValues();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntNegativeToPositiveRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextIntNegativeToPositiveRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntNegativeRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextIntNegativeRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntPositiveRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextIntPositiveRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntWideRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextIntWideRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongIAE() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextLongIAE();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongNegativeToPositiveRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextLongNegativeToPositiveRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongNegativeRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextLongNegativeRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongPositiveRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextLongPositiveRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongWideRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextLongWideRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextPoisson() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextPoisson();
        }
    }

    @Test(timeout=1000000)
    public void testNextPoissonConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextPoissonConsistency();
        }
    }

    @Test(timeout=1000000)
    public void testNextHex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextHex();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformIAE() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextUniformIAE();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformUniformPositiveBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextUniformUniformPositiveBounds();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformUniformNegativeToPositiveBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextUniformUniformNegativeToPositiveBounds();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformUniformNegaiveBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextUniformUniformNegaiveBounds();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformUniformMaximalInterval() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextUniformUniformMaximalInterval();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformExclusiveEndpoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextUniformExclusiveEndpoints();
        }
    }

    @Test(timeout=1000000)
    public void testNextGaussian() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextGaussian();
        }
    }

    @Test(timeout=1000000)
    public void testNextExponential() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextExponential();
        }
    }

    @Test(timeout=1000000)
    public void testConfig() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testConfig();
        }
    }

    @Test(timeout=1000000)
    public void testNextSample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextSample();
        }
    }

    @Test(timeout=1000000)
    public void testNextPermutation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextPermutation();
        }
    }

    @Test(timeout=1000000)
    public void testNextInversionDeviate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextInversionDeviate();
        }
    }

    @Test(timeout=1000000)
    public void testNextBeta() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextBeta();
        }
    }

    @Test(timeout=1000000)
    public void testNextCauchy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextCauchy();
        }
    }

    @Test(timeout=1000000)
    public void testNextChiSquare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextChiSquare();
        }
    }

    @Test(timeout=1000000)
    public void testNextF() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextF();
        }
    }

    @Test(timeout=1000000)
    public void testNextGamma() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextGamma();
        }
    }

    @Test(timeout=1000000)
    public void testNextT() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextT();
        }
    }

    @Test(timeout=1000000)
    public void testNextWeibull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextWeibull();
        }
    }

    @Test(timeout=1000000)
    public void testNextBinomial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextBinomial();
        }
    }

    @Test(timeout=1000000)
    public void testNextHypergeometric() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextHypergeometric();
        }
    }

    @Test(timeout=1000000)
    public void testNextPascal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextPascal();
        }
    }

    @Test(timeout=1000000)
    public void testNextZipf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testNextZipf();
        }
    }

    @Test(timeout=1000000)
    public void testReseed() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.Well44497aTest object = new org.apache.commons.math3.random.Well44497aTest();
               object.setUp();
               object.testReseed();
        }
    }

}