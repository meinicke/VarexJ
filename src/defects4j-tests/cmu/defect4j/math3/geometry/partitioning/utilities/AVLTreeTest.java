package cmu.defect4j.math3.geometry.partitioning.utilities;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class AVLTreeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testDelete1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest object = new org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest();
               object.testDelete1();
        }
    }

    @Test(timeout=120000)
    public void testNavigation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest object = new org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest();
               object.testNavigation();
        }
    }

    @Test(timeout=120000)
    public void testSearch() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest object = new org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest();
               object.testSearch();
        }
    }

    @Test(timeout=120000)
    public void testRepetition() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest object = new org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest();
               object.testRepetition();
        }
    }

    @Test(timeout=120000)
    public void testInsert() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest object = new org.apache.commons.math3.geometry.partitioning.utilities.AVLTreeTest();
               object.testInsert();
        }
    }

}