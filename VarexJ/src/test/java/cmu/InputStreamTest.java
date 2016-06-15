package cmu;

import java.io.InputStream;
import java.util.Arrays;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

/**
 * 
 * Some small test cases to test the basic behavior of variability-aware execution. 
 * 
 * @author Jens Meinicke
 *
 */
@SuppressWarnings("unused")
public class InputStreamTest extends TestJPF {

	static String[] JPF_CONFIGURATION = new String[]{"+search.class=.search.RandomSearch"};

	@Test
	public void streamTest() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			System.out.println("START");
			InputStream in = System.in;
			assertNotNull(in);
			newStream(in);
		}
	}
	
	void newStream(java.io.InputStream dstream) {
		new java.io.InputStreamReader(dstream);
	}
}
