package cmu.defect4j.jfree.data.time.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class YearTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashcode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testHashcode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateConstructor1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testDateConstructor1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsSelf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testEqualsSelf");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateConstructor2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testDateConstructor2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotCloneable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testNotCloneable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSerialIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testGetSerialIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testGetFirstMillisecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecondWithTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testGetFirstMillisecondWithTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFirstMillisecondWithCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testGetFirstMillisecondWithCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testGetLastMillisecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecondWithTimeZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testGetLastMillisecondWithTimeZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLastMillisecondWithCalendar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testGetLastMillisecondWithCalendar");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNext() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testNext");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStart() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testGetStart");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetEnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testGetEnd");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinuss9999Previous() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testMinuss9999Previous");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test1900Next() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("test1900Next");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test9999Previous() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("test9999Previous");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test9999Next() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("test9999Next");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.YearTests("testParseYear");
			testcase.run();
		}
	}

}