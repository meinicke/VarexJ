package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

import MinePumpSystem.PL_Interface_impl;

public class MineTest extends TestJPF {
	
	private static final String FM = "+featuremodel=mine.dimacs";
	private static String[] config = {"+search.class= .search.RandomSearch", "+classpath=lib\\Mine.jar", FM};

	@Test
	public void runZipMe() {
		if (verifyNoPropertyViolation(config)) {
			if (!MinePumpSystem.FeatureSwitches.__SELECTED_FEATURE_startCommand) {
				PL_Interface_impl.main(new String[]{"1"});
			}
		}
	}
	
	@Test
	public void runZipMe2() {
		if (verifyNoPropertyViolation(config)) {
			if (MinePumpSystem.FeatureSwitches.__SELECTED_FEATURE_startCommand) {
				PL_Interface_impl.main(new String[]{"1"});
			}
		}
	}
	
	@Test
	public void runZipMe3() {
		if (verifyNoPropertyViolation(config)) {
			PL_Interface_impl.main(new String[]{"1"});
		}
	}

}
