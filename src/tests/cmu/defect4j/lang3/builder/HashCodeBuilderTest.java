package cmu.defect4j.lang3.builder;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class HashCodeBuilderTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testByte();
        }
    }

    @Test(timeout=10000)
    public void testObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testObject();
        }
    }

    @Test(timeout=10000)
    public void testObjectBuild() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testObjectBuild();
        }
    }

    @Test(timeout=10000)
    public void testLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testLong();
        }
    }

    @Test(timeout=10000)
    public void testInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testInt();
        }
    }

    @Test(timeout=10000)
    public void testShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testShort();
        }
    }

    @Test(timeout=10000)
    public void testChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testChar();
        }
    }

    @Test(timeout=10000)
    public void testDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testDouble();
        }
    }

    @Test(timeout=10000)
    public void testFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testFloat();
        }
    }

    @Test(timeout=10000)
    public void testBoolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testBoolean();
        }
    }

    @Test(timeout=10000)
    public void testObjectArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testObjectArray();
        }
    }

    @Test(timeout=10000)
    public void testLongArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testLongArray();
        }
    }

    @Test(timeout=10000)
    public void testIntArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testIntArray();
        }
    }

    @Test(timeout=10000)
    public void testShortArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testShortArray();
        }
    }

    @Test(timeout=10000)
    public void testCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testCharArray();
        }
    }

    @Test(timeout=10000)
    public void testByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testByteArray();
        }
    }

    @Test(timeout=10000)
    public void testDoubleArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testDoubleArray();
        }
    }

    @Test(timeout=10000)
    public void testFloatArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testFloatArray();
        }
    }

    @Test(timeout=10000)
    public void testBooleanArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testBooleanArray();
        }
    }

    @Test(timeout=10000)
    public void testConstructorEx1() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testConstructorEx1();
        }
    }

    @Test(timeout=10000)
    public void testConstructorEx2() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testConstructorEx2();
        }
    }

    @Test(timeout=10000)
    public void testReflectionHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testReflectionHashCode();
        }
    }

    @Test(timeout=10000)
    public void testLongArrayAsObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testLongArrayAsObject();
        }
    }

    @Test(timeout=10000)
    public void testReflectionHierarchyHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testReflectionHierarchyHashCode();
        }
    }

    @Test(timeout=10000)
    public void testReflectionHierarchyHashCodeEx1() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testReflectionHierarchyHashCodeEx1();
        }
    }

    @Test(timeout=10000)
    public void testReflectionHierarchyHashCodeEx2() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testReflectionHierarchyHashCodeEx2();
        }
    }

    @Test(timeout=10000)
    public void testReflectionHashCodeEx1() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testReflectionHashCodeEx1();
        }
    }

    @Test(timeout=10000)
    public void testReflectionHashCodeEx2() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testReflectionHashCodeEx2();
        }
    }

    @Test(timeout=10000)
    public void testReflectionHashCodeEx3() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testReflectionHashCodeEx3();
        }
    }

    @Test(timeout=10000)
    public void testObjectArrayAsObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testObjectArrayAsObject();
        }
    }

    @Test(timeout=10000)
    public void testIntArrayAsObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testIntArrayAsObject();
        }
    }

    @Test(timeout=10000)
    public void testShortArrayAsObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testShortArrayAsObject();
        }
    }

    @Test(timeout=10000)
    public void testCharArrayAsObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testCharArrayAsObject();
        }
    }

    @Test(timeout=10000)
    public void testByteArrayAsObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testByteArrayAsObject();
        }
    }

    @Test(timeout=10000)
    public void testDoubleArrayAsObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testDoubleArrayAsObject();
        }
    }

    @Test(timeout=10000)
    public void testFloatArrayAsObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testFloatArrayAsObject();
        }
    }

    @Test(timeout=10000)
    public void testBooleanArrayAsObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testBooleanArrayAsObject();
        }
    }

    @Test(timeout=10000)
    public void testBooleanMultiArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testBooleanMultiArray();
        }
    }

    @Test(timeout=10000)
    public void testReflectionHashCodeExcludeFields() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testReflectionHashCodeExcludeFields();
        }
    }

    @Test(timeout=10000)
    public void testReflectionObjectCycle() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testReflectionObjectCycle();
        }
    }

    @Test(timeout=10000)
    public void testToHashCodeEqualsHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testToHashCodeEqualsHashCode();
        }
    }

    @Test(timeout=10000)
    public void testSuper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderTest();
               object.testSuper();
        }
    }

}