package cmu.defect4j.jfree.data.time.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class WeekTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashcode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testHashcode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotCloneable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testNotCloneable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSerialIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testGetSerialIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testGetFirstMillisecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecondWithTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testGetFirstMillisecondWithTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecondWithCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testGetFirstMillisecondWithCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testGetLastMillisecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecondWithTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testGetLastMillisecondWithTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecondWithCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testGetLastMillisecondWithCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNext() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testNext");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStart() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testGetStart");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetEnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testGetEnd");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testW1Y1900Previous() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testW1Y1900Previous");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testW1Y1900Next() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testW1Y1900Next");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testW52Y9999Previous() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testW52Y9999Previous");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testW52Y9999Next() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testW52Y9999Next");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWeek12005() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testWeek12005");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWeek532005() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testWeek532005");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1448828() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testBug1448828");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1498805() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.WeekTests("testBug1498805");
			testcase.run();
		}
	}

}