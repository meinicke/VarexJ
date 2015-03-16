package cmu.defect4j.math3.geometry.euclidean.threed;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PlaneTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testOffset() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PlaneTest object = new org.apache.commons.math3.geometry.euclidean.threed.PlaneTest();
               object.testOffset();
        }
    }

    @Test(timeout=120000)
    public void testContains() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PlaneTest object = new org.apache.commons.math3.geometry.euclidean.threed.PlaneTest();
               object.testContains();
        }
    }

    @Test(timeout=120000)
    public void testSimilar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PlaneTest object = new org.apache.commons.math3.geometry.euclidean.threed.PlaneTest();
               object.testSimilar();
        }
    }

    @Test(timeout=120000)
    public void testIntersection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PlaneTest object = new org.apache.commons.math3.geometry.euclidean.threed.PlaneTest();
               object.testIntersection();
        }
    }

    @Test(timeout=120000)
    public void testTranslate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PlaneTest object = new org.apache.commons.math3.geometry.euclidean.threed.PlaneTest();
               object.testTranslate();
        }
    }

    @Test(timeout=120000)
    public void testIntersection2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PlaneTest object = new org.apache.commons.math3.geometry.euclidean.threed.PlaneTest();
               object.testIntersection2();
        }
    }

    @Test(timeout=120000)
    public void testPoint() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PlaneTest object = new org.apache.commons.math3.geometry.euclidean.threed.PlaneTest();
               object.testPoint();
        }
    }

    @Test(timeout=120000)
    public void testThreePoints() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PlaneTest object = new org.apache.commons.math3.geometry.euclidean.threed.PlaneTest();
               object.testThreePoints();
        }
    }

    @Test(timeout=120000)
    public void testRotate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PlaneTest object = new org.apache.commons.math3.geometry.euclidean.threed.PlaneTest();
               object.testRotate();
        }
    }

    @Test(timeout=120000)
    public void testIntersection3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PlaneTest object = new org.apache.commons.math3.geometry.euclidean.threed.PlaneTest();
               object.testIntersection3();
        }
    }

}