package cmu.datatypes;


import java.util.Collection;
import java.util.LinkedList;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class CollectionPrintTest extends TestJPF {

	static String[] JPF_CONFIGURATION = {/*"+interaction=interaction",*/"+choice=MapChoice", "+search.class= .search.RandomSearch", "+invocation=false"};
	
	@Conditional static boolean a1 = true;
	@Conditional static boolean a2 = true;
	@Conditional static boolean a3 = true;
	@Conditional static boolean a4 = true;
	@Test
	public void collectionTests() throws Exception {// BUG in JPF_StringBuilder
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Collection<Integer> set = new LinkedList<>();
			int i = 0;
			if (a1 ) set.add(i); i++;
			if (a2 ) set.add(i); i++;
			if (a3 ) set.add(i); i++;
			if (a4 ) set.add(i); i++;
			System.out.println(set);
		}
	}
}
