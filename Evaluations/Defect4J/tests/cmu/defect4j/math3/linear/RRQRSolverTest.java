package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class RRQRSolverTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testSolveDimensionErrors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RRQRSolverTest object = new org.apache.commons.math3.linear.RRQRSolverTest();
               object.testSolveDimensionErrors();
        }
    }

    @Test(timeout=1000000)
    public void testSolve() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RRQRSolverTest object = new org.apache.commons.math3.linear.RRQRSolverTest();
               object.testSolve();
        }
    }

    @Test(timeout=1000000)
    public void testRank() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RRQRSolverTest object = new org.apache.commons.math3.linear.RRQRSolverTest();
               object.testRank();
        }
    }

    @Test(timeout=1000000)
    public void testSolveRankErrors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RRQRSolverTest object = new org.apache.commons.math3.linear.RRQRSolverTest();
               object.testSolveRankErrors();
        }
    }

    @Test(timeout=1000000)
    public void testOverdetermined() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RRQRSolverTest object = new org.apache.commons.math3.linear.RRQRSolverTest();
               object.testOverdetermined();
        }
    }

    @Test(timeout=1000000)
    public void testUnderdetermined() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.RRQRSolverTest object = new org.apache.commons.math3.linear.RRQRSolverTest();
               object.testUnderdetermined();
        }
    }

}