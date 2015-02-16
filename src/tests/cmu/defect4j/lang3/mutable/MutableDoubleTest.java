package cmu.defect4j.lang3.mutable;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MutableDoubleTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testHashCode();
        }
    }

    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testConstructors();
        }
    }

    @Test(timeout=120000)
    public void testConstructorNull() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testConstructorNull();
        }
    }

    @Test(timeout=120000)
    public void testGetSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testGetSet();
        }
    }

    @Test(timeout=120000)
    public void testSetNull() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testSetNull();
        }
    }

    @Test(timeout=120000)
    public void testToDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testToDouble();
        }
    }

    @Test(timeout=120000)
    public void testNanInfinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testNanInfinite();
        }
    }

    @Test(timeout=120000)
    public void testCompareToNull() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testCompareToNull();
        }
    }

    @Test(timeout=120000)
    public void testPrimitiveValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testPrimitiveValues();
        }
    }

    @Test(timeout=120000)
    public void testIncrement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testIncrement();
        }
    }

    @Test(timeout=120000)
    public void testDecrement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testDecrement();
        }
    }

    @Test(timeout=120000)
    public void testAddValuePrimitive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testAddValuePrimitive();
        }
    }

    @Test(timeout=120000)
    public void testAddValueObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testAddValueObject();
        }
    }

    @Test(timeout=120000)
    public void testSubtractValuePrimitive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testSubtractValuePrimitive();
        }
    }

    @Test(timeout=120000)
    public void testSubtractValueObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testSubtractValueObject();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testCompareTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableDoubleTest object = new org.apache.commons.lang3.mutable.MutableDoubleTest();
               object.testCompareTo();
        }
    }

}