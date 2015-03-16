package cmu.defect4j.math3.optim.nonlinear.scalar.noderiv;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PowellOptimizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testQuadratic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest();
               object.testQuadratic();
        }
    }

    @Test(timeout=120000)
    public void testBoundsUnsupported() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathUnsupportedOperationException", config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest();
               object.testBoundsUnsupported();
        }
    }

    @Test(timeout=120000)
    public void testSumSinc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest();
               object.testSumSinc();
        }
    }

    @Test(timeout=120000)
    public void testMaximizeQuadratic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest();
               object.testMaximizeQuadratic();
        }
    }

    @Test(timeout=120000)
    public void testRelativeToleranceOnScaledValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizerTest();
               object.testRelativeToleranceOnScaledValues();
        }
    }

}