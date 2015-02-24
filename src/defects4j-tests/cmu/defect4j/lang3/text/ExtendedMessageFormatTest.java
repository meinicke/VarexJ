package cmu.defect4j.lang3.text;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Ignore;
import org.junit.Test;

public class ExtendedMessageFormatTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testExtendedFormats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.ExtendedMessageFormatTest object = new org.apache.commons.lang3.text.ExtendedMessageFormatTest();
               object.setUp();
               object.testExtendedFormats();
        }
    }

    @Test(timeout=120000)
    public void testEscapedQuote_LANG_477() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.ExtendedMessageFormatTest object = new org.apache.commons.lang3.text.ExtendedMessageFormatTest();
               object.setUp();
               object.testEscapedQuote_LANG_477();
        }
    }

    @Test(timeout=120000)
    public void testExtendedAndBuiltInFormats() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.ExtendedMessageFormatTest object = new org.apache.commons.lang3.text.ExtendedMessageFormatTest();
               object.setUp();
               object.testExtendedAndBuiltInFormats();
        }
    }

    @Test(timeout=120000)
    public void testBuiltInChoiceFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.ExtendedMessageFormatTest object = new org.apache.commons.lang3.text.ExtendedMessageFormatTest();
               object.setUp();
               object.testBuiltInChoiceFormat();
        }
    }

    @Ignore
    @Test//(timeout=1000000)// long running, but works
    public void testBuiltInDateTimeFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.ExtendedMessageFormatTest object = new org.apache.commons.lang3.text.ExtendedMessageFormatTest();
               object.setUp();
               object.testBuiltInDateTimeFormat();
        }
    }

    @Ignore
    @Test//(timeout=1000000)// long running, but works
    public void testOverriddenBuiltinFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.ExtendedMessageFormatTest object = new org.apache.commons.lang3.text.ExtendedMessageFormatTest();
               object.setUp();
               object.testOverriddenBuiltinFormat();
        }
    }

    @Test(timeout=120000)
    public void testBuiltInNumberFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.ExtendedMessageFormatTest object = new org.apache.commons.lang3.text.ExtendedMessageFormatTest();
               object.setUp();
               object.testBuiltInNumberFormat();
        }
    }

    @Test(timeout=120000)
    public void testEqualsHashcode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.ExtendedMessageFormatTest object = new org.apache.commons.lang3.text.ExtendedMessageFormatTest();
               object.setUp();
               object.testEqualsHashcode();
        }
    }

}