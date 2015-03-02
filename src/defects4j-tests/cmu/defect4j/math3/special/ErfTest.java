package cmu.defect4j.math3.special;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ErfTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testLargeValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testLargeValues();
        }
    }

    @Test(timeout=120000)
    public void testErf1960() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErf1960();
        }
    }

    @Test(timeout=120000)
    public void testErf2576() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErf2576();
        }
    }

    @Test(timeout=120000)
    public void testErf2807() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErf2807();
        }
    }

    @Test(timeout=120000)
    public void testErf0() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErf0();
        }
    }

    @Test(timeout=120000)
    public void testErf3291() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErf3291();
        }
    }

    @Test(timeout=120000)
    public void testErfGnu() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErfGnu();
        }
    }

    @Test(timeout=120000)
    public void testErfcGnu() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErfcGnu();
        }
    }

    @Test(timeout=120000)
    public void testErfcMaple() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErfcMaple();
        }
    }

    @Test(timeout=120000)
    public void testTwoArgumentErf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testTwoArgumentErf();
        }
    }

    @Test(timeout=120000)
    public void testErfInvNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErfInvNaN();
        }
    }

    @Test(timeout=120000)
    public void testErfInvInfinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErfInvInfinite();
        }
    }

    @Test(timeout=120000)
    public void testErfInv() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErfInv();
        }
    }

    @Test(timeout=120000)
    public void testErfcInvNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErfcInvNaN();
        }
    }

    @Test(timeout=120000)
    public void testErfcInvInfinite() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErfcInvInfinite();
        }
    }

    @Test(timeout=120000)
    public void testErfcInv() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.special.ErfTest object = new org.apache.commons.math3.special.ErfTest();
               object.testErfcInv();
        }
    }

}