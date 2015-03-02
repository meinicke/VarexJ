package cmu.defect4j.math3.analysis.solvers;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SecantSolverTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSinZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.SecantSolverTest object = new org.apache.commons.math3.analysis.solvers.SecantSolverTest();
               object.testSinZero();
        }
    }

    @Test(timeout=120000)
    public void testQuinticZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.SecantSolverTest object = new org.apache.commons.math3.analysis.solvers.SecantSolverTest();
               object.testQuinticZero();
        }
    }

    @Test(timeout=120000)
    public void testRootEndpoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.SecantSolverTest object = new org.apache.commons.math3.analysis.solvers.SecantSolverTest();
               object.testRootEndpoints();
        }
    }

    @Test(timeout=120000)
    public void testBadEndpoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.SecantSolverTest object = new org.apache.commons.math3.analysis.solvers.SecantSolverTest();
               object.testBadEndpoints();
        }
    }

    @Test(timeout=120000)
    public void testSolutionLeftSide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.SecantSolverTest object = new org.apache.commons.math3.analysis.solvers.SecantSolverTest();
               object.testSolutionLeftSide();
        }
    }

    @Test(timeout=120000)
    public void testSolutionRightSide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.SecantSolverTest object = new org.apache.commons.math3.analysis.solvers.SecantSolverTest();
               object.testSolutionRightSide();
        }
    }

    @Test(timeout=120000)
    public void testSolutionBelowSide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.SecantSolverTest object = new org.apache.commons.math3.analysis.solvers.SecantSolverTest();
               object.testSolutionBelowSide();
        }
    }

    @Test(timeout=120000)
    public void testSolutionAboveSide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.SecantSolverTest object = new org.apache.commons.math3.analysis.solvers.SecantSolverTest();
               object.testSolutionAboveSide();
        }
    }

}