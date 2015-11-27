package cmu.defect4j.math3.optim.nonlinear.scalar.noderiv;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SimplexOptimizerNelderMeadTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testRosenbrock() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest();
               object.testRosenbrock();
        }
    }

    @Test(timeout=1000000)
    public void testBoundsUnsupported() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathUnsupportedOperationException", config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest();
               object.testBoundsUnsupported();
        }
    }

    @Test(timeout=1000000)
    public void testMinimize1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest();
               object.testMinimize1();
        }
    }

    @Test(timeout=1000000)
    public void testMinimize2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest();
               object.testMinimize2();
        }
    }

    @Test(timeout=1000000)
    public void testMaximize1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest();
               object.testMaximize1();
        }
    }

    @Test(timeout=1000000)
    public void testMaximize2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest();
               object.testMaximize2();
        }
    }

    @Test(timeout=1000000)
    public void testPowell() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest();
               object.testPowell();
        }
    }

    @Test(timeout=1000000)
    public void testLeastSquares1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest();
               object.testLeastSquares1();
        }
    }

    @Test(timeout=1000000)
    public void testLeastSquares2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest();
               object.testLeastSquares2();
        }
    }

    @Test(timeout=1000000)
    public void testLeastSquares3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest();
               object.testLeastSquares3();
        }
    }

    @Test(timeout=1000000)
    public void testMaxIterations() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.TooManyEvaluationsException", config)) {
               org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest object = new org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizerNelderMeadTest();
               object.testMaxIterations();
        }
    }

}