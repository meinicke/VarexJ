package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestISODateTimeFormat_Fields extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testForFields_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_empty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_empty");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_calBased_YMD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_calBased_YMD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_calBased_YMD_unmodifiable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_calBased_YMD_unmodifiable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_calBased_YMD_duplicates() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_calBased_YMD_duplicates");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_calBased_Y() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_calBased_Y");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_calBased_M() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_calBased_M");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_calBased_D() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_calBased_D");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_calBased_YM() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_calBased_YM");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_calBased_MD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_calBased_MD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_calBased_YD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_calBased_YD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_weekBased_YWD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_weekBased_YWD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_weekBased_Y() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_weekBased_Y");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_weekBased_W() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_weekBased_W");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_weekBased_D() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_weekBased_D");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_weekBased_YW() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_weekBased_YW");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_weekBased_WD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_weekBased_WD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_weekBased_YD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_weekBased_YD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_ordinalBased_YD() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_ordinalBased_YD");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_ordinalBased_Y() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_ordinalBased_Y");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_ordinalBased_D() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_ordinalBased_D");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_HMSm() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_HMSm");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_HMS() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_HMS");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_HM() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_HM");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_H() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_H");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_MSm() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_MSm");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_MS() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_MS");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_M() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_M");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_Sm() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_Sm");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_S() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_S");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_m() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_m");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_Hm() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_Hm");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_HS() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_HS");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_Mm() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_Mm");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_HSm() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_HSm");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_time_HMm() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_time_HMm");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_datetime_YMDH() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_datetime_YMDH");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_datetime_DH() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_datetime_DH");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_datetime_YH() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_datetime_YH");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields_datetime_DM() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat_Fields("testForFields_datetime_DM");
			testcase.run();
		}
	}

}