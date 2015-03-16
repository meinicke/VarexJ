package cmu.defect4j.math3.exception.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LocalizedFormatsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testMessageNumber() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.exception.util.LocalizedFormatsTest object = new org.apache.commons.math3.exception.util.LocalizedFormatsTest();
               object.testMessageNumber();
        }
    }

    @Test(timeout=120000)
    public void testAllKeysPresentInPropertiesFiles() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.exception.util.LocalizedFormatsTest object = new org.apache.commons.math3.exception.util.LocalizedFormatsTest();
               object.testAllKeysPresentInPropertiesFiles();
        }
    }

    @Test(timeout=120000)
    public void testAllPropertiesCorrespondToKeys() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.exception.util.LocalizedFormatsTest object = new org.apache.commons.math3.exception.util.LocalizedFormatsTest();
               object.testAllPropertiesCorrespondToKeys();
        }
    }

    @Test(timeout=120000)
    public void testNoMissingFrenchTranslation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.exception.util.LocalizedFormatsTest object = new org.apache.commons.math3.exception.util.LocalizedFormatsTest();
               object.testNoMissingFrenchTranslation();
        }
    }

    @Test(timeout=120000)
    public void testNoOpEnglishTranslation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.exception.util.LocalizedFormatsTest object = new org.apache.commons.math3.exception.util.LocalizedFormatsTest();
               object.testNoOpEnglishTranslation();
        }
    }

    @Test(timeout=120000)
    public void testVariablePartsConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.exception.util.LocalizedFormatsTest object = new org.apache.commons.math3.exception.util.LocalizedFormatsTest();
               object.testVariablePartsConsistency();
        }
    }

}