package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StringUtilsStartsEndsWithTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testStartsWith() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsStartsEndsWithTest object = new org.apache.commons.lang3.StringUtilsStartsEndsWithTest();
               object.testStartsWith();
        }
    }

    @Test(timeout=120000)
    public void testStartsWithAny() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsStartsEndsWithTest object = new org.apache.commons.lang3.StringUtilsStartsEndsWithTest();
               object.testStartsWithAny();
        }
    }

    @Test(timeout=120000)
    public void testEndsWith() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsStartsEndsWithTest object = new org.apache.commons.lang3.StringUtilsStartsEndsWithTest();
               object.testEndsWith();
        }
    }

    @Test(timeout=120000)
    public void testEndsWithIgnoreCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsStartsEndsWithTest object = new org.apache.commons.lang3.StringUtilsStartsEndsWithTest();
               object.testEndsWithIgnoreCase();
        }
    }

    @Test(timeout=120000)
    public void testEndsWithAny() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsStartsEndsWithTest object = new org.apache.commons.lang3.StringUtilsStartsEndsWithTest();
               object.testEndsWithAny();
        }
    }

    @Test(timeout=120000)
    public void testStartsWithIgnoreCase() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsStartsEndsWithTest object = new org.apache.commons.lang3.StringUtilsStartsEndsWithTest();
               object.testStartsWithIgnoreCase();
        }
    }

}