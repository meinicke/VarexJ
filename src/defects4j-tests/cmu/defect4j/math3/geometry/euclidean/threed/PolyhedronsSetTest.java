package cmu.defect4j.math3.geometry.euclidean.threed;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PolyhedronsSetTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testBox() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest object = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest();
               object.testBox();
        }
    }

    @Test(timeout=120000)
    public void testTetrahedron() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest object = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest();
               object.testTetrahedron();
        }
    }

    @Test(timeout=120000)
    public void testIsometry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest object = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest();
               object.testIsometry();
        }
    }

    @Test(timeout=120000)
    public void testBuildBox() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest object = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest();
               object.testBuildBox();
        }
    }

    @Test(timeout=120000)
    public void testCross() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest object = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest();
               object.testCross();
        }
    }

    @Test(timeout=120000)
    public void testIssue780() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest object = new org.apache.commons.math3.geometry.euclidean.threed.PolyhedronsSetTest();
               object.testIssue780();
        }
    }

}