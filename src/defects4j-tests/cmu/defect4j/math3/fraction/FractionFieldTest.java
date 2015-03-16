package cmu.defect4j.math3.fraction;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FractionFieldTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testZero() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFieldTest object = new org.apache.commons.math3.fraction.FractionFieldTest();
               object.testZero();
        }
    }

    @Test(timeout=120000)
    public void testOne() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFieldTest object = new org.apache.commons.math3.fraction.FractionFieldTest();
               object.testOne();
        }
    }

    @Test(timeout=120000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fraction.FractionFieldTest object = new org.apache.commons.math3.fraction.FractionFieldTest();
               object.testSerial();
        }
    }

}