package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestPeriod_Constructors extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testParse_noFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testParse_noFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_long_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_long_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstants");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RI5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RD1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RD2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RD_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RD_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RD_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RD_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_PeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_PeriodType4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_Chronology3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_Chronology3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_PeriodType_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_PeriodType_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType_Chronology3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_PeriodType_Chronology3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType_Chronology4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_PeriodType_Chronology4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_4int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_4int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_8int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_8int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_8int__PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_8int__PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_8int__PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_8int__PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_8int__PeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_8int__PeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_long_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_long_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_PeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_long_PeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_PeriodType_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_long_PeriodType_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_PeriodType_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_long_PeriodType_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RI_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RI_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI_PeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RI_PeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI_PeriodType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RI_PeriodType4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI_PeriodType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RI_PeriodType5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RD_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RD_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_Object_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_Object_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_PeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_Object_PeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_PeriodType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_Object_PeriodType4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_fixedZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_fixedZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod_PeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testToPeriod_PeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP2Local() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP2Local");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP_PeriodType2Local() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP_PeriodType2Local");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP_PeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP_PeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP_PeriodType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP_PeriodType4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP_PeriodType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP_PeriodType5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP_PeriodType6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP_PeriodType6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP_PeriodType7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP_PeriodType7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RP_PeriodType8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RP_RP_PeriodType8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RD_RI_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RD_RI_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RD_RI_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RD_RI_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryYears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactoryYears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactoryMonths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactoryWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactoryDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactoryHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactoryMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactorySeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactorySeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactoryMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_RI_RI_toFeb_standardYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_RI_RI_toFeb_standardYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_RI_RI_toFeb_leapYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_RI_RI_toFeb_leapYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_RI_RI_toFeb_exactMonths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_RI_RI_toFeb_endOfMonth3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_RI_RI_toMar_endOfMonth2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_LD_LD_toFeb_standardYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_LD_LD_toFeb_standardYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_LD_LD_toFeb_leapYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_LD_LD_toFeb_leapYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_LD_LD_toFeb_exactMonths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_LD_LD_toFeb_endOfMonth3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_trickyDifferences_LD_LD_toMar_endOfMonth2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryFieldDifference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactoryFieldDifference1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryFieldDifference2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactoryFieldDifference2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryFieldDifference3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactoryFieldDifference3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryFieldDifference4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactoryFieldDifference4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryFieldDifference5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testFactoryFieldDifference5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_long_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_RI_RI4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_Object1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_Object2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_Object3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Constructors("testConstructor_Object4");
			testcase.run();
		}
	}

}