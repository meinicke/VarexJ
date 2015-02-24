package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMutableDateTime_Adds extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testAdd_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RD1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_RD1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RD2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_RD2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RD_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_RD_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RD_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_RD_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RP1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_RP1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RP2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_RP2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RP_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_RP_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_RP_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_RP_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_DurationFieldType_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_DurationFieldType_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_DurationFieldType_int_dstOverlapSummer_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_DurationFieldType_int_dstOverlapSummer_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_DurationFieldType_int_dstOverlapWinter_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_DurationFieldType_int_dstOverlapWinter_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_DurationFieldType_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_DurationFieldType_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd_DurationFieldType_int3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAdd_DurationFieldType_int3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddYears_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddYears_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddYears_int_dstOverlapSummer_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddYears_int_dstOverlapSummer_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddYears_int_dstOverlapWinter_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddYears_int_dstOverlapWinter_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMonths_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddMonths_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMonths_int_dstOverlapSummer_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddMonths_int_dstOverlapSummer_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMonths_int_dstOverlapWinter_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddMonths_int_dstOverlapWinter_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddDays_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddDays_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddDays_int_dstOverlapSummer_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddDays_int_dstOverlapSummer_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddDays_int_dstOverlapWinter_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddDays_int_dstOverlapWinter_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddWeekyears_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddWeekyears_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddWeeks_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddWeeks_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddWeeks_int_dstOverlapSummer_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddWeeks_int_dstOverlapSummer_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddWeeks_int_dstOverlapWinter_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddWeeks_int_dstOverlapWinter_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddHours_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddHours_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddHours_int_dstOverlapSummer_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddHours_int_dstOverlapSummer_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddHours_int_dstOverlapWinter_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddHours_int_dstOverlapWinter_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMinutes_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddMinutes_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMinutes_int_dstOverlapSummer_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddMinutes_int_dstOverlapSummer_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMinutes_int_dstOverlapWinter_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddMinutes_int_dstOverlapWinter_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddSeconds_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddSeconds_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddSeconds_int_dstOverlapSummer_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddSeconds_int_dstOverlapSummer_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddSeconds_int_dstOverlapWinter_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddSeconds_int_dstOverlapWinter_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMillis_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddMillis_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMillis_int_dstOverlapSummer_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddMillis_int_dstOverlapSummer_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddMillis_int_dstOverlapWinter_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testAddMillis_int_dstOverlapWinter_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Adds("testTest");
			testcase.run();
		}
	}

}