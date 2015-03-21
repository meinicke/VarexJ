package cmu.defect4j.math3.geometry.euclidean.twod;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LineTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testContains() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testContains();
        }
    }

    @Test(timeout=1000000)
    public void testIntersection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testIntersection();
        }
    }

    @Test(timeout=1000000)
    public void testOffset() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testOffset();
        }
    }

    @Test(timeout=1000000)
    public void testAbscissa() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testAbscissa();
        }
    }

    @Test(timeout=1000000)
    public void testPointAt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testPointAt();
        }
    }

    @Test(timeout=1000000)
    public void testOriginOffset() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testOriginOffset();
        }
    }

    @Test(timeout=1000000)
    public void testParallel() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testParallel();
        }
    }

    @Test(timeout=1000000)
    public void testTransform() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testTransform();
        }
    }

    @Test(timeout=1000000)
    public void testDistance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.LineTest object = new org.apache.commons.math3.geometry.euclidean.twod.LineTest();
               object.testDistance();
        }
    }

}