package cmu.defect4j.lang3.builder;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ReflectionToStringBuilderExcludeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=10000)
    public void test_toStringExclude() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest object = new org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest();
               object.test_toStringExclude();
        }
    }

    @Test(timeout=10000)
    public void test_toStringExcludeArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest object = new org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest();
               object.test_toStringExcludeArray();
        }
    }

    @Test(timeout=10000)
    public void test_toStringExcludeArrayWithNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest object = new org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest();
               object.test_toStringExcludeArrayWithNull();
        }
    }

    @Test(timeout=10000)
    public void test_toStringExcludeArrayWithNulls() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest object = new org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest();
               object.test_toStringExcludeArrayWithNulls();
        }
    }

    @Test(timeout=10000)
    public void test_toStringExcludeCollection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest object = new org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest();
               object.test_toStringExcludeCollection();
        }
    }

    @Test(timeout=10000)
    public void test_toStringExcludeCollectionWithNull() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest object = new org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest();
               object.test_toStringExcludeCollectionWithNull();
        }
    }

    @Test(timeout=10000)
    public void test_toStringExcludeCollectionWithNulls() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest object = new org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest();
               object.test_toStringExcludeCollectionWithNulls();
        }
    }

    @Test(timeout=10000)
    public void test_toStringExcludeEmptyArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest object = new org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest();
               object.test_toStringExcludeEmptyArray();
        }
    }

    @Test(timeout=10000)
    public void test_toStringExcludeEmptyCollection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest object = new org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest();
               object.test_toStringExcludeEmptyCollection();
        }
    }

    @Test(timeout=10000)
    public void test_toStringExcludeNullArray() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest object = new org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest();
               object.test_toStringExcludeNullArray();
        }
    }

    @Test(timeout=10000)
    public void test_toStringExcludeNullCollection() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest object = new org.apache.commons.lang3.builder.ReflectionToStringBuilderExcludeTest();
               object.test_toStringExcludeNullCollection();
        }
    }

}