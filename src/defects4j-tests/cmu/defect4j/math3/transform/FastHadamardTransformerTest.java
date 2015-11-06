package cmu.defect4j.math3.transform;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FastHadamardTransformerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void test8Points() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastHadamardTransformerTest object = new org.apache.commons.math3.transform.FastHadamardTransformerTest();
               object.test8Points();
        }
    }

    @Test(timeout=1000000)
    public void test4Points() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastHadamardTransformerTest object = new org.apache.commons.math3.transform.FastHadamardTransformerTest();
               object.test4Points();
        }
    }

    @Test(timeout=1000000)
    public void testNoIntInverse() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastHadamardTransformerTest object = new org.apache.commons.math3.transform.FastHadamardTransformerTest();
               object.testNoIntInverse();
        }
    }

    @Test(timeout=1000000)
    public void test3Points() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.transform.FastHadamardTransformerTest object = new org.apache.commons.math3.transform.FastHadamardTransformerTest();
               object.test3Points();
        }
    }

}