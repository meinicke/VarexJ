package cmu.defect4j.lang3.text;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StrMatcherTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testCommaMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testCommaMatcher();
        }
    }

    @Test(timeout=120000)
    public void testTabMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testTabMatcher();
        }
    }

    @Test(timeout=120000)
    public void testSpaceMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testSpaceMatcher();
        }
    }

    @Test(timeout=120000)
    public void testSplitMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testSplitMatcher();
        }
    }

    @Test(timeout=120000)
    public void testTrimMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testTrimMatcher();
        }
    }

    @Test(timeout=120000)
    public void testSingleQuoteMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testSingleQuoteMatcher();
        }
    }

    @Test(timeout=120000)
    public void testDoubleQuoteMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testDoubleQuoteMatcher();
        }
    }

    @Test(timeout=120000)
    public void testQuoteMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testQuoteMatcher();
        }
    }

    @Test(timeout=120000)
    public void testNoneMatcher() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testNoneMatcher();
        }
    }

    @Test(timeout=120000)
    public void testCharMatcher_char() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testCharMatcher_char();
        }
    }

    @Test(timeout=120000)
    public void testCharSetMatcher_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testCharSetMatcher_String();
        }
    }

    @Test(timeout=120000)
    public void testCharSetMatcher_charArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testCharSetMatcher_charArray();
        }
    }

    @Test(timeout=120000)
    public void testStringMatcher_String() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testStringMatcher_String();
        }
    }

    @Test(timeout=120000)
    public void testMatcherIndices() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.text.StrMatcherTest object = new org.apache.commons.lang3.text.StrMatcherTest();
               object.testMatcherIndices();
        }
    }

}