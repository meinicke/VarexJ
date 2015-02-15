package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SystemUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SystemUtilsTest object = new org.apache.commons.lang3.SystemUtilsTest();
               object.testConstructor();
        }
    }

    @Test(timeout=10000)
    public void testGetJavaHome() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SystemUtilsTest object = new org.apache.commons.lang3.SystemUtilsTest();
               object.testGetJavaHome();
        }
    }

    @Test(timeout=10000)
    public void testGetJavaIoTmpDir() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SystemUtilsTest object = new org.apache.commons.lang3.SystemUtilsTest();
               object.testGetJavaIoTmpDir();
        }
    }

    @Test(timeout=10000)
    public void testGetUserDir() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SystemUtilsTest object = new org.apache.commons.lang3.SystemUtilsTest();
               object.testGetUserDir();
        }
    }

    @Test(timeout=10000)
    public void testGetUserHome() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SystemUtilsTest object = new org.apache.commons.lang3.SystemUtilsTest();
               object.testGetUserHome();
        }
    }

    @Test(timeout=10000)
    public void testIS_JAVA() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SystemUtilsTest object = new org.apache.commons.lang3.SystemUtilsTest();
               object.testIS_JAVA();
        }
    }

    @Test(timeout=10000)
    public void testIS_OS() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SystemUtilsTest object = new org.apache.commons.lang3.SystemUtilsTest();
               object.testIS_OS();
        }
    }

    @Test(timeout=10000)
    public void testJavaVersionMatches() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SystemUtilsTest object = new org.apache.commons.lang3.SystemUtilsTest();
               object.testJavaVersionMatches();
        }
    }

    @Test(timeout=10000)
    public void testOSMatchesName() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SystemUtilsTest object = new org.apache.commons.lang3.SystemUtilsTest();
               object.testOSMatchesName();
        }
    }

    @Test(timeout=10000)
    public void testOSMatchesNameAndVersion() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SystemUtilsTest object = new org.apache.commons.lang3.SystemUtilsTest();
               object.testOSMatchesNameAndVersion();
        }
    }

    @Test(timeout=10000)
    public void testJavaAwtHeadless() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SystemUtilsTest object = new org.apache.commons.lang3.SystemUtilsTest();
               object.testJavaAwtHeadless();
        }
    }

}