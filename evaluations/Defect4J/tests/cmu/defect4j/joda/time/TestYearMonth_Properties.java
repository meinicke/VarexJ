package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestYearMonth_Properties extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPropertyGetYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyGetYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEqualsHashCodeLenient() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyEqualsHashCodeLenient");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEqualsHashCodeStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyEqualsHashCodeStrict");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyAddYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyAddWrapFieldYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertySetYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertySetTextYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyCompareToYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyGetMaxMinValuesYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyGetMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMaxMinValuesMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyGetMaxMinValuesMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyCompareToMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyCompareToMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyAddMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertyAddWrapFieldMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertySetMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYearMonth_Properties("testPropertySetTextMonth");
			testcase.run();
		}
	}

}