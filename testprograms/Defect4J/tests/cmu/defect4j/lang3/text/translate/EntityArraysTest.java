package cmu.defect4j.lang3.text.translate;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EntityArraysTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstructorExists() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.translate.EntityArraysTest object = new org.apache.commons.lang3.text.translate.EntityArraysTest();
               object.testConstructorExists();
        }
    }

    @Test(timeout=120000)
    public void testHTML40_EXTENDED_ESCAPE() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.translate.EntityArraysTest object = new org.apache.commons.lang3.text.translate.EntityArraysTest();
               object.testHTML40_EXTENDED_ESCAPE();
        }
    }

    @Test(timeout=120000)
    public void testISO8859_1_ESCAPE() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.translate.EntityArraysTest object = new org.apache.commons.lang3.text.translate.EntityArraysTest();
               object.testISO8859_1_ESCAPE();
        }
    }

}