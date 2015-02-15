package cmu.defect4j.lang3.tuple;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ImmutableTripleTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.ImmutableTripleTest object = new org.apache.commons.lang3.tuple.ImmutableTripleTest();
               object.testHashCode();
        }
    }

    @Test(timeout=10000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.ImmutableTripleTest object = new org.apache.commons.lang3.tuple.ImmutableTripleTest();
               object.testToString();
        }
    }

    @Test(timeout=10000)
    public void testTripleOf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.ImmutableTripleTest object = new org.apache.commons.lang3.tuple.ImmutableTripleTest();
               object.testTripleOf();
        }
    }

    @Test(timeout=10000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.ImmutableTripleTest object = new org.apache.commons.lang3.tuple.ImmutableTripleTest();
               object.testEquals();
        }
    }

    @Test(timeout=10000)
    public void testBasic() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.ImmutableTripleTest object = new org.apache.commons.lang3.tuple.ImmutableTripleTest();
               object.testBasic();
        }
    }

    @Test(timeout=10000)
    public void testSerialization() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.tuple.ImmutableTripleTest object = new org.apache.commons.lang3.tuple.ImmutableTripleTest();
               object.testSerialization();
        }
    }

}