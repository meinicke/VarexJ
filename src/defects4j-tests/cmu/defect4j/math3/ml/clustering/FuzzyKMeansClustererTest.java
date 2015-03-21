package cmu.defect4j.math3.ml.clustering;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class FuzzyKMeansClustererTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testCluster() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ml.clustering.FuzzyKMeansClustererTest object = new org.apache.commons.math3.ml.clustering.FuzzyKMeansClustererTest();
               object.testCluster();
        }
    }

    @Test(timeout=1000000)
    public void testNullDataset() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NullArgumentException", config)) {
               org.apache.commons.math3.ml.clustering.FuzzyKMeansClustererTest object = new org.apache.commons.math3.ml.clustering.FuzzyKMeansClustererTest();
               object.testNullDataset();
        }
    }

    @Test(timeout=1000000)
    public void testGetters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.ml.clustering.FuzzyKMeansClustererTest object = new org.apache.commons.math3.ml.clustering.FuzzyKMeansClustererTest();
               object.testGetters();
        }
    }

    @Test(timeout=1000000)
    public void testTooSmallFuzzynessFactor() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.ml.clustering.FuzzyKMeansClustererTest object = new org.apache.commons.math3.ml.clustering.FuzzyKMeansClustererTest();
               object.testTooSmallFuzzynessFactor();
        }
    }

}