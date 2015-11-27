package cmu.defect4j.math3.geometry.euclidean.threed;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class Vector3DTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testWrongDimension() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testWrongDimension();
        }
    }

    @Test(timeout=1000000)
    public void testNorm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testNorm();
        }
    }

    @Test(timeout=1000000)
    public void testNormalize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testNormalize();
        }
    }

    @Test(timeout=1000000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testToString();
        }
    }

    @Test(timeout=1000000)
    public void testHash() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testHash();
        }
    }

    @Test(timeout=1000000)
    public void testZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testZero();
        }
    }

    @Test(timeout=1000000)
    public void testSpace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testSpace();
        }
    }

    @Test(timeout=1000000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testEquals();
        }
    }

    @Test(timeout=1000000)
    public void testInfinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testInfinite();
        }
    }

    @Test(timeout=1000000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testConstructors();
        }
    }

    @Test(timeout=1000000)
    public void testNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testNaN();
        }
    }

    @Test(timeout=1000000)
    public void testCoordinates() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testCoordinates();
        }
    }

    @Test(timeout=1000000)
    public void testNorm1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testNorm1();
        }
    }

    @Test(timeout=1000000)
    public void testNormSq() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testNormSq();
        }
    }

    @Test(timeout=1000000)
    public void testNormInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testNormInf();
        }
    }

    @Test(timeout=1000000)
    public void testDistance1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testDistance1();
        }
    }

    @Test(timeout=1000000)
    public void testDistance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testDistance();
        }
    }

    @Test(timeout=1000000)
    public void testDistanceSq() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testDistanceSq();
        }
    }

    @Test(timeout=1000000)
    public void testDistanceInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testDistanceInf();
        }
    }

    @Test(timeout=1000000)
    public void testScalarProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testScalarProduct();
        }
    }

    @Test(timeout=1000000)
    public void testVectorialProducts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testVectorialProducts();
        }
    }

    @Test(timeout=1000000)
    public void testCrossProductCancellation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testCrossProductCancellation();
        }
    }

    @Test(timeout=1000000)
    public void testAngular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testAngular();
        }
    }

    @Test(timeout=1000000)
    public void testAngularSeparation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testAngularSeparation();
        }
    }

    @Test(timeout=1000000)
    public void testOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testOrthogonal();
        }
    }

    @Test(timeout=1000000)
    public void testAngle() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testAngle();
        }
    }

    @Test(timeout=1000000)
    public void testAccurateDotProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testAccurateDotProduct();
        }
    }

    @Test(timeout=1000000)
    public void testDotProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testDotProduct();
        }
    }

    @Test(timeout=1000000)
    public void testAccurateCrossProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testAccurateCrossProduct();
        }
    }

    @Test(timeout=1000000)
    public void testCrossProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testCrossProduct();
        }
    }

    @Test(timeout=1000000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testAdd();
        }
    }

    @Test(timeout=1000000)
    public void testSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testSubtract();
        }
    }

    @Test(timeout=1000000)
    public void testNegate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.Vector3DTest();
               object.testNegate();
        }
    }

}