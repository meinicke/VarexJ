package cmu.defect4j.math3.ode.sampling;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StepNormalizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testBoundaries() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerTest();
               object.setUp();
               object.testBoundaries();
        }
    }

    @Test(timeout=120000)
    public void testBeforeEnd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.sampling.StepNormalizerTest object = new org.apache.commons.math3.ode.sampling.StepNormalizerTest();
               object.setUp();
               object.testBeforeEnd();
        }
    }

}