package cmu.defect4j.joda.time.chrono;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestGJDate extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void test_plusYears_positiveToPositive() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_plusYears_positiveToPositive");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_plusYears_positiveToZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_plusYears_positiveToZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_plusYears_positiveToNegative() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_plusYears_positiveToNegative");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_plusYears_negativeToNegative() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_plusYears_negativeToNegative");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_plusYears_negativeToZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_plusYears_negativeToZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_plusYears_negativeToPositive() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_plusYears_negativeToPositive");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_plusYears_positiveToPositive_crossCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_plusYears_positiveToPositive_crossCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_plusYears_positiveToZero_crossCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_plusYears_positiveToZero_crossCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_plusYears_positiveToNegative_crossCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_plusYears_positiveToNegative_crossCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_plusYears_negativeToPositive_crossCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_plusYears_negativeToPositive_crossCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_plusWeekyears_positiveToZero_crossCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_plusWeekyears_positiveToZero_crossCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_plusWeekyears_positiveToNegative_crossCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_plusWeekyears_positiveToNegative_crossCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_cutoverPreZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJDate("test_cutoverPreZero");
			testcase.run();
		}
	}

}