package cmu.defect4j.lang3.event;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EventListenerSupportTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testAddNullListener() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.event.EventListenerSupportTest object = new org.apache.commons.lang3.event.EventListenerSupportTest();
               object.testAddNullListener();
        }
    }

    @Test(timeout=10000)
    public void testRemoveNullListener() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.event.EventListenerSupportTest object = new org.apache.commons.lang3.event.EventListenerSupportTest();
               object.testRemoveNullListener();
        }
    }

    @Test(timeout=10000)
    public void testEventDispatchOrder() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventListenerSupportTest object = new org.apache.commons.lang3.event.EventListenerSupportTest();
               object.testEventDispatchOrder();
        }
    }

    @Test(timeout=10000)
    public void testCreateWithNonInterfaceParameter() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.event.EventListenerSupportTest object = new org.apache.commons.lang3.event.EventListenerSupportTest();
               object.testCreateWithNonInterfaceParameter();
        }
    }

    @Test(timeout=10000)
    public void testCreateWithNullParameter() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.event.EventListenerSupportTest object = new org.apache.commons.lang3.event.EventListenerSupportTest();
               object.testCreateWithNullParameter();
        }
    }

    @Test(timeout=10000)
    public void testRemoveListenerDuringEvent() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventListenerSupportTest object = new org.apache.commons.lang3.event.EventListenerSupportTest();
               object.testRemoveListenerDuringEvent();
        }
    }

    @Test(timeout=10000)
    public void testGetListeners() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventListenerSupportTest object = new org.apache.commons.lang3.event.EventListenerSupportTest();
               object.testGetListeners();
        }
    }

    @Test(timeout=10000)
    public void testSubclassInvocationHandling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventListenerSupportTest object = new org.apache.commons.lang3.event.EventListenerSupportTest();
               object.testSubclassInvocationHandling();
        }
    }

    @Test(timeout=10000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.event.EventListenerSupportTest object = new org.apache.commons.lang3.event.EventListenerSupportTest();
               object.testSerialization();
        }
    }

}