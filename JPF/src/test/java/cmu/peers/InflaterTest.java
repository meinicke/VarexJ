package cmu.peers;

import java.util.zip.Inflater;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class InflaterTest extends TestJPF {
	
	@Test
	public void test() throws Exception {
		if (verifyNoPropertyViolation()) {
			new Inflater().finished();
			new Inflater(true).finished();
		}
		
	}

}
