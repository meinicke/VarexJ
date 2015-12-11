package cmu.defect4j.math3.ode.sampling;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StepNormalizerOutputTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testIncNeither() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testIncNeither();
        }
    }

    @Test(timeout=1000000)
    public void testIncNeitherRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testIncNeitherRev();
        }
    }

    @Test(timeout=1000000)
    public void testIncFirst() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testIncFirst();
        }
    }

    @Test(timeout=1000000)
    public void testIncFirstRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testIncFirstRev();
        }
    }

    @Test(timeout=1000000)
    public void testIncLast() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testIncLast();
        }
    }

    @Test(timeout=1000000)
    public void testIncLastRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testIncLastRev();
        }
    }

    @Test(timeout=1000000)
    public void testIncBoth() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testIncBoth();
        }
    }

    @Test(timeout=1000000)
    public void testIncBothRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testIncBothRev();
        }
    }

    @Test(timeout=1000000)
    public void testMulNeither() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testMulNeither();
        }
    }

    @Test(timeout=1000000)
    public void testMulNeitherRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testMulNeitherRev();
        }
    }

    @Test(timeout=1000000)
    public void testMulFirst() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testMulFirst();
        }
    }

    @Test(timeout=1000000)
    public void testMulFirstRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testMulFirstRev();
        }
    }

    @Test(timeout=1000000)
    public void testMulLast() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testMulLast();
        }
    }

    @Test(timeout=1000000)
    public void testMulLastRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testMulLastRev();
        }
    }

    @Test(timeout=1000000)
    public void testMulBoth() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testMulBoth();
        }
    }

    @Test(timeout=1000000)
    public void testMulBothRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputTest();
               object.testMulBothRev();
        }
    }

}