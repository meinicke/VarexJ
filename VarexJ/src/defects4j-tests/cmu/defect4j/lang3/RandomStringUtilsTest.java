package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class RandomStringUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RandomStringUtilsTest object = new org.apache.commons.lang3.RandomStringUtilsTest();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void testExceptions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RandomStringUtilsTest object = new org.apache.commons.lang3.RandomStringUtilsTest();
               object.testExceptions();
        }
    }

    @Test(timeout=120000)
    public void testRandomAlphaNumeric() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RandomStringUtilsTest object = new org.apache.commons.lang3.RandomStringUtilsTest();
               object.testRandomAlphaNumeric();
        }
    }

    @Test(timeout=120000)
    public void testRandomNumeric() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RandomStringUtilsTest object = new org.apache.commons.lang3.RandomStringUtilsTest();
               object.testRandomNumeric();
        }
    }

    @Test(timeout=120000)
    public void testRandomAlphabetic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RandomStringUtilsTest object = new org.apache.commons.lang3.RandomStringUtilsTest();
               object.testRandomAlphabetic();
        }
    }

    @Test(timeout=120000)
    public void testRandomAscii() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RandomStringUtilsTest object = new org.apache.commons.lang3.RandomStringUtilsTest();
               object.testRandomAscii();
        }
    }

    @Test(timeout=120000)
    public void testRandomStringUtilsHomog() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RandomStringUtilsTest object = new org.apache.commons.lang3.RandomStringUtilsTest();
               object.testRandomStringUtilsHomog();
        }
    }

    @Test(timeout=120000)
    public void testLang100() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RandomStringUtilsTest object = new org.apache.commons.lang3.RandomStringUtilsTest();
               object.testLang100();
        }
    }

    @Test(timeout=120000)
    public void testRandomStringUtils() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RandomStringUtilsTest object = new org.apache.commons.lang3.RandomStringUtilsTest();
               object.testRandomStringUtils();
        }
    }

    @Test(timeout=120000)
    public void testLANG805() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RandomStringUtilsTest object = new org.apache.commons.lang3.RandomStringUtilsTest();
               object.testLANG805();
        }
    }

    @Test(timeout=120000)
    public void testLANG807() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RandomStringUtilsTest object = new org.apache.commons.lang3.RandomStringUtilsTest();
               object.testLANG807();
        }
    }

}