package cmu.defect4j.math3.geometry.euclidean.threed;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class RotationTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testCompose() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testCompose();
        }
    }

    @Test(timeout=120000)
    public void testAxisAngle() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testAxisAngle();
        }
    }

    @Test(timeout=120000)
    public void testRevert() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testRevert();
        }
    }

    @Test(timeout=120000)
    public void testVectorOnePair() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testVectorOnePair();
        }
    }

    @Test(timeout=120000)
    public void testIdentity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testIdentity();
        }
    }

    @Test(timeout=120000)
    public void testVectorTwoPairs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testVectorTwoPairs();
        }
    }

    @Test(timeout=120000)
    public void testMatrix() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testMatrix();
        }
    }

    @Test(timeout=120000)
    public void testAngles() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testAngles();
        }
    }

    @Test(timeout=120000)
    public void testSingularities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testSingularities();
        }
    }

    @Test(timeout=120000)
    public void testQuaternion() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testQuaternion();
        }
    }

    @Test(timeout=120000)
    public void testComposeInverse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testComposeInverse();
        }
    }

    @Test(timeout=120000)
    public void testArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testArray();
        }
    }

    @Test(timeout=120000)
    public void testApplyInverseTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testApplyInverseTo();
        }
    }

    @Test(timeout=120000)
    public void testIssue639() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testIssue639();
        }
    }

    @Test(timeout=120000)
    public void testIssue801() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.RotationTest object = new org.apache.commons.math3.geometry.euclidean.threed.RotationTest();
               object.testIssue801();
        }
    }

}