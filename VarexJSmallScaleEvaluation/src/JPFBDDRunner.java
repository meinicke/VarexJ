import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class JPFBDDRunner {

	public static void main(String[] args) {
		new JPFBDDRunner();
	}

	public JPFBDDRunner() {
		System.out.println("VarexJRunner.VarexJRunner()");
		LinkedList<String> commands = new LinkedList<>();
		commands.add("C:\\Program Files\\Java\\jre1.8.0_45\\bin\\java");
//		commands.add("-Xms7g");
		commands.add("-Xmx7g");
//		commands.add("-XX:+UseConcMarkSweepGC");
//		commands.add("-XX:+UseParNewGC");
//		commands.add("-XX:-UseParallelGC");
		commands.add("-jar");
		commands.add("C:\\Users\\meinicke\\workspaceJPFBDD\\jpf-core\\build\\RunJPF.jar");
//		commands.add("+search.class=.search.heuristic.BFSHeuristic");
//		commands.add("+search.class=.search.DFSearch");
		commands.add("+search.multiple_errors=true");
		commands.add("+classpath=C:\\Users\\meinicke\\workspace\\VarexJSmallScaleEvaluation\\bin\\;C:\\Users\\meinicke\\workspaceJPFBDD\\jpf-core\\build\\jpf.jar;C:\\Users\\meinicke\\workspaceJPFBDD\\build\\jpf-bdd.jar;C:\\Users\\meinicke\\workspaceJPFBDD\\jpf-bdd\\build\\jpf-bdd-annotations.jar;");
		commands.add("phil.DiningPhilosophersBDD");
		commands.add("");
		for (int complexity = 0; complexity <= 5; complexity++) {
			commands.removeLast();
			commands.add("" + complexity);
			for (int round = 0; round < 2; round++) {
				process(commands);
			}
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
