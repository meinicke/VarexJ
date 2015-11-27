package cmu.defect4j.math3.stat.regression;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class GLSMultipleLinearRegressionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void cannotAddNullYSampleData() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.cannotAddNullYSampleData();
        }
    }

    @Test(timeout=1000000)
    public void cannotAddSampleDataWithSizeMismatch() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.cannotAddSampleDataWithSizeMismatch();
        }
    }

    @Test(timeout=1000000)
    public void cannotAddXSampleData() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.cannotAddXSampleData();
        }
    }

    @Test(timeout=1000000)
    public void notEnoughData() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.notEnoughData();
        }
    }

    @Test(timeout=1000000)
    public void cannotAddNullCovarianceData() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.cannotAddNullCovarianceData();
        }
    }

    @Test(timeout=1000000)
    public void cannotAddCovarianceDataWithSampleSizeMismatch() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.cannotAddCovarianceDataWithSampleSizeMismatch();
        }
    }

    @Test(timeout=1000000)
    public void cannotAddCovarianceDataThatIsNotSquare() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.cannotAddCovarianceDataThatIsNotSquare();
        }
    }

    @Test(timeout=1000000)
    public void testYVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.testYVariance();
        }
    }

    @Test(timeout=1000000)
    public void testNewSample2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.testNewSample2();
        }
    }

    @Test(timeout=1000000)
    public void testGLSOLSConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.testGLSOLSConsistency();
        }
    }

    @Test(timeout=1000000)
    public void testGLSEfficiency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.testGLSEfficiency();
        }
    }

    @Test(timeout=1000000)
    public void canEstimateResiduals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.canEstimateResiduals();
        }
    }

    @Test(timeout=1000000)
    public void canEstimateRegressionParameters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.canEstimateRegressionParameters();
        }
    }

    @Test(timeout=1000000)
    public void canEstimateRegressionParametersVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.canEstimateRegressionParametersVariance();
        }
    }

    @Test(timeout=1000000)
    public void canEstimateRegressandVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.canEstimateRegressandVariance();
        }
    }

    @Test(timeout=1000000)
    public void testNewSample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.testNewSample();
        }
    }

    @Test(timeout=1000000)
    public void testNewSampleNullData() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.testNewSampleNullData();
        }
    }

    @Test(timeout=1000000)
    public void testNewSampleInvalidData() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.testNewSampleInvalidData();
        }
    }

    @Test(timeout=1000000)
    public void testNewSampleInsufficientData() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.testNewSampleInsufficientData();
        }
    }

    @Test(timeout=1000000)
    public void testXSampleDataNull() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.testXSampleDataNull();
        }
    }

    @Test(timeout=1000000)
    public void testYSampleDataNull() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.GLSMultipleLinearRegressionTest();
               object.setUp();
               object.testYSampleDataNull();
        }
    }

}