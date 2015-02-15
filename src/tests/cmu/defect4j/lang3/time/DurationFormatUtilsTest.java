package cmu.defect4j.lang3.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DurationFormatUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testFormatDurationHMS() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testFormatDurationHMS();
        }
    }

    @Test(timeout=10000)
    public void testFormatDurationISO() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testFormatDurationISO();
        }
    }

    @Test(timeout=10000)
    public void testFormatDuration() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testFormatDuration();
        }
    }

    @Test(timeout=10000)
    public void testFormatPeriodISO() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testFormatPeriodISO();
        }
    }

    @Test(timeout=10000)
    public void testFormatPeriod() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testFormatPeriod();
        }
    }

    @Test(timeout=10000)
    public void testLexx() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testLexx();
        }
    }

    @Test(timeout=10000)
    public void testBugzilla38401() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testBugzilla38401();
        }
    }

    @Test(timeout=10000)
    public void testJiraLang281() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testJiraLang281();
        }
    }

    @Test(timeout=10000)
    public void testLANG815() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testLANG815();
        }
    }

    @Test(timeout=10000)
    public void testLowDurations() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testLowDurations();
        }
    }

    @Test(timeout=10000)
    public void testEdgeDurations() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testEdgeDurations();
        }
    }

    @Test(timeout=10000)
    public void testDurationsByBruteForce() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testDurationsByBruteForce();
        }
    }

    @Test(timeout=10000)
    public void testFormatDurationWords() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testFormatDurationWords();
        }
    }

    @Test(timeout=10000)
    public void testFormatDurationPluralWords() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testFormatDurationPluralWords();
        }
    }

    @Test(timeout=10000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.DurationFormatUtilsTest object = new org.apache.commons.lang3.time.DurationFormatUtilsTest();
               object.testConstructor();
        }
    }

}