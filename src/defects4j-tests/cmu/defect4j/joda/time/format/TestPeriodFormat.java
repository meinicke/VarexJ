package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestPeriodFormat extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void test_getDefault_formatStandard() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_getDefault_formatStandard");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getDefault_FormatOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_getDefault_FormatOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getDefault_formatTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_getDefault_formatTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getDefault_parseOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_getDefault_parseOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getDefault_parseTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_getDefault_parseTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getDefault_checkRedundantSeparator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_getDefault_checkRedundantSeparator");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getDefault_cached() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_getDefault_cached");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_default() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_default");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_fr_formatStandard() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_fr_formatStandard");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_fr_FormatOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_fr_FormatOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_fr_formatTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_fr_formatTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_fr_parseOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_fr_parseOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_fr_parseTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_fr_parseTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_fr_cached() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_fr_cached");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_pt_formatStandard() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_pt_formatStandard");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_pt_FormatOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_pt_FormatOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_pt_formatTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_pt_formatTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_pt_parseOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_pt_parseOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_pt_parseTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_pt_parseTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_pt_cached() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_pt_cached");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_es_formatStandard() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_es_formatStandard");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_es_FormatOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_es_FormatOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_es_formatTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_es_formatTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_es_parseOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_es_parseOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_es_parseTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_es_parseTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_es_cached() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_es_cached");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_de_formatStandard() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_de_formatStandard");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_de_FormatOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_de_FormatOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_de_formatTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_de_formatTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_de_parseOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_de_parseOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_de_parseTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_de_parseTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_de_cached() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_de_cached");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_nl_formatStandard() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_nl_formatStandard");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_nl_FormatOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_nl_FormatOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_nl_formatTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_nl_formatTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_nl_parseOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_nl_parseOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_nl_parseTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_nl_parseTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_nl_cached() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_nl_cached");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_da_formatMultiple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_da_formatMultiple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_da_formatSinglular() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_da_formatSinglular");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_da_cached() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_da_cached");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_ja_formatMultiple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_ja_formatMultiple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_ja_formatSingular() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_ja_formatSingular");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_ja_cached() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_ja_cached");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_ja_parseOneField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_ja_parseOneField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_ja_parseTwoFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_ja_parseTwoFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_ja_checkRedundantSeparator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_ja_checkRedundantSeparator");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_fr_from_de() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_fr_from_de");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_fr_from_nl() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_fr_from_nl");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_en_from_de() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_en_from_de");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_wordBased_en_from_nl() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("test_wordBased_en_from_nl");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubclassableConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestPeriodFormat("testSubclassableConstructor");
			testcase.run();
		}
	}

}