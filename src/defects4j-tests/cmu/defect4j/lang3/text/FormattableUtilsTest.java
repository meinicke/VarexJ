package cmu.defect4j.lang3.text;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
//FIXME
public class FormattableUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testDefaultAppend() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.FormattableUtilsTest object = new org.apache.commons.lang3.text.FormattableUtilsTest();
               object.testDefaultAppend();
        }
    }

    @Test(timeout=120000)
    public void testAlternatePadCharacter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.FormattableUtilsTest object = new org.apache.commons.lang3.text.FormattableUtilsTest();
               object.testAlternatePadCharacter();
        }
    }

    @Test(timeout=120000)
    public void testEllipsis() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.FormattableUtilsTest object = new org.apache.commons.lang3.text.FormattableUtilsTest();
               object.testEllipsis();
        }
    }

    @Test(timeout=120000)
    public void testIllegalEllipsis() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.text.FormattableUtilsTest object = new org.apache.commons.lang3.text.FormattableUtilsTest();
               object.testIllegalEllipsis();
        }
    }

    @Test(timeout=120000)
    public void testAlternatePadCharAndEllipsis() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.FormattableUtilsTest object = new org.apache.commons.lang3.text.FormattableUtilsTest();
               object.testAlternatePadCharAndEllipsis();
        }
    }

}