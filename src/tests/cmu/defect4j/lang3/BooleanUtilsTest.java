package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class BooleanUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testConstructor();
        }
    }

    @Test(timeout=10000)
    public void test_negate_Boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_negate_Boolean();
        }
    }

    @Test(timeout=10000)
    public void test_isTrue_Boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_isTrue_Boolean();
        }
    }

    @Test(timeout=10000)
    public void test_isNotTrue_Boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_isNotTrue_Boolean();
        }
    }

    @Test(timeout=10000)
    public void test_isFalse_Boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_isFalse_Boolean();
        }
    }

    @Test(timeout=10000)
    public void test_isNotFalse_Boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_isNotFalse_Boolean();
        }
    }

    @Test(timeout=10000)
    public void test_toBoolean_Boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBoolean_Boolean();
        }
    }

    @Test(timeout=10000)
    public void test_toBooleanDefaultIfNull_Boolean_boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBooleanDefaultIfNull_Boolean_boolean();
        }
    }

    @Test(timeout=10000)
    public void test_toBoolean_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBoolean_int();
        }
    }

    @Test(timeout=10000)
    public void test_toBooleanObject_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBooleanObject_int();
        }
    }

    @Test(timeout=10000)
    public void test_toBooleanObject_Integer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBooleanObject_Integer();
        }
    }

    @Test(timeout=10000)
    public void test_toBoolean_int_int_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBoolean_int_int_int();
        }
    }

    @Test(timeout=10000)
    public void test_toBoolean_int_int_int_noMatch() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBoolean_int_int_int_noMatch();
        }
    }

    @Test(timeout=10000)
    public void test_toBoolean_Integer_Integer_Integer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBoolean_Integer_Integer_Integer();
        }
    }

    @Test(timeout=10000)
    public void test_toBoolean_Integer_Integer_Integer_nullValue() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBoolean_Integer_Integer_Integer_nullValue();
        }
    }

    @Test(timeout=10000)
    public void test_toBoolean_Integer_Integer_Integer_noMatch() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBoolean_Integer_Integer_Integer_noMatch();
        }
    }

    @Test(timeout=10000)
    public void test_toBooleanObject_int_int_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBooleanObject_int_int_int();
        }
    }

    @Test(timeout=10000)
    public void test_toBooleanObject_int_int_int_noMatch() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBooleanObject_int_int_int_noMatch();
        }
    }

    @Test(timeout=10000)
    public void test_toBooleanObject_Integer_Integer_Integer_Integer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBooleanObject_Integer_Integer_Integer_Integer();
        }
    }

    @Test(timeout=10000)
    public void test_toBooleanObject_Integer_Integer_Integer_Integer_nullValue() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBooleanObject_Integer_Integer_Integer_Integer_nullValue();
        }
    }

    @Test(timeout=10000)
    public void test_toBooleanObject_Integer_Integer_Integer_Integer_noMatch() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBooleanObject_Integer_Integer_Integer_Integer_noMatch();
        }
    }

    @Test(timeout=10000)
    public void test_toInteger_boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toInteger_boolean();
        }
    }

    @Test(timeout=10000)
    public void test_toIntegerObject_boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toIntegerObject_boolean();
        }
    }

    @Test(timeout=10000)
    public void test_toIntegerObject_Boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toIntegerObject_Boolean();
        }
    }

    @Test(timeout=10000)
    public void test_toInteger_boolean_int_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toInteger_boolean_int_int();
        }
    }

    @Test(timeout=10000)
    public void test_toInteger_Boolean_int_int_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toInteger_Boolean_int_int_int();
        }
    }

    @Test(timeout=10000)
    public void test_toIntegerObject_boolean_Integer_Integer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toIntegerObject_boolean_Integer_Integer();
        }
    }

    @Test(timeout=10000)
    public void test_toIntegerObject_Boolean_Integer_Integer_Integer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toIntegerObject_Boolean_Integer_Integer_Integer();
        }
    }

    @Test(timeout=10000)
    public void test_toBooleanObject_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBooleanObject_String();
        }
    }

    @Test(timeout=10000)
    public void test_toBooleanObject_String_String_String_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBooleanObject_String_String_String_String();
        }
    }

    @Test(timeout=10000)
    public void test_toBooleanObject_String_String_String_String_nullValue() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBooleanObject_String_String_String_String_nullValue();
        }
    }

    @Test(timeout=10000)
    public void test_toBooleanObject_String_String_String_String_noMatch() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBooleanObject_String_String_String_String_noMatch();
        }
    }

    @Test(timeout=10000)
    public void test_toBoolean_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBoolean_String();
        }
    }

    @Test(timeout=10000)
    public void test_toBoolean_String_String_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBoolean_String_String_String();
        }
    }

    @Test(timeout=10000)
    public void test_toBoolean_String_String_String_nullValue() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBoolean_String_String_String_nullValue();
        }
    }

    @Test(timeout=10000)
    public void test_toBoolean_String_String_String_noMatch() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toBoolean_String_String_String_noMatch();
        }
    }

    @Test(timeout=10000)
    public void test_toStringTrueFalse_Boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toStringTrueFalse_Boolean();
        }
    }

    @Test(timeout=10000)
    public void test_toStringOnOff_Boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toStringOnOff_Boolean();
        }
    }

    @Test(timeout=10000)
    public void test_toStringYesNo_Boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toStringYesNo_Boolean();
        }
    }

    @Test(timeout=10000)
    public void test_toString_Boolean_String_String_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toString_Boolean_String_String_String();
        }
    }

    @Test(timeout=10000)
    public void test_toStringTrueFalse_boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toStringTrueFalse_boolean();
        }
    }

    @Test(timeout=10000)
    public void test_toStringOnOff_boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toStringOnOff_boolean();
        }
    }

    @Test(timeout=10000)
    public void test_toStringYesNo_boolean() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toStringYesNo_boolean();
        }
    }

    @Test(timeout=10000)
    public void test_toString_boolean_String_String_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.test_toString_boolean_String_String_String();
        }
    }

    @Test(timeout=10000)
    public void testXor_primitive_nullInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testXor_primitive_nullInput();
        }
    }

    @Test(timeout=10000)
    public void testXor_primitive_emptyInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testXor_primitive_emptyInput();
        }
    }

    @Test(timeout=10000)
    public void testXor_primitive_validInput_2items() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testXor_primitive_validInput_2items();
        }
    }

    @Test(timeout=10000)
    public void testXor_primitive_validInput_3items() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testXor_primitive_validInput_3items();
        }
    }

    @Test(timeout=10000)
    public void testXor_object_nullInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testXor_object_nullInput();
        }
    }

    @Test(timeout=10000)
    public void testXor_object_emptyInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testXor_object_emptyInput();
        }
    }

    @Test(timeout=10000)
    public void testXor_object_nullElementInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testXor_object_nullElementInput();
        }
    }

    @Test(timeout=10000)
    public void testXor_object_validInput_2items() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testXor_object_validInput_2items();
        }
    }

    @Test(timeout=10000)
    public void testXor_object_validInput_3items() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testXor_object_validInput_3items();
        }
    }

    @Test(timeout=10000)
    public void testAnd_primitive_nullInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testAnd_primitive_nullInput();
        }
    }

    @Test(timeout=10000)
    public void testAnd_primitive_emptyInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testAnd_primitive_emptyInput();
        }
    }

    @Test(timeout=10000)
    public void testAnd_primitive_validInput_2items() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testAnd_primitive_validInput_2items();
        }
    }

    @Test(timeout=10000)
    public void testAnd_primitive_validInput_3items() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testAnd_primitive_validInput_3items();
        }
    }

    @Test(timeout=10000)
    public void testAnd_object_nullInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testAnd_object_nullInput();
        }
    }

    @Test(timeout=10000)
    public void testAnd_object_emptyInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testAnd_object_emptyInput();
        }
    }

    @Test(timeout=10000)
    public void testAnd_object_nullElementInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testAnd_object_nullElementInput();
        }
    }

    @Test(timeout=10000)
    public void testAnd_object_validInput_2items() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testAnd_object_validInput_2items();
        }
    }

    @Test(timeout=10000)
    public void testAnd_object_validInput_3items() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testAnd_object_validInput_3items();
        }
    }

    @Test(timeout=10000)
    public void testOr_primitive_nullInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testOr_primitive_nullInput();
        }
    }

    @Test(timeout=10000)
    public void testOr_primitive_emptyInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testOr_primitive_emptyInput();
        }
    }

    @Test(timeout=10000)
    public void testOr_primitive_validInput_2items() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testOr_primitive_validInput_2items();
        }
    }

    @Test(timeout=10000)
    public void testOr_primitive_validInput_3items() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testOr_primitive_validInput_3items();
        }
    }

    @Test(timeout=10000)
    public void testOr_object_nullInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testOr_object_nullInput();
        }
    }

    @Test(timeout=10000)
    public void testOr_object_emptyInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testOr_object_emptyInput();
        }
    }

    @Test(timeout=10000)
    public void testOr_object_nullElementInput() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testOr_object_nullElementInput();
        }
    }

    @Test(timeout=10000)
    public void testOr_object_validInput_2items() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testOr_object_validInput_2items();
        }
    }

    @Test(timeout=10000)
    public void testOr_object_validInput_3items() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.BooleanUtilsTest object = new org.apache.commons.lang3.BooleanUtilsTest();
               object.testOr_object_validInput_3items();
        }
    }

}