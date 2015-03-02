package cmu.defect4j.math3.stat.regression;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class OLSMultipleLinearRegressionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void cannotAddSampleDataWithSizeMismatch() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.cannotAddSampleDataWithSizeMismatch();
        }
    }

    @Test(timeout=120000)
    public void testYVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testYVariance();
        }
    }

    @Test(timeout=120000)
    public void testNewSample2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testNewSample2();
        }
    }

    @Test(timeout=120000)
    public void testHat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testHat();
        }
    }

    @Test(timeout=120000)
    public void testWampler1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testWampler1();
        }
    }

    @Test(timeout=120000)
    public void testWampler2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testWampler2();
        }
    }

    @Test(timeout=120000)
    public void testWampler3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testWampler3();
        }
    }

    @Test(timeout=120000)
    public void testWampler4() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testWampler4();
        }
    }

    @Test(timeout=120000)
    public void testPerfectFit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testPerfectFit();
        }
    }

    @Test(timeout=120000)
    public void testNewSampleDataYNull() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testNewSampleDataYNull();
        }
    }

    @Test(timeout=120000)
    public void testNewSampleDataXNull() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testNewSampleDataXNull();
        }
    }

    @Test(timeout=120000)
    public void testLongly() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testLongly();
        }
    }

    @Test(timeout=120000)
    public void testSwissFertility() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testSwissFertility();
        }
    }

    @Test(timeout=120000)
    public void canEstimateRegressionParameters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.canEstimateRegressionParameters();
        }
    }

    @Test(timeout=120000)
    public void canEstimateResiduals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.canEstimateResiduals();
        }
    }

    @Test(timeout=120000)
    public void canEstimateRegressionParametersVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.canEstimateRegressionParametersVariance();
        }
    }

    @Test(timeout=120000)
    public void canEstimateRegressandVariance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.canEstimateRegressandVariance();
        }
    }

    @Test(timeout=120000)
    public void testNewSample() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testNewSample();
        }
    }

    @Test(timeout=120000)
    public void testNewSampleNullData() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testNewSampleNullData();
        }
    }

    @Test(timeout=120000)
    public void testNewSampleInvalidData() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testNewSampleInvalidData();
        }
    }

    @Test(timeout=120000)
    public void testNewSampleInsufficientData() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testNewSampleInsufficientData();
        }
    }

    @Test(timeout=120000)
    public void testXSampleDataNull() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testXSampleDataNull();
        }
    }

    @Test(timeout=120000)
    public void testYSampleDataNull() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest object = new org.apache.commons.math3.stat.regression.OLSMultipleLinearRegressionTest();
               object.setUp();
               object.testYSampleDataNull();
        }
    }

}