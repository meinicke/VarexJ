package cmu.defect4j.math3.ml.distance;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CanberraDistanceTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void test() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ml.distance.CanberraDistanceTest object = new org.apache.commons.math3.ml.distance.CanberraDistanceTest();
               object.test();
        }
    }

    @Test(timeout=120000)
    public void testZero2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ml.distance.CanberraDistanceTest object = new org.apache.commons.math3.ml.distance.CanberraDistanceTest();
               object.testZero2();
        }
    }

    @Test(timeout=120000)
    public void testZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ml.distance.CanberraDistanceTest object = new org.apache.commons.math3.ml.distance.CanberraDistanceTest();
               object.testZero();
        }
    }

}