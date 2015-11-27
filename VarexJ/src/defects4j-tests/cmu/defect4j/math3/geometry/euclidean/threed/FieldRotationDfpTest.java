package cmu.defect4j.math3.geometry.euclidean.threed;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FieldRotationDfpTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testCompose() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testCompose();
        }
    }

    @Test(timeout=1000000)
    public void testIdentity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testIdentity();
        }
    }

    @Test(timeout=1000000)
    public void testAxisAngle() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testAxisAngle();
        }
    }

    @Test(timeout=1000000)
    public void testRevert() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testRevert();
        }
    }

    @Test(timeout=1000000)
    public void testVectorOnePair() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testVectorOnePair();
        }
    }

    @Test(timeout=1000000)
    public void testVectorTwoPairs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testVectorTwoPairs();
        }
    }

    @Test(timeout=1000000)
    public void testMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testMatrix();
        }
    }

    @Test(timeout=1000000)
    public void testAngles() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testAngles();
        }
    }

    @Test(timeout=1000000)
    public void testSingularities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testSingularities();
        }
    }

    @Test(timeout=1000000)
    public void testQuaternion() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testQuaternion();
        }
    }

    @Test(timeout=1000000)
    public void testComposeInverse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testComposeInverse();
        }
    }

    @Test(timeout=1000000)
    public void testDoubleVectors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testDoubleVectors();
        }
    }

    @Test(timeout=1000000)
    public void testDoubleRotations() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testDoubleRotations();
        }
    }

    @Test(timeout=1000000)
    public void testArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testArray();
        }
    }

    @Test(timeout=1000000)
    public void testApplyInverseTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testApplyInverseTo();
        }
    }

    @Test(timeout=1000000)
    public void testIssue639() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testIssue639();
        }
    }

    @Test(timeout=1000000)
    public void testIssue801() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldRotationDfpTest();
               object.testIssue801();
        }
    }

}