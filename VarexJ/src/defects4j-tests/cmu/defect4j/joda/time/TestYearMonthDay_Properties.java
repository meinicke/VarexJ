package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestYearMonthDay_Properties extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPropertyGetYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyGetYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaximumValueDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyWithMaximumValueDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMinimumValueDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyWithMinimumValueDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEqualsHashCodeLenient() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyEqualsHashCodeLenient");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEqualsHashCodeStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyEqualsHashCodeStrict");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyAddYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyAddWrapFieldYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertySetYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertySetTextYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyCompareToYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyGetMaxMinValuesYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyGetMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyGetMaxMinValuesMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyCompareToMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyGetDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyGetMaxMinValuesDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyCompareToDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyAddMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyAddWrapFieldMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertySetMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertySetTextMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyAddDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertyAddWrapFieldDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertySetDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonthDay_Properties("testPropertySetTextDay");
			testcase.run();
		}
	}

}