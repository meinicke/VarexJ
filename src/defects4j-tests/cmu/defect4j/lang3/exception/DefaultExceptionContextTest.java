package cmu.defect4j.lang3.exception;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DefaultExceptionContextTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testFormattedExceptionMessageNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.DefaultExceptionContextTest object = new org.apache.commons.lang3.exception.DefaultExceptionContextTest();
               object.setUp();
               object.testFormattedExceptionMessageNull();
        }
    }

    @Test(timeout=120000)
    public void testAddContextValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.DefaultExceptionContextTest object = new org.apache.commons.lang3.exception.DefaultExceptionContextTest();
               object.setUp();
               object.testAddContextValue();
        }
    }

    @Test(timeout=120000)
    public void testSetContextValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.DefaultExceptionContextTest object = new org.apache.commons.lang3.exception.DefaultExceptionContextTest();
               object.setUp();
               object.testSetContextValue();
        }
    }

    @Test(timeout=120000)
    public void testGetFirstContextValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.DefaultExceptionContextTest object = new org.apache.commons.lang3.exception.DefaultExceptionContextTest();
               object.setUp();
               object.testGetFirstContextValue();
        }
    }

    @Test(timeout=120000)
    public void testGetContextValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.DefaultExceptionContextTest object = new org.apache.commons.lang3.exception.DefaultExceptionContextTest();
               object.setUp();
               object.testGetContextValues();
        }
    }

    @Test(timeout=120000)
    public void testGetContextLabels() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.DefaultExceptionContextTest object = new org.apache.commons.lang3.exception.DefaultExceptionContextTest();
               object.setUp();
               object.testGetContextLabels();
        }
    }

    @Test(timeout=120000)
    public void testGetContextEntries() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.DefaultExceptionContextTest object = new org.apache.commons.lang3.exception.DefaultExceptionContextTest();
               object.setUp();
               object.testGetContextEntries();
        }
    }

    @Test(timeout=120000)
    public void testJavaSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.DefaultExceptionContextTest object = new org.apache.commons.lang3.exception.DefaultExceptionContextTest();
               object.setUp();
               object.testJavaSerialization();
        }
    }

}