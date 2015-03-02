package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DefaultTransformerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testTransformDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.DefaultTransformerTest object = new org.apache.commons.math3.util.DefaultTransformerTest();
               object.testTransformDouble();
        }
    }

    @Test(timeout=120000)
    public void testTransformNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.DefaultTransformerTest object = new org.apache.commons.math3.util.DefaultTransformerTest();
               object.testTransformNull();
        }
    }

    @Test(timeout=120000)
    public void testTransformInteger() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.DefaultTransformerTest object = new org.apache.commons.math3.util.DefaultTransformerTest();
               object.testTransformInteger();
        }
    }

    @Test(timeout=120000)
    public void testTransformBigDecimal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.DefaultTransformerTest object = new org.apache.commons.math3.util.DefaultTransformerTest();
               object.testTransformBigDecimal();
        }
    }

    @Test(timeout=120000)
    public void testTransformString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.DefaultTransformerTest object = new org.apache.commons.math3.util.DefaultTransformerTest();
               object.testTransformString();
        }
    }

    @Test(timeout=120000)
    public void testTransformObject() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.util.DefaultTransformerTest object = new org.apache.commons.math3.util.DefaultTransformerTest();
               object.testTransformObject();
        }
    }

    @Test(timeout=120000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.DefaultTransformerTest object = new org.apache.commons.math3.util.DefaultTransformerTest();
               object.testSerial();
        }
    }

}