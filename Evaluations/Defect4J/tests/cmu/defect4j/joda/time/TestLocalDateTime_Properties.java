package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestLocalDateTime_Properties extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPropertyRoundHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyRoundHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetMaxMinValuesHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaxMinValueHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyWithMaxMinValueHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddToCopyHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddToCopyHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldToCopyHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddWrapFieldToCopyHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetTextHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaximumValueHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyWithMaximumValueHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMinimumValueHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyWithMinimumValueHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyCompareToHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetMaxMinValuesMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaxMinValueMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyWithMaxMinValueMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddToCopyMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddToCopyMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldToCopyMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddWrapFieldToCopyMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetTextMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyCompareToMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetMaxMinValuesSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaxMinValueSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyWithMaxMinValueSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddToCopySecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddToCopySecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldToCopySecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddWrapFieldToCopySecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetTextSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyCompareToSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetMaxMinValuesMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaxMinValueMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyWithMaxMinValueMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddToCopyMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddToCopyMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldToCopyMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddWrapFieldToCopyMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetTextMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyCompareToMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaximumValueDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyWithMaximumValueDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMinimumValueDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyWithMinimumValueDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyCompareToYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetMaxMinValuesYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddToCopyYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddToCopyYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldToCopyYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddWrapFieldToCopyYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetCopyYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetCopyYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetCopyTextYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetCopyTextYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetMaxMinValuesMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddToCopyMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddToCopyMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldToCopyMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddWrapFieldToCopyMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetCopyMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetCopyMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetCopyTextMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetCopyTextMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyCompareToMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyGetMaxMinValuesDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddToCopyDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddToCopyDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldToCopyDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyAddWrapFieldToCopyDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetCopyDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetCopyDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetCopyTextDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertySetCopyTextDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyCompareToDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDateTime_Properties("testPropertyHashCode");
			testcase.run();
		}
	}

}