package cmu.defect4j.math3.ode.nonstiff;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EulerStepInterpolatorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void serialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest object = new org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest();
               object.serialization();
        }
    }

    @Test(timeout=120000)
    public void derivativesConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest object = new org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest();
               object.derivativesConsistency();
        }
    }

    @Test(timeout=120000)
    public void noReset() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest object = new org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest();
               object.noReset();
        }
    }

    @Test(timeout=120000)
    public void interpolationAtBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest object = new org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest();
               object.interpolationAtBounds();
        }
    }

    @Test(timeout=120000)
    public void interpolationInside() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest object = new org.apache.commons.math3.ode.nonstiff.EulerStepInterpolatorTest();
               object.interpolationInside();
        }
    }

}