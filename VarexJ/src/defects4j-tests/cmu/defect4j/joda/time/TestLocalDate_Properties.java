package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestLocalDate_Properties extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPropertyGetYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyGetYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaximumValueDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyWithMaximumValueDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMinimumValueDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyWithMinimumValueDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEqualsHashCodeLenient() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyEqualsHashCodeLenient");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEqualsHashCodeStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyEqualsHashCodeStrict");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyCompareToYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyGetMaxMinValuesYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddToCopyYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyAddToCopyYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldToCopyYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyAddWrapFieldToCopyYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyGetMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetCopyYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertySetCopyYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetCopyTextYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertySetCopyTextYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyGetMaxMinValuesMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddToCopyMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyAddToCopyMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldToCopyMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyAddWrapFieldToCopyMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetCopyMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertySetCopyMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetCopyTextMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertySetCopyTextMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyCompareToMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyGetDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyGetMaxMinValuesDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddToCopyDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyAddToCopyDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldToCopyDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyAddWrapFieldToCopyDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetCopyDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertySetCopyDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetCopyTextDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertySetCopyTextDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyCompareToDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Properties("testPropertyHashCode");
			testcase.run();
		}
	}

}