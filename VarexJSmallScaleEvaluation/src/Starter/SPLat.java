package Starter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;

import inc.IncSPLat;
import nesting.NestSPLat;
import nesting2.NestVoidSPLat;
import nointeraction.NoSPLat;
import prefix.PrefixSPLat;
import reference.RefSPLat;
/**
 * 
 * Original implementation by 
 * Kim et al. SPLat: Lightweight dynamic analysis for reducing combinatorics in testing configurable systems
 * 
 * @author Jens Meinicke
 *
 */
public class SPLat {

	private static long maxUsedMemory = 0;

	public static void main(String[] args) {
		ISPLatEvaluation[] testClasses = new ISPLatEvaluation[]{
//				new NoSPLat(),
//				new PrefixSPLat(), 
//				new RefSPLat(), 
//				new IncSPLat(), 
//				new NestSPLat(),
				new NestVoidSPLat()
				};
		for (ISPLatEvaluation testClass : testClasses) {
			System.out.println("Start " + testClass.getClass().getName());
			boolean timedOut = false;
			int maxComplexity = 100;
			if (testClass.getClass() == PrefixSPLat.class) {
				maxComplexity = 10;
			}
			for (int max = 0; max <= maxComplexity; max++) {
				if (timedOut) {
					break;
				}
				for (int i = 0; i < 1; i++) {
					long start = System.currentTimeMillis();
					int runs = runSPLat(testClass, max);
					long end = System.currentTimeMillis();
					long time = (end - start);
					System.out.println(" finished after " + runs + " configurations after " + time + "ms " + (maxUsedMemory >> 20) + "MB");
					createOutput(time);
					missingConfigurations.clear();
					Runtime.getRuntime().gc();
					if (time > 120_000) {
						timedOut = true;
						break;
					}
				}
			}
			File resultsFile = new File("SPLat.csv");
			resultsFile.renameTo(new File("SPLat-" + testClass.getClass().getSimpleName() + ".csv"));
		}
	}
	
	private static int runSPLat(ISPLatEvaluation testClass, int max) {
		System.out.print("#feature " + max);
		nrFeatures = max;
		if (testClass.getClass() == PrefixSPLat.class) {
			nrFeatures = 10;
		}
		int runs = 0;
		maxUsedMemory = 0;
		missingConfigurations.add(new Configuration());
		while (!missingConfigurations.isEmpty()) {
			Runtime rt = Runtime.getRuntime();
			final long m = rt.totalMemory() - rt.freeMemory();
			if (m > maxUsedMemory) {
				maxUsedMemory  = m;
			}
			currentConfiguration = missingConfigurations.remove(0);
			testClass.run(max);runs++;
		}
		return runs;
	}
	
	private static void createOutput(long time) {
		File results = new File("SPLat.csv");
		System.out.println("write results to " + results + " " + time);
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(results, true)))) {
			out.print(time);
			out.print(';');
			out.print(maxUsedMemory >> 20);// MB
			out.println();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	static int nrFeatures = 0;
	
	static LinkedList<Configuration> missingConfigurations = new LinkedList<>();
//	static Set<Configuration> finishedConfigurations = new HashSet<>((int)Math.pow(2, 23));
	
	static Configuration currentConfiguration = new Configuration();
	
	public static boolean get(int i) {
		Boolean selection = currentConfiguration.get(i - 1);
		if (selection == null) {
			currentConfiguration.set(i - 1, Boolean.TRUE);
			Configuration newConfig = currentConfiguration.copy();
			newConfig.set(i - 1, Boolean.FALSE);
//			if (!finishedConfigurations.contains(currentConfiguration)) {
				missingConfigurations.addFirst(newConfig);
//			}
		}
		
		return currentConfiguration.get(i - 1);
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