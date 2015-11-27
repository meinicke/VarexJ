package cmu.defect4j.jfree.data.time.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class QuarterTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashcode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testHashcode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQ1Y1900Previous() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testQ1Y1900Previous");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQ1Y1900Next() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testQ1Y1900Next");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQ4Y9999Previous() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testQ4Y9999Previous");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQ4Y9999Next() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testQ4Y9999Next");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseQuarter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testParseQuarter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateConstructor1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testDateConstructor1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsSelf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testEqualsSelf");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateConstructor2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testDateConstructor2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotCloneable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testNotCloneable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSerialIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testGetSerialIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testGetFirstMillisecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecondWithTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testGetFirstMillisecondWithTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecondWithCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testGetFirstMillisecondWithCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testGetLastMillisecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecondWithTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testGetLastMillisecondWithTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecondWithCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testGetLastMillisecondWithCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNext() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testNext");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStart() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testGetStart");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetEnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.QuarterTests("testGetEnd");
			testcase.run();
		}
	}

}