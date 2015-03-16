package cmu.defect4j.math3.ode;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FirstOrderConverterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testDoubleDimension() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.FirstOrderConverterTest object = new org.apache.commons.math3.ode.FirstOrderConverterTest();
               object.testDoubleDimension();
        }
    }

    @Test(timeout=120000)
    public void testDecreasingSteps() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.FirstOrderConverterTest object = new org.apache.commons.math3.ode.FirstOrderConverterTest();
               object.testDecreasingSteps();
        }
    }

    @Test(timeout=120000)
    public void testSmallStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.FirstOrderConverterTest object = new org.apache.commons.math3.ode.FirstOrderConverterTest();
               object.testSmallStep();
        }
    }

    @Test(timeout=120000)
    public void testBigStep() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ode.FirstOrderConverterTest object = new org.apache.commons.math3.ode.FirstOrderConverterTest();
               object.testBigStep();
        }
    }

}