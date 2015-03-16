package cmu.defect4j.math3.stat;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FrequencyTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testCounts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testCounts();
        }
    }

    @Test(timeout=120000)
    public void testPcts() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testPcts();
        }
    }

    @Test(timeout=120000)
    public void testEmptyTable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testEmptyTable();
        }
    }

    @Test(timeout=120000)
    public void testNonComparableCumPct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testNonComparableCumPct();
        }
    }

    @Test(timeout=120000)
    public void testNonComparablePct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testNonComparablePct();
        }
    }

    @Test(timeout=120000)
    public void testIntegerValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testIntegerValues();
        }
    }

    @Test(timeout=120000)
    public void testGetUniqueCount() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testGetUniqueCount();
        }
    }

    @Test(timeout=120000)
    public void testIncrement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testIncrement();
        }
    }

    @Test(timeout=120000)
    public void testMerge() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testMerge();
        }
    }

    @Test(timeout=120000)
    public void testMergeCollection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testMergeCollection();
        }
    }

    @Test(timeout=120000)
    public void testMode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testMode();
        }
    }

    @Test(timeout=120000)
    public void testModeDoubleNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testModeDoubleNan();
        }
    }

    @Test(timeout=120000)
    public void testModeFloatNan() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testModeFloatNan();
        }
    }

    @Test(timeout=120000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testAdd();
        }
    }

    @Test(timeout=120000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.FrequencyTest object = new org.apache.commons.math3.stat.FrequencyTest();
               object.setUp();
               object.testSerial();
        }
    }

}