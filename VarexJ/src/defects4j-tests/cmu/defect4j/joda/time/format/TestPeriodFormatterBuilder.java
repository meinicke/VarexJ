package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestPeriodFormatterBuilder extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testToFormatterPrinterParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testToFormatterPrinterParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatYears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatYears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatMonths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSecondsWithMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSecondsWithMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSecondsWithOptionalMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSecondsWithOptionalMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatMillis3Digit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatMillis3Digit");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrefixSimple1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrefixSimple1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrefixSimple2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrefixSimple2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrefixSimple3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrefixSimple3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrefixPlural1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrefixPlural1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrefixPlural2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrefixPlural2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrefixPlural3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrefixPlural3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSuffixSimple1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSuffixSimple1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSuffixSimple2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSuffixSimple2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSuffixSimple3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSuffixSimple3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSuffixSimple4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSuffixSimple4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSuffixPlural1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSuffixPlural1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSuffixPlural2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSuffixPlural2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSuffixPlural3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSuffixPlural3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSuffixPlural4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSuffixPlural4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrefixSuffix() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrefixSuffix");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSeparatorSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSeparatorSimple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSeparatorComplex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSeparatorComplex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSeparatorIfFieldsAfter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSeparatorIfFieldsAfter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatSeparatorIfFieldsBefore() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatSeparatorIfFieldsBefore");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatLiteral");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatAppendFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatAppendFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatMinDigits() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatMinDigits");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroDefault");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroRarelyLast() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroRarelyLast");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroRarelyFirst() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroRarelyFirst");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroRarelyFirstYears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroRarelyFirstYears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroRarelyFirstMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroRarelyFirstMonths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroRarelyFirstWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroRarelyFirstWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroRarelyFirstDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroRarelyFirstDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroRarelyFirstHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroRarelyFirstHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroRarelyFirstMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroRarelyFirstMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroRarelyFirstSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroRarelyFirstSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroIfSupported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroIfSupported");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroAlways() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroAlways");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatPrintZeroNever() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatPrintZeroNever");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatAppend_PrinterParser_null_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatAppend_PrinterParser_null_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatAppend_PrinterParser_Printer_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatAppend_PrinterParser_Printer_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatAppend_PrinterParser_null_Parser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatAppend_PrinterParser_null_Parser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatAppend_PrinterParser_PrinterParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatAppend_PrinterParser_PrinterParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatAppend_PrinterParser_Printer_null_null_Parser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatAppend_PrinterParser_Printer_null_null_Parser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatAppend_PrinterParserThenClear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testFormatAppend_PrinterParserThenClear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2495455() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormatterBuilder("testBug2495455");
			testcase.run();
		}
	}

}