package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;

import java.util.List;

import org.apache.commons.lang3.ClassUtils;
import org.junit.Ignore;
import org.junit.Test;

public class ClassUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void test_getShortClassName_Object() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getShortClassName_Object();
        }
    }

    @Test(timeout=120000)
    public void test_getShortClassName_Class() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getShortClassName_Class();
        }
    }

    @Test(timeout=120000)
    public void test_getShortClassName_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getShortClassName_String();
        }
    }

    @Test(timeout=120000)
    public void test_getSimpleName_Class() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getSimpleName_Class();
        }
    }

    @Test(timeout=120000)
    public void test_getSimpleName_Object() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getSimpleName_Object();
        }
    }

    @Test(timeout=120000)
    public void test_getPackageName_Object() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getPackageName_Object();
        }
    }

    @Test(timeout=120000)
    public void test_getPackageName_Class() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getPackageName_Class();
        }
    }

    @Test(timeout=120000)
    public void test_getPackageName_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getPackageName_String();
        }
    }

    @Test(timeout=120000)
    public void test_getAllSuperclasses_Class() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getAllSuperclasses_Class();
        }
    }
    
    private static interface IA {    }
    private static interface IB {    }
    private static interface IC extends ID, IE {    }
    private static interface ID {    }
    private static interface IE extends IF {    }
    private static interface IF {    }
    private static class CX implements IB, IA, IE {    }
    @SuppressWarnings("unused")
	private static class CY extends CX implements IB, IC {    }

    @Test(timeout=120000)
    public void test_getAllInterfaces_Class() throws Exception {
        if (verifyNoPropertyViolation(config)) {
        	final List<?> list = ClassUtils.getAllInterfaces(CY.class);
            assertEquals(6, list.size());
            assertTrue(list.contains(IB.class));
            assertTrue(list.contains(IB.class));
            assertTrue(list.contains(IC.class));
            assertTrue(list.contains(ID.class));
            assertTrue(list.contains(IE.class));
            assertTrue(list.contains(IF.class));
            assertTrue(list.contains(IA.class));
            assertEquals(null, ClassUtils.getAllInterfaces(null));
        	
        	// somehow the order of the interfaces differs
//           org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
//           object.test_getAllInterfaces_Class();
        }
    }

    @Test(timeout=120000)
    public void test_convertClassNamesToClasses_List() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_convertClassNamesToClasses_List();
        }
    }

    @Test(timeout=120000)
    public void test_convertClassesToClassNames_List() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_convertClassesToClassNames_List();
        }
    }

    @Test(timeout=120000)
    public void test_isInnerClass_Class() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_isInnerClass_Class();
        }
    }

    @Test(timeout=120000)
    public void test_isAssignable_ClassArray_ClassArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_isAssignable_ClassArray_ClassArray();
        }
    }

    @Test(timeout=120000)
    public void test_isAssignable_ClassArray_ClassArray_Autoboxing() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_isAssignable_ClassArray_ClassArray_Autoboxing();
        }
    }

    @Test(timeout=120000)
    public void test_isAssignable_ClassArray_ClassArray_NoAutoboxing() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_isAssignable_ClassArray_ClassArray_NoAutoboxing();
        }
    }

    @Test(timeout=120000)
    public void test_isAssignable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_isAssignable();
        }
    }

    @Test(timeout=120000)
    public void test_isAssignable_Autoboxing() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_isAssignable_Autoboxing();
        }
    }

    @Test(timeout=120000)
    public void test_isAssignable_NoAutoboxing() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_isAssignable_NoAutoboxing();
        }
    }

    @Test(timeout=120000)
    public void test_isAssignable_Widening() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_isAssignable_Widening();
        }
    }

    @Test(timeout=120000)
    public void test_isAssignable_DefaultUnboxing_Widening() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_isAssignable_DefaultUnboxing_Widening();
        }
    }

    @Test(timeout=120000)
    public void test_isAssignable_Unboxing_Widening() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_isAssignable_Unboxing_Widening();
        }
    }

    @Test(timeout=120000)
    public void testIsPrimitiveOrWrapper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testIsPrimitiveOrWrapper();
        }
    }

    @Test(timeout=120000)
    public void testIsPrimitiveWrapper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testIsPrimitiveWrapper();
        }
    }

    @Test(timeout=120000)
    public void testPrimitiveToWrapper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testPrimitiveToWrapper();
        }
    }

    @Test(timeout=120000)
    public void testPrimitivesToWrappers() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testPrimitivesToWrappers();
        }
    }

    @Test(timeout=120000)
    public void testWrapperToPrimitive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testWrapperToPrimitive();
        }
    }

    @Test(timeout=120000)
    public void testWrapperToPrimitiveNoWrapper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testWrapperToPrimitiveNoWrapper();
        }
    }

    @Test(timeout=120000)
    public void testWrapperToPrimitiveNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testWrapperToPrimitiveNull();
        }
    }

    @Test(timeout=120000)
    public void testWrappersToPrimitives() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testWrappersToPrimitives();
        }
    }

    @Test(timeout=120000)
    public void testWrappersToPrimitivesNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testWrappersToPrimitivesNull();
        }
    }

    @Test(timeout=120000)
    public void testWrappersToPrimitivesEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testWrappersToPrimitivesEmpty();
        }
    }

    @Test(timeout=120000)
    public void testGetClassClassNotFound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testGetClassClassNotFound();
        }
    }

    @Test(timeout=120000)
    public void testGetClassInvalidArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testGetClassInvalidArguments();
        }
    }

    @Test(timeout=120000)
    public void testWithInterleavingWhitespace() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testWithInterleavingWhitespace();
        }
    }

    @Test(timeout=120000)
    public void testGetInnerClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testGetInnerClass();
        }
    }

    @Test(timeout=120000)
    public void testGetClassByNormalNameArrays() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testGetClassByNormalNameArrays();
        }
    }

    @Test(timeout=120000)
    public void testGetClassByNormalNameArrays2D() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testGetClassByNormalNameArrays2D();
        }
    }

    @Test(timeout=120000)
    public void testGetClassWithArrayClasses2D() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testGetClassWithArrayClasses2D();
        }
    }

    @Test(timeout=120000)
    public void testGetClassWithArrayClasses() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testGetClassWithArrayClasses();
        }
    }

    @Test(timeout=120000)
    public void testGetClassRawPrimitives() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testGetClassRawPrimitives();
        }
    }

    @Ignore // bug does not appear
    @Test(timeout=120000)
    public void testShowJavaBug() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testShowJavaBug();
        }
    }

    @Test(timeout=120000)
    public void testGetPublicMethod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testGetPublicMethod();
        }
    }

    @Test(timeout=120000)
    public void testToClass_object() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.testToClass_object();
        }
    }

    @Test(timeout=120000)
    public void test_getShortCanonicalName_Object() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getShortCanonicalName_Object();
        }
    }

    @Test(timeout=120000)
    public void test_getShortCanonicalName_Class() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getShortCanonicalName_Class();
        }
    }

    @Test(timeout=120000)
    public void test_getShortCanonicalName_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getShortCanonicalName_String();
        }
    }

    @Test(timeout=120000)
    public void test_getPackageCanonicalName_Object() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getPackageCanonicalName_Object();
        }
    }

    @Test(timeout=120000)
    public void test_getPackageCanonicalName_Class() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getPackageCanonicalName_Class();
        }
    }

    @Test(timeout=120000)
    public void test_getPackageCanonicalName_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ClassUtilsTest object = new org.apache.commons.lang3.ClassUtilsTest();
               object.test_getPackageCanonicalName_String();
        }
    }

}