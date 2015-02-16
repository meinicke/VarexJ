package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ArrayUtilsRemoveMultipleTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testRemoveAllObjectArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllObjectArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllObjectArrayRemoveNone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllObjectArrayRemoveNone();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllObjectArrayNegativeIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllObjectArrayNegativeIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllObjectArrayOutOfBoundsIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllObjectArrayOutOfBoundsIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllNullObjectArray() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllNullObjectArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllNumberArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllNumberArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllBooleanArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllBooleanArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllBooleanArrayRemoveNone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllBooleanArrayRemoveNone();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllBooleanArrayNegativeIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllBooleanArrayNegativeIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllBooleanArrayOutOfBoundsIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllBooleanArrayOutOfBoundsIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllNullBooleanArray() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllNullBooleanArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllByteArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllByteArrayRemoveNone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllByteArrayRemoveNone();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllByteArrayNegativeIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllByteArrayNegativeIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllByteArrayOutOfBoundsIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllByteArrayOutOfBoundsIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllNullByteArray() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllNullByteArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllCharArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllCharArrayRemoveNone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllCharArrayRemoveNone();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllCharArrayNegativeIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllCharArrayNegativeIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllCharArrayOutOfBoundsIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllCharArrayOutOfBoundsIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllNullCharArray() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllNullCharArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllDoubleArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllDoubleArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllDoubleArrayRemoveNone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllDoubleArrayRemoveNone();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllDoubleArrayNegativeIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllDoubleArrayNegativeIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllDoubleArrayOutOfBoundsIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllDoubleArrayOutOfBoundsIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllNullDoubleArray() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllNullDoubleArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllFloatArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllFloatArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllFloatArrayRemoveNone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllFloatArrayRemoveNone();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllFloatArrayNegativeIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllFloatArrayNegativeIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllFloatArrayOutOfBoundsIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllFloatArrayOutOfBoundsIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllNullFloatArray() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllNullFloatArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllIntArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllIntArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllIntArrayRemoveNone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllIntArrayRemoveNone();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllIntArrayNegativeIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllIntArrayNegativeIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllIntArrayOutOfBoundsIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllIntArrayOutOfBoundsIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllNullIntArray() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllNullIntArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllLongArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllLongArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllLongArrayRemoveNone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllLongArrayRemoveNone();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllLongArrayNegativeIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllLongArrayNegativeIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllLongArrayOutOfBoundsIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllLongArrayOutOfBoundsIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllNullLongArray() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllNullLongArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllShortArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllShortArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllShortArrayRemoveNone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllShortArrayRemoveNone();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllShortArrayNegativeIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllShortArrayNegativeIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllShortArrayOutOfBoundsIndex() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllShortArrayOutOfBoundsIndex();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAllNullShortArray() throws Exception {
        if (verifyUnhandledException("java.lang.IndexOutOfBoundsException", config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveAllNullShortArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveElementsObjectArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveElementsObjectArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveElementBooleanArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveElementBooleanArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveElementByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveElementByteArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveElementCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveElementCharArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveElementDoubleArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveElementDoubleArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveElementFloatArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveElementFloatArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveElementIntArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveElementIntArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveElementLongArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveElementLongArray();
        }
    }

    @Test(timeout=120000)
    public void testRemoveElementShortArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest object = new org.apache.commons.lang3.ArrayUtilsRemoveMultipleTest();
               object.testRemoveElementShortArray();
        }
    }

}