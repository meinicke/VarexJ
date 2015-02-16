package cmu.defect4j.lang3.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StopWatchTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testStopWatchSimple() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.StopWatchTest object = new org.apache.commons.lang3.time.StopWatchTest();
               object.testStopWatchSimple();
        }
    }

    @Test(timeout=120000)
    public void testStopWatchSimpleGet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.StopWatchTest object = new org.apache.commons.lang3.time.StopWatchTest();
               object.testStopWatchSimpleGet();
        }
    }

    @Test(timeout=120000)
    public void testStopWatchSplit() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.StopWatchTest object = new org.apache.commons.lang3.time.StopWatchTest();
               object.testStopWatchSplit();
        }
    }

    @Test(timeout=120000)
    public void testStopWatchSuspend() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.StopWatchTest object = new org.apache.commons.lang3.time.StopWatchTest();
               object.testStopWatchSuspend();
        }
    }

    @Test(timeout=120000)
    public void testLang315() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.StopWatchTest object = new org.apache.commons.lang3.time.StopWatchTest();
               object.testLang315();
        }
    }

    @Test(timeout=120000)
    public void testBadStates() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.StopWatchTest object = new org.apache.commons.lang3.time.StopWatchTest();
               object.testBadStates();
        }
    }

    @Test(timeout=120000)
    public void testGetStartTime() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.StopWatchTest object = new org.apache.commons.lang3.time.StopWatchTest();
               object.testGetStartTime();
        }
    }

}