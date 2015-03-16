package cmu.defect4j.math3.ode.nonstiff;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class AdamsBashforthIntegratorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void dimensionCheck() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegratorTest();
               object.dimensionCheck();
        }
    }

    @Test(timeout=120000)
    public void testMinStep() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegratorTest();
               object.testMinStep();
        }
    }

    @Test(timeout=120000)
    public void testIncreasingTolerance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegratorTest();
               object.testIncreasingTolerance();
        }
    }

    @Test(timeout=120000)
    public void exceedMaxEvaluations() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MaxCountExceededException", config)) {
               org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegratorTest();
               object.exceedMaxEvaluations();
        }
    }

    @Test(timeout=120000)
    public void backward() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegratorTest();
               object.backward();
        }
    }

    @Test(timeout=120000)
    public void polynomial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegratorTest object = new org.apache.commons.math3.ode.nonstiff.AdamsBashforthIntegratorTest();
               object.polynomial();
        }
    }

}