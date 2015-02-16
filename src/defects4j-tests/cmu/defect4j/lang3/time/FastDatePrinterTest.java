package cmu.defect4j.lang3.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FastDatePrinterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testFormat() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testFormat();
        }
    }

    @Test(timeout=120000)
    public void testSimpleDate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testSimpleDate();
        }
    }

    @Test(timeout=120000)
    public void testLang645() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testLang645();
        }
    }

    @Test(timeout=120000)
    public void testShortDateStyleWithLocales() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testShortDateStyleWithLocales();
        }
    }

    @Test(timeout=120000)
    public void testLowYearPadding() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testLowYearPadding();
        }
    }

    @Test(timeout=120000)
    public void testMilleniumBug() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testMilleniumBug();
        }
    }

    @Test(timeout=120000)
    public void testLang303() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testLang303();
        }
    }

    @Test(timeout=120000)
    public void testLang538() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testLang538();
        }
    }

    @Test(timeout=120000)
    public void testToStringContainsName() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testToStringContainsName();
        }
    }

    @Test(timeout=120000)
    public void testPatternMatches() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testPatternMatches();
        }
    }

    @Test(timeout=120000)
    public void testLocaleMatches() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testLocaleMatches();
        }
    }

    @Test(timeout=120000)
    public void testTimeZoneMatches() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testTimeZoneMatches();
        }
    }

    @Test(timeout=120000)
    public void testCalendarTimezoneRespected() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDatePrinterTest object = new org.apache.commons.lang3.time.FastDatePrinterTest();
               object.testCalendarTimezoneRespected();
        }
    }

}