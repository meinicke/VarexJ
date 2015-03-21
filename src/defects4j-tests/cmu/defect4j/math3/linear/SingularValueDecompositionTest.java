package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SingularValueDecompositionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testDimensions();
        }
    }

    @Test(timeout=1000000)
    public void testRank() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testRank();
        }
    }

    @Test(timeout=1000000)
    public void testAEqualUSVt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testAEqualUSVt();
        }
    }

    @Test(timeout=1000000)
    public void testUOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testUOrthogonal();
        }
    }

    @Test(timeout=1000000)
    public void testVOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testVOrthogonal();
        }
    }

    @Test(timeout=1000000)
    public void testMoreRows() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testMoreRows();
        }
    }

    @Test(timeout=1000000)
    public void testMoreColumns() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testMoreColumns();
        }
    }

    @Test(timeout=1000000)
    public void testHadamard() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testHadamard();
        }
    }

    @Test(timeout=1000000)
    public void testStability1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testStability1();
        }
    }

    @Test(timeout=1000000)
    public void testStability2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testStability2();
        }
    }

    @Test(timeout=1000000)
    public void testConditionNumber() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testConditionNumber();
        }
    }

    @Test(timeout=1000000)
    public void testInverseConditionNumber() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testInverseConditionNumber();
        }
    }

    @Test(timeout=1000000)
    public void testIssue947() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SingularValueDecompositionTest object = new org.apache.commons.math3.linear.SingularValueDecompositionTest();
               object.testIssue947();
        }
    }

}