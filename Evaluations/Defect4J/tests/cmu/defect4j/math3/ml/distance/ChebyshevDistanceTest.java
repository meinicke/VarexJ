package cmu.defect4j.math3.ml.distance;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ChebyshevDistanceTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void test() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ml.distance.ChebyshevDistanceTest object = new org.apache.commons.math3.ml.distance.ChebyshevDistanceTest();
               object.test();
        }
    }

    @Test(timeout=1000000)
    public void testZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ml.distance.ChebyshevDistanceTest object = new org.apache.commons.math3.ml.distance.ChebyshevDistanceTest();
               object.testZero();
        }
    }

}