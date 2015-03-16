package cmu.defect4j.math3.special;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BetaTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testLogBeta() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogBeta();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedBetaNanPositivePositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testRegularizedBetaNanPositivePositive();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedBetaPositiveNanPositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testRegularizedBetaPositiveNanPositive();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedBetaPositivePositiveNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testRegularizedBetaPositivePositiveNan();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedBetaNegativePositivePositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testRegularizedBetaNegativePositivePositive();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedBetaPositiveNegativePositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testRegularizedBetaPositiveNegativePositive();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedBetaPositivePositiveNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testRegularizedBetaPositivePositiveNegative();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedBetaZeroPositivePositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testRegularizedBetaZeroPositivePositive();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedBetaPositiveZeroPositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testRegularizedBetaPositiveZeroPositive();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedBetaPositivePositiveZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testRegularizedBetaPositivePositiveZero();
        }
    }

    @Test(timeout=120000)
    public void testRegularizedBetaPositivePositivePositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testRegularizedBetaPositivePositivePositive();
        }
    }

    @Test(timeout=120000)
    public void testLogBetaNanPositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogBetaNanPositive();
        }
    }

    @Test(timeout=120000)
    public void testLogBetaPositiveNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogBetaPositiveNan();
        }
    }

    @Test(timeout=120000)
    public void testLogBetaNegativePositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogBetaNegativePositive();
        }
    }

    @Test(timeout=120000)
    public void testLogBetaPositiveNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogBetaPositiveNegative();
        }
    }

    @Test(timeout=120000)
    public void testLogBetaZeroPositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogBetaZeroPositive();
        }
    }

    @Test(timeout=120000)
    public void testLogBetaPositiveZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogBetaPositiveZero();
        }
    }

    @Test(timeout=120000)
    public void testLogBetaPositivePositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogBetaPositivePositive();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaSum() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogGammaSum();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaSumPrecondition1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogGammaSumPrecondition1();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaSumPrecondition2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogGammaSumPrecondition2();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaSumPrecondition3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogGammaSumPrecondition3();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaSumPrecondition4() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogGammaSumPrecondition4();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaMinusLogGammaSum() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogGammaMinusLogGammaSum();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaMinusLogGammaSumPrecondition1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogGammaMinusLogGammaSumPrecondition1();
        }
    }

    @Test(timeout=120000)
    public void testLogGammaMinusLogGammaSumPrecondition2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testLogGammaMinusLogGammaSumPrecondition2();
        }
    }

    @Test(timeout=120000)
    public void testSumDeltaMinusDeltaSum() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testSumDeltaMinusDeltaSum();
        }
    }

    @Test(timeout=120000)
    public void testSumDeltaMinusDeltaSumPrecondition1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testSumDeltaMinusDeltaSumPrecondition1();
        }
    }

    @Test(timeout=120000)
    public void testSumDeltaMinusDeltaSumPrecondition2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.special.BetaTest object = new org.apache.commons.math3.special.BetaTest();
               object.testSumDeltaMinusDeltaSumPrecondition2();
        }
    }

}