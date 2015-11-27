package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class HessenbergTransformerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testNonSquare() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.HessenbergTransformerTest object = new org.apache.commons.math3.linear.HessenbergTransformerTest();
               object.testNonSquare();
        }
    }

    @Test(timeout=1000000)
    public void testAEqualPHPt() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.HessenbergTransformerTest object = new org.apache.commons.math3.linear.HessenbergTransformerTest();
               object.testAEqualPHPt();
        }
    }

    @Test(timeout=1000000)
    public void testPOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.HessenbergTransformerTest object = new org.apache.commons.math3.linear.HessenbergTransformerTest();
               object.testPOrthogonal();
        }
    }

    @Test(timeout=1000000)
    public void testPTOrthogonal() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.HessenbergTransformerTest object = new org.apache.commons.math3.linear.HessenbergTransformerTest();
               object.testPTOrthogonal();
        }
    }

    @Test(timeout=1000000)
    public void testHessenbergForm() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.HessenbergTransformerTest object = new org.apache.commons.math3.linear.HessenbergTransformerTest();
               object.testHessenbergForm();
        }
    }

    @Test(timeout=1000000)
    public void testRandomData() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.HessenbergTransformerTest object = new org.apache.commons.math3.linear.HessenbergTransformerTest();
               object.testRandomData();
        }
    }

    @Test(timeout=1000000)
    public void testRandomDataNormalDistribution() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.HessenbergTransformerTest object = new org.apache.commons.math3.linear.HessenbergTransformerTest();
               object.testRandomDataNormalDistribution();
        }
    }

    @Test(timeout=1000000)
    public void testMatricesValues5() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.HessenbergTransformerTest object = new org.apache.commons.math3.linear.HessenbergTransformerTest();
               object.testMatricesValues5();
        }
    }

    @Test(timeout=1000000)
    public void testMatricesValues3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.HessenbergTransformerTest object = new org.apache.commons.math3.linear.HessenbergTransformerTest();
               object.testMatricesValues3();
        }
    }

}