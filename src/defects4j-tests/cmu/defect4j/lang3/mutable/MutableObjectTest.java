package cmu.defect4j.lang3.mutable;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class MutableObjectTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableObjectTest object = new org.apache.commons.lang3.mutable.MutableObjectTest();
               object.testConstructors();
        }
    }

    @Test(timeout=120000)
    public void testGetSet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableObjectTest object = new org.apache.commons.lang3.mutable.MutableObjectTest();
               object.testGetSet();
        }
    }

    @Test(timeout=120000)
    public void testEquals() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableObjectTest object = new org.apache.commons.lang3.mutable.MutableObjectTest();
               object.testEquals();
        }
    }

    @Test(timeout=120000)
    public void testHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableObjectTest object = new org.apache.commons.lang3.mutable.MutableObjectTest();
               object.testHashCode();
        }
    }

    @Test(timeout=120000)
    public void testToString() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.mutable.MutableObjectTest object = new org.apache.commons.lang3.mutable.MutableObjectTest();
               object.testToString();
        }
    }

}