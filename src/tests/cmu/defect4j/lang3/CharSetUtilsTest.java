package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CharSetUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testSqueeze_StringStringarray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetUtilsTest object = new org.apache.commons.lang3.CharSetUtilsTest();
               object.testSqueeze_StringStringarray();
        }
    }

    @Test(timeout=10000)
    public void testSqueeze_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetUtilsTest object = new org.apache.commons.lang3.CharSetUtilsTest();
               object.testSqueeze_StringString();
        }
    }

    @Test(timeout=10000)
    public void testContainsAny_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetUtilsTest object = new org.apache.commons.lang3.CharSetUtilsTest();
               object.testContainsAny_StringString();
        }
    }

    @Test(timeout=10000)
    public void testContainsAny_StringStringarray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetUtilsTest object = new org.apache.commons.lang3.CharSetUtilsTest();
               object.testContainsAny_StringStringarray();
        }
    }

    @Test(timeout=10000)
    public void testCount_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetUtilsTest object = new org.apache.commons.lang3.CharSetUtilsTest();
               object.testCount_StringString();
        }
    }

    @Test(timeout=10000)
    public void testCount_StringStringarray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetUtilsTest object = new org.apache.commons.lang3.CharSetUtilsTest();
               object.testCount_StringStringarray();
        }
    }

    @Test(timeout=10000)
    public void testKeep_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetUtilsTest object = new org.apache.commons.lang3.CharSetUtilsTest();
               object.testKeep_StringString();
        }
    }

    @Test(timeout=10000)
    public void testKeep_StringStringarray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetUtilsTest object = new org.apache.commons.lang3.CharSetUtilsTest();
               object.testKeep_StringStringarray();
        }
    }

    @Test(timeout=10000)
    public void testDelete_StringString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetUtilsTest object = new org.apache.commons.lang3.CharSetUtilsTest();
               object.testDelete_StringString();
        }
    }

    @Test(timeout=10000)
    public void testDelete_StringStringarray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetUtilsTest object = new org.apache.commons.lang3.CharSetUtilsTest();
               object.testDelete_StringStringarray();
        }
    }

    @Test(timeout=10000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetUtilsTest object = new org.apache.commons.lang3.CharSetUtilsTest();
               object.testConstructor();
        }
    }

}