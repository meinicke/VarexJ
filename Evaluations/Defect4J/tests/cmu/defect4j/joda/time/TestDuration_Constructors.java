package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDuration_Constructors extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testParse_noFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testParse_noFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testConstructor_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testZERO() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testZERO");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_standardDays_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testFactory_standardDays_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_standardHours_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testFactory_standardHours_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_standardMinutes_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testFactory_standardMinutes_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_standardSeconds_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testFactory_standardSeconds_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_millis_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testFactory_millis_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testConstructor_long_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testConstructor_RI_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testConstructor_RI_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testConstructor_RI_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testConstructor_RI_RI4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testConstructor_Object1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testConstructor_Object2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testConstructor_Object3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testConstructor_Object4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Constructors("testConstructor_Object5");
			testcase.run();
		}
	}

}