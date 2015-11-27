package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SchurTransformerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testMath848() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SchurTransformerTest object = new org.apache.commons.math3.linear.SchurTransformerTest();
               object.testMath848();
        }
    }

    @Test(timeout=1000000)
    public void testNonSquare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SchurTransformerTest object = new org.apache.commons.math3.linear.SchurTransformerTest();
               object.testNonSquare();
        }
    }

    @Test(timeout=1000000)
    public void testSchurForm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SchurTransformerTest object = new org.apache.commons.math3.linear.SchurTransformerTest();
               object.testSchurForm();
        }
    }

    @Test(timeout=1000000)
    public void testPOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SchurTransformerTest object = new org.apache.commons.math3.linear.SchurTransformerTest();
               object.testPOrthogonal();
        }
    }

    @Test(timeout=1000000)
    public void testPTOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SchurTransformerTest object = new org.apache.commons.math3.linear.SchurTransformerTest();
               object.testPTOrthogonal();
        }
    }

    @Test(timeout=1000000)
    public void testRandomData() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SchurTransformerTest object = new org.apache.commons.math3.linear.SchurTransformerTest();
               object.testRandomData();
        }
    }

    @Test(timeout=1000000)
    public void testRandomDataNormalDistribution() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SchurTransformerTest object = new org.apache.commons.math3.linear.SchurTransformerTest();
               object.testRandomDataNormalDistribution();
        }
    }

    @Test(timeout=1000000)
    public void testAEqualPTPt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.SchurTransformerTest object = new org.apache.commons.math3.linear.SchurTransformerTest();
               object.testAEqualPTPt();
        }
    }

}