package cmu.defect4j.math3.analysis.differentiation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class GradientFunctionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void test2DDistance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.GradientFunctionTest object = new org.apache.commons.math3.analysis.differentiation.GradientFunctionTest();
               object.test2DDistance();
        }
    }

    @Test(timeout=120000)
    public void test3DDistance() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.differentiation.GradientFunctionTest object = new org.apache.commons.math3.analysis.differentiation.GradientFunctionTest();
               object.test3DDistance();
        }
    }

}