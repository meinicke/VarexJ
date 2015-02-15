package cmu.defect4j.lang3.exception;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ExceptionUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testConstructor();
        }
    }

    @Test(timeout=10000)
    public void testGetCause_Throwable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetCause_Throwable();
        }
    }

    @Test(timeout=10000)
    public void testGetCause_ThrowableArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetCause_ThrowableArray();
        }
    }

    @Test(timeout=10000)
    public void testGetRootCause_Throwable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetRootCause_Throwable();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowableCount_Throwable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowableCount_Throwable();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowables_Throwable_null() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowables_Throwable_null();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowables_Throwable_withoutCause() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowables_Throwable_withoutCause();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowables_Throwable_nested() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowables_Throwable_nested();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowables_Throwable_withCause() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowables_Throwable_withCause();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowables_Throwable_jdkNoCause() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowables_Throwable_jdkNoCause();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowables_Throwable_recursiveCause() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowables_Throwable_recursiveCause();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowableList_Throwable_null() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowableList_Throwable_null();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowableList_Throwable_withoutCause() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowableList_Throwable_withoutCause();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowableList_Throwable_nested() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowableList_Throwable_nested();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowableList_Throwable_withCause() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowableList_Throwable_withCause();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowableList_Throwable_jdkNoCause() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowableList_Throwable_jdkNoCause();
        }
    }

    @Test(timeout=10000)
    public void testGetThrowableList_Throwable_recursiveCause() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetThrowableList_Throwable_recursiveCause();
        }
    }

    @Test(timeout=10000)
    public void testIndexOf_ThrowableClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testIndexOf_ThrowableClass();
        }
    }

    @Test(timeout=10000)
    public void testIndexOf_ThrowableClassInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testIndexOf_ThrowableClassInt();
        }
    }

    @Test(timeout=10000)
    public void testIndexOfType_ThrowableClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testIndexOfType_ThrowableClass();
        }
    }

    @Test(timeout=10000)
    public void testIndexOfType_ThrowableClassInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testIndexOfType_ThrowableClassInt();
        }
    }

    @Test(timeout=10000)
    public void testPrintRootCauseStackTrace_Throwable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testPrintRootCauseStackTrace_Throwable();
        }
    }

    @Test(timeout=10000)
    public void testPrintRootCauseStackTrace_ThrowableStream() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testPrintRootCauseStackTrace_ThrowableStream();
        }
    }

    @Test(timeout=10000)
    public void testPrintRootCauseStackTrace_ThrowableWriter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testPrintRootCauseStackTrace_ThrowableWriter();
        }
    }

    @Test(timeout=10000)
    public void testGetRootCauseStackTrace_Throwable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testGetRootCauseStackTrace_Throwable();
        }
    }

    @Test(timeout=10000)
    public void testRemoveCommonFrames_ListList() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.testRemoveCommonFrames_ListList();
        }
    }

    @Test(timeout=10000)
    public void test_getMessage_Throwable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.test_getMessage_Throwable();
        }
    }

    @Test(timeout=10000)
    public void test_getRootCauseMessage_Throwable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.exception.ExceptionUtilsTest object = new org.apache.commons.lang3.exception.ExceptionUtilsTest();
               object.setUp();
               object.test_getRootCauseMessage_Throwable();
        }
    }

}