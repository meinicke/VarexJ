package cmu.defect4j.lang3.text;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StrLookupTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testNoneLookup() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrLookupTest object = new org.apache.commons.lang3.text.StrLookupTest();
               object.testNoneLookup();
        }
    }

    @Test(timeout=120000)
    public void testSystemProperiesLookup() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrLookupTest object = new org.apache.commons.lang3.text.StrLookupTest();
               object.testSystemProperiesLookup();
        }
    }

    @Test(timeout=120000)
    public void testMapLookup() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrLookupTest object = new org.apache.commons.lang3.text.StrLookupTest();
               object.testMapLookup();
        }
    }

    @Test(timeout=120000)
    public void testMapLookup_nullMap() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrLookupTest object = new org.apache.commons.lang3.text.StrLookupTest();
               object.testMapLookup_nullMap();
        }
    }

}