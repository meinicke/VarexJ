package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StringUtilsIsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testIsAlpha() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsIsTest object = new org.apache.commons.lang3.StringUtilsIsTest();
               object.testIsAlpha();
        }
    }

    @Test(timeout=120000)
    public void testIsAlphanumeric() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsIsTest object = new org.apache.commons.lang3.StringUtilsIsTest();
               object.testIsAlphanumeric();
        }
    }

    @Test(timeout=120000)
    public void testIsWhitespace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsIsTest object = new org.apache.commons.lang3.StringUtilsIsTest();
               object.testIsWhitespace();
        }
    }

    @Test(timeout=120000)
    public void testIsAlphaspace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsIsTest object = new org.apache.commons.lang3.StringUtilsIsTest();
               object.testIsAlphaspace();
        }
    }

    @Test(timeout=120000)
    public void testIsAlphanumericSpace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsIsTest object = new org.apache.commons.lang3.StringUtilsIsTest();
               object.testIsAlphanumericSpace();
        }
    }

    @Test(timeout=120000)
    public void testIsAsciiPrintable_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsIsTest object = new org.apache.commons.lang3.StringUtilsIsTest();
               object.testIsAsciiPrintable_String();
        }
    }

    @Test(timeout=120000)
    public void testIsNumeric() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsIsTest object = new org.apache.commons.lang3.StringUtilsIsTest();
               object.testIsNumeric();
        }
    }

    @Test(timeout=120000)
    public void testIsNumericSpace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringUtilsIsTest object = new org.apache.commons.lang3.StringUtilsIsTest();
               object.testIsNumericSpace();
        }
    }

}