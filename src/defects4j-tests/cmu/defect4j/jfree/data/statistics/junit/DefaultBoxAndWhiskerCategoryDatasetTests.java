package cmu.defect4j.jfree.data.statistics.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DefaultBoxAndWhiskerCategoryDatasetTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultBoxAndWhiskerCategoryDatasetTests("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultBoxAndWhiskerCategoryDatasetTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultBoxAndWhiskerCategoryDatasetTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultBoxAndWhiskerCategoryDatasetTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test1701822() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultBoxAndWhiskerCategoryDatasetTests("test1701822");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultBoxAndWhiskerCategoryDatasetTests("testAdd");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddUpdatesCachedRange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultBoxAndWhiskerCategoryDatasetTests("testAddUpdatesCachedRange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRangeBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultBoxAndWhiskerCategoryDatasetTests("testGetRangeBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemove() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultBoxAndWhiskerCategoryDatasetTests("testRemove");
			testcase.run();
		}
	}

}