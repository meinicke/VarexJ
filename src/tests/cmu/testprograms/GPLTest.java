package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Ignore;
import org.junit.Test;

public class GPLTest extends TestJPF {

	@Ignore @Test
	public void random1Test() {
		if (verifyNoPropertyViolation("+search.class=.search.RandomSearch", "+classpath=lib\\GPL.jar")) {
			run("random1-gpl-benchmark.txt");
		}
	}
	
	@Test
	public void simpleTest() {
		if (verifyNoPropertyViolation("+search.class=.search.RandomSearch", "+classpath=lib\\GPL.jar")) {
			run("Simple.txt");
		}
	}
	
	@Test
	public void network4Test() {
		if (verifyNoPropertyViolation("+search.class=.search.RandomSearch", "+classpath=lib\\GPL.jar")) {
			run("gpl-4-network-benchmark.txt");
		}
	}
	
	
	
	private void run(String graph) {
		GPL.Main.main(new String[]{"lib\\GPL\\" + graph, "v0"});
	}
}
