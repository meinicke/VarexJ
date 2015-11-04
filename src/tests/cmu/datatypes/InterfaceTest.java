package cmu.datatypes;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class InterfaceTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";
	
	@Conditional
	static boolean a = true;
	@Conditional
	static boolean b = true;
	@Conditional
	static boolean c = true;
	@Conditional
	static boolean d = true;

	@Test
	public void interfaceTest() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (a) {
//				System.out.println(Constants.MAX_BLOCK_SIZE);
				assertFalse(0 == Constants.MAX_BLOCK_SIZE);
			} else {
//				System.out.println(Constants.MAX_BLOCK_SIZE);
				assertFalse(0 == Constants.MAX_BLOCK_SIZE);
			}
//			System.out.println(Constants.MAX_BLOCK_SIZE);
		}
	}

}


