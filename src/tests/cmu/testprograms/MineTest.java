package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

import MinePumpSystem.PL_Interface_impl;

public class MineTest extends TestJPF {
	
	private static final String FM = "+featuremodel=mine.dimacs";
	private static String[] config = {"+search.class= .search.RandomSearch", "+classpath=lib\\Mine.jar,lib\\aspectjrt.jar", FM};

	@Test
	public void mineTest1() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"1"});
		}
	}
	
	@Test
	public void mineTest2() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"2"});
		}
	}
	
	@Test
	public void mineTest3() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"3"});
		}
	}
	
	@Test
	public void mineTest4() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"4"});
		}
	}
	
	@Test
	public void mineTest5() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"5"});
		}
	}
}
