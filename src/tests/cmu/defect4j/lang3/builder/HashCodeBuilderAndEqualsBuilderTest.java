package cmu.defect4j.lang3.builder;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class HashCodeBuilderAndEqualsBuilderTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void testInteger() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest();
               object.testInteger();
        }
    }

    @Test(timeout=10000)
    public void testIntegerWithTransients() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest();
               object.testIntegerWithTransients();
        }
    }

    @Test(timeout=10000)
    public void testFixture() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest();
               object.testFixture();
        }
    }

    @Test(timeout=10000)
    public void testFixtureWithTransients() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest object = new org.apache.commons.lang3.builder.HashCodeBuilderAndEqualsBuilderTest();
               object.testFixtureWithTransients();
        }
    }

}