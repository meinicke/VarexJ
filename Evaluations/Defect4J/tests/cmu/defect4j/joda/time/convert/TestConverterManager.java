package cmu.defect4j.joda.time.convert;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestConverterManager extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSingleton() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testSingleton");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetInstantConverter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetInstantConverter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetInstantConverterRemovedNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetInstantConverterRemovedNull");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetInstantConverterOKMultipleMatches() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetInstantConverterOKMultipleMatches");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetInstantConverterBadMultipleMatches() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetInstantConverterBadMultipleMatches");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetInstantConverters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetInstantConverters");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddInstantConverter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddInstantConverter1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddInstantConverter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddInstantConverter2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddInstantConverter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddInstantConverter3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddInstantConverter4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddInstantConverter4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddInstantConverterSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddInstantConverterSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInstantConverter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemoveInstantConverter1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInstantConverter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemoveInstantConverter2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInstantConverter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemoveInstantConverter3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveInstantConverterSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemoveInstantConverterSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPartialConverter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetPartialConverter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPartialConverterRemovedNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetPartialConverterRemovedNull");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPartialConverterOKMultipleMatches() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetPartialConverterOKMultipleMatches");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPartialConverterBadMultipleMatches() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetPartialConverterBadMultipleMatches");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPartialConverters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetPartialConverters");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPartialConverter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddPartialConverter1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPartialConverter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddPartialConverter2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPartialConverter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddPartialConverter3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPartialConverter4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddPartialConverter4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPartialConverterSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddPartialConverterSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePartialConverter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemovePartialConverter1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePartialConverter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemovePartialConverter2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePartialConverter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemovePartialConverter3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePartialConverterSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemovePartialConverterSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDurationConverter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetDurationConverter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDurationConverterRemovedNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetDurationConverterRemovedNull");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDurationConverters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetDurationConverters");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddDurationConverter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddDurationConverter1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddDurationConverter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddDurationConverter2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddDurationConverter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddDurationConverter3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddDurationConverterSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddDurationConverterSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDurationConverter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemoveDurationConverter1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDurationConverter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemoveDurationConverter2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDurationConverter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemoveDurationConverter3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDurationConverterSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemoveDurationConverterSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPeriodConverter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetPeriodConverter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPeriodConverterRemovedNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetPeriodConverterRemovedNull");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPeriodConverters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetPeriodConverters");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPeriodConverter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddPeriodConverter1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPeriodConverter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddPeriodConverter2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPeriodConverter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddPeriodConverter3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddPeriodConverterSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddPeriodConverterSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePeriodConverter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemovePeriodConverter1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePeriodConverter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemovePeriodConverter2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePeriodConverter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemovePeriodConverter3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovePeriodConverterSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemovePeriodConverterSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetIntervalConverter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetIntervalConverter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetIntervalConverterRemovedNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetIntervalConverterRemovedNull");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetIntervalConverters() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testGetIntervalConverters");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddIntervalConverter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddIntervalConverter1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddIntervalConverter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddIntervalConverter2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddIntervalConverter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddIntervalConverter3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddIntervalConverterSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testAddIntervalConverterSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveIntervalConverter1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemoveIntervalConverter1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveIntervalConverter2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemoveIntervalConverter2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveIntervalConverter3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemoveIntervalConverter3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveIntervalConverterSecurity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testRemoveIntervalConverterSecurity");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.convert.TestConverterManager("testToString");
			testcase.run();
		}
	}

}