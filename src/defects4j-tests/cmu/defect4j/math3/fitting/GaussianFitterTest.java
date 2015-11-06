package cmu.defect4j.math3.fitting;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class GaussianFitterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testFit01() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.GaussianFitterTest object = new org.apache.commons.math3.fitting.GaussianFitterTest();
               object.testFit01();
        }
    }

    @Test(timeout=1000000)
    public void testFit02() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.fitting.GaussianFitterTest object = new org.apache.commons.math3.fitting.GaussianFitterTest();
               object.testFit02();
        }
    }

    @Test(timeout=1000000)
    public void testFit03() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.fitting.GaussianFitterTest object = new org.apache.commons.math3.fitting.GaussianFitterTest();
               object.testFit03();
        }
    }

    @Test(timeout=1000000)
    public void testFit04() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.GaussianFitterTest object = new org.apache.commons.math3.fitting.GaussianFitterTest();
               object.testFit04();
        }
    }

    @Test(timeout=1000000)
    public void testFit05() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.GaussianFitterTest object = new org.apache.commons.math3.fitting.GaussianFitterTest();
               object.testFit05();
        }
    }

    @Test(timeout=1000000)
    public void testFit06() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.GaussianFitterTest object = new org.apache.commons.math3.fitting.GaussianFitterTest();
               object.testFit06();
        }
    }

    @Test(timeout=1000000)
    public void testFit07() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.GaussianFitterTest object = new org.apache.commons.math3.fitting.GaussianFitterTest();
               object.testFit07();
        }
    }

    @Test(timeout=1000000)
    public void testMath519() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.GaussianFitterTest object = new org.apache.commons.math3.fitting.GaussianFitterTest();
               object.testMath519();
        }
    }

    @Test(timeout=1000000)
    public void testMath798() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.GaussianFitterTest object = new org.apache.commons.math3.fitting.GaussianFitterTest();
               object.testMath798();
        }
    }

}