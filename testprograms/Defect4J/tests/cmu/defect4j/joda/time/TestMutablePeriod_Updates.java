package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMutablePeriod_Updates extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testAdd_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RD1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RD1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RD2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RD2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RP1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RP1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RP2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RP2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testClear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddYears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAddYears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAddWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAddDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAddHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAddMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAddSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAddMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetYears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetYears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetMonths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSet_Field() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSet_Field");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_Field() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_Field");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_8ints1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_8ints1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_8ints2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_8ints2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_8ints3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_8ints3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_8ints4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_8ints4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RP1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RP1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RP2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RP2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RP3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RP3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RP4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RP4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RP5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RP5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long_long3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long_long3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long_long_NoYears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long_long_NoYears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long_long_NoMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long_long_NoMonths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long_long_NoWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long_long_NoWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long_long_NoDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long_long_NoDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long_long_NoHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long_long_NoHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long_long_NoMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long_long_NoMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long_long_NoSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long_long_NoSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long_long_NoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long_long_NoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RI_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RI_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RI_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RI_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RI_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RI_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RInterval1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RInterval1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RInterval2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RInterval2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RD1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RD1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RD2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RD2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriod_RD3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testSetPeriod_RD3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_8ints1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_8ints1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_8ints2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_8ints2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_long3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_long3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_long_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_long_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_long_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_long_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_long_Chronology3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_long_Chronology3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RD3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RD3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RP3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RP3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RP4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RP4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RP5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RP5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RP6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RP6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RInterval1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RInterval1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RInterval2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RInterval2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RInterval3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RInterval3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RInterval4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RInterval4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RInterval5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAdd_RInterval5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergePeriod_RP1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testMergePeriod_RP1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergePeriod_RP2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testMergePeriod_RP2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergePeriod_RP3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testMergePeriod_RP3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergePeriod_RP4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testMergePeriod_RP4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergePeriod_RP5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testMergePeriod_RP5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Updates("testAddMonths");
			testcase.run();
		}
	}

}