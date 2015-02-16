package cmu.defect4j.lang3.mutable;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MutableShortTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testHashCode();
        }
    }

    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testConstructors();
        }
    }

    @Test(timeout=120000)
    public void testGetSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testGetSet();
        }
    }

    @Test(timeout=120000)
    public void testToShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testToShort();
        }
    }

    @Test(timeout=120000)
    public void testPrimitiveValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testPrimitiveValues();
        }
    }

    @Test(timeout=120000)
    public void testIncrement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testIncrement();
        }
    }

    @Test(timeout=120000)
    public void testDecrement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testDecrement();
        }
    }

    @Test(timeout=120000)
    public void testAddValuePrimitive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testAddValuePrimitive();
        }
    }

    @Test(timeout=120000)
    public void testAddValueObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testAddValueObject();
        }
    }

    @Test(timeout=120000)
    public void testSubtractValuePrimitive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testSubtractValuePrimitive();
        }
    }

    @Test(timeout=120000)
    public void testSubtractValueObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testSubtractValueObject();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testCompareTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableShortTest object = new org.apache.commons.lang3.mutable.MutableShortTest();
               object.testCompareTo();
        }
    }

}