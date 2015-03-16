package cmu.defect4j.math3.random;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SobolSequenceGeneratorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void test3DReference() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.SobolSequenceGeneratorTest object = new org.apache.commons.math3.random.SobolSequenceGeneratorTest();
               object.setUp();
               object.test3DReference();
        }
    }

    @Test(timeout=120000)
    public void testSkip() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.SobolSequenceGeneratorTest object = new org.apache.commons.math3.random.SobolSequenceGeneratorTest();
               object.setUp();
               object.testSkip();
        }
    }

    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.SobolSequenceGeneratorTest object = new org.apache.commons.math3.random.SobolSequenceGeneratorTest();
               object.setUp();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void testConstructor2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.random.SobolSequenceGeneratorTest object = new org.apache.commons.math3.random.SobolSequenceGeneratorTest();
               object.setUp();
               object.testConstructor2();
        }
    }

}