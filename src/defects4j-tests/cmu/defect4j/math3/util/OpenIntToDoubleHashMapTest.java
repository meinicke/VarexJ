package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class OpenIntToDoubleHashMapTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testIterator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testIterator();
        }
    }

    @Test(timeout=120000)
    public void testCopy() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testCopy();
        }
    }

    @Test(timeout=120000)
    public void testConcurrentModification() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testConcurrentModification();
        }
    }

    @Test(timeout=120000)
    public void testPutAndGetWith0ExpectedSize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testPutAndGetWith0ExpectedSize();
        }
    }

    @Test(timeout=120000)
    public void testPutAndGetWithExpectedSize() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testPutAndGetWithExpectedSize();
        }
    }

    @Test(timeout=120000)
    public void testPutAndGet() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testPutAndGet();
        }
    }

    @Test(timeout=120000)
    public void testPutAbsentOnExisting() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testPutAbsentOnExisting();
        }
    }

    @Test(timeout=120000)
    public void testPutOnExisting() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testPutOnExisting();
        }
    }

    @Test(timeout=120000)
    public void testGetAbsent() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testGetAbsent();
        }
    }

    @Test(timeout=120000)
    public void testGetFromEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testGetFromEmpty();
        }
    }

    @Test(timeout=120000)
    public void testRemove() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testRemove();
        }
    }

    @Test(timeout=120000)
    public void testRemove2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testRemove2();
        }
    }

    @Test(timeout=120000)
    public void testRemoveFromEmpty() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testRemoveFromEmpty();
        }
    }

    @Test(timeout=120000)
    public void testRemoveAbsent() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testRemoveAbsent();
        }
    }

    @Test(timeout=120000)
    public void testContainsKey() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testContainsKey();
        }
    }

    @Test(timeout=120000)
    public void testPutKeysWithCollisions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testPutKeysWithCollisions();
        }
    }

    @Test(timeout=120000)
    public void testPutKeysWithCollision2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.OpenIntToDoubleHashMapTest object = new org.apache.commons.math3.util.OpenIntToDoubleHashMapTest();
               object.setUp();
               object.testPutKeysWithCollision2();
        }
    }

}