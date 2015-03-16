package cmu.defect4j.math3.analysis.solvers;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BracketingNthOrderBrentSolverTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testInsufficientOrder1() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testInsufficientOrder1();
        }
    }

    @Test(timeout=120000)
    public void testConstructorsOK() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testConstructorsOK();
        }
    }

    @Test(timeout=120000)
    public void testIssue716() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testIssue716();
        }
    }

    @Test(timeout=120000)
    public void testInsufficientOrder2() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testInsufficientOrder2();
        }
    }

    @Test(timeout=120000)
    public void testInsufficientOrder3() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testInsufficientOrder3();
        }
    }

    @Test(timeout=120000)
    public void testConvergenceOnFunctionAccuracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testConvergenceOnFunctionAccuracy();
        }
    }

    @Test(timeout=120000)
    public void testFasterThanNewton() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testFasterThanNewton();
        }
    }

    @Test(timeout=120000)
    public void testSinZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testSinZero();
        }
    }

    @Test(timeout=120000)
    public void testQuinticZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testQuinticZero();
        }
    }

    @Test(timeout=120000)
    public void testRootEndpoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testRootEndpoints();
        }
    }

    @Test(timeout=120000)
    public void testBadEndpoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testBadEndpoints();
        }
    }

    @Test(timeout=120000)
    public void testSolutionLeftSide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testSolutionLeftSide();
        }
    }

    @Test(timeout=120000)
    public void testSolutionRightSide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testSolutionRightSide();
        }
    }

    @Test(timeout=120000)
    public void testSolutionBelowSide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testSolutionBelowSide();
        }
    }

    @Test(timeout=120000)
    public void testSolutionAboveSide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest object = new org.apache.commons.math3.analysis.solvers.BracketingNthOrderBrentSolverTest();
               object.testSolutionAboveSide();
        }
    }

}