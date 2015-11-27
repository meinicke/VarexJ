package cmu.defect4j.math3.random;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class RandomDataGeneratorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testNextIntIAE() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextIntIAE();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntExtremeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextIntExtremeValues();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongExtremeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextLongExtremeValues();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformExtremeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextUniformExtremeValues();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntNegativeToPositiveRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextIntNegativeToPositiveRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntNegativeRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextIntNegativeRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntPositiveRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextIntPositiveRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextIntWideRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextIntWideRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongIAE() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextLongIAE();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongNegativeToPositiveRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextLongNegativeToPositiveRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongNegativeRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextLongNegativeRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongPositiveRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextLongPositiveRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextLongWideRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextLongWideRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextPoisson() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextPoisson();
        }
    }

    @Test(timeout=1000000)
    public void testNextPoissonConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextPoissonConsistency();
        }
    }

    @Test(timeout=1000000)
    public void testNextHex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextHex();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformIAE() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextUniformIAE();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformUniformPositiveBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextUniformUniformPositiveBounds();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformUniformNegativeToPositiveBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextUniformUniformNegativeToPositiveBounds();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformUniformNegaiveBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextUniformUniformNegaiveBounds();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformUniformMaximalInterval() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextUniformUniformMaximalInterval();
        }
    }

    @Test(timeout=1000000)
    public void testNextUniformExclusiveEndpoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextUniformExclusiveEndpoints();
        }
    }

    @Test(timeout=1000000)
    public void testNextGaussian() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextGaussian();
        }
    }

    @Test(timeout=1000000)
    public void testNextExponential() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextExponential();
        }
    }

    @Test(timeout=1000000)
    public void testConfig() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testConfig();
        }
    }

    @Test(timeout=1000000)
    public void testNextSample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextSample();
        }
    }

    @Test(timeout=1000000)
    public void testNextPermutation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextPermutation();
        }
    }

    @Test(timeout=1000000)
    public void testNextInversionDeviate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextInversionDeviate();
        }
    }

    @Test(timeout=1000000)
    public void testNextBeta() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextBeta();
        }
    }

    @Test(timeout=1000000)
    public void testNextCauchy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextCauchy();
        }
    }

    @Test(timeout=1000000)
    public void testNextChiSquare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextChiSquare();
        }
    }

    @Test(timeout=1000000)
    public void testNextF() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextF();
        }
    }

    @Test(timeout=1000000)
    public void testNextGamma() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextGamma();
        }
    }

    @Test(timeout=1000000)
    public void testNextT() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextT();
        }
    }

    @Test(timeout=1000000)
    public void testNextWeibull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextWeibull();
        }
    }

    @Test(timeout=1000000)
    public void testNextBinomial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextBinomial();
        }
    }

    @Test(timeout=1000000)
    public void testNextHypergeometric() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextHypergeometric();
        }
    }

    @Test(timeout=1000000)
    public void testNextPascal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextPascal();
        }
    }

    @Test(timeout=1000000)
    public void testNextZipf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextZipf();
        }
    }

    @Test(timeout=1000000)
    public void testReseed() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testReseed();
        }
    }

    @Test(timeout=1000000)
    public void testNextSecureLongIAE() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextSecureLongIAE();
        }
    }

    @Test(timeout=1000000)
    public void testNextSecureLongNegativeRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextSecureLongNegativeRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextSecureLongNegativeToPositiveRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextSecureLongNegativeToPositiveRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextSecureLongPositiveRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextSecureLongPositiveRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextSecureIntIAE() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextSecureIntIAE();
        }
    }

    @Test(timeout=1000000)
    public void testNextSecureIntNegativeToPositiveRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextSecureIntNegativeToPositiveRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextSecureIntNegativeRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextSecureIntNegativeRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextSecureIntPositiveRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextSecureIntPositiveRange();
        }
    }

    @Test(timeout=1000000)
    public void testNextSecureHex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.RandomDataGeneratorTest object = new org.apache.commons.math3.random.RandomDataGeneratorTest();
               object.testNextSecureHex();
        }
    }

}