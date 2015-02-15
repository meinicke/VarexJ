package cmu.defect4j.lang3.reflect;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class TypeUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testIsAssignable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.TypeUtilsTest object = new org.apache.commons.lang3.reflect.TypeUtilsTest();
               object.testIsAssignable();
        }
    }

    @Test(timeout=10000)
    public void testIsInstance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.TypeUtilsTest object = new org.apache.commons.lang3.reflect.TypeUtilsTest();
               object.testIsInstance();
        }
    }

    @Test(timeout=10000)
    public void testGetTypeArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.TypeUtilsTest object = new org.apache.commons.lang3.reflect.TypeUtilsTest();
               object.testGetTypeArguments();
        }
    }

    @Test(timeout=10000)
    public void testTypesSatisfyVariables() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.TypeUtilsTest object = new org.apache.commons.lang3.reflect.TypeUtilsTest();
               object.testTypesSatisfyVariables();
        }
    }

    @Test(timeout=10000)
    public void testDetermineTypeVariableAssignments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.TypeUtilsTest object = new org.apache.commons.lang3.reflect.TypeUtilsTest();
               object.testDetermineTypeVariableAssignments();
        }
    }

    @Test(timeout=10000)
    public void testGetRawType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.TypeUtilsTest object = new org.apache.commons.lang3.reflect.TypeUtilsTest();
               object.testGetRawType();
        }
    }

    @Test(timeout=10000)
    public void testIsArrayTypeClasses() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.TypeUtilsTest object = new org.apache.commons.lang3.reflect.TypeUtilsTest();
               object.testIsArrayTypeClasses();
        }
    }

    @Test(timeout=10000)
    public void testIsArrayGenericTypes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.TypeUtilsTest object = new org.apache.commons.lang3.reflect.TypeUtilsTest();
               object.testIsArrayGenericTypes();
        }
    }

    @Test(timeout=10000)
    public void testGetPrimitiveArrayComponentType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.TypeUtilsTest object = new org.apache.commons.lang3.reflect.TypeUtilsTest();
               object.testGetPrimitiveArrayComponentType();
        }
    }

    @Test(timeout=10000)
    public void testGetArrayComponentType() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.TypeUtilsTest object = new org.apache.commons.lang3.reflect.TypeUtilsTest();
               object.testGetArrayComponentType();
        }
    }

    @Test(timeout=10000)
    public void testLang820() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.TypeUtilsTest object = new org.apache.commons.lang3.reflect.TypeUtilsTest();
               object.testLang820();
        }
    }

}