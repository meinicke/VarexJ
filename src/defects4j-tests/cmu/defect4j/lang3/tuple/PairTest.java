package cmu.defect4j.lang3.tuple;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import gov.nasa.jpf.util.test.TestJPF;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

public class PairTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testMapEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.PairTest object = new org.apache.commons.lang3.tuple.PairTest();
               object.testMapEntry();
        }
    }

    @Test(timeout=120000)
    public void testCompatibilityBetweenPairs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.PairTest object = new org.apache.commons.lang3.tuple.PairTest();
               object.testCompatibilityBetweenPairs();
        }
    }

    @Test(timeout=120000)
    public void testComparable1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.PairTest object = new org.apache.commons.lang3.tuple.PairTest();
               object.testComparable1();
        }
    }

    @Test(timeout=120000)
    public void testComparable2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.PairTest object = new org.apache.commons.lang3.tuple.PairTest();
               object.testComparable2();
        }
    }

    @Test(timeout=120000)// FIXME MJIEnv#format()
    public void testToStringCustom() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.PairTest object = new org.apache.commons.lang3.tuple.PairTest();
               object.testToStringCustom();
        }
    }

    @Test(timeout=120000)// FIXME MJIEnv#format()
    public void testFormattable_simple() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.PairTest object = new org.apache.commons.lang3.tuple.PairTest();
               object.testFormattable_simple();
        }
    }

    @Test(timeout=120000)// FIXME MJIEnv#format()
    public void testFormattable_padded() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.PairTest object = new org.apache.commons.lang3.tuple.PairTest();
               object.testFormattable_padded();
        }
    }

    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.PairTest object = new org.apache.commons.lang3.tuple.PairTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testPairOf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.PairTest object = new org.apache.commons.lang3.tuple.PairTest();
               object.testPairOf();
        }
    }

}