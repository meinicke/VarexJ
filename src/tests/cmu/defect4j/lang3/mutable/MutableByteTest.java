package cmu.defect4j.lang3.mutable;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MutableByteTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testHashCode();
        }
    }

    @Test(timeout=10000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testToString();
        }
    }

    @Test(timeout=10000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testEquals();
        }
    }

    @Test(timeout=10000)
    public void testCompareTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testCompareTo();
        }
    }

    @Test(timeout=10000)
    public void testPrimitiveValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testPrimitiveValues();
        }
    }

    @Test(timeout=10000)
    public void testToByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testToByte();
        }
    }

    @Test(timeout=10000)
    public void testIncrement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testIncrement();
        }
    }

    @Test(timeout=10000)
    public void testDecrement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testDecrement();
        }
    }

    @Test(timeout=10000)
    public void testAddValuePrimitive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testAddValuePrimitive();
        }
    }

    @Test(timeout=10000)
    public void testAddValueObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testAddValueObject();
        }
    }

    @Test(timeout=10000)
    public void testSubtractValuePrimitive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testSubtractValuePrimitive();
        }
    }

    @Test(timeout=10000)
    public void testSubtractValueObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testSubtractValueObject();
        }
    }

    @Test(timeout=10000)
    public void testCompareToNull() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testCompareToNull();
        }
    }

    @Test(timeout=10000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testConstructors();
        }
    }

    @Test(timeout=10000)
    public void testConstructorNull() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testConstructorNull();
        }
    }

    @Test(timeout=10000)
    public void testGetSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testGetSet();
        }
    }

    @Test(timeout=10000)
    public void testSetNull() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.mutable.MutableByteTest object = new org.apache.commons.lang3.mutable.MutableByteTest();
               object.testSetNull();
        }
    }

}