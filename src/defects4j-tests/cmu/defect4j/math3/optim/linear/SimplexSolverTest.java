package cmu.defect4j.math3.optim.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SimplexSolverTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testMath828() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath828();
        }
    }

    @Test(timeout=1000000)
    public void testMath828Cycle() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath828Cycle();
        }
    }

    @Test(timeout=1000000)
    public void testMath781() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath781();
        }
    }

    @Test(timeout=1000000)
    public void testMath713NegativeVariable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath713NegativeVariable();
        }
    }

    @Test(timeout=1000000)
    public void testMath434NegativeVariable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath434NegativeVariable();
        }
    }

    @Test(timeout=1000000)
    public void testMath434UnfeasibleSolution() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.optim.linear.NoFeasibleSolutionException", config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath434UnfeasibleSolution();
        }
    }

    @Test(timeout=1000000)
    public void testMath434PivotRowSelection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath434PivotRowSelection();
        }
    }

    @Test(timeout=1000000)
    public void testMath434PivotRowSelection2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath434PivotRowSelection2();
        }
    }

    @Test(timeout=1000000)
    public void testMath272() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath272();
        }
    }

    @Test(timeout=1000000)
    public void testMath286() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath286();
        }
    }

    @Test(timeout=1000000)
    public void testDegeneracy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testDegeneracy();
        }
    }

    @Test(timeout=1000000)
    public void testMath288() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath288();
        }
    }

    @Test(timeout=1000000)
    public void testMath290GEQ() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath290GEQ();
        }
    }

    @Test(timeout=1000000)
    public void testMath290LEQ() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.optim.linear.NoFeasibleSolutionException", config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath290LEQ();
        }
    }

    @Test(timeout=1000000)
    public void testMath293() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath293();
        }
    }

    @Test(timeout=1000000)
    public void testMath930() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMath930();
        }
    }

    @Test(timeout=1000000)
    public void testSimplexSolver() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testSimplexSolver();
        }
    }

    @Test(timeout=1000000)
    public void testSingleVariableAndConstraint() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testSingleVariableAndConstraint();
        }
    }

    @Test(timeout=1000000)
    public void testModelWithNoArtificialVars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testModelWithNoArtificialVars();
        }
    }

    @Test(timeout=1000000)
    public void testMinimization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testMinimization();
        }
    }

    @Test(timeout=1000000)
    public void testSolutionWithNegativeDecisionVariable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testSolutionWithNegativeDecisionVariable();
        }
    }

    @Test(timeout=1000000)
    public void testInfeasibleSolution() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.optim.linear.NoFeasibleSolutionException", config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testInfeasibleSolution();
        }
    }

    @Test(timeout=1000000)
    public void testUnboundedSolution() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.optim.linear.UnboundedSolutionException", config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testUnboundedSolution();
        }
    }

    @Test(timeout=1000000)
    public void testRestrictVariablesToNonNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testRestrictVariablesToNonNegative();
        }
    }

    @Test(timeout=1000000)
    public void testEpsilon() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testEpsilon();
        }
    }

    @Test(timeout=1000000)
    public void testTrivialModel() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testTrivialModel();
        }
    }

    @Test(timeout=1000000)
    public void testLargeModel() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.linear.SimplexSolverTest object = new org.apache.commons.math3.optim.linear.SimplexSolverTest();
               object.testLargeModel();
        }
    }

}