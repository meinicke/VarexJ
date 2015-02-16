package cmu.defect4j.lang3.tuple;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class TripleTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.TripleTest object = new org.apache.commons.lang3.tuple.TripleTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testTripleOf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.TripleTest object = new org.apache.commons.lang3.tuple.TripleTest();
               object.testTripleOf();
        }
    }

    @Test(timeout=120000)
    public void testComparable1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.TripleTest object = new org.apache.commons.lang3.tuple.TripleTest();
               object.testComparable1();
        }
    }

    @Test(timeout=120000)
    public void testComparable2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.TripleTest object = new org.apache.commons.lang3.tuple.TripleTest();
               object.testComparable2();
        }
    }

    @Test(timeout=120000)
    public void testToStringCustom() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.TripleTest object = new org.apache.commons.lang3.tuple.TripleTest();
               object.testToStringCustom();
        }
    }

    @Test(timeout=120000)
    public void testFormattable_simple() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.TripleTest object = new org.apache.commons.lang3.tuple.TripleTest();
               object.testFormattable_simple();
        }
    }

    @Test(timeout=120000)
    public void testFormattable_padded() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.TripleTest object = new org.apache.commons.lang3.tuple.TripleTest();
               object.testFormattable_padded();
        }
    }

    @Test(timeout=120000)
    public void testCompatibilityBetweenTriples() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.TripleTest object = new org.apache.commons.lang3.tuple.TripleTest();
               object.testCompatibilityBetweenTriples();
        }
    }

    @Test(timeout=120000)
    public void testComparable3() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.TripleTest object = new org.apache.commons.lang3.tuple.TripleTest();
               object.testComparable3();
        }
    }

    @Test(timeout=120000)
    public void testComparable4() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.TripleTest object = new org.apache.commons.lang3.tuple.TripleTest();
               object.testComparable4();
        }
    }

}