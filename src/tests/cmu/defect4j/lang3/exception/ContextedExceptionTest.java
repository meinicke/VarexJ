package cmu.defect4j.lang3.exception;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ContextedExceptionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testContextedExceptionString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testContextedExceptionString();
        }
    }

    @Test(timeout=120000)
    public void testContextedExceptionThrowable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testContextedExceptionThrowable();
        }
    }

    @Test(timeout=120000)
    public void testContextedExceptionStringThrowable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testContextedExceptionStringThrowable();
        }
    }

    @Test(timeout=120000)
    public void testContextedExceptionStringThrowableContext() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testContextedExceptionStringThrowableContext();
        }
    }

    @Test(timeout=120000)
    public void testNullExceptionPassing() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testNullExceptionPassing();
        }
    }

    @Test(timeout=120000)
    public void testContextedException() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testContextedException();
        }
    }

    @Test(timeout=120000)
    public void testRawMessage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testRawMessage();
        }
    }

    @Test(timeout=120000)
    public void testAddContextValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testAddContextValue();
        }
    }

    @Test(timeout=120000)
    public void testSetContextValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testSetContextValue();
        }
    }

    @Test(timeout=120000)
    public void testGetFirstContextValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testGetFirstContextValue();
        }
    }

    @Test(timeout=120000)
    public void testGetContextValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testGetContextValues();
        }
    }

    @Test(timeout=120000)
    public void testGetContextLabels() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testGetContextLabels();
        }
    }

    @Test(timeout=120000)
    public void testGetContextEntries() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testGetContextEntries();
        }
    }

    @Test(timeout=120000)
    public void testJavaSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ContextedExceptionTest object = new org.apache.commons.lang3.exception.ContextedExceptionTest();
               object.testJavaSerialization();
        }
    }

}