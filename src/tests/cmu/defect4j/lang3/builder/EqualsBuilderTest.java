package cmu.defect4j.lang3.builder;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class EqualsBuilderTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testObject();
        }
    }

    @Test(timeout=120000)
    public void testObjectBuild() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testObjectBuild();
        }
    }

    @Test(timeout=120000)
    public void testLong() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testLong();
        }
    }

    @Test(timeout=120000)
    public void testInt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testInt();
        }
    }

    @Test(timeout=120000)
    public void testShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testShort();
        }
    }

    @Test(timeout=120000)
    public void testChar() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testChar();
        }
    }

    @Test(timeout=120000)
    public void testDouble() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testDouble();
        }
    }

    @Test(timeout=120000)
    public void testFloat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testFloat();
        }
    }

    @Test(timeout=120000)
    public void testBoolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testBoolean();
        }
    }

    @Test(timeout=120000)
    public void testObjectArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testObjectArray();
        }
    }

    @Test(timeout=120000)
    public void testLongArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testLongArray();
        }
    }

    @Test(timeout=120000)
    public void testIntArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testIntArray();
        }
    }

    @Test(timeout=120000)
    public void testShortArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testShortArray();
        }
    }

    @Test(timeout=120000)
    public void testCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testCharArray();
        }
    }

    @Test(timeout=120000)
    public void testByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testByteArray();
        }
    }

    @Test(timeout=120000)
    public void testDoubleArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testDoubleArray();
        }
    }

    @Test(timeout=120000)
    public void testFloatArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testFloatArray();
        }
    }

    @Test(timeout=120000)
    public void testBooleanArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testBooleanArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiLongArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testMultiLongArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiIntArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testMultiIntArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiShortArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testMultiShortArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiCharArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testMultiCharArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiByteArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testMultiByteArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiFloatArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testMultiFloatArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiDoubleArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testMultiDoubleArray();
        }
    }

    @Test(timeout=120000)
    public void testMultiBooleanArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testMultiBooleanArray();
        }
    }

    @Test(timeout=120000)
    public void testRaggedArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testRaggedArray();
        }
    }

    @Test(timeout=120000)
    public void testMixedArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testMixedArray();
        }
    }

    @Test(timeout=120000)
    public void testObjectArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testObjectArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testLongArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testLongArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testIntArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testIntArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testShortArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testShortArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testCharArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testCharArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testByteArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testByteArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testDoubleArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testDoubleArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testFloatArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testFloatArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testBooleanArrayHiddenByObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testBooleanArrayHiddenByObject();
        }
    }

    @Test(timeout=120000)
    public void testByte() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testByte();
        }
    }

    @Test(timeout=120000)
    public void testReflectionEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testReflectionEquals();
        }
    }

    @Test(timeout=120000)
    public void testReflectionHierarchyEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testReflectionHierarchyEquals();
        }
    }

    @Test(timeout=120000)
    public void testSuper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testSuper();
        }
    }

    @Test(timeout=120000)
    public void testAccessors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testAccessors();
        }
    }

    @Test(timeout=120000)
    public void testReset() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testReset();
        }
    }

    @Test(timeout=120000)
    public void testUnrelatedClasses() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testUnrelatedClasses();
        }
    }

    @Test(timeout=120000)
    public void testNpeForNullElement() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testNpeForNullElement();
        }
    }

    @Test(timeout=120000)
    public void testReflectionEqualsExcludeFields() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testReflectionEqualsExcludeFields();
        }
    }

    @Test(timeout=120000)
    public void testCyclicalObjectReferences() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.EqualsBuilderTest object = new org.apache.commons.lang3.builder.EqualsBuilderTest();
               object.testCyclicalObjectReferences();
        }
    }

}