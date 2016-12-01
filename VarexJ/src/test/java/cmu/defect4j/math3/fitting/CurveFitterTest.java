package cmu.defect4j.math3.fitting;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class CurveFitterTest extends TestJPF {

    private final String[] config = {"+search.class= .search.RandomSearch","+nhandler.delegateUnhandledNative","+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/math6.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1800000)
    public void testMath303() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.CurveFitterTest object = new org.apache.commons.math3.fitting.CurveFitterTest();
               object.testMath303();
        }
    }

    @Test(timeout=1800000)
    public void testMath304() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.CurveFitterTest object = new org.apache.commons.math3.fitting.CurveFitterTest();
               object.testMath304();
        }
    }

    @Test(timeout=1800000)
    public void testMath372() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.CurveFitterTest object = new org.apache.commons.math3.fitting.CurveFitterTest();
               object.testMath372();
        }
    }

}