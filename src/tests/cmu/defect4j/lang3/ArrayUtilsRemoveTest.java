package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ArrayUtilsRemoveTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testRemoveObjectArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveObjectArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveNumberArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveNumberArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveBooleanArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveBooleanArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveByteArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveCharArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveDoubleArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveDoubleArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveFloatArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveFloatArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveIntArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveIntArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveLongArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveLongArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveShortArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveShortArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveElementObjectArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveElementObjectArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveElementBooleanArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveElementBooleanArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveElementByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveElementByteArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveElementCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveElementCharArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveElementDoubleArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveElementDoubleArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveElementFloatArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveElementFloatArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveElementIntArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveElementIntArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveElementLongArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveElementLongArray();
        }
    }

    @Test(timeout=10000)
    public void testRemoveElementShortArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveTest object = new org.apache.commons.lang3.ArrayUtilsRemoveTest();
               object.testRemoveElementShortArray();
        }
    }

}