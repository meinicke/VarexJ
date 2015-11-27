package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SingularValueSolverTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testSolveDimensionErrors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueSolverTest object = new org.apache.commons.math3.linear.SingularValueSolverTest();
               object.testSolveDimensionErrors();
        }
    }

    @Test(timeout=1000000)
    public void testSolve() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueSolverTest object = new org.apache.commons.math3.linear.SingularValueSolverTest();
               object.testSolve();
        }
    }

    @Test(timeout=1000000)
    public void testLeastSquareSolve() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueSolverTest object = new org.apache.commons.math3.linear.SingularValueSolverTest();
               object.testLeastSquareSolve();
        }
    }

    @Test(timeout=1000000)
    public void testMath320B() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueSolverTest object = new org.apache.commons.math3.linear.SingularValueSolverTest();
               object.testMath320B();
        }
    }

    @Test(timeout=1000000)
    public void testConditionNumber() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueSolverTest object = new org.apache.commons.math3.linear.SingularValueSolverTest();
               object.testConditionNumber();
        }
    }

}