package cmu.defect4j.lang3.math;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FractionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testHashCode();
        }
    }

    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testConstants() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testConstants();
        }
    }

    @Test(timeout=120000)
    public void testFactory_int_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testFactory_int_int();
        }
    }

    @Test(timeout=120000)
    public void testFactory_int_int_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testFactory_int_int_int();
        }
    }

    @Test(timeout=120000)
    public void testReducedFactory_int_int() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testReducedFactory_int_int();
        }
    }

    @Test(timeout=120000)
    public void testFactory_double() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testFactory_double();
        }
    }

    @Test(timeout=120000)
    public void testFactory_String() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testFactory_String();
        }
    }

    @Test(timeout=120000)
    public void testFactory_String_double() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testFactory_String_double();
        }
    }

    @Test(timeout=120000)
    public void testFactory_String_proper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testFactory_String_proper();
        }
    }

    @Test(timeout=120000)
    public void testFactory_String_improper() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testFactory_String_improper();
        }
    }

    @Test(timeout=120000)
    public void testGets() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testGets();
        }
    }

    @Test(timeout=120000)
    public void testConversions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testConversions();
        }
    }

    @Test(timeout=120000)
    public void testReduce() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testReduce();
        }
    }

    @Test(timeout=120000)
    public void testInvert() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testInvert();
        }
    }

    @Test(timeout=120000)
    public void testNegate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testNegate();
        }
    }

    @Test(timeout=120000)
    public void testAbs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testAbs();
        }
    }

    @Test(timeout=120000)
    public void testPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testPow();
        }
    }

    @Test(timeout=120000)
    public void testAdd() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testAdd();
        }
    }

    @Test(timeout=120000)
    public void testSubtract() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testSubtract();
        }
    }

    @Test(timeout=120000)
    public void testMultiply() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testMultiply();
        }
    }

    @Test(timeout=120000)
    public void testDivide() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testDivide();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testCompareTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testCompareTo();
        }
    }

    @Test(timeout=120000)
    public void testToProperString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.math.FractionTest object = new org.apache.commons.lang3.math.FractionTest();
               object.testToProperString();
        }
    }

}