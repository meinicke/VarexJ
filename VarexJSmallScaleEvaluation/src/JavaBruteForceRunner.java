import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaBruteForceRunner {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		new JavaBruteForceRunner();
	}

	public JavaBruteForceRunner() throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
//		for (int complexity = 0; complexity <= 100; complexity++) {
//			System.out.println(complexity);
//			for (int round = 0; round < 3; round++) {
//				long duration = 0;
//				for (int i = 0; i < Math.pow(2, complexity); i++) {
//					setFields(complexity, i);
//					long start = System.nanoTime(); 
////					array.ArrayVarexJ.main(new String[] { complexity + "" });
//					inc.IncVarexJ.main(new String[] { complexity + "" });
//					long end = System.nanoTime();
//					duration += end - start;
//				}
//				long timeInMs = duration / 1_000_000;
//				if (timeInMs > 30_000) {
//					break;
//				}
//				
//				createOutput(timeInMs);
//			}
//		}
//		File resultsFile = new File("JVM.csv");
//		resultsFile.renameTo(new File("JVM-Inc.csv"));
		
		for (int complexity = 0; complexity <= 100; complexity++) {
			System.out.println(complexity);
			boolean maxReached = false;
			for (int round = 0; round < 3; round++) {
				long duration = 0;
				for (int i = 0; i < Math.pow(2, complexity); i++) {
					setFields(complexity, i);
					long start = System.nanoTime(); 
					array.ArrayVarexJ.main(new String[] { complexity + "" });
					long end = System.nanoTime();
					duration += end - start;
				}
				long timeInMs = duration / 1_000_000;
				if (timeInMs > 30_000) {
					maxReached = true;
					break;
				}
				
				createOutput(timeInMs);
			}
			if (maxReached) {
				break;
			}
		}
		File resultsFile = new File("JVM.csv");
		resultsFile.renameTo(new File("JVM-Array.csv"));
	}

	private void setFields(int complexity, int i) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		int conf = i;
		for (int j = 1; j <= complexity; j++) {
			array.ArrayVarexJ.class.getField("a" + j).set(null, conf % 2 == 0);
			conf = conf >> 1;
		}
	}

	private static void createOutput(long time) {
		File results = new File("JVM.csv");
		if (!results.exists()) {
			try {
				results.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("write results to " + results + " " + time);
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(results, true)))) {
			out.print(time);
			out.print(';');
			out.print(0);
			out.print(';');
			out.print(0);
			out.print(';');
			out.print(0);
			out.println();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
