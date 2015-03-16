package cmu.defect4j.math3.geometry.euclidean.threed;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FieldVector3DTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testWrongDimension() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testWrongDimension();
        }
    }

    @Test(timeout=120000)
    public void testNorm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testNorm();
        }
    }

    @Test(timeout=120000)
    public void testNormalize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testNormalize();
        }
    }

    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testAdd();
        }
    }

    @Test(timeout=120000)
    public void testSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testSubtract();
        }
    }

    @Test(timeout=120000)
    public void testNegate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testNegate();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testHash() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testHash();
        }
    }

    @Test(timeout=120000)
    public void testInfinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testInfinite();
        }
    }

    @Test(timeout=120000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testConstructors();
        }
    }

    @Test(timeout=120000)
    public void testNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testNaN();
        }
    }

    @Test(timeout=120000)
    public void testCoordinates() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testCoordinates();
        }
    }

    @Test(timeout=120000)
    public void testNorm1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testNorm1();
        }
    }

    @Test(timeout=120000)
    public void testNormSq() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testNormSq();
        }
    }

    @Test(timeout=120000)
    public void testNormInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testNormInf();
        }
    }

    @Test(timeout=120000)
    public void testDistance1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testDistance1();
        }
    }

    @Test(timeout=120000)
    public void testDistance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testDistance();
        }
    }

    @Test(timeout=120000)
    public void testDistanceSq() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testDistanceSq();
        }
    }

    @Test(timeout=120000)
    public void testDistanceInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testDistanceInf();
        }
    }

    @Test(timeout=120000)
    public void testScalarProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testScalarProduct();
        }
    }

    @Test(timeout=120000)
    public void testVectorialProducts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testVectorialProducts();
        }
    }

    @Test(timeout=120000)
    public void testCrossProductCancellation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testCrossProductCancellation();
        }
    }

    @Test(timeout=120000)
    public void testAngular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testAngular();
        }
    }

    @Test(timeout=120000)
    public void testAngularSeparation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testAngularSeparation();
        }
    }

    @Test(timeout=120000)
    public void testOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testOrthogonal();
        }
    }

    @Test(timeout=120000)
    public void testAngle() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testAngle();
        }
    }

    @Test(timeout=120000)
    public void testAccurateDotProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testAccurateDotProduct();
        }
    }

    @Test(timeout=120000)
    public void testDotProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testDotProduct();
        }
    }

    @Test(timeout=120000)
    public void testAccurateCrossProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testAccurateCrossProduct();
        }
    }

    @Test(timeout=120000)
    public void testCrossProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest object = new org.apache.commons.math3.geometry.euclidean.threed.FieldVector3DTest();
               object.testCrossProduct();
        }
    }

}