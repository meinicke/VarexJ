package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MultidimensionalCounterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testAccessors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MultidimensionalCounterTest object = new org.apache.commons.math3.util.MultidimensionalCounterTest();
               object.testAccessors();
        }
    }

    @Test(timeout=120000)
    public void testPreconditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MultidimensionalCounterTest object = new org.apache.commons.math3.util.MultidimensionalCounterTest();
               object.testPreconditions();
        }
    }

    @Test(timeout=120000)
    public void testIteratorPreconditions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MultidimensionalCounterTest object = new org.apache.commons.math3.util.MultidimensionalCounterTest();
               object.testIteratorPreconditions();
        }
    }

    @Test(timeout=120000)
    public void testMulti2UniConversion() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MultidimensionalCounterTest object = new org.apache.commons.math3.util.MultidimensionalCounterTest();
               object.testMulti2UniConversion();
        }
    }

    @Test(timeout=120000)
    public void testIterationConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.MultidimensionalCounterTest object = new org.apache.commons.math3.util.MultidimensionalCounterTest();
               object.testIterationConsistency();
        }
    }

}