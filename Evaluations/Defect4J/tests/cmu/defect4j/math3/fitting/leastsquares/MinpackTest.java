package cmu.defect4j.math3.fitting.leastsquares;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MinpackTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testMinpackLinearFullRank() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackLinearFullRank();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackLinearRank1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackLinearRank1();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackLinearRank1ZeroColsAndRows() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackLinearRank1ZeroColsAndRows();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackRosenbrok() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackRosenbrok();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackHelicalValley() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackHelicalValley();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackPowellSingular() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackPowellSingular();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackFreudensteinRoth() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackFreudensteinRoth();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackBard() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackBard();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackKowalikOsborne() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackKowalikOsborne();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackMeyer() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackMeyer();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackWatson() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackWatson();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackBox3Dimensional() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackBox3Dimensional();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackJennrichSampson() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackJennrichSampson();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackBrownDennis() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackBrownDennis();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackChebyquad() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackChebyquad();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackBrownAlmostLinear() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackBrownAlmostLinear();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackOsborne1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackOsborne1();
        }
    }

    @Test(timeout=1000000)
    public void testMinpackOsborne2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.fitting.leastsquares.MinpackTest object = new org.apache.commons.math3.fitting.leastsquares.MinpackTest();
               object.testMinpackOsborne2();
        }
    }

}