package cmu.defect4j.math3.dfp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DfpDecTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testRound() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpDecTest object = new org.apache.commons.math3.dfp.DfpDecTest();
               object.setUp();
               object.testRound();
        }
    }

    @Test(timeout=120000)
    public void testRoundDecimal10() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpDecTest object = new org.apache.commons.math3.dfp.DfpDecTest();
               object.setUp();
               object.testRoundDecimal10();
        }
    }

    @Test(timeout=120000)
    public void testNextAfter() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpDecTest object = new org.apache.commons.math3.dfp.DfpDecTest();
               object.setUp();
               object.testNextAfter();
        }
    }

}