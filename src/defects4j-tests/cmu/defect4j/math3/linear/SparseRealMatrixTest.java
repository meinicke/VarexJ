package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SparseRealMatrixTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testScalarAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testScalarAdd();
        }
    }

    @Test(timeout=1000000)
    public void testNorm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testNorm();
        }
    }

    @Test(timeout=1000000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testToString();
        }
    }

    @Test(timeout=1000000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=1000000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testDimensions();
        }
    }

    @Test(timeout=1000000)
    public void testCopyFunctions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testCopyFunctions();
        }
    }

    @Test(timeout=1000000)
    public void testAddFail() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testAddFail();
        }
    }

    @Test(timeout=1000000)
    public void testPlusMinus() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testPlusMinus();
        }
    }

    @Test(timeout=1000000)
    public void testMultiply2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testMultiply2();
        }
    }

    @Test(timeout=1000000)
    public void testTrace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testTrace();
        }
    }

    @Test(timeout=1000000)
    public void testOperate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testOperate();
        }
    }

    @Test(timeout=1000000)
    public void testMath209() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testMath209();
        }
    }

    @Test(timeout=1000000)
    public void testTranspose() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testTranspose();
        }
    }

    @Test(timeout=1000000)
    public void testPremultiplyVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testPremultiplyVector();
        }
    }

    @Test(timeout=1000000)
    public void testPremultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testPremultiply();
        }
    }

    @Test(timeout=1000000)
    public void testGetVectors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testGetVectors();
        }
    }

    @Test(timeout=1000000)
    public void testGetEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testGetEntry();
        }
    }

    @Test(timeout=1000000)
    public void testExamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testExamples();
        }
    }

    @Test(timeout=1000000)
    public void testGetRowMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testGetRowMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testGetColumnMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testGetColumnMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testGetRowVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testGetRowVector();
        }
    }

    @Test(timeout=1000000)
    public void testGetColumnVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testGetColumnVector();
        }
    }

    @Test(timeout=1000000)
    public void testSetSubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testSetSubMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testSerial();
        }
    }

    @Test(timeout=1000000)
    public void testSubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testSubMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testAdd();
        }
    }

    @Test(timeout=1000000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseRealMatrixTest object = new org.apache.commons.math3.linear.SparseRealMatrixTest();
               object.testMultiply();
        }
    }

}