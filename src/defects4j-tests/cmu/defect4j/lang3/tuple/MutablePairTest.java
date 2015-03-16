package cmu.defect4j.lang3.tuple;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MutablePairTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.MutablePairTest object = new org.apache.commons.lang3.tuple.MutablePairTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.MutablePairTest object = new org.apache.commons.lang3.tuple.MutablePairTest();
               object.testHashCode();
        }
    }

    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.MutablePairTest object = new org.apache.commons.lang3.tuple.MutablePairTest();
               object.testToString();
        }
    }

    @Test(timeout=120000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.MutablePairTest object = new org.apache.commons.lang3.tuple.MutablePairTest();
               object.testSerialization();
        }
    }

    @Test(timeout=120000)
    public void testDefault() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.MutablePairTest object = new org.apache.commons.lang3.tuple.MutablePairTest();
               object.testDefault();
        }
    }

    @Test(timeout=120000)
    public void testMutate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.MutablePairTest object = new org.apache.commons.lang3.tuple.MutablePairTest();
               object.testMutate();
        }
    }

    @Test(timeout=120000)
    public void testBasic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.MutablePairTest object = new org.apache.commons.lang3.tuple.MutablePairTest();
               object.testBasic();
        }
    }

    @Test(timeout=120000)
    public void testPairOf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.MutablePairTest object = new org.apache.commons.lang3.tuple.MutablePairTest();
               object.testPairOf();
        }
    }

}