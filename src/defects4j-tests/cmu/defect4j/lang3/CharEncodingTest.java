package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CharEncodingTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testSupported() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharEncodingTest object = new org.apache.commons.lang3.CharEncodingTest();
               object.testSupported();
        }
    }

    @Test(timeout=120000)
    public void testMustBeSupportedJava1_3_1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharEncodingTest object = new org.apache.commons.lang3.CharEncodingTest();
               object.testMustBeSupportedJava1_3_1();
        }
    }

    @Test(timeout=120000)
    public void testNotSupported() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharEncodingTest object = new org.apache.commons.lang3.CharEncodingTest();
               object.testNotSupported();
        }
    }

    @Test(timeout=120000)
    public void testWorksOnJava1_1_8() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharEncodingTest object = new org.apache.commons.lang3.CharEncodingTest();
               object.testWorksOnJava1_1_8();
        }
    }

    @Test(timeout=120000)
    public void testWorksOnJava1_2_2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharEncodingTest object = new org.apache.commons.lang3.CharEncodingTest();
               object.testWorksOnJava1_2_2();
        }
    }

    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharEncodingTest object = new org.apache.commons.lang3.CharEncodingTest();
               object.testConstructor();
        }
    }

}