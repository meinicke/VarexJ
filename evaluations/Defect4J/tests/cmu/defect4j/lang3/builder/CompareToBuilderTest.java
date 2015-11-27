package cmu.defect4j.lang3.builder;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CompareToBuilderTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testReflectionCompare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testReflectionCompare();
        }
    }

    @Test(timeout=120000)
    public void testReflectionCompareEx1() throws Exception {
        if (verifyUnhandledException("java.lang.NullPointerException", config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testReflectionCompareEx1();
        }
    }

    @Test(timeout=120000)
    public void testReflectionCompareEx2() throws Exception {
        if (verifyUnhandledException("java.lang.ClassCastException", config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testReflectionCompareEx2();
        }
    }

    @Test(timeout=120000)
    public void testReflectionHierarchyCompare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testReflectionHierarchyCompare();
        }
    }

    @Test(timeout=120000)
    public void testReflectionHierarchyCompareExcludeFields() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testReflectionHierarchyCompareExcludeFields();
        }
    }

    @Test(timeout=120000)
    public void testReflectionHierarchyCompareTransients() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testReflectionHierarchyCompareTransients();
        }
    }

    @Test(timeout=120000)
    public void testAppendSuper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testAppendSuper();
        }
    }

    @Test(timeout=120000)
    public void testObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testObject();
        }
    }

    @Test(timeout=120000)
    public void testObjectBuild() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testObjectBuild();
        }
    }

    @Test(timeout=120000)
    public void testObjectEx2() throws Exception {
        if (verifyUnhandledException("java.lang.ClassCastException", config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testObjectEx2();
        }
    }

    @Test(timeout=120000)
    public void testObjectComparator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testObjectComparator();
        }
    }

    @Test(timeout=120000)
    public void testObjectComparatorNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testObjectComparatorNull();
        }
    }

    @Test(timeout=120000)
    public void testLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testLong();
        }
    }

    @Test(timeout=120000)
    public void testInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testInt();
        }
    }

    @Test(timeout=120000)
    public void testShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testShort();
        }
    }

    @Test(timeout=120000)
    public void testChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testChar();
        }
    }

    @Test(timeout=120000)
    public void testDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testDouble();
        }
    }

    @Test(timeout=120000)
    public void testFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testFloat();
        }
    }

    @Test(timeout=120000)
    public void testBoolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testBoolean();
        }
    }

    @Test(timeout=120000)
    public void testObjectArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testObjectArray();
        }
    }

    @Test(timeout=120000)
    public void testLongArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testLongArray();
        }
    }

    @Test(timeout=120000)
    public void testIntArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testIntArray();
        }
    }

    @Test(timeout=120000)
    public void testShortArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testShortArray();
        }
    }

    @Test(timeout=120000)
    public void testCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testCharArray();
        }
    }

    @Test(timeout=120000)
    public void testByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testByteArray();
        }
    }

    @Test(timeout=120000)
    public void testDoubleArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testDoubleArray();
        }
    }

    @Test(timeout=120000)
    public void testFloatArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testFloatArray();
        }
    }

    @Test(timeout=120000)
    public void testBooleanArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testBooleanArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiLongArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testMultiLongArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiIntArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testMultiIntArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiShortArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testMultiShortArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testMultiCharArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testMultiByteArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiFloatArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testMultiFloatArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiDoubleArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testMultiDoubleArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiBooleanArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testMultiBooleanArray();
        }
    }

    @Test(timeout=120000)
    public void testRaggedArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testRaggedArray();
        }
    }

    @Test(timeout=120000)
    public void testMixedArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testMixedArray();
        }
    }

    @Test(timeout=120000)
    public void testObjectArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testObjectArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testLongArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testLongArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testIntArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testIntArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testShortArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testShortArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testCharArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testCharArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testByteArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testByteArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testDoubleArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testDoubleArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testFloatArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testFloatArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testBooleanArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testBooleanArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.CompareToBuilderTest object = new org.apache.commons.lang3.builder.CompareToBuilderTest();
               object.testByte();
        }
    }

}