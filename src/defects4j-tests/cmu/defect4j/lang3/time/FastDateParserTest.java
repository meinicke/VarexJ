package cmu.defect4j.lang3.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
//FIXME
public class FastDateParserTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void test_Equality_Hash() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.test_Equality_Hash();
        }
    }

    @Test(timeout=120000)
    public void testParseZone() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testParseZone();
        }
    }

    @Test(timeout=120000)
    public void testParseLongShort() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testParseLongShort();
        }
    }

    @Test(timeout=120000)
    public void testAmPm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testAmPm();
        }
    }

    @Test(timeout=120000)
    public void testParses() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testParses();
        }
    }

    @Test(timeout=120000)
    public void testLocales_Long_AD() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLocales_Long_AD();
        }
    }

    @Test(timeout=120000)
    public void testLocales_Long_BC() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLocales_Long_BC();
        }
    }

    @Test(timeout=120000)
    public void testLocales_Short_AD() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLocales_Short_AD();
        }
    }

    @Test(timeout=120000)
    public void testLocales_Short_BC() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLocales_Short_BC();
        }
    }

    @Test(timeout=120000)
    public void testLocales_LongNoEra_AD() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLocales_LongNoEra_AD();
        }
    }

    @Test(timeout=120000)
    public void testLocales_LongNoEra_BC() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLocales_LongNoEra_BC();
        }
    }

    @Test(timeout=120000)
    public void testLocales_ShortNoEra_AD() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLocales_ShortNoEra_AD();
        }
    }

    @Test(timeout=120000)
    public void testLocales_ShortNoEra_BC() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLocales_ShortNoEra_BC();
        }
    }

    @Test(timeout=120000)
    public void testParseNumerics() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testParseNumerics();
        }
    }

    @Test(timeout=120000)
    public void testQuotes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testQuotes();
        }
    }

    @Test(timeout=120000)
    public void testSpecialCharacters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testSpecialCharacters();
        }
    }

    @Test(timeout=120000)
    public void testLANG_832() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLANG_832();
        }
    }

    @Test(timeout=120000)
    public void testLANG_831() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLANG_831();
        }
    }

    @Test(timeout=120000)
    public void testDayOf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testDayOf();
        }
    }

    @Test(timeout=120000)
    public void testShortDateStyleWithLocales() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testShortDateStyleWithLocales();
        }
    }

    @Test(timeout=120000)
    public void testLowYearPadding() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLowYearPadding();
        }
    }

    @Test(timeout=120000)
    public void testMilleniumBug() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testMilleniumBug();
        }
    }

    @Test(timeout=120000)
    public void testLang303() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLang303();
        }
    }

    @Test(timeout=120000)
    public void testLang538() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLang538();
        }
    }

    @Test(timeout=120000)
    public void testToStringContainsName() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testToStringContainsName();
        }
    }

    @Test(timeout=120000)
    public void testPatternMatches() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testPatternMatches();
        }
    }

    @Test(timeout=120000)
    public void testLocaleMatches() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testLocaleMatches();
        }
    }

    @Test(timeout=120000)
    public void testTimeZoneMatches() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.time.FastDateParserTest object = new org.apache.commons.lang3.time.FastDateParserTest();
               object.testTimeZoneMatches();
        }
    }

}