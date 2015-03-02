package cmu.defect4j.math3.analysis.interpolation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FieldHermiteInterpolatorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest();
               object.testZero();
        }
    }

    @Test(timeout=120000)
    public void testQuadratic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest();
               object.testQuadratic();
        }
    }

    @Test(timeout=120000)
    public void testMixedDerivatives() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest();
               object.testMixedDerivatives();
        }
    }

    @Test(timeout=120000)
    public void testRandomPolynomialsValuesOnly() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest();
               object.testRandomPolynomialsValuesOnly();
        }
    }

    @Test(timeout=120000)
    public void testRandomPolynomialsFirstDerivative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest();
               object.testRandomPolynomialsFirstDerivative();
        }
    }

    @Test(timeout=120000)
    public void testSine() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest();
               object.testSine();
        }
    }

    @Test(timeout=120000)
    public void testSquareRoot() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest();
               object.testSquareRoot();
        }
    }

    @Test(timeout=120000)
    public void testWikipedia() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest();
               object.testWikipedia();
        }
    }

    @Test(timeout=120000)
    public void testOnePointParabola() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest();
               object.testOnePointParabola();
        }
    }

    @Test(timeout=120000)
    public void testEmptySampleValue() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NoDataException", config)) {
               org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest();
               object.testEmptySampleValue();
        }
    }

    @Test(timeout=120000)
    public void testEmptySampleDerivative() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NoDataException", config)) {
               org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest();
               object.testEmptySampleDerivative();
        }
    }

    @Test(timeout=120000)
    public void testDuplicatedAbscissa() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.FieldHermiteInterpolatorTest();
               object.testDuplicatedAbscissa();
        }
    }

}