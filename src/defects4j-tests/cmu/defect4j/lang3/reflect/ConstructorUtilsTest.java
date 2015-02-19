package cmu.defect4j.lang3.reflect;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ConstructorUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.ConstructorUtilsTest object = new org.apache.commons.lang3.reflect.ConstructorUtilsTest();
               object.setUp();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void testInvokeConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.ConstructorUtilsTest object = new org.apache.commons.lang3.reflect.ConstructorUtilsTest();
               object.setUp();
               object.testInvokeConstructor();
        }
    }

    @Test(timeout=120000)
    public void testInvokeExactConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.ConstructorUtilsTest object = new org.apache.commons.lang3.reflect.ConstructorUtilsTest();
               object.setUp();
               object.testInvokeExactConstructor();
        }
    }

    @Test(timeout=120000)
    public void testGetAccessibleConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.ConstructorUtilsTest object = new org.apache.commons.lang3.reflect.ConstructorUtilsTest();
               object.setUp();
               object.testGetAccessibleConstructor();
        }
    }

    @Test(timeout=120000)
    public void testGetAccessibleConstructorFromDescription() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.ConstructorUtilsTest object = new org.apache.commons.lang3.reflect.ConstructorUtilsTest();
               object.setUp();
               object.testGetAccessibleConstructorFromDescription();
        }
    }

    @Test(timeout=120000)
    public void testGetMatchingAccessibleMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.ConstructorUtilsTest object = new org.apache.commons.lang3.reflect.ConstructorUtilsTest();
               object.setUp();
               object.testGetMatchingAccessibleMethod();
        }
    }

    @Test(timeout=120000)// FIXME
    public void testNullArgument() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.ConstructorUtilsTest object = new org.apache.commons.lang3.reflect.ConstructorUtilsTest();
               object.setUp();
               object.testNullArgument();
        }
    }

}