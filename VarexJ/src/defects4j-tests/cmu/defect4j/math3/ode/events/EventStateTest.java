package cmu.defect4j.math3.ode.events;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EventStateTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void closeEvents() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.events.EventStateTest object = new org.apache.commons.math3.ode.events.EventStateTest();
               object.closeEvents();
        }
    }

    @Test(timeout=1000000)
    public void testIssue695() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.events.EventStateTest object = new org.apache.commons.math3.ode.events.EventStateTest();
               object.testIssue695();
        }
    }

    @Test(timeout=1000000)
    public void testIssue965() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.events.EventStateTest object = new org.apache.commons.math3.ode.events.EventStateTest();
               object.testIssue965();
        }
    }

}