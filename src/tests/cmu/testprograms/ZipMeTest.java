package cmu.testprograms;

import gov.nasa.jpf.util.test.TestJPF;

import java.io.IOException;

import net.sf.zipme.ZipTest;

import org.junit.Test;

public class ZipMeTest extends TestJPF {
	
	private static final String FM = "+featuremodel=zipme.dimacs";
	private static String[] config = {"+search.class= .search.RandomSearch", "+classpath=lib\\ZipMe.jar", FM};

	@Test
	public void runZipMe() {
		if (verifyNoPropertyViolation(config)) {
			
		}
	}


}
