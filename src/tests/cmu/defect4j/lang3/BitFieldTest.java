package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BitFieldTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testGetValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testGetValue();
        }
    }

    @Test(timeout=10000)
    public void testGetShortValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testGetShortValue();
        }
    }

    @Test(timeout=10000)
    public void testGetRawValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testGetRawValue();
        }
    }

    @Test(timeout=10000)
    public void testGetShortRawValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testGetShortRawValue();
        }
    }

    @Test(timeout=10000)
    public void testIsSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testIsSet();
        }
    }

    @Test(timeout=10000)
    public void testIsAllSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testIsAllSet();
        }
    }

    @Test(timeout=10000)
    public void testSetValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testSetValue();
        }
    }

    @Test(timeout=10000)
    public void testSetShortValue() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testSetShortValue();
        }
    }

    @Test(timeout=10000)
    public void testByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testByte();
        }
    }

    @Test(timeout=10000)
    public void testClear() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testClear();
        }
    }

    @Test(timeout=10000)
    public void testClearShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testClearShort();
        }
    }

    @Test(timeout=10000)
    public void testSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testSet();
        }
    }

    @Test(timeout=10000)
    public void testSetShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testSetShort();
        }
    }

    @Test(timeout=10000)
    public void testSetBoolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testSetBoolean();
        }
    }

    @Test(timeout=10000)
    public void testSetShortBoolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BitFieldTest object = new org.apache.commons.lang3.BitFieldTest();
               object.testSetShortBoolean();
        }
    }

}