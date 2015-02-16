package cmu.defect4j.lang3.reflect;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FieldUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void testGetField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetField();
        }
    }

    @Test(timeout=120000)
    public void testGetFieldIllegalArgumentException1() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetFieldIllegalArgumentException1();
        }
    }

    @Test(timeout=120000)
    public void testGetFieldIllegalArgumentException2() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetFieldIllegalArgumentException2();
        }
    }

    @Test(timeout=120000)
    public void testGetFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testGetFieldForceAccessIllegalArgumentException1() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetFieldForceAccessIllegalArgumentException1();
        }
    }

    @Test(timeout=120000)
    public void testGetFieldForceAccessIllegalArgumentException2() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetFieldForceAccessIllegalArgumentException2();
        }
    }

    @Test(timeout=120000)
    public void testGetAllFields() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetAllFields();
        }
    }

    @Test(timeout=120000)
    public void testGetAllFieldsList() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetAllFieldsList();
        }
    }

    @Test(timeout=120000)
    public void testGetDeclaredField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetDeclaredField();
        }
    }

    @Test(timeout=120000)
    public void testGetDeclaredFieldAccessIllegalArgumentException1() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetDeclaredFieldAccessIllegalArgumentException1();
        }
    }

    @Test(timeout=120000)
    public void testGetDeclaredFieldAccessIllegalArgumentException2() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetDeclaredFieldAccessIllegalArgumentException2();
        }
    }

    @Test(timeout=120000)
    public void testGetDeclaredFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetDeclaredFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testGetDeclaredFieldForceAccessIllegalArgumentException1() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetDeclaredFieldForceAccessIllegalArgumentException1();
        }
    }

    @Test(timeout=120000)
    public void testGetDeclaredFieldForceAccessIllegalArgumentException2() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testGetDeclaredFieldForceAccessIllegalArgumentException2();
        }
    }

    @Test(timeout=120000)
    public void testReadStaticField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadStaticField();
        }
    }

    @Test(timeout=120000)
    public void testReadStaticFieldIllegalArgumentException1() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadStaticFieldIllegalArgumentException1();
        }
    }

    @Test(timeout=120000)
    public void testReadStaticFieldIllegalArgumentException2() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadStaticFieldIllegalArgumentException2();
        }
    }

    @Test(timeout=120000)
    public void testReadStaticFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadStaticFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testReadStaticFieldForceAccessIllegalArgumentException1() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadStaticFieldForceAccessIllegalArgumentException1();
        }
    }

    @Test(timeout=120000)
    public void testReadStaticFieldForceAccessIllegalArgumentException2() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadStaticFieldForceAccessIllegalArgumentException2();
        }
    }

    @Test(timeout=120000)
    public void testReadNamedStaticField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadNamedStaticField();
        }
    }

    @Test(timeout=120000)
    public void testReadNamedStaticFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadNamedStaticFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testReadDeclaredNamedStaticField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadDeclaredNamedStaticField();
        }
    }

    @Test(timeout=120000)
    public void testReadDeclaredNamedStaticFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadDeclaredNamedStaticFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testReadField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadField();
        }
    }

    @Test(timeout=120000)
    public void testReadFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testReadNamedField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadNamedField();
        }
    }

    @Test(timeout=120000)
    public void testReadNamedFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadNamedFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testReadDeclaredNamedField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadDeclaredNamedField();
        }
    }

    @Test(timeout=120000)
    public void testReadDeclaredNamedFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testReadDeclaredNamedFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testWriteStaticField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testWriteStaticField();
        }
    }

    @Test(timeout=120000)
    public void testWriteStaticFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testWriteStaticFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testWriteNamedStaticField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testWriteNamedStaticField();
        }
    }

    @Test(timeout=120000)
    public void testWriteNamedStaticFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testWriteNamedStaticFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testWriteDeclaredNamedStaticField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testWriteDeclaredNamedStaticField();
        }
    }

    @Test(timeout=120000)
    public void testWriteDeclaredNamedStaticFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testWriteDeclaredNamedStaticFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testWriteField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testWriteField();
        }
    }

    @Test(timeout=120000)
    public void testWriteFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testWriteFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testWriteNamedField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testWriteNamedField();
        }
    }

    @Test(timeout=120000)
    public void testWriteNamedFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testWriteNamedFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testWriteDeclaredNamedField() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testWriteDeclaredNamedField();
        }
    }

    @Test(timeout=120000)
    public void testWriteDeclaredNamedFieldForceAccess() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testWriteDeclaredNamedFieldForceAccess();
        }
    }

    @Test(timeout=120000)
    public void testAmbig() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.reflect.FieldUtilsTest object = new org.apache.commons.lang3.reflect.FieldUtilsTest();
               object.setUp();
               object.testAmbig();
        }
    }

}