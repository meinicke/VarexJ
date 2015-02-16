package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CharRangeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testHashCode();
        }
    }

    @Test(timeout=120000)
    public void testClass() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testClass();
        }
    }

    @Test(timeout=120000)
    public void testConstructorAccessors_is() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testConstructorAccessors_is();
        }
    }

    @Test(timeout=120000)
    public void testConstructorAccessors_isNot() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testConstructorAccessors_isNot();
        }
    }

    @Test(timeout=120000)
    public void testConstructorAccessors_isIn_Same() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testConstructorAccessors_isIn_Same();
        }
    }

    @Test(timeout=120000)
    public void testConstructorAccessors_isIn_Normal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testConstructorAccessors_isIn_Normal();
        }
    }

    @Test(timeout=120000)
    public void testConstructorAccessors_isIn_Reversed() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testConstructorAccessors_isIn_Reversed();
        }
    }

    @Test(timeout=120000)
    public void testConstructorAccessors_isNotIn_Same() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testConstructorAccessors_isNotIn_Same();
        }
    }

    @Test(timeout=120000)
    public void testConstructorAccessors_isNotIn_Normal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testConstructorAccessors_isNotIn_Normal();
        }
    }

    @Test(timeout=120000)
    public void testConstructorAccessors_isNotIn_Reversed() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testConstructorAccessors_isNotIn_Reversed();
        }
    }

    @Test(timeout=120000)
    public void testEquals_Object() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testEquals_Object();
        }
    }

    @Test(timeout=120000)
    public void testContains_Char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testContains_Char();
        }
    }

    @Test(timeout=120000)
    public void testContains_Charrange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testContains_Charrange();
        }
    }

    @Test(timeout=120000)
    public void testContainsNullArg() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testContainsNullArg();
        }
    }

    @Test(timeout=120000)
    public void testIterator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testIterator();
        }
    }

    @Test(timeout=120000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.CharRangeTest object = new org.apache.commons.lang3.CharRangeTest();
               object.testSerialization();
        }
    }

}