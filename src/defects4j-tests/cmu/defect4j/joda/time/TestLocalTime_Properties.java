package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestLocalTime_Properties extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPropertyPlusHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyPlusHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRoundHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyRoundHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyGetHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyPlusWrapFieldHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyPlusWrapFieldHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyPlusMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyPlusMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyPlusNoWrapHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyPlusNoWrapHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyGetMaxMinValuesHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaxMinValueHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyWithMaxMinValueHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertySetHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertySetTextHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaximumValueHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyWithMaximumValueHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMinimumValueHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyWithMinimumValueHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyCompareToHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyGetMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyGetMaxMinValuesMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaxMinValueMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyWithMaxMinValueMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertySetMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertySetTextMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyCompareToMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyGetSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyGetMaxMinValuesSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaxMinValueSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyWithMaxMinValueSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertySetSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertySetTextSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyCompareToSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyGetMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyGetMaxMinValuesMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaxMinValueMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyWithMaxMinValueMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertySetMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertySetTextMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyCompareToMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyPlusNoWrapMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyPlusNoWrapMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyPlusWrapFieldMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyPlusWrapFieldMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyPlusSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyPlusSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyPlusNoWrapSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyPlusNoWrapSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyPlusWrapFieldSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyPlusWrapFieldSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyPlusMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyPlusMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyPlusNoWrapMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyPlusNoWrapMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyPlusWrapFieldMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalTime_Properties("testPropertyPlusWrapFieldMilli");
			testcase.run();
		}
	}

}