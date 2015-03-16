package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ConjugateGradientTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testNonSquareOperator() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonSquareOperatorException", config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testNonSquareOperator();
        }
    }

    @Test(timeout=120000)
    public void testDimensionMismatchRightHandSide() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testDimensionMismatchRightHandSide();
        }
    }

    @Test(timeout=120000)
    public void testDimensionMismatchSolution() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testDimensionMismatchSolution();
        }
    }

    @Test(timeout=120000)
    public void testNonPositiveDefiniteLinearOperator() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException", config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testNonPositiveDefiniteLinearOperator();
        }
    }

    @Test(timeout=120000)
    public void testUnpreconditionedSolution() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testUnpreconditionedSolution();
        }
    }

    @Test(timeout=120000)
    public void testUnpreconditionedInPlaceSolutionWithInitialGuess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testUnpreconditionedInPlaceSolutionWithInitialGuess();
        }
    }

    @Test(timeout=120000)
    public void testUnpreconditionedSolutionWithInitialGuess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testUnpreconditionedSolutionWithInitialGuess();
        }
    }

    @Test(timeout=120000)
    public void testUnpreconditionedResidual() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testUnpreconditionedResidual();
        }
    }

    @Test(timeout=120000)
    public void testNonSquarePreconditioner() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonSquareOperatorException", config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testNonSquarePreconditioner();
        }
    }

    @Test(timeout=120000)
    public void testMismatchedOperatorDimensions() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testMismatchedOperatorDimensions();
        }
    }

    @Test(timeout=120000)
    public void testNonPositiveDefinitePreconditioner() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException", config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testNonPositiveDefinitePreconditioner();
        }
    }

    @Test(timeout=120000)
    public void testPreconditionedSolution() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testPreconditionedSolution();
        }
    }

    @Test(timeout=120000)
    public void testPreconditionedResidual() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testPreconditionedResidual();
        }
    }

    @Test(timeout=120000)
    public void testPreconditionedSolution2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testPreconditionedSolution2();
        }
    }

    @Test(timeout=120000)
    public void testEventManagement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testEventManagement();
        }
    }

    @Test(timeout=120000)
    public void testUnpreconditionedNormOfResidual() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testUnpreconditionedNormOfResidual();
        }
    }

    @Test(timeout=120000)
    public void testPreconditionedNormOfResidual() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ConjugateGradientTest object = new org.apache.commons.math3.linear.ConjugateGradientTest();
               object.testPreconditionedNormOfResidual();
        }
    }

}