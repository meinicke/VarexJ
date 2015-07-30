package Starter;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class VarexJRunner {

	private static final int rounds = 3;

	public static void main(String[] args) {
		new VarexJRunner();
	}

	public VarexJRunner() {
		String[] testClasses = new String[] {
				inc.IncVarexJ.class.getName(),
				nesting.NestVarexJ.class.getName(),
				prefix.PrefixVarexJ.class.getName(),
				reference.RefVarexJ.class.getName(),
				nointeraction.NoVarexJ.class.getName()
				};
		for (String test : testClasses) {
			LinkedList<String> commands = new LinkedList<>();
			commands.add("java");
			commands.add("-Xmx7g");
			commands.add("-jar");
			commands.add("C:\\Users\\meinicke\\git\\VarexJ\\build\\RunJPF.jar");
			// JPF conf
			commands.add("+native_classpath=C:\\Users\\meinicke\\VarexJ\\lib\\*");
			commands.add("+classpath=C:\\Users\\meinicke\\git\\VarexJ\\VarexJSmallScaleEvaluation\\bin\\;C:\\Users\\meinicke\\git\\VarexJ\\build\\jpf.jar");
			commands.add("+search.class=.search.RandomSearch");
			// VarexJ conf
			commands.add("+choice=MapChoice");
			commands.add(test);
			commands.add("");
			int max = 100;
			if (test.equals(prefix.PrefixVarexJ.class.getName())) {
				max = 10;
			}
			
			for (int complexity =  0; complexity <= max; complexity++) {
				commands.removeLast();
				commands.add("" + complexity);
				for (int round = 0; round < rounds; round++) {
					process(commands);
				}
			}
			File resultsFile = new File("VarexJ.csv");
			resultsFile.renameTo(new File("VarexJ" + test + ".csv"));
		}
	}

	private void process(List<String> commands) {
		ProcessBuilder processBuilder = new ProcessBuilder(commands);
		BufferedReader input = null;
		BufferedReader error = null;
		try {
			Process process = processBuilder.start();
			input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			error = new BufferedReader(new InputStreamReader(process.getErrorStream()));

			while (true) {
				try {
					String line;
					while ((line = input.readLine()) != null) {
						System.out.println(line);
					}
					while ((line = error.readLine()) != null) {
						System.out.println(line);
					}

					try {
						process.waitFor();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					int exitValue = process.exitValue();
					if (exitValue != 0) {
						throw new IOException("The process doesn't finish normally (exit=" + exitValue + ")!");
					}
					break;
				} catch (IllegalThreadStateException e) {
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (input != null)
					input.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if (error != null)
					try {
						error.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
			}
		}
	}
}
