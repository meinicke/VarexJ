package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LocaleUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testIsAvailableLocale() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testIsAvailableLocale();
        }
    }

    @Test(timeout=10000)
    public void testLanguagesByCountry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testLanguagesByCountry();
        }
    }

    @Test(timeout=10000)
    public void testCountriesByLanguage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testCountriesByLanguage();
        }
    }

    @Test(timeout=10000)
    public void testLang328() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testLang328();
        }
    }

    @Test(timeout=10000)
    public void testLang865() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testLang865();
        }
    }

    @Test(timeout=10000)
    public void testParseAllLocales() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testParseAllLocales();
        }
    }

    @Test(timeout=10000)
    public void testToLocale_1Part() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testToLocale_1Part();
        }
    }

    @Test(timeout=10000)
    public void testToLocale_2Part() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testToLocale_2Part();
        }
    }

    @Test(timeout=10000)
    public void testToLocale_3Part() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testToLocale_3Part();
        }
    }

    @Test(timeout=10000)
    public void testLocaleLookupList_Locale() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testLocaleLookupList_Locale();
        }
    }

    @Test(timeout=10000)
    public void testLocaleLookupList_LocaleLocale() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testLocaleLookupList_LocaleLocale();
        }
    }

    @Test(timeout=10000)
    public void testAvailableLocaleList() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testAvailableLocaleList();
        }
    }

    @Test(timeout=10000)
    public void testAvailableLocaleSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testAvailableLocaleSet();
        }
    }

    @Test(timeout=10000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.LocaleUtilsTest object = new org.apache.commons.lang3.LocaleUtilsTest();
               object.setUp();
               object.testConstructor();
        }
    }

}