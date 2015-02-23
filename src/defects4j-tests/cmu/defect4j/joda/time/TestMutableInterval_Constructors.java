package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMutableInterval_Constructors extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testParse_noFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testParse_noFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_long_long_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_long_long_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RI8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RI9");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_long_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_long_long3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RI5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RI6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RI7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RP1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RP1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RP2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RP2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RP3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RP3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RP4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RP4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RP5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RP5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RP6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RP6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RP7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RP7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RP8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RP8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RP_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RP_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RP_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RI4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RP_RI4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RI5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RP_RI5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RI6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RP_RI6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RI7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RP_RI7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RP_RI8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RP_RI8");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RD1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RD2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RD3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RD4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RD5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RD5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RD_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RD_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RD_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RD_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RD_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RD_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RD_RI4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RD_RI4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RD_RI5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RD_RI5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_Object6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_Object_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_Object_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_long_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_long_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_RI_RI4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_RI_RI4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_Object1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_Object2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_Object3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_Object4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructor_Object5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Constructors("testConstructor_Object5");
			testcase.run();
		}
	}

}