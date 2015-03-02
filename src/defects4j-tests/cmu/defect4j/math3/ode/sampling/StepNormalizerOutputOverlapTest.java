package cmu.defect4j.math3.ode.sampling;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StepNormalizerOutputOverlapTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testIncNeither() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testIncNeither();
        }
    }

    @Test(timeout=120000)
    public void testIncNeitherRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testIncNeitherRev();
        }
    }

    @Test(timeout=120000)
    public void testIncFirst() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testIncFirst();
        }
    }

    @Test(timeout=120000)
    public void testIncFirstRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testIncFirstRev();
        }
    }

    @Test(timeout=120000)
    public void testIncLast() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testIncLast();
        }
    }

    @Test(timeout=120000)
    public void testIncLastRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testIncLastRev();
        }
    }

    @Test(timeout=120000)
    public void testIncBoth() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testIncBoth();
        }
    }

    @Test(timeout=120000)
    public void testIncBothRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testIncBothRev();
        }
    }

    @Test(timeout=120000)
    public void testMulNeither() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testMulNeither();
        }
    }

    @Test(timeout=120000)
    public void testMulNeitherRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testMulNeitherRev();
        }
    }

    @Test(timeout=120000)
    public void testMulFirst() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testMulFirst();
        }
    }

    @Test(timeout=120000)
    public void testMulFirstRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testMulFirstRev();
        }
    }

    @Test(timeout=120000)
    public void testMulLast() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testMulLast();
        }
    }

    @Test(timeout=120000)
    public void testMulLastRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testMulLastRev();
        }
    }

    @Test(timeout=120000)
    public void testMulBoth() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testMulBoth();
        }
    }

    @Test(timeout=120000)
    public void testMulBothRev() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerOutputOverlapTest();
               object.testMulBothRev();
        }
    }

}