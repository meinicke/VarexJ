package cmu.defect4j.jfree.data.general.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DatasetUtilitiesTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFindRangeBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindRangeBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindDomainBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindDomainBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalculatePieDatasetTotal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testCalculatePieDatasetTotal");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJava() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testJava");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindDomainBounds2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindDomainBounds2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindDomainBounds3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindDomainBounds3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindDomainBounds_NaN() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindDomainBounds_NaN");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateDomainBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateDomainBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateDomainBounds_NaN() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateDomainBounds_NaN");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateDomainBounds_NaN2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateDomainBounds_NaN2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindRangeBounds_CategoryDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindRangeBounds_CategoryDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindRangeBounds2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindRangeBounds2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateRangeBounds_CategoryDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateRangeBounds_CategoryDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateRangeBounds2_CategoryDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateRangeBounds2_CategoryDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateRangeBounds3_CategoryDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateRangeBounds3_CategoryDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateRangeBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateRangeBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateRangeBounds2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateRangeBounds2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateRangeBounds3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateRangeBounds3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateRangeBounds4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateRangeBounds4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindMinimumDomainValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindMinimumDomainValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindMaximumDomainValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindMaximumDomainValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindMinimumRangeValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindMinimumRangeValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindMaximumRangeValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindMaximumRangeValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinMaxRange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testMinMaxRange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test803660() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("test803660");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCumulativeRange1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testCumulativeRange1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCumulativeRange2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testCumulativeRange2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCumulativeRange3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testCumulativeRange3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCumulativeRange_NaN() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testCumulativeRange_NaN");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCreateCategoryDataset1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testCreateCategoryDataset1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCreateCategoryDataset2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testCreateCategoryDataset2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaximumStackedRangeValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testMaximumStackedRangeValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindStackedRangeBounds_CategoryDataset1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindStackedRangeBounds_CategoryDataset1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindStackedRangeBounds_CategoryDataset2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindStackedRangeBounds_CategoryDataset2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindStackedRangeBounds_CategoryDataset3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindStackedRangeBounds_CategoryDataset3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindStackedRangeBoundsForTableXYDataset1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindStackedRangeBoundsForTableXYDataset1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindStackedRangeBoundsForTableXYDataset2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindStackedRangeBoundsForTableXYDataset2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStackedRangeWithMap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testStackedRangeWithMap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEmptyOrNullXYDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIsEmptyOrNullXYDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLimitPieDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testLimitPieDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSampleFunction2D() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testSampleFunction2D");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindMinimumStackedRangeValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindMinimumStackedRangeValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindMinimumStackedRangeValue2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindMinimumStackedRangeValue2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindMaximumStackedRangeValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindMaximumStackedRangeValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindMaximumStackedRangeValue2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testFindMaximumStackedRangeValue2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateToFindRangeBounds1_XYDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateToFindRangeBounds1_XYDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateToFindRangeBounds2_XYDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateToFindRangeBounds2_XYDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateToFindRangeBounds_BoxAndWhiskerXYDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateToFindRangeBounds_BoxAndWhiskerXYDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateToFindRangeBounds_StatisticalCategoryDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateToFindRangeBounds_StatisticalCategoryDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateToFindRangeBounds_MultiValueCategoryDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateToFindRangeBounds_MultiValueCategoryDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIterateRangeBounds_IntervalCategoryDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testIterateRangeBounds_IntervalCategoryDataset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2849731() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testBug2849731");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2849731_2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testBug2849731_2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2849731_3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DatasetUtilitiesTests("testBug2849731_3");
			testcase.run();
		}
	}

}