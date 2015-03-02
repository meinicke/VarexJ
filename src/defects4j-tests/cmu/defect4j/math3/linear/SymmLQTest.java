package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SymmLQTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testNonSquareOperator() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonSquareOperatorException", config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testNonSquareOperator();
        }
    }

    @Test(timeout=120000)
    public void testDimensionMismatchRightHandSide() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testDimensionMismatchRightHandSide();
        }
    }

    @Test(timeout=120000)
    public void testDimensionMismatchSolution() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testDimensionMismatchSolution();
        }
    }

    @Test(timeout=120000)
    public void testUnpreconditionedSolution() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testUnpreconditionedSolution();
        }
    }

    @Test(timeout=120000)
    public void testUnpreconditionedInPlaceSolutionWithInitialGuess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testUnpreconditionedInPlaceSolutionWithInitialGuess();
        }
    }

    @Test(timeout=120000)
    public void testUnpreconditionedSolutionWithInitialGuess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testUnpreconditionedSolutionWithInitialGuess();
        }
    }

    @Test(timeout=120000)
    public void testNonSquarePreconditioner() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonSquareOperatorException", config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testNonSquarePreconditioner();
        }
    }

    @Test(timeout=120000)
    public void testMismatchedOperatorDimensions() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testMismatchedOperatorDimensions();
        }
    }

    @Test(timeout=120000)
    public void testNonPositiveDefinitePreconditioner() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonPositiveDefiniteOperatorException", config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testNonPositiveDefinitePreconditioner();
        }
    }

    @Test(timeout=120000)
    public void testPreconditionedSolution() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testPreconditionedSolution();
        }
    }

    @Test(timeout=120000)
    public void testPreconditionedSolution2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testPreconditionedSolution2();
        }
    }

    @Test(timeout=120000)
    public void testEventManagement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testEventManagement();
        }
    }

    @Test(timeout=120000)
    public void testUnpreconditionedNormOfResidual() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testUnpreconditionedNormOfResidual();
        }
    }

    @Test(timeout=120000)
    public void testPreconditionedNormOfResidual() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testPreconditionedNormOfResidual();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders1();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders2();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders3();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders4() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders4();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders5() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders5();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders6() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders6();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders7() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders7();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders8() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders8();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders9() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders9();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders10() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders10();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders11() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders11();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders12() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders12();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders13() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders13();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders14() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders14();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders15() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders15();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders16() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders16();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders17() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders17();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders18() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders18();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders19() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders19();
        }
    }

    @Test(timeout=120000)
    public void testSolveSaunders20() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testSolveSaunders20();
        }
    }

    @Test(timeout=120000)
    public void testNonSelfAdjointOperator() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonSelfAdjointOperatorException", config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testNonSelfAdjointOperator();
        }
    }

    @Test(timeout=120000)
    public void testNonSelfAdjointPreconditioner() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.linear.NonSelfAdjointOperatorException", config)) {
               org.apache.commons.math3.linear.SymmLQTest object = new org.apache.commons.math3.linear.SymmLQTest();
               object.testNonSelfAdjointPreconditioner();
        }
    }

}