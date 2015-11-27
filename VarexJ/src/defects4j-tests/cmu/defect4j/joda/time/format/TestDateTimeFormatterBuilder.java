package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateTimeFormatterBuilder extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void test_appendFixedSignedDecimal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_appendFixedSignedDecimal");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_appendTimeZoneId() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_appendTimeZoneId");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_printParseZoneTokyo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_printParseZoneTokyo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_printParseZoneParis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_printParseZoneParis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_printParseZoneDawsonCreek() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_printParseZoneDawsonCreek");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_printParseZoneBahiaBanderas() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_printParseZoneBahiaBanderas");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_printParseOffset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_printParseOffset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_printParseOffsetAndZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_printParseOffsetAndZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_parseWrongOffset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_parseWrongOffset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_parseWrongOffsetAndZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_parseWrongOffsetAndZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_localPrintParseZoneTokyo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_localPrintParseZoneTokyo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_localPrintParseOffset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_localPrintParseOffset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_localPrintParseOffsetAndZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_localPrintParseOffsetAndZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_localParseWrongOffsetAndZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_localParseWrongOffsetAndZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_printParseShortName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_printParseShortName");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_printParseShortNameWithLookup() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_printParseShortNameWithLookup");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_printParseShortNameWithAutoLookup() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_printParseShortNameWithAutoLookup");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_printParseLongName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_printParseLongName");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_printParseLongNameWithLookup() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_printParseLongNameWithLookup");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_toFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_toFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_toPrinter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_toPrinter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_toParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_toParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_canBuildPrinter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_canBuildPrinter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_canBuildFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_canBuildFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_canBuildParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_canBuildParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_append_Formatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_append_Formatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_append_Printer() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_append_Printer");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_append_nullPrinter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_append_nullPrinter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_append_Parser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_append_Parser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_append_nullParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_append_nullParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_append_Printer_nullParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_append_Printer_nullParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_append_nullPrinter_Parser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_append_nullPrinter_Parser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_appendOptional_Parser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_appendOptional_Parser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_appendOptional_nullParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_appendOptional_nullParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_appendFixedDecimal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatterBuilder("test_appendFixedDecimal");
			testcase.run();
		}
	}

}