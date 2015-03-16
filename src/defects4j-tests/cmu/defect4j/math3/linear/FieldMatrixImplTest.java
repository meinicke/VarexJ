package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FieldMatrixImplTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testAdd();
        }
    }

    @Test(timeout=120000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testMultiply();
        }
    }

    @Test(timeout=120000)
    public void testDimensions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testDimensions();
        }
    }

    @Test(timeout=120000)
    public void testCopyFunctions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testCopyFunctions();
        }
    }

    @Test(timeout=120000)
    public void testAddFail() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testAddFail();
        }
    }

    @Test(timeout=120000)
    public void testPlusMinus() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testPlusMinus();
        }
    }

    @Test(timeout=120000)
    public void testMultiply2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testMultiply2();
        }
    }

    @Test(timeout=120000)
    public void testPower() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testPower();
        }
    }

    @Test(timeout=120000)
    public void testTrace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testTrace();
        }
    }

    @Test(timeout=120000)
    public void testOperate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testOperate();
        }
    }

    @Test(timeout=120000)
    public void testMath209() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testMath209();
        }
    }

    @Test(timeout=120000)
    public void testTranspose() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testTranspose();
        }
    }

    @Test(timeout=120000)
    public void testPremultiplyVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testPremultiplyVector();
        }
    }

    @Test(timeout=120000)
    public void testPremultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testPremultiply();
        }
    }

    @Test(timeout=120000)
    public void testGetVectors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testGetVectors();
        }
    }

    @Test(timeout=120000)
    public void testGetEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testGetEntry();
        }
    }

    @Test(timeout=120000)
    public void testExamples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testExamples();
        }
    }

    @Test(timeout=120000)
    public void testGetSubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testGetSubMatrix();
        }
    }

    @Test(timeout=120000)
    public void testCopySubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testCopySubMatrix();
        }
    }

    @Test(timeout=120000)
    public void testGetRowMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testGetRowMatrix();
        }
    }

    @Test(timeout=120000)
    public void testSetRowMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testSetRowMatrix();
        }
    }

    @Test(timeout=120000)
    public void testGetColumnMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testGetColumnMatrix();
        }
    }

    @Test(timeout=120000)
    public void testSetColumnMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testSetColumnMatrix();
        }
    }

    @Test(timeout=120000)
    public void testGetRowVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testGetRowVector();
        }
    }

    @Test(timeout=120000)
    public void testSetRowVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testSetRowVector();
        }
    }

    @Test(timeout=120000)
    public void testGetColumnVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testGetColumnVector();
        }
    }

    @Test(timeout=120000)
    public void testSetColumnVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testSetColumnVector();
        }
    }

    @Test(timeout=120000)
    public void testGetRow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testGetRow();
        }
    }

    @Test(timeout=120000)
    public void testSetRow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testSetRow();
        }
    }

    @Test(timeout=120000)
    public void testGetColumn() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testGetColumn();
        }
    }

    @Test(timeout=120000)
    public void testSetColumn() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testSetColumn();
        }
    }

    @Test(timeout=120000)
    public void testSetSubMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testSetSubMatrix();
        }
    }

    @Test(timeout=120000)
    public void testWalk() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testWalk();
        }
    }

    @Test(timeout=120000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testSerial();
        }
    }

    @Test(timeout=120000)
    public void testScalarAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testScalarAdd();
        }
    }

    @Test(timeout=120000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.FieldMatrixImplTest object = new org.apache.commons.math3.linear.FieldMatrixImplTest();
               object.testEqualsAndHashCode();
        }
    }

}