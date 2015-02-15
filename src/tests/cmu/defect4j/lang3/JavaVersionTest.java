package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class JavaVersionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.JavaVersionTest object = new org.apache.commons.lang3.JavaVersionTest();
               object.testToString();
        }
    }

    @Test(timeout=10000)
    public void testAtLeast() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.JavaVersionTest object = new org.apache.commons.lang3.JavaVersionTest();
               object.testAtLeast();
        }
    }

    @Test(timeout=10000)
    public void testGetJavaVersion() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.JavaVersionTest object = new org.apache.commons.lang3.JavaVersionTest();
               object.testGetJavaVersion();
        }
    }

}