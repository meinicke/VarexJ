package cmu.defect4j.lang3.mutable;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MutableIntTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testCompareToNull() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testCompareToNull();
        }
    }

    @Test(timeout=120000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testConstructors();
        }
    }

    @Test(timeout=120000)
    public void testConstructorNull() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testConstructorNull();
        }
    }

    @Test(timeout=120000)
    public void testGetSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testGetSet();
        }
    }

    @Test(timeout=120000)
    public void testSetNull() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testSetNull();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testCompareTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testCompareTo();
        }
    }

    @Test(timeout=120000)
    public void testPrimitiveValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testPrimitiveValues();
        }
    }

    @Test(timeout=120000)
    public void testIncrement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testIncrement();
        }
    }

    @Test(timeout=120000)
    public void testDecrement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testDecrement();
        }
    }

    @Test(timeout=120000)
    public void testAddValuePrimitive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testAddValuePrimitive();
        }
    }

    @Test(timeout=120000)
    public void testAddValueObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testAddValueObject();
        }
    }

    @Test(timeout=120000)
    public void testSubtractValuePrimitive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testSubtractValuePrimitive();
        }
    }

    @Test(timeout=120000)
    public void testSubtractValueObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testSubtractValueObject();
        }
    }

    @Test(timeout=120000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testHashCode();
        }
    }

    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testToInteger() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableIntTest object = new org.apache.commons.lang3.mutable.MutableIntTest();
               object.testToInteger();
        }
    }

}