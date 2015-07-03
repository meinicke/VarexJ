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
		for (int complexity = 1; complexity <= 30; complexity++) {
			System.out.println(complexity);

			for (int round = 0; round < 2; round++) {
				long duration = 0;
				for (int i = 0; i < Math.pow(2, complexity); i++) {
					setFields(complexity, i);
					long start = System.nanoTime(); 
					array.ArrayVarexJ.main(new String[] { complexity + "" });
					long end = System.nanoTime();
					duration += end - start;
				}
				createOutput(duration / 1_000_000);
			}
		}
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
