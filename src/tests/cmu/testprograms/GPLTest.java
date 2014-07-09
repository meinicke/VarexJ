package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class GPLTest extends TestJPF {

	@Test
	public void runGPLRandom1() {
		if (verifyNoPropertyViolation("+search.class=.search.RandomSearch", "+classpath=lib\\GPL.jar")) {
			GPL.Main.main(new String[]{"lib\\GPL\\random1-gpl-benchmark.txt", "v0"});
		}
	}
	
	@Test
	public void runGPLSimple() {
		if (verifyNoPropertyViolation("+search.class=.search.RandomSearch", "+classpath=lib\\GPL.jar")) {
			GPL.Main.main(new String[]{"lib\\GPL\\simple.txt", "v0"});
		}
	}
}
