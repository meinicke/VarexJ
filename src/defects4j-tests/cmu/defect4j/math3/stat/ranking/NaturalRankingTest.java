package cmu.defect4j.math3.stat.ranking;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class NaturalRankingTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testDefault() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.ranking.NaturalRankingTest object = new org.apache.commons.math3.stat.ranking.NaturalRankingTest();
               object.testDefault();
        }
    }

    @Test(timeout=1000000)
    public void testNaNsMaximalTiesMinimum() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.ranking.NaturalRankingTest object = new org.apache.commons.math3.stat.ranking.NaturalRankingTest();
               object.testNaNsMaximalTiesMinimum();
        }
    }

    @Test(timeout=1000000)
    public void testNaNsRemovedTiesSequential() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.ranking.NaturalRankingTest object = new org.apache.commons.math3.stat.ranking.NaturalRankingTest();
               object.testNaNsRemovedTiesSequential();
        }
    }

    @Test(timeout=1000000)
    public void testNaNsAndInfs() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.ranking.NaturalRankingTest object = new org.apache.commons.math3.stat.ranking.NaturalRankingTest();
               object.testNaNsAndInfs();
        }
    }

    @Test(timeout=1000000)
    public void testNaNsMinimalTiesMaximum() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.ranking.NaturalRankingTest object = new org.apache.commons.math3.stat.ranking.NaturalRankingTest();
               object.testNaNsMinimalTiesMaximum();
        }
    }

    @Test(timeout=1000000)
    public void testNaNsMinimalTiesAverage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.ranking.NaturalRankingTest object = new org.apache.commons.math3.stat.ranking.NaturalRankingTest();
               object.testNaNsMinimalTiesAverage();
        }
    }

    @Test(timeout=1000000)
    public void testNaNsFixedTiesRandom() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.ranking.NaturalRankingTest object = new org.apache.commons.math3.stat.ranking.NaturalRankingTest();
               object.testNaNsFixedTiesRandom();
        }
    }

    @Test(timeout=1000000)
    public void testNaNsFailed() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotANumberException", config)) {
               org.apache.commons.math3.stat.ranking.NaturalRankingTest object = new org.apache.commons.math3.stat.ranking.NaturalRankingTest();
               object.testNaNsFailed();
        }
    }

    @Test(timeout=1000000)
    public void testNoNaNsFailed() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.stat.ranking.NaturalRankingTest object = new org.apache.commons.math3.stat.ranking.NaturalRankingTest();
               object.testNoNaNsFailed();
        }
    }

}