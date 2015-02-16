package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SerializationUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testException() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testException();
        }
    }

    @Test(timeout=120000)
    public void testSerializeStream() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testSerializeStream();
        }
    }

    @Test(timeout=120000)
    public void testSerializeStreamUnserializable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testSerializeStreamUnserializable();
        }
    }

    @Test(timeout=120000)
    public void testSerializeStreamNullObj() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testSerializeStreamNullObj();
        }
    }

    @Test(timeout=120000)
    public void testSerializeStreamObjNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testSerializeStreamObjNull();
        }
    }

    @Test(timeout=120000)
    public void testSerializeStreamNullNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testSerializeStreamNullNull();
        }
    }

    @Test(timeout=120000)
    public void testSerializeIOException() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testSerializeIOException();
        }
    }

    @Test(timeout=120000)
    public void testDeserializeStream() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testDeserializeStream();
        }
    }

    @Test(timeout=120000)
    public void testDeserializeClassCastException() throws Exception {
        if (verifyUnhandledException("java.lang.ClassCastException", config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testDeserializeClassCastException();
        }
    }

    @Test(timeout=120000)
    public void testDeserializeStreamOfNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testDeserializeStreamOfNull();
        }
    }

    @Test(timeout=120000)
    public void testDeserializeStreamNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testDeserializeStreamNull();
        }
    }

    @Test(timeout=120000)
    public void testDeserializeStreamBadStream() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testDeserializeStreamBadStream();
        }
    }

    @Test(timeout=120000)
    public void testDeserializeStreamClassNotFound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testDeserializeStreamClassNotFound();
        }
    }

    @Test(timeout=120000)
    public void testSerializeBytes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testSerializeBytes();
        }
    }

    @Test(timeout=120000)
    public void testSerializeBytesUnserializable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testSerializeBytesUnserializable();
        }
    }

    @Test(timeout=120000)
    public void testSerializeBytesNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testSerializeBytesNull();
        }
    }

    @Test(timeout=120000)
    public void testDeserializeBytes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testDeserializeBytes();
        }
    }

    @Test(timeout=120000)
    public void testDeserializeBytesOfNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testDeserializeBytesOfNull();
        }
    }

    @Test(timeout=120000)
    public void testDeserializeBytesNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testDeserializeBytesNull();
        }
    }

    @Test(timeout=120000)
    public void testDeserializeBytesBadStream() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testDeserializeBytesBadStream();
        }
    }

    @Test(timeout=120000)
    public void testCloneNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testCloneNull();
        }
    }

    @Test(timeout=120000)
    public void testCloneUnserializable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testCloneUnserializable();
        }
    }

    @Test(timeout=120000)
    public void testPrimitiveTypeClassSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testPrimitiveTypeClassSerialization();
        }
    }

    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void testClone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.SerializationUtilsTest object = new org.apache.commons.lang3.SerializationUtilsTest();
               object.setUp();
               object.testClone();
        }
    }

}