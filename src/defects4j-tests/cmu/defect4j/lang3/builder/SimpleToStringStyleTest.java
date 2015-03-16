package cmu.defect4j.lang3.builder;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SimpleToStringStyleTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testAppendSuper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.SimpleToStringStyleTest object = new org.apache.commons.lang3.builder.SimpleToStringStyleTest();
               object.setUp();
               object.testAppendSuper();
        }
    }

    @Test(timeout=120000)
    public void testObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.SimpleToStringStyleTest object = new org.apache.commons.lang3.builder.SimpleToStringStyleTest();
               object.setUp();
               object.testObject();
        }
    }

    @Test(timeout=120000)
    public void testLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.SimpleToStringStyleTest object = new org.apache.commons.lang3.builder.SimpleToStringStyleTest();
               object.setUp();
               object.testLong();
        }
    }

    @Test(timeout=120000)
    public void testObjectArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.SimpleToStringStyleTest object = new org.apache.commons.lang3.builder.SimpleToStringStyleTest();
               object.setUp();
               object.testObjectArray();
        }
    }

    @Test(timeout=120000)
    public void testLongArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.SimpleToStringStyleTest object = new org.apache.commons.lang3.builder.SimpleToStringStyleTest();
               object.setUp();
               object.testLongArray();
        }
    }

    @Test(timeout=120000)
    public void testBlank() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.SimpleToStringStyleTest object = new org.apache.commons.lang3.builder.SimpleToStringStyleTest();
               object.setUp();
               object.testBlank();
        }
    }

    @Test(timeout=120000)
    public void testPerson() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.SimpleToStringStyleTest object = new org.apache.commons.lang3.builder.SimpleToStringStyleTest();
               object.setUp();
               object.testPerson();
        }
    }

    @Test(timeout=120000)
    public void testLongArrayArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.SimpleToStringStyleTest object = new org.apache.commons.lang3.builder.SimpleToStringStyleTest();
               object.setUp();
               object.testLongArrayArray();
        }
    }

}