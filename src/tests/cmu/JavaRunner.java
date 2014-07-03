package cmu;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith(Parameterized.class)
public class JavaRunner extends VariabilityAwareTest {

	@Before
	public void setJava() {
		RUN_WITH_JPF = false;
	}
	
	
	// TODO maybe push top
	public JavaRunner(Boolean a, Boolean b, Boolean c, Boolean d,
			Boolean x, Boolean y, Boolean z) {
		VariabilityAwareTest.a = a; 
		VariabilityAwareTest.b = b;
		VariabilityAwareTest.c = c;
		VariabilityAwareTest.d = d;
		VariabilityAwareTest.x = x;
		VariabilityAwareTest.y = y;
		VariabilityAwareTest.z = z;
	}
	
	@Parameters
	public static List<Object[]> configurations() {
		return createConfigurations(7);
	}
	
	public static void main(String[] args) {
		createConfigurations(3);
	}
	
	private static List<Object[]> createConfigurations(int numberOfFeatures) {
		Object[][] configurations = new Object[(int)Math.pow(2, numberOfFeatures)][numberOfFeatures];
		for (int i = 0;i <= Math.pow(2, numberOfFeatures)-1; i++) {
//			int configuration = i;
//			for (int j = 1; i <= numberOfFeatures; j++) {
//				if (configuration % (2) == 0) {
//					configurations[i][j-1] = new Boolean(true);
//				} else {
//					configurations[i][j-1] = new Boolean(false);
//				}
//				configuration = configuration>>1 ;
//			}
			
			configurations[i] = createConfiguration(i, numberOfFeatures);
		}
		return Arrays.asList(configurations);
	}

	private static Boolean[] createConfiguration(int configuration, int numberOfFeatures) {
		Boolean[] selections = new Boolean[numberOfFeatures];
		for (int i = 1; i <= numberOfFeatures; i++) {
			if (configuration % (2) == 0) {
				selections[i-1] = (true);
			} else {
				selections[i-1] = (false);
			}
			configuration = configuration>>1 ;
		}
		
		return selections;
	}

}
