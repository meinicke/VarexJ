package cmu.defect4j.lang3.text;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CompositeFormatTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testCompositeFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.CompositeFormatTest object = new org.apache.commons.lang3.text.CompositeFormatTest();
               object.testCompositeFormat();
        }
    }

    @Test(timeout=10000)
    public void testUsage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.CompositeFormatTest object = new org.apache.commons.lang3.text.CompositeFormatTest();
               object.testUsage();
        }
    }

}