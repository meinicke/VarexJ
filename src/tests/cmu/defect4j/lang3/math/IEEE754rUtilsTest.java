package cmu.defect4j.lang3.math;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class IEEE754rUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testEnforceExceptions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.IEEE754rUtilsTest object = new org.apache.commons.lang3.math.IEEE754rUtilsTest();
               object.testEnforceExceptions();
        }
    }

    @Test(timeout=10000)
    public void testLang381() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.IEEE754rUtilsTest object = new org.apache.commons.lang3.math.IEEE754rUtilsTest();
               object.testLang381();
        }
    }

    @Test(timeout=10000)
    public void testConstructorExists() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.IEEE754rUtilsTest object = new org.apache.commons.lang3.math.IEEE754rUtilsTest();
               object.testConstructorExists();
        }
    }

}