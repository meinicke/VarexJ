package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class RangeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testHashCode();
        }
    }

    @Test(timeout=10000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testToString();
        }
    }

    @Test(timeout=10000)
    public void testContains() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testContains();
        }
    }

    @Test(timeout=10000)
    public void testComparableConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testComparableConstructors();
        }
    }

    @Test(timeout=10000)
    public void testIsWithCompare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testIsWithCompare();
        }
    }

    @Test(timeout=10000)
    public void testBetweenWithCompare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testBetweenWithCompare();
        }
    }

    @Test(timeout=10000)
    public void testRangeOfChars() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testRangeOfChars();
        }
    }

    @Test(timeout=10000)
    public void testEqualsObject() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testEqualsObject();
        }
    }

    @Test(timeout=10000)
    public void testToStringFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testToStringFormat();
        }
    }

    @Test(timeout=10000)
    public void testGetMinimum() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testGetMinimum();
        }
    }

    @Test(timeout=10000)
    public void testGetMaximum() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testGetMaximum();
        }
    }

    @Test(timeout=10000)
    public void testIsAfter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testIsAfter();
        }
    }

    @Test(timeout=10000)
    public void testIsStartedBy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testIsStartedBy();
        }
    }

    @Test(timeout=10000)
    public void testIsEndedBy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testIsEndedBy();
        }
    }

    @Test(timeout=10000)
    public void testIsBefore() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testIsBefore();
        }
    }

    @Test(timeout=10000)
    public void testElementCompareTo() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testElementCompareTo();
        }
    }

    @Test(timeout=10000)
    public void testContainsRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testContainsRange();
        }
    }

    @Test(timeout=10000)
    public void testIsAfterRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testIsAfterRange();
        }
    }

    @Test(timeout=10000)
    public void testIsOverlappedBy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testIsOverlappedBy();
        }
    }

    @Test(timeout=10000)
    public void testIsBeforeRange() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testIsBeforeRange();
        }
    }

    @Test(timeout=10000)
    public void testIntersectionWith() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testIntersectionWith();
        }
    }

    @Test(timeout=10000)
    public void testIntersectionWithNull() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testIntersectionWithNull();
        }
    }

    @Test(timeout=10000)
    public void testIntersectionWithNonOverlapping() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testIntersectionWithNonOverlapping();
        }
    }

    @Test(timeout=10000)
    public void testSerializing() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.RangeTest object = new org.apache.commons.lang3.RangeTest();
               object.setUp();
               object.testSerializing();
        }
    }

}