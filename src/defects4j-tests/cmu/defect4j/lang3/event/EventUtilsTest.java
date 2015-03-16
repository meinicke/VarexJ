package cmu.defect4j.lang3.event;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EventUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventUtilsTest object = new org.apache.commons.lang3.event.EventUtilsTest();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void testAddEventListenerThrowsException() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventUtilsTest object = new org.apache.commons.lang3.event.EventUtilsTest();
               object.testAddEventListenerThrowsException();
        }
    }

    @Test(timeout=120000)// FIXME
    public void testAddEventListenerWithPrivateAddMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventUtilsTest object = new org.apache.commons.lang3.event.EventUtilsTest();
               object.testAddEventListenerWithPrivateAddMethod();
        }
    }

    @Test(timeout=120000)// FIXME
    public void testBindEventsToMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventUtilsTest object = new org.apache.commons.lang3.event.EventUtilsTest();
               object.testBindEventsToMethod();
        }
    }

    @Test(timeout=120000)// FIXME
    public void testBindEventsToMethodWithEvent() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventUtilsTest object = new org.apache.commons.lang3.event.EventUtilsTest();
               object.testBindEventsToMethodWithEvent();
        }
    }

    @Test(timeout=120000)// FIXME
    public void testBindFilteredEventsToMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventUtilsTest object = new org.apache.commons.lang3.event.EventUtilsTest();
               object.testBindFilteredEventsToMethod();
        }
    }

    @Test(timeout=120000)// FIXME
    public void testAddEventListener() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventUtilsTest object = new org.apache.commons.lang3.event.EventUtilsTest();
               object.testAddEventListener();
        }
    }

    @Test(timeout=120000)// FIXME
    public void testAddEventListenerWithNoAddMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventUtilsTest object = new org.apache.commons.lang3.event.EventUtilsTest();
               object.testAddEventListenerWithNoAddMethod();
        }
    }

}