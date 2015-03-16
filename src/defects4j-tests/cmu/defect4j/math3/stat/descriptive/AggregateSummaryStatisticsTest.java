package cmu.defect4j.math3.stat.descriptive;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class AggregateSummaryStatisticsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testAggregation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest();
               object.testAggregation();
        }
    }

    @Test(timeout=120000)
    public void testAggregationConsistency() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest();
               object.testAggregationConsistency();
        }
    }

    @Test(timeout=120000)
    public void testAggregate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest();
               object.testAggregate();
        }
    }

    @Test(timeout=120000)
    public void testAggregateDegenerate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest();
               object.testAggregateDegenerate();
        }
    }

    @Test(timeout=120000)
    public void testAggregateSpecialValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest object = new org.apache.commons.math3.stat.descriptive.AggregateSummaryStatisticsTest();
               object.testAggregateSpecialValues();
        }
    }

}