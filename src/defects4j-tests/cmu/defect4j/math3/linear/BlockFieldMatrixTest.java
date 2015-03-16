package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BlockFieldMatrixTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testAdd();
        }
    }

    @Test(timeout=120000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testMultiply();
        }
    }

    @Test(timeout=120000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testDimensions();
        }
    }

    @Test(timeout=120000)
    public void testCopyFunctions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testCopyFunctions();
        }
    }

    @Test(timeout=120000)
    public void testAddFail() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testAddFail();
        }
    }

    @Test(timeout=120000)
    public void testPlusMinus() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testPlusMinus();
        }
    }

    @Test(timeout=120000)
    public void testMultiply2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testMultiply2();
        }
    }

    @Test(timeout=120000)
    public void testTrace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testTrace();
        }
    }

    @Test(timeout=120000)
    public void testOperate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testOperate();
        }
    }

    @Test(timeout=120000)
    public void testMath209() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testMath209();
        }
    }

    @Test(timeout=120000)
    public void testTranspose() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testTranspose();
        }
    }

    @Test(timeout=120000)
    public void testPremultiplyVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testPremultiplyVector();
        }
    }

    @Test(timeout=120000)
    public void testPremultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testPremultiply();
        }
    }

    @Test(timeout=120000)
    public void testGetVectors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetVectors();
        }
    }

    @Test(timeout=120000)
    public void testGetEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetEntry();
        }
    }

    @Test(timeout=120000)
    public void testExamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testExamples();
        }
    }

    @Test(timeout=120000)
    public void testGetSubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetSubMatrix();
        }
    }

    @Test(timeout=120000)
    public void testCopySubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testCopySubMatrix();
        }
    }

    @Test(timeout=120000)
    public void testGetRowMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetRowMatrix();
        }
    }

    @Test(timeout=120000)
    public void testSetRowMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testSetRowMatrix();
        }
    }

    @Test(timeout=120000)
    public void testGetColumnMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetColumnMatrix();
        }
    }

    @Test(timeout=120000)
    public void testSetColumnMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testSetColumnMatrix();
        }
    }

    @Test(timeout=120000)
    public void testGetRowVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetRowVector();
        }
    }

    @Test(timeout=120000)
    public void testSetRowVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testSetRowVector();
        }
    }

    @Test(timeout=120000)
    public void testGetColumnVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetColumnVector();
        }
    }

    @Test(timeout=120000)
    public void testSetColumnVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testSetColumnVector();
        }
    }

    @Test(timeout=120000)
    public void testGetRow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetRow();
        }
    }

    @Test(timeout=120000)
    public void testSetRow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testSetRow();
        }
    }

    @Test(timeout=120000)
    public void testGetColumn() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetColumn();
        }
    }

    @Test(timeout=120000)
    public void testSetColumn() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testSetColumn();
        }
    }

    @Test(timeout=120000)
    public void testSetSubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testSetSubMatrix();
        }
    }

    @Test(timeout=120000)
    public void testWalk() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testWalk();
        }
    }

    @Test(timeout=120000)
    public void testSeveralBlocks() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testSeveralBlocks();
        }
    }

    @Test(timeout=120000)
    public void testOperateLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testOperateLarge();
        }
    }

    @Test(timeout=120000)
    public void testOperatePremultiplyLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testOperatePremultiplyLarge();
        }
    }

    @Test(timeout=120000)
    public void testGetSetMatrixLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetSetMatrixLarge();
        }
    }

    @Test(timeout=120000)
    public void testGetSetRowMatrixLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetSetRowMatrixLarge();
        }
    }

    @Test(timeout=120000)
    public void testGetSetColumnMatrixLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetSetColumnMatrixLarge();
        }
    }

    @Test(timeout=120000)
    public void testGetSetRowVectorLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetSetRowVectorLarge();
        }
    }

    @Test(timeout=120000)
    public void testGetSetColumnVectorLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetSetColumnVectorLarge();
        }
    }

    @Test(timeout=120000)
    public void testGetSetRowLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetSetRowLarge();
        }
    }

    @Test(timeout=120000)
    public void testGetSetColumnLarge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testGetSetColumnLarge();
        }
    }

    @Test(timeout=120000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testSerial();
        }
    }

    @Test(timeout=120000)
    public void testScalarAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testScalarAdd();
        }
    }

    @Test(timeout=120000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.BlockFieldMatrixTest object = new org.apache.commons.math3.linear.BlockFieldMatrixTest();
               object.testEqualsAndHashCode();
        }
    }

}