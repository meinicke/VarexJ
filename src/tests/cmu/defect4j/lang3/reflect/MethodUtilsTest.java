package cmu.defect4j.lang3.reflect;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MethodUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testConstructor();
        }
    }

    @Test(timeout=10000)
    public void testGetAccessibleInterfaceMethodFromDescription() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testGetAccessibleInterfaceMethodFromDescription();
        }
    }

    @Test(timeout=10000)
    public void testGetAccessiblePublicMethodFromDescription() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testGetAccessiblePublicMethodFromDescription();
        }
    }

    @Test(timeout=10000)
    public void testGetAccessibleMethodInaccessible() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testGetAccessibleMethodInaccessible();
        }
    }

    @Test(timeout=10000)
    public void testInvokeMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testInvokeMethod();
        }
    }

    @Test(timeout=10000)
    public void testInvokeExactMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testInvokeExactMethod();
        }
    }

    @Test(timeout=10000)
    public void testInvokeStaticMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testInvokeStaticMethod();
        }
    }

    @Test(timeout=10000)
    public void testInvokeExactStaticMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testInvokeExactStaticMethod();
        }
    }

    @Test(timeout=10000)
    public void testGetAccessibleInterfaceMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testGetAccessibleInterfaceMethod();
        }
    }

    @Test(timeout=10000)
    public void testGetAccessibleMethodPrivateInterface() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testGetAccessibleMethodPrivateInterface();
        }
    }

    @Test(timeout=10000)
    public void testGetAccessiblePublicMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testGetAccessiblePublicMethod();
        }
    }

    @Test(timeout=10000)
    public void testGetMatchingAccessibleMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testGetMatchingAccessibleMethod();
        }
    }

    @Test(timeout=10000)
    public void testNullArgument() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.reflect.MethodUtilsTest object = new org.apache.commons.lang3.reflect.MethodUtilsTest();
               object.setUp();
               object.testNullArgument();
        }
    }

}