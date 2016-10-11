package cmu.datatypes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class CollectionsTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	@Conditional
	static boolean a = true;

	@Test
	public void sortDefaultTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			List<Integer> c = new LinkedList<>();
			int i = 10;
			c.add(i--);
			c.add(i--);
			c.add(i--);
			c.add(i--);
			c.add(i--);
			c.add(i--);
			c.add(i--);
			Collections.sort(c);
		}
	}
}
