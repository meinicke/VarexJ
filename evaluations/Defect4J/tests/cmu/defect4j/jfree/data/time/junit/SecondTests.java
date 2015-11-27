package cmu.defect4j.jfree.data.time.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SecondTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashcode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testHashcode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateConstructor1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testDateConstructor1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsSelf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testEqualsSelf");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateConstructor2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testDateConstructor2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotCloneable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testNotCloneable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSerialIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testGetSerialIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testGetFirstMillisecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecondWithTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testGetFirstMillisecondWithTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecondWithCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testGetFirstMillisecondWithCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testGetLastMillisecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecondWithTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testGetLastMillisecondWithTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecondWithCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testGetLastMillisecondWithCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNext() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testNext");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStart() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testGetStart");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetEnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.SecondTests("testGetEnd");
			testcase.run();
		}
	}

}