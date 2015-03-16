package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ValidateTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void testNotEmptyString1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotEmptyString1();
        }
    }

    @Test(timeout=120000)
    public void testNotEmptyString2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotEmptyString2();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankNullStringShouldThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankNullStringShouldThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankMsgNullStringShouldThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankMsgNullStringShouldThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankEmptyStringShouldThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankEmptyStringShouldThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankBlankStringWithWhitespacesShouldThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankBlankStringWithWhitespacesShouldThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankBlankStringWithNewlinesShouldThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankBlankStringWithNewlinesShouldThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankMsgBlankStringShouldThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankMsgBlankStringShouldThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankMsgBlankStringWithWhitespacesShouldThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankMsgBlankStringWithWhitespacesShouldThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankMsgEmptyStringShouldThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankMsgEmptyStringShouldThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankNotBlankStringShouldNotThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankNotBlankStringShouldNotThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankNotBlankStringWithNewlinesShouldNotThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankNotBlankStringWithNewlinesShouldNotThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankMsgNotBlankStringShouldNotThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankMsgNotBlankStringShouldNotThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankMsgNotBlankStringWithWhitespacesShouldNotThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankMsgNotBlankStringWithWhitespacesShouldNotThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankMsgNotBlankStringWithNewlinesShouldNotThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankMsgNotBlankStringWithNewlinesShouldNotThrow();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankReturnValues1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankReturnValues1();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankReturnValues2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankReturnValues2();
        }
    }

    @Test(timeout=120000)
    public void testNoNullElementsArray1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNoNullElementsArray1();
        }
    }

    @Test(timeout=120000)
    public void testNoNullElementsArray2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNoNullElementsArray2();
        }
    }

    @Test(timeout=120000)
    public void testNoNullElementsCollection1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNoNullElementsCollection1();
        }
    }

    @Test(timeout=120000)
    public void testNoNullElementsCollection2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNoNullElementsCollection2();
        }
    }

    @Test(timeout=120000)
    public void testValidIndex_withMessage_array() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testValidIndex_withMessage_array();
        }
    }

    @Test(timeout=120000)
    public void testValidIndex_array() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testValidIndex_array();
        }
    }

    @Test(timeout=120000)
    public void testValidIndex_withMessage_collection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testValidIndex_withMessage_collection();
        }
    }

    @Test(timeout=120000)
    public void testValidIndex_collection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testValidIndex_collection();
        }
    }

    @Test(timeout=120000)
    public void testValidIndex_withMessage_charSequence() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testValidIndex_withMessage_charSequence();
        }
    }

    @Test(timeout=120000)
    public void testValidIndex_charSequence() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testValidIndex_charSequence();
        }
    }

    @Test(timeout=120000)
    public void testMatchesPattern() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testMatchesPattern();
        }
    }

    @Test(timeout=120000)
    public void testMatchesPattern_withMessage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testMatchesPattern_withMessage();
        }
    }

    @Test(timeout=120000)
    public void testInclusiveBetween() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testInclusiveBetween();
        }
    }

    @Test(timeout=120000)
    public void testInclusiveBetween_withMessage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testInclusiveBetween_withMessage();
        }
    }

    @Test(timeout=120000)
    public void testExclusiveBetween() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testExclusiveBetween();
        }
    }

    @Test(timeout=120000)
    public void testExclusiveBetween_withMessage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testExclusiveBetween_withMessage();
        }
    }

    @Test(timeout=120000)
    public void testIsInstanceOf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testIsInstanceOf();
        }
    }

    @Test(timeout=120000)
    public void testIsInstanceOfExceptionMessage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testIsInstanceOfExceptionMessage();
        }
    }

    @Test(timeout=120000)
    public void testIsInstanceOf_withMessage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testIsInstanceOf_withMessage();
        }
    }

    @Test(timeout=120000)
    public void testIsAssignableExceptionMessage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testIsAssignableExceptionMessage();
        }
    }

    @Test(timeout=120000)
    public void testIsAssignable_withMessage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testIsAssignable_withMessage();
        }
    }

    @Test(timeout=120000)
    public void testIsTrue4() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testIsTrue4();
        }
    }

    @Test(timeout=120000)
    public void testIsTrue5() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testIsTrue5();
        }
    }

    @Test(timeout=120000)
    public void testNotNull1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotNull1();
        }
    }

    @Test(timeout=120000)
    public void testNotNull2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotNull2();
        }
    }

    @Test(timeout=120000)
    public void testNotEmptyArray1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotEmptyArray1();
        }
    }

    @Test(timeout=120000)
    public void testNotEmptyArray2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotEmptyArray2();
        }
    }

    @Test(timeout=120000)
    public void testNotEmptyCollection1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotEmptyCollection1();
        }
    }

    @Test(timeout=120000)
    public void testNotEmptyCollection2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotEmptyCollection2();
        }
    }

    @Test(timeout=120000)
    public void testNotEmptyMap1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotEmptyMap1();
        }
    }

    @Test(timeout=120000)
    public void testNotEmptyMap2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotEmptyMap2();
        }
    }

    @Test(timeout=120000)
    public void testIsTrue1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testIsTrue1();
        }
    }

    @Test(timeout=120000)
    public void testIsTrue2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testIsTrue2();
        }
    }

    @Test(timeout=120000)
    public void testIsTrue3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testIsTrue3();
        }
    }

    @Test(timeout=120000)
    public void testNotBlankNotBlankStringWithWhitespacesShouldNotThrow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testNotBlankNotBlankStringWithWhitespacesShouldNotThrow();
        }
    }

    @Test(timeout=120000)
    public void testIsAssignable() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.ValidateTest object = new org.apache.commons.lang3.ValidateTest();
               object.testIsAssignable();
        }
    }

}