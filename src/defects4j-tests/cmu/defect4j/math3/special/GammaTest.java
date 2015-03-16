package cmu.defect4j.math3.special;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class GammaTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testRegularizedGammaPositiveNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testRegularizedGammaPositiveNan();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedGammaNegativePositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testRegularizedGammaNegativePositive();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedGammaPositiveNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testRegularizedGammaPositiveNegative();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedGammaZeroPositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testRegularizedGammaZeroPositive();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedGammaPositiveZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testRegularizedGammaPositiveZero();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedGammaPositivePositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testRegularizedGammaPositivePositive();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testLogGammaNan();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testLogGammaNegative();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testLogGammaZero();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaPositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testLogGammaPositive();
        }
    }

    @Test(timeout=120000)
    public void testDigammaLargeArgs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testDigammaLargeArgs();
        }
    }

    @Test(timeout=120000)
    public void testDigammaSmallArgs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testDigammaSmallArgs();
        }
    }

    @Test(timeout=120000)
    public void testTrigamma() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testTrigamma();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaPrecondition1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testLogGammaPrecondition1();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaPrecondition2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testLogGammaPrecondition2();
        }
    }

    @Test(timeout=120000)
    public void testInvGamma1pm1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testInvGamma1pm1();
        }
    }

    @Test(timeout=120000)
    public void testInvGamma1pm1Precondition1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testInvGamma1pm1Precondition1();
        }
    }

    @Test(timeout=120000)
    public void testInvGamma1pm1Precondition2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testInvGamma1pm1Precondition2();
        }
    }

    @Test(timeout=120000)
    public void testLogGamma1p() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testLogGamma1p();
        }
    }

    @Test(timeout=120000)
    public void testLogGamma1pPrecondition1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testLogGamma1pPrecondition1();
        }
    }

    @Test(timeout=120000)
    public void testLogGamma1pPrecondition2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testLogGamma1pPrecondition2();
        }
    }

    @Test(timeout=120000)
    public void testGamma() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testGamma();
        }
    }

    @Test(timeout=120000)
    public void testGammaNegativeInteger() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testGammaNegativeInteger();
        }
    }

    @Test(timeout=120000)
    public void testLogGamma() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testLogGamma();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedGammaNanPositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.GammaTest object = new org.apache.commons.math3.special.GammaTest();
               object.testRegularizedGammaNanPositive();
        }
    }

}