package cmu.defect4j.math3.analysis.solvers;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class NewtonRaphsonSolverTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSinZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolverTest object = new org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolverTest();
               object.testSinZero();
        }
    }

    @Test(timeout=120000)
    public void testQuinticZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolverTest object = new org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolverTest();
               object.testQuinticZero();
        }
    }

}