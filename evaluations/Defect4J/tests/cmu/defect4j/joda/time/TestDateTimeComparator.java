package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateTimeComparator extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testClass");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticGetInstance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testStaticGetInstance");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticGetDateOnlyInstance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testStaticGetDateOnlyInstance");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticGetTimeOnlyInstance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testStaticGetTimeOnlyInstance");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticGetInstanceLower() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testStaticGetInstanceLower");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticGetInstanceLowerUpper() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testStaticGetInstanceLowerUpper");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testSerialization1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testSerialization2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicComps1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testBasicComps1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicComps2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testBasicComps2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicComps3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testBasicComps3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicComps4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testBasicComps4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicComps5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testBasicComps5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDOW() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testDOW");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDOM() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testDOM");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDOY() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testDOY");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWOW() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testWOW");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWOYY() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testWOYY");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListBasic() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListBasic");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListDOW() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListDOW");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListDOM() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListDOM");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListDOY() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListDOY");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListWOW() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListWOW");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListYOYY() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListYOYY");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testListTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullDT() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testNullDT");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidObj() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeComparator("testInvalidObj");
			testcase.run();
		}
	}

}