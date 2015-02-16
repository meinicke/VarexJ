package cmu.defect4j.lang3.mutable;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MutableBooleanTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testCompareToNull() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.mutable.MutableBooleanTest object = new org.apache.commons.lang3.mutable.MutableBooleanTest();
               object.testCompareToNull();
        }
    }

    @Test(timeout=120000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableBooleanTest object = new org.apache.commons.lang3.mutable.MutableBooleanTest();
               object.testConstructors();
        }
    }

    @Test(timeout=120000)
    public void testConstructorNull() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.mutable.MutableBooleanTest object = new org.apache.commons.lang3.mutable.MutableBooleanTest();
               object.testConstructorNull();
        }
    }

    @Test(timeout=120000)
    public void testGetSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableBooleanTest object = new org.apache.commons.lang3.mutable.MutableBooleanTest();
               object.testGetSet();
        }
    }

    @Test(timeout=120000)
    public void testSetNull() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.mutable.MutableBooleanTest object = new org.apache.commons.lang3.mutable.MutableBooleanTest();
               object.testSetNull();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableBooleanTest object = new org.apache.commons.lang3.mutable.MutableBooleanTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testCompareTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableBooleanTest object = new org.apache.commons.lang3.mutable.MutableBooleanTest();
               object.testCompareTo();
        }
    }

    @Test(timeout=120000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableBooleanTest object = new org.apache.commons.lang3.mutable.MutableBooleanTest();
               object.testHashCode();
        }
    }

    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableBooleanTest object = new org.apache.commons.lang3.mutable.MutableBooleanTest();
               object.testToString();
        }
    }

}