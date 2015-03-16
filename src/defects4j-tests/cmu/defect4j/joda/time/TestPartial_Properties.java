package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestPartial_Properties extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPropertyGetHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertyGetHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertyGetMaxMinValuesHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertySetHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertySetTextHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaximumValueHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertyWithMaximumValueHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMinimumValueHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertyWithMinimumValueHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertyCompareToHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertyGetMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertyGetMaxMinValuesMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertySetMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertySetTextMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertyCompareToMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertyAddHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertyAddWrapFieldHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertyAddMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPartial_Properties("testPropertyAddWrapFieldMinute");
			testcase.run();
		}
	}

}