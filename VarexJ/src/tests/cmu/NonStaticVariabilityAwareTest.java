package cmu;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class NonStaticVariabilityAwareTest extends TestJPF {

	static String[] JPF_CONFIGURATION = new String[]{/*"+interaction=interaction",*/ "+search.class= .search.RandomSearch", "+choice=MapChoice"};
	
	@Test
	public void simpleForTest() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			NonStaticFeature[] mains = new NonStaticFeature[10];
			for (int i = 0; i < mains.length; i++) {
				mains[i] = new NonStaticFeature();
			}
			int rounds = 1;
			for (NonStaticFeature m : mains) {
				if (m.a) {
					rounds++;
				}
			}
			
			int a = 0;
			for (int start = 0; start <= rounds; start++) {
				a++;
			}
			System.out.println(a);
		}
	}

	

}

class NonStaticFeature {

	@Conditional
	boolean a = true;
	
}
