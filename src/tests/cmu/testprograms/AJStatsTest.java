package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Ignore;
import org.junit.Test;

public class AJStatsTest extends TestJPF {
	
	private static final String FM = "";
	private static String[] config = {"+search.class= .search.RandomSearch", "+classpath=lib\\AJStats.jar", FM};

 	@Ignore 
 	@Test
	public void ajStats1Test() {
		if (verifyNoPropertyViolation(config)) {
			if (ajs.FeatureSwitches.valid_product()) {
				ajs.PL_Interface_impl.main(new String[]{"1"});
			}
		}
	}

 	@Test
	public void ajStats2Test() {
		if (verifyNoPropertyViolation(config)) {
			if (ajs.FeatureSwitches.valid_product()) {
				ajs.PL_Interface_impl.main(new String[]{"2"});
			}
		}
	}


}
