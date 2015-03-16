package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestTimeOfDay_Properties extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPropertyAddWrapFieldSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyAddWrapFieldSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyAddMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddNoWrapMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyAddNoWrapMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyAddWrapFieldMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddNoWrapHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyAddNoWrapHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddNoWrapMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyAddNoWrapMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyAddSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddNoWrapSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyAddNoWrapSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyGetHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyGetMaxMinValuesHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertySetHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertySetTextHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaximumValueHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyWithMaximumValueHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMinimumValueHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyWithMinimumValueHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyCompareToHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyGetMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyGetMaxMinValuesMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertySetMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertySetTextMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyCompareToMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyGetSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyGetMaxMinValuesSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertySetSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertySetTextSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyCompareToSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyGetMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyGetMaxMinValuesMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertySetMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertySetTextMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToMilli() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyCompareToMilli");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyAddHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyAddWrapFieldHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyAddMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestTimeOfDay_Properties("testPropertyAddWrapFieldMinute");
			testcase.run();
		}
	}

}