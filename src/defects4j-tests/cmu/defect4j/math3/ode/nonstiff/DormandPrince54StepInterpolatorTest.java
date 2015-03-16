package cmu.defect4j.math3.ode.nonstiff;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DormandPrince54StepInterpolatorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void serialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolatorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolatorTest();
               object.serialization();
        }
    }

    @Test(timeout=120000)
    public void derivativesConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolatorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolatorTest();
               object.derivativesConsistency();
        }
    }

    @Test(timeout=120000)
    public void checkClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolatorTest object = new org.apache.commons.math3.ode.nonstiff.DormandPrince54StepInterpolatorTest();
               object.checkClone();
        }
    }

}