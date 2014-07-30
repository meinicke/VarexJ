package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class AJStatsTest extends TestJPF {
	
	private static final String FM = "";
	private static String[] config = {"+search.class= .search.RandomSearch", "+classpath=lib\\AJStats.jar", FM};

 	@Test
	public void ajStatsTest() {
		if (verifyNoPropertyViolation(config)) {
			if (ajs.FeatureSwitches.valid_product()) {
				ajs.PL_Interface_impl.main(null);
			}
		}
	}


}
