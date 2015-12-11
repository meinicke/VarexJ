package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMonthDay_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testIsSupported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testIsSupported");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testGet");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testCompareTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual_MD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testIsEqual_MD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_MD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testIsBefore_MD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_MD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testIsAfter_MD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronologyRetainFields_Chrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithChronologyRetainFields_Chrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronologyRetainFields_sameChrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithChronologyRetainFields_sameChrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronologyRetainFields_nullChrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithChronologyRetainFields_nullChrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_nullField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithField_nullField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_unknownField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithField_unknownField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField_same() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithField_same");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithFieldAdded");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_nullField_zero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithFieldAdded_nullField_zero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_nullField_nonZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithFieldAdded_nullField_nonZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_zero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithFieldAdded_zero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded_unknownField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithFieldAdded_unknownField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMonths_int_fromLeap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlusMonths_int_fromLeap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMonths_int_negativeFromLeap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlusMonths_int_negativeFromLeap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMonths_int_endOfMonthAdjust() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlusMonths_int_endOfMonthAdjust");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMonths_int_negativeEndOfMonthAdjust() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlusMonths_int_negativeEndOfMonthAdjust");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMonths_int_same() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlusMonths_int_same");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMonths_int_wrap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlusMonths_int_wrap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMonths_int_adjust() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlusMonths_int_adjust");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusDays_int_fromLeap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlusDays_int_fromLeap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusDays_int_negativeFromLeap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlusDays_int_negativeFromLeap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusDays_same() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlusDays_same");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMonths_int_fromLeap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinusMonths_int_fromLeap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMonths_int_negativeFromLeap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinusMonths_int_negativeFromLeap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMonths_int_endOfMonthAdjust() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinusMonths_int_endOfMonthAdjust");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMonths_int_negativeEndOfMonthAdjust() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinusMonths_int_negativeEndOfMonthAdjust");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMonths_int_same() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinusMonths_int_same");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMonths_int_wrap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinusMonths_int_wrap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMonths_int_adjust() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinusMonths_int_adjust");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusDays_int_fromLeap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinusDays_int_fromLeap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusDays_int_negativeFromLeap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinusDays_int_negativeFromLeap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusDays_same() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinusDays_same");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testGetValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testGetValues");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testGetField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testGetFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testGetFieldTypes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testWithers");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testToString_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_DTFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testToString_DTFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToLocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testToLocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMonths_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlusMonths_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusDays_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testPlusDays_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinus_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusMonths_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinusMonths_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusDays_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testMinusDays_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testProperty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_String_Locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testToString_String_Locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSize() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testSize");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testGetFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testToDateTime_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDateTime_nullRI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testToDateTime_nullRI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Basics("testToString");
			testcase.run();
		}
	}

}