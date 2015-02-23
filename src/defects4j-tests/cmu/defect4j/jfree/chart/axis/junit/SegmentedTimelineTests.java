package cmu.defect4j.jfree.chart.axis.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SegmentedTimelineTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMsSegmentedTimeline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMsSegmentedTimeline");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMs2SegmentedTimeline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMs2SegmentedTimeline");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMondayThroughFridaySegmentedTimeline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMondayThroughFridaySegmentedTimeline");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFifteenMinSegmentedTimeline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testFifteenMinSegmentedTimeline");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMsSegment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMsSegment");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMs2Segment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMs2Segment");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMondayThroughFridaySegment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMondayThroughFridaySegment");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFifteenMinSegment() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testFifteenMinSegment");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMsInc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMsInc");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMs2Inc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMs2Inc");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMondayThroughFridayInc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMondayThroughFridayInc");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFifteenMinInc() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testFifteenMinInc");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMsIncludedAndExcludedSegments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMsIncludedAndExcludedSegments");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMs2IncludedAndExcludedSegments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMs2IncludedAndExcludedSegments");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMondayThroughFridayIncludedAndExcludedSegments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMondayThroughFridayIncludedAndExcludedSegments");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFifteenMinIncludedAndExcludedSegments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testFifteenMinIncludedAndExcludedSegments");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMsExceptionSegments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMsExceptionSegments");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMs2BaseTimelineExceptionSegments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMs2BaseTimelineExceptionSegments");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMondayThoughFridayExceptionSegments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMondayThoughFridayExceptionSegments");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFifteenMinExceptionSegments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testFifteenMinExceptionSegments");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMsTranslations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMsTranslations");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMs2BaseTimelineTranslations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMs2BaseTimelineTranslations");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMs2Translations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testMs2Translations");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFifteenMinTranslations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testFifteenMinTranslations");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testSerialization2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicSegmentedTimeline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testBasicSegmentedTimeline");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSegmentedTimelineWithException1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.SegmentedTimelineTests("testSegmentedTimelineWithException1");
			testcase.run();
		}
	}

}