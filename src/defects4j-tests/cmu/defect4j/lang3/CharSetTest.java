package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CharSetTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testHashCode();
        }
    }

    @Test(timeout=120000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testSerialization();
        }
    }

    @Test(timeout=120000)
    public void testGetInstance_Stringarray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testGetInstance_Stringarray();
        }
    }

    @Test(timeout=120000)
    public void testConstructor_String_simple() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testConstructor_String_simple();
        }
    }

    @Test(timeout=120000)
    public void testConstructor_String_combo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testConstructor_String_combo();
        }
    }

    @Test(timeout=120000)
    public void testConstructor_String_comboNegated() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testConstructor_String_comboNegated();
        }
    }

    @Test(timeout=120000)
    public void testConstructor_String_oddDash() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testConstructor_String_oddDash();
        }
    }

    @Test(timeout=120000)
    public void testConstructor_String_oddNegate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testConstructor_String_oddNegate();
        }
    }

    @Test(timeout=120000)
    public void testConstructor_String_oddCombinations() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testConstructor_String_oddCombinations();
        }
    }

    @Test(timeout=120000)
    public void testEquals_Object() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testEquals_Object();
        }
    }

    @Test(timeout=120000)
    public void testContains_Char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testContains_Char();
        }
    }

    @Test(timeout=120000)
    public void testClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testClass();
        }
    }

    @Test(timeout=120000)
    public void testStatics() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testStatics();
        }
    }

    @Test(timeout=120000)
    public void testGetInstance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharSetTest object = new org.apache.commons.lang3.CharSetTest();
               object.testGetInstance();
        }
    }

}