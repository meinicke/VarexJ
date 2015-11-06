package cmu.defect4j.math3.random;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EmpiricalDistributionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testDensityIntegrals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testDensityIntegrals();
        }
    }

    @Test(timeout=1000000)
    public void testLoad() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testLoad();
        }
    }

    @Test(timeout=1000000)
    public void testDoubleLoad() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testDoubleLoad();
        }
    }

    @Test(timeout=1000000)
    public void testNext() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testNext();
        }
    }

    @Test(timeout=1000000)
    public void testNexFail() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testNexFail();
        }
    }

    @Test(timeout=1000000)
    public void testGridTooFine() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testGridTooFine();
        }
    }

    @Test(timeout=1000000)
    public void testLoadNullDoubleArray() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testLoadNullDoubleArray();
        }
    }

    @Test(timeout=1000000)
    public void testLoadNullURL() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testLoadNullURL();
        }
    }

    @Test(timeout=1000000)
    public void testLoadNullFile() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testLoadNullFile();
        }
    }

    @Test(timeout=1000000)
    public void testGetBinUpperBounds() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testGetBinUpperBounds();
        }
    }

    @Test(timeout=1000000)
    public void testGeneratorConfig() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testGeneratorConfig();
        }
    }

    @Test(timeout=1000000)
    public void testReSeed() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testReSeed();
        }
    }

    @Test(timeout=1000000)
    public void testGridTooFat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testGridTooFat();
        }
    }

    @Test(timeout=1000000)
    public void testBinIndexOverflow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testBinIndexOverflow();
        }
    }

    @Test(timeout=1000000)
    public void testKernelOverrideConstant() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testKernelOverrideConstant();
        }
    }

    @Test(timeout=1000000)
    public void testKernelOverrideUniform() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testKernelOverrideUniform();
        }
    }

    @Test(timeout=1000000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testSerialization();
        }
    }

    @Test(timeout=1000000)
    public void testDensities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testDensities();
        }
    }

    @Test(timeout=1000000)
    public void testCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testInverseCumulativeProbabilities() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testInverseCumulativeProbabilities();
        }
    }

    @Test(timeout=1000000)
    public void testSampling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testSampling();
        }
    }

    @Test(timeout=1000000)
    public void testConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testConsistency();
        }
    }

    @Test(timeout=1000000)
    public void testIsSupportLowerBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testIsSupportLowerBoundInclusive();
        }
    }

    @Test(timeout=1000000)
    public void testIsSupportUpperBoundInclusive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testIsSupportUpperBoundInclusive();
        }
    }

    @Test(timeout=1000000)
    public void testDistributionClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testDistributionClone();
        }
    }

    @Test(timeout=1000000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.EmpiricalDistributionTest object = new org.apache.commons.math3.random.EmpiricalDistributionTest();
               object.setUp();
               object.testIllegalArguments();
        }
    }

}