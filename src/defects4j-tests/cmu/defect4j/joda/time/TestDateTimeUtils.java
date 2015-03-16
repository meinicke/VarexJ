package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateTimeUtils extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testClass");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSystemMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testSystemMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSystemMillisSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testSystemMillisSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFixedMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testFixedMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFixedMillisSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testFixedMillisSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOffsetMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testOffsetMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOffsetMillisToZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testOffsetMillisToZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOffsetMillisSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testOffsetMillisSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMillisProvider() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testMillisProvider");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMillisProvider_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testMillisProvider_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMillisProviderSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testMillisProviderSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetInstantMillis_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testGetInstantMillis_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetInstantChronology_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testGetInstantChronology_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetIntervalChronology_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testGetIntervalChronology_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetIntervalChronology_RI_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testGetIntervalChronology_RI_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetReadableInterval_ReadableInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testGetReadableInterval_ReadableInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetChronology_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testGetChronology_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetZone_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testGetZone_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPeriodType_PeriodType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testGetPeriodType_PeriodType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDurationMillis_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testGetDurationMillis_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsContiguous_RP() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testIsContiguous_RP");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsContiguous_RP_GJChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("testIsContiguous_RP_GJChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_julianDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeUtils("test_julianDay");
			testcase.run();
		}
	}

}