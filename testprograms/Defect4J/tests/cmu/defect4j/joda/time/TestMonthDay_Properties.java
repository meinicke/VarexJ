package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMonthDay_Properties extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyGetMaxMinValuesMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyGetMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertySetMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertySetTextMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyAddMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyAddWrapFieldMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyGetDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEqualsHashCodeLenient() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyEqualsHashCodeLenient");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEqualsHashCodeStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyEqualsHashCodeStrict");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyCompareToMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyGetMaxMinValuesDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyAddDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyAddWrapFieldDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertySetDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertySetTextDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyCompareToDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Properties("testPropertyHashCode");
			testcase.run();
		}
	}

}