package cmu.defect4j.math3.fitting;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class WeightedObservedPointsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testAdd1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.WeightedObservedPointsTest object = new org.apache.commons.math3.fitting.WeightedObservedPointsTest();
               object.testAdd1();
        }
    }

    @Test(timeout=120000)
    public void testAdd2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.WeightedObservedPointsTest object = new org.apache.commons.math3.fitting.WeightedObservedPointsTest();
               object.testAdd2();
        }
    }

    @Test(timeout=120000)
    public void testAdd3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.WeightedObservedPointsTest object = new org.apache.commons.math3.fitting.WeightedObservedPointsTest();
               object.testAdd3();
        }
    }

    @Test(timeout=120000)
    public void testClear() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.WeightedObservedPointsTest object = new org.apache.commons.math3.fitting.WeightedObservedPointsTest();
               object.testClear();
        }
    }

    @Test(timeout=120000)
    public void testToListCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.WeightedObservedPointsTest object = new org.apache.commons.math3.fitting.WeightedObservedPointsTest();
               object.testToListCopy();
        }
    }

}