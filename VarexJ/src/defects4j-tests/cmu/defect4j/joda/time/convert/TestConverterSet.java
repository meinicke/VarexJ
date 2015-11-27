package cmu.defect4j.joda.time.convert;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestConverterSet extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterSet("testClass");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBigHashtable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterSet("testBigHashtable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddNullRemoved1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterSet("testAddNullRemoved1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddNullRemoved2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterSet("testAddNullRemoved2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddNullRemoved3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterSet("testAddNullRemoved3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveNullRemoved1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterSet("testRemoveNullRemoved1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveNullRemoved2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterSet("testRemoveNullRemoved2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveBadIndex1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterSet("testRemoveBadIndex1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveBadIndex2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterSet("testRemoveBadIndex2");
			testcase.run();
		}
	}

}