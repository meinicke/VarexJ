package cmu.defect4j.math3.stat.descriptive;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class AbstractUnivariateStatisticTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testTestPositive() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatisticTest object = new org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatisticTest();
               object.testTestPositive();
        }
    }

    @Test(timeout=1000000)
    public void testTestNegative() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatisticTest object = new org.apache.commons.math3.stat.descriptive.AbstractUnivariateStatisticTest();
               object.testTestNegative();
        }
    }

}