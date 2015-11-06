package cmu.defect4j.math3.ode.nonstiff;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ClassicalRungeKuttaIntegratorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testDecreasingSteps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest();
               object.testDecreasingSteps();
        }
    }

    @Test(timeout=1000000)
    public void testSmallStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest();
               object.testSmallStep();
        }
    }

    @Test(timeout=1000000)
    public void testBigStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest();
               object.testBigStep();
        }
    }

    @Test(timeout=1000000)
    public void testSanityChecks() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest();
               object.testSanityChecks();
        }
    }

    @Test(timeout=1000000)
    public void testMissedEndEvent() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest();
               object.testMissedEndEvent();
        }
    }

    @Test(timeout=1000000)
    public void testBackward() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest();
               object.testBackward();
        }
    }

    @Test(timeout=1000000)
    public void testKepler() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest();
               object.testKepler();
        }
    }

    @Test(timeout=1000000)
    public void testStepSize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.ClassicalRungeKuttaIntegratorTest();
               object.testStepSize();
        }
    }

}