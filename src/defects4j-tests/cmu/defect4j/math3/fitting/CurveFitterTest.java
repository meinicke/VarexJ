package cmu.defect4j.math3.fitting;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class CurveFitterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testMath303() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.CurveFitterTest object = new org.apache.commons.math3.fitting.CurveFitterTest();
               object.testMath303();
        }
    }

    @Test(timeout=120000)
    public void testMath304() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.CurveFitterTest object = new org.apache.commons.math3.fitting.CurveFitterTest();
               object.testMath304();
        }
    }

    @Test(timeout=120000)
    public void testMath372() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.CurveFitterTest object = new org.apache.commons.math3.fitting.CurveFitterTest();
               object.testMath372();
        }
    }

}