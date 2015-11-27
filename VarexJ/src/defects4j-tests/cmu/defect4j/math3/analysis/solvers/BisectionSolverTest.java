package cmu.defect4j.math3.analysis.solvers;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BisectionSolverTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testQuinticZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BisectionSolverTest object = new org.apache.commons.math3.analysis.solvers.BisectionSolverTest();
               object.testQuinticZero();
        }
    }

    @Test(timeout=1000000)
    public void testSinZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BisectionSolverTest object = new org.apache.commons.math3.analysis.solvers.BisectionSolverTest();
               object.testSinZero();
        }
    }

    @Test(timeout=1000000)
    public void testMath369() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.solvers.BisectionSolverTest object = new org.apache.commons.math3.analysis.solvers.BisectionSolverTest();
               object.testMath369();
        }
    }

}