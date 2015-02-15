package cmu.defect4j.lang3.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FastDateFormat_PrinterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testFormat();
        }
    }

    @Test(timeout=10000)
    public void testSimpleDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testSimpleDate();
        }
    }

    @Test(timeout=10000)
    public void testLang645() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testLang645();
        }
    }

    @Test(timeout=10000)
    public void testCalendarTimezoneRespected() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testCalendarTimezoneRespected();
        }
    }

    @Test(timeout=10000)
    public void testShortDateStyleWithLocales() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testShortDateStyleWithLocales();
        }
    }

    @Test(timeout=10000)
    public void testLowYearPadding() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testLowYearPadding();
        }
    }

    @Test(timeout=10000)
    public void testMilleniumBug() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testMilleniumBug();
        }
    }

    @Test(timeout=10000)
    public void testLang303() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testLang303();
        }
    }

    @Test(timeout=10000)
    public void testLang538() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testLang538();
        }
    }

    @Test(timeout=10000)
    public void testToStringContainsName() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testToStringContainsName();
        }
    }

    @Test(timeout=10000)
    public void testPatternMatches() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testPatternMatches();
        }
    }

    @Test(timeout=10000)
    public void testLocaleMatches() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testLocaleMatches();
        }
    }

    @Test(timeout=10000)
    public void testTimeZoneMatches() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testTimeZoneMatches();
        }
    }

    @Test(timeout=10000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateFormat_PrinterTest object = new org.apache.commons.lang3.time.FastDateFormat_PrinterTest();
               object.testEquals();
        }
    }

}