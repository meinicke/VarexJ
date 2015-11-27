package cmu.defect4j.joda.time.convert;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestStringConverter extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSupportedType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSupportedType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetInstantMillis_Object_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetInstantMillis_Object_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPartialValues() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetPartialValues");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSingleton() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSingleton");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetChronology_Object_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetChronology_Object_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetChronology_Object_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetChronology_Object_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPeriodType_Object() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetPeriodType_Object");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsReadableInterval_Object_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testIsReadableInterval_Object_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDateTime1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetDateTime1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDateTime2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetDateTime2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDateTime3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetDateTime3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDateTime4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetDateTime4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDateTime5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetDateTime5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDateTime6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetDateTime6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDurationMillis_Object1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetDurationMillis_Object1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDurationMillis_Object2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetDurationMillis_Object2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoPeriod_Object3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoPeriod_Object3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoPeriod_Object4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoPeriod_Object4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoPeriod_Object5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoPeriod_Object5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoPeriod_Object6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoPeriod_Object6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoPeriod_Object7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoPeriod_Object7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoPeriod_Object8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoPeriod_Object8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoInterval_Object_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoInterval_Object_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoInterval_Object_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoInterval_Object_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoInterval_Object_Chronology3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoInterval_Object_Chronology3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoInterval_Object_Chronology4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoInterval_Object_Chronology4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoInterval_Object_Chronology5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoInterval_Object_Chronology5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoInterval_Object_Chronology6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoInterval_Object_Chronology6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoInterval_Object_Chronology7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoInterval_Object_Chronology7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoInterval_Object_Chronology8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoInterval_Object_Chronology8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoIntervalEx_Object_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoIntervalEx_Object_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoIntervalEx_Object_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoIntervalEx_Object_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoIntervalEx_Object_Chronology3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoIntervalEx_Object_Chronology3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoIntervalEx_Object_Chronology4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoIntervalEx_Object_Chronology4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoIntervalEx_Object_Chronology5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoIntervalEx_Object_Chronology5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetInstantMillis_Object() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetInstantMillis_Object");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetInstantMillis_Object_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetInstantMillis_Object_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetInstantMillisInvalid() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetInstantMillisInvalid");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testGetDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoPeriod_Object1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoPeriod_Object1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetIntoPeriod_Object2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testSetIntoPeriod_Object2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestStringConverter("testToString");
			testcase.run();
		}
	}

}