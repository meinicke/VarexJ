package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestLocalDate_Constructors extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstructor_nullObject_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_nullObject_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_nullDateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_Object_nullDateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_nullObject_nullDateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_nullObject_nullDateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_nullObject_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_nullObject_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_nullChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_Object_nullChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_nullObject_nullChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_nullObject_nullChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_int_int_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_int_int_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_int_int_int_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_int_int_int_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_int_int_int_nullChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_int_int_int_nullChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParse_noFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testParse_noFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParse_formatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testParse_formatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_nullDateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_nullDateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_nullChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_nullChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long1_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_long1_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long2_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_long2_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_nullDateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_long_nullDateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long1_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_long1_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long2_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_long2_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_nullChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_long_nullChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_nullObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_nullObject");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_Object_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_Object_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectString1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectString1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectString2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectString2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectString3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectString3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectStringEx1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectStringEx1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectStringEx2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectStringEx2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_Object1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_fromCalendarFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testFactory_fromCalendarFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_fromCalendarFields_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testFactory_fromCalendarFields_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_fromCalendarFields_beforeYearZero1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testFactory_fromCalendarFields_beforeYearZero1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_fromCalendarFields_beforeYearZero3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testFactory_fromCalendarFields_beforeYearZero3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_fromDateFields_after1970() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testFactory_fromDateFields_after1970");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_fromDateFields_before1970() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testFactory_fromDateFields_before1970");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_fromDateFields_beforeYearZero1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testFactory_fromDateFields_beforeYearZero1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_fromDateFields_beforeYearZero3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testFactory_fromDateFields_beforeYearZero3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_fromDateFields_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testFactory_fromDateFields_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long3_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_long3_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long4_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_long4_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectStringEx3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectStringEx3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectStringEx4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectStringEx4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectStringEx5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectStringEx5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectStringEx6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectStringEx6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectStringEx7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectStringEx7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectLocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectLocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectLocalTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectLocalTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectLocalDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectLocalDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectYearMonthDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_ObjectYearMonthDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_Chronology_crossChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestLocalDate_Constructors("testConstructor_Object_Chronology_crossChronology");
			testcase.run();
		}
	}

}