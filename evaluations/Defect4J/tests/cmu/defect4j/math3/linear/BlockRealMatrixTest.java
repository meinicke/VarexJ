package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BlockRealMatrixTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testScalarAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testScalarAdd();
        }
    }

    @Test(timeout=1000000)
    public void testNorm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testNorm();
        }
    }

    @Test(timeout=1000000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testToString();
        }
    }

    @Test(timeout=1000000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=1000000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testDimensions();
        }
    }

    @Test(timeout=1000000)
    public void testCopyFunctions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testCopyFunctions();
        }
    }

    @Test(timeout=1000000)
    public void testAddFail() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testAddFail();
        }
    }

    @Test(timeout=1000000)
    public void testFrobeniusNorm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testFrobeniusNorm();
        }
    }

    @Test(timeout=1000000)
    public void testPlusMinus() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testPlusMinus();
        }
    }

    @Test(timeout=1000000)
    public void testMultiply2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testMultiply2();
        }
    }

    @Test(timeout=1000000)
    public void testTrace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testTrace();
        }
    }

    @Test(timeout=1000000)
    public void testOperate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testOperate();
        }
    }

    @Test(timeout=1000000)
    public void testMath209() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testMath209();
        }
    }

    @Test(timeout=1000000)
    public void testTranspose() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testTranspose();
        }
    }

    @Test(timeout=1000000)
    public void testPremultiplyVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testPremultiplyVector();
        }
    }

    @Test(timeout=1000000)
    public void testPremultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testPremultiply();
        }
    }

    @Test(timeout=1000000)
    public void testGetVectors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetVectors();
        }
    }

    @Test(timeout=1000000)
    public void testGetEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetEntry();
        }
    }

    @Test(timeout=1000000)
    public void testExamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testExamples();
        }
    }

    @Test(timeout=1000000)
    public void testGetSubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetSubMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testCopySubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testCopySubMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testGetRowMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetRowMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testSetRowMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testSetRowMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testGetColumnMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetColumnMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testSetColumnMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testSetColumnMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testGetRowVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetRowVector();
        }
    }

    @Test(timeout=1000000)
    public void testSetRowVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testSetRowVector();
        }
    }

    @Test(timeout=1000000)
    public void testGetColumnVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetColumnVector();
        }
    }

    @Test(timeout=1000000)
    public void testSetColumnVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testSetColumnVector();
        }
    }

    @Test(timeout=1000000)
    public void testGetRow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetRow();
        }
    }

    @Test(timeout=1000000)
    public void testSetRow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testSetRow();
        }
    }

    @Test(timeout=1000000)
    public void testGetColumn() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetColumn();
        }
    }

    @Test(timeout=1000000)
    public void testSetColumn() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testSetColumn();
        }
    }

    @Test(timeout=1000000)
    public void testSetSubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testSetSubMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testWalk() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testWalk();
        }
    }

    @Test(timeout=1000000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testSerial();
        }
    }

    @Test(timeout=1000000)
    public void testSeveralBlocks() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testSeveralBlocks();
        }
    }

    @Test(timeout=1000000)
    public void testOperateLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testOperateLarge();
        }
    }

    @Test(timeout=1000000)
    public void testOperatePremultiplyLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testOperatePremultiplyLarge();
        }
    }

    @Test(timeout=1000000)
    public void testGetSetMatrixLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetSetMatrixLarge();
        }
    }

    @Test(timeout=1000000)
    public void testGetSetRowMatrixLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetSetRowMatrixLarge();
        }
    }

    @Test(timeout=1000000)
    public void testGetSetColumnMatrixLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetSetColumnMatrixLarge();
        }
    }

    @Test(timeout=1000000)
    public void testGetSetRowVectorLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetSetRowVectorLarge();
        }
    }

    @Test(timeout=1000000)
    public void testGetSetColumnVectorLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetSetColumnVectorLarge();
        }
    }

    @Test(timeout=1000000)
    public void testGetSetRowLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetSetRowLarge();
        }
    }

    @Test(timeout=1000000)
    public void testGetSetColumnLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testGetSetColumnLarge();
        }
    }

    @Test(timeout=1000000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testAdd();
        }
    }

    @Test(timeout=1000000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockRealMatrixTest object = new org.apache.commons.math3.linear.BlockRealMatrixTest();
               object.testMultiply();
        }
    }

}