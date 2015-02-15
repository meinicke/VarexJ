package cmu.defect4j.lang3;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StringEscapeUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testConstructor();
        }
    }

    @Test(timeout=10000)
    public void testEscapeJava() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeJava();
        }
    }

    @Test(timeout=10000)
    public void testEscapeJavaWithSlash() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeJavaWithSlash();
        }
    }

    @Test(timeout=10000)
    public void testUnescapeJava() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testUnescapeJava();
        }
    }

    @Test(timeout=10000)
    public void testEscapeEcmaScript() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeEcmaScript();
        }
    }

    @Test(timeout=10000)
    public void testEscapeHtml() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeHtml();
        }
    }

    @Test(timeout=10000)
    public void testUnescapeHtml4() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testUnescapeHtml4();
        }
    }

    @Test(timeout=10000)
    public void testUnescapeHexCharsHtml() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testUnescapeHexCharsHtml();
        }
    }

    @Test(timeout=10000)
    public void testUnescapeUnknownEntity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testUnescapeUnknownEntity();
        }
    }

    @Test(timeout=10000)
    public void testEscapeHtmlVersions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeHtmlVersions();
        }
    }

    @Test(timeout=10000)
    public void testEscapeXml() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeXml();
        }
    }

    @Test(timeout=10000)
    public void testEscapeXmlSupplementaryCharacters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeXmlSupplementaryCharacters();
        }
    }

    @Test(timeout=10000)
    public void testEscapeXmlAllCharacters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeXmlAllCharacters();
        }
    }

    @Test(timeout=10000)
    public void testUnescapeXmlSupplementaryCharacters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testUnescapeXmlSupplementaryCharacters();
        }
    }

    @Test(timeout=10000)
    public void testStandaloneAmphersand() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testStandaloneAmphersand();
        }
    }

    @Test(timeout=10000)
    public void testLang313() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testLang313();
        }
    }

    @Test(timeout=10000)
    public void testEscapeCsvString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeCsvString();
        }
    }

    @Test(timeout=10000)
    public void testEscapeCsvWriter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeCsvWriter();
        }
    }

    @Test(timeout=10000)
    public void testUnescapeCsvString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testUnescapeCsvString();
        }
    }

    @Test(timeout=10000)
    public void testUnescapeCsvWriter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testUnescapeCsvWriter();
        }
    }

    @Test(timeout=10000)
    public void testEscapeHtmlHighUnicode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeHtmlHighUnicode();
        }
    }

    @Test(timeout=10000)
    public void testEscapeHiragana() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeHiragana();
        }
    }

    @Test(timeout=10000)
    public void testLang708() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testLang708();
        }
    }

    @Test(timeout=10000)
    public void testLang720() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testLang720();
        }
    }

    @Test(timeout=10000)
    public void testEscapeJson() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.StringEscapeUtilsTest object = new org.apache.commons.lang3.StringEscapeUtilsTest();
               object.testEscapeJson();
        }
    }

}