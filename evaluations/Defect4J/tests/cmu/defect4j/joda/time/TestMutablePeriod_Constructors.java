package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMutablePeriod_Constructors extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testParse_noFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testParse_noFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_long_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_long_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RI5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RD1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RD2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_Object_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_Object_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_PeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_PeriodType4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_Chronology3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_Chronology3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_PeriodType_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_PeriodType_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType_Chronology3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_PeriodType_Chronology3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_PeriodType_Chronology4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_PeriodType_Chronology4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_4int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_4int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_8int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_8int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_8int__PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_8int__PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_8int__PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_8int__PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_8int__PeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_8int__PeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_long_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_long_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_PeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_long_PeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_PeriodType_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_long_PeriodType_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_PeriodType_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_long_PeriodType_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RI_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RI_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI_PeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RI_PeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI_PeriodType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RI_PeriodType4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI_PeriodType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RI_PeriodType5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RD_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RD_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_Object_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_Object_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_PeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_Object_PeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_PeriodType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_Object_PeriodType4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_long_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_RI_RI4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_Object1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_Object2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_Object3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutablePeriod_Constructors("testConstructor_Object4");
			testcase.run();
		}
	}

}