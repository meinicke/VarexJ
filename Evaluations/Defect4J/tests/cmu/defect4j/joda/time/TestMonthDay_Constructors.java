package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMonthDay_Constructors extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstructor_nullObject_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_nullObject_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_nullChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_Object_nullChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_nullObject_nullChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_nullObject_nullChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParse_noFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testParse_noFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParse_formatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testParse_formatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_DateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_DateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_nullDateTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_nullDateTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_nullChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_nullChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long1_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_long1_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long2_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_long2_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_nullChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_long_nullChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_Object");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_nullObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_nullObject");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_Object_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectString1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_ObjectString1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectString5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_ObjectString5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectStringEx1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_ObjectStringEx1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectStringEx2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_ObjectStringEx2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_FromCalendarFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testFactory_FromCalendarFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_FromDateFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testFactory_FromDateFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_int_int_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_int_int_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_int_int_nullChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_int_int_nullChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectStringEx3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_ObjectStringEx3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_ObjectStringEx4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_ObjectStringEx4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_int_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonthDay_Constructors("testConstructor_int_int");
			testcase.run();
		}
	}

}