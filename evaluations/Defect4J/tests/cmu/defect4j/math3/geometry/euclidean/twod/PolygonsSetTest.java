package cmu.defect4j.math3.geometry.euclidean.twod;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PolygonsSetTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testSimplyConnected() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testSimplyConnected();
        }
    }

    @Test(timeout=1000000)
    public void testStair() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testStair();
        }
    }

    @Test(timeout=1000000)
    public void testHole() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testHole();
        }
    }

    @Test(timeout=1000000)
    public void testDisjointPolygons() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testDisjointPolygons();
        }
    }

    @Test(timeout=1000000)
    public void testOppositeHyperplanes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testOppositeHyperplanes();
        }
    }

    @Test(timeout=1000000)
    public void testSingularPoint() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testSingularPoint();
        }
    }

    @Test(timeout=1000000)
    public void testLineIntersection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testLineIntersection();
        }
    }

    @Test(timeout=1000000)
    public void testUnlimitedSubHyperplane() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testUnlimitedSubHyperplane();
        }
    }

    @Test(timeout=1000000)
    public void testUnion() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testUnion();
        }
    }

    @Test(timeout=1000000)
    public void testXor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testXor();
        }
    }

    @Test(timeout=1000000)
    public void testDifference() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testDifference();
        }
    }

    @Test(timeout=1000000)
    public void testEmptyDifference() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testEmptyDifference();
        }
    }

    @Test(timeout=1000000)
    public void testChoppedHexagon() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testChoppedHexagon();
        }
    }

    @Test(timeout=1000000)
    public void testConcentric() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testConcentric();
        }
    }

    @Test(timeout=1000000)
    public void testBug20040520() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testBug20040520();
        }
    }

    @Test(timeout=1000000)
    public void testBug20041003() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testBug20041003();
        }
    }

    @Test(timeout=1000000)
    public void testSqueezedHexa() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testSqueezedHexa();
        }
    }

    @Test(timeout=1000000)
    public void testIssue880Simplified() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testIssue880Simplified();
        }
    }

    @Test(timeout=1000000)
    public void testIssue880Complete() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testIssue880Complete();
        }
    }

    @Test(timeout=1000000)
    public void testIntersection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest object = new org.apache.commons.math3.geometry.euclidean.twod.PolygonsSetTest();
               object.testIntersection();
        }
    }

}