import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SPLat {

	public static void main(String[] args) {
		int runs = 0;
		System.out.println("---------------------- run nr. " + ++runs);
		new SPLat().method();
		
		while (!missingConfigurations.isEmpty()) {
			System.out.println("---------------------- run nr. " + ++runs);
//			if (finishedConfigurations.contains(currentConfiguration)) {
//				throw new RuntimeException("configuration was executed twice" + currentConfiguration);
//			}
//			finishedConfigurations.add(currentConfiguration);
			currentConfiguration = missingConfigurations.remove(0);
			new SPLat().method();
		}
//		System.out.println("----------------------");
		System.out.println("finished after " + runs + " configurations");
	}
	static final int nrFeatures = 3;
	
	static List<Configuration> missingConfigurations = new LinkedList<>();
//	static Set<Configuration> finishedConfigurations = new HashSet<>((int)Math.pow(2, 23));
	
	static Configuration currentConfiguration = new Configuration();
	
	void method() {
		int i = 0;
		if (get(0)) {
			
			if (get(1)) {
				if (get(2)) {
					
				}
				
			}
		}

		System.out.println(i);
		System.out.println(currentConfiguration);
	}
	
	
	void method2() {
		int i = 0;

		if (get(1)) {i++;}
		if (get(1)) {i++;} 
		if (get(2)) {i++;} 
		if (get(3)) {i++;} 
		if (get(4)) {i++;} 
		if (get(5)) {i++;} 
		if (get(6)) {i++;} 
		if (get(7)) {i++;} 
		if (get(8)) {i++;} 
		if (get(9)) {i++;} 
		if (get(10)){i++;} 
		if (get(11)){i++;} 
		if (get(12)){i++;} 
		if (get(13)){i++;} 
		if (get(14)){i++;} 
		if (get(15)){i++;} 
		if (get(16)){i++;} 
		if (get(17)){i++;} 
		if (get(18)){i++;} 
		if (get(19)){i++;} 
		if (get(20)){i++;} 
		if (get(21)){i++;} 
		if (get(22)){i++;} 
//		if (get(23)){i++;} 
//		if (get(24)){i++;} 
//		if (get(25)){i++;} 
//		if (get(26)){i++;} 
//		if (get(27)){i++;} 
//		if (get(28)){i++;} 
//		if (get(29)){i++;} 
//		if (get(30)){i++;} 
//		System.out.println(i);
	}
	private boolean get(int i) {
		Boolean selection = currentConfiguration.get(i);
		if (selection == null) {
			currentConfiguration.set(i, Boolean.TRUE);
			Configuration newConfig = currentConfiguration.copy();
			
			newConfig.set(i, Boolean.FALSE);
			// TODO is this necessary?
//			if (!finishedConfigurations.contains(currentConfiguration)) {
				missingConfigurations.add(newConfig);
//			}
		}
		
		return currentConfiguration.get(i);
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