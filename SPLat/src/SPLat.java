import java.util.Arrays;
import java.util.LinkedList;

/**
 * 
 * Original implementation by Kim et al. "SPLat: Lightweight dynamic analysis for
 * reducing combinatorics in testing configurable systems"
 * 
 * @author Jens Meinicke
 *
 */
public class SPLat {

	public static void main(String[] args) {
		int runs = 0;
		System.out.println("---------------------- run nr. " + ++runs);
		new SPLat().method();

		while (!missingConfigurations.isEmpty()) {
			System.out.println("---------------------- run nr. " + ++runs);
			currentConfiguration = missingConfigurations.remove(0);
			new SPLat().method();
		}
		System.out.println("finished after " + runs + " configurations");
	}

	static int nrFeatures = 3;
	static LinkedList<Configuration> missingConfigurations = new LinkedList<>();
	static Configuration currentConfiguration = new Configuration();

	public static boolean get(int i) {
		Boolean selection = currentConfiguration.get(i);
		if (selection == null) {
			currentConfiguration.set(i, Boolean.TRUE);
			Configuration newConfig = currentConfiguration.copy();
			newConfig.set(i, Boolean.FALSE);
			missingConfigurations.addFirst(newConfig);
		}

		return currentConfiguration.get(i);
	}

	void method() {
		int i = 0;
		if (get(0)) {
			i++;
			if (get(1)) {
				i++;
				if (get(2)) {
					i++;
				}

			}
		}

		System.out.println(i);
		System.out.println(currentConfiguration);
	}
}
class Configuration {
	Boolean[] selection = new Boolean[SPLat.nrFeatures];

	Boolean get(int i) {
		return selection[i];
	}
	void set(int i, Boolean b) {
		selection[i] = b;
	}
	
	Configuration copy() {
		Configuration c = new Configuration();
		for (int k = 0; k < selection.length; k++) {
			if (selection[k] != null) {
				c.set(k, selection[k]);
			}
		}
		return c;
	}
	
	@Override
	public int hashCode() {
		int hash = 0;
		for (int j = 0; j < selection.length; j++) {
			if (selection[j] != null && selection[j]) {
				hash += Math.pow(2, j);
			}
		}
		return hash;
	}
	@Override
	public boolean equals(Object obj) {
		Configuration other = (Configuration) obj;
		return Arrays.equals(selection, other.selection);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(selection);
	}
}