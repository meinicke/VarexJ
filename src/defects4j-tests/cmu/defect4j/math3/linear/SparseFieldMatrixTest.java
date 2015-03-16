package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SparseFieldMatrixTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testAdd();
        }
    }

    @Test(timeout=120000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testMultiply();
        }
    }

    @Test(timeout=120000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testDimensions();
        }
    }

    @Test(timeout=120000)
    public void testCopyFunctions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testCopyFunctions();
        }
    }

    @Test(timeout=120000)
    public void testAddFail() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testAddFail();
        }
    }

    @Test(timeout=120000)
    public void testPlusMinus() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testPlusMinus();
        }
    }

    @Test(timeout=120000)
    public void testMultiply2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testMultiply2();
        }
    }

    @Test(timeout=120000)
    public void testTrace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testTrace();
        }
    }

    @Test(timeout=120000)
    public void testOperate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testOperate();
        }
    }

    @Test(timeout=120000)
    public void testMath209() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testMath209();
        }
    }

    @Test(timeout=120000)
    public void testTranspose() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testTranspose();
        }
    }

    @Test(timeout=120000)
    public void testPremultiplyVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testPremultiplyVector();
        }
    }

    @Test(timeout=120000)
    public void testPremultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testPremultiply();
        }
    }

    @Test(timeout=120000)
    public void testGetVectors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testGetVectors();
        }
    }

    @Test(timeout=120000)
    public void testGetEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testGetEntry();
        }
    }

    @Test(timeout=120000)
    public void testExamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testExamples();
        }
    }

    @Test(timeout=120000)
    public void testGetRowMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testGetRowMatrix();
        }
    }

    @Test(timeout=120000)
    public void testGetColumnMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testGetColumnMatrix();
        }
    }

    @Test(timeout=120000)
    public void testGetRowVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testGetRowVector();
        }
    }

    @Test(timeout=120000)
    public void testGetColumnVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testGetColumnVector();
        }
    }

    @Test(timeout=120000)
    public void testSetSubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testSetSubMatrix();
        }
    }

    @Test(timeout=120000)
    public void testSubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testSubMatrix();
        }
    }

    @Test(timeout=120000)
    public void testScalarAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testScalarAdd();
        }
    }

    @Test(timeout=120000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SparseFieldMatrixTest object = new org.apache.commons.math3.linear.SparseFieldMatrixTest();
               object.testEqualsAndHashCode();
        }
    }

}