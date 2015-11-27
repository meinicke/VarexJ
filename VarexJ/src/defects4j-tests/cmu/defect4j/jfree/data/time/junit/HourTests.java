package cmu.defect4j.jfree.data.time.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class HourTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashcode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testHashcode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateConstructor1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testDateConstructor1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsSelf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testEqualsSelf");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateConstructor2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testDateConstructor2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotCloneable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testNotCloneable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSerialIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testGetSerialIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testGetFirstMillisecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecondWithTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testGetFirstMillisecondWithTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecondWithCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testGetFirstMillisecondWithCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testGetLastMillisecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecondWithTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testGetLastMillisecondWithTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecondWithCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testGetLastMillisecondWithCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNext() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testNext");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStart() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testGetStart");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetEnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testGetEnd");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFirstHourPrevious() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testFirstHourPrevious");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFirstHourNext() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testFirstHourNext");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLastHourPrevious() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testLastHourPrevious");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLastHourNext() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testLastHourNext");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.HourTests("testParseHour");
			testcase.run();
		}
	}

}