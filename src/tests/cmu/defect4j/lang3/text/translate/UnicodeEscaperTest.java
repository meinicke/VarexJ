package cmu.defect4j.lang3.text.translate;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class UnicodeEscaperTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testAbove() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.translate.UnicodeEscaperTest object = new org.apache.commons.lang3.text.translate.UnicodeEscaperTest();
               object.testAbove();
        }
    }

    @Test(timeout=10000)
    public void testBelow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.translate.UnicodeEscaperTest object = new org.apache.commons.lang3.text.translate.UnicodeEscaperTest();
               object.testBelow();
        }
    }

    @Test(timeout=10000)
    public void testBetween() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.translate.UnicodeEscaperTest object = new org.apache.commons.lang3.text.translate.UnicodeEscaperTest();
               object.testBetween();
        }
    }

}