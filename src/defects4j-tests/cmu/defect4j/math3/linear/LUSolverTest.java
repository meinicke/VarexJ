package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LUSolverTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testSolveDimensionErrors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUSolverTest object = new org.apache.commons.math3.linear.LUSolverTest();
               object.testSolveDimensionErrors();
        }
    }

    @Test(timeout=1000000)
    public void testSolve() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUSolverTest object = new org.apache.commons.math3.linear.LUSolverTest();
               object.testSolve();
        }
    }

    @Test(timeout=1000000)
    public void testDeterminant() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUSolverTest object = new org.apache.commons.math3.linear.LUSolverTest();
               object.testDeterminant();
        }
    }

    @Test(timeout=1000000)
    public void testSingular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUSolverTest object = new org.apache.commons.math3.linear.LUSolverTest();
               object.testSingular();
        }
    }

    @Test(timeout=1000000)
    public void testSolveSingularityErrors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUSolverTest object = new org.apache.commons.math3.linear.LUSolverTest();
               object.testSolveSingularityErrors();
        }
    }

    @Test(timeout=1000000)
    public void testThreshold() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.LUSolverTest object = new org.apache.commons.math3.linear.LUSolverTest();
               object.testThreshold();
        }
    }

}