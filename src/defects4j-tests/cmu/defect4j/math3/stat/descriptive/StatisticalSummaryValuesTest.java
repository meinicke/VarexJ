package cmu.defect4j.math3.stat.descriptive;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class StatisticalSummaryValuesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.StatisticalSummaryValuesTest object = new org.apache.commons.math3.stat.descriptive.StatisticalSummaryValuesTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.StatisticalSummaryValuesTest object = new org.apache.commons.math3.stat.descriptive.StatisticalSummaryValuesTest();
               object.testSerialization();
        }
    }

    @Test(timeout=120000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.StatisticalSummaryValuesTest object = new org.apache.commons.math3.stat.descriptive.StatisticalSummaryValuesTest();
               object.testEqualsAndHashCode();
        }
    }

}