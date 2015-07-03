import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class JPFCoreRunner {

	public static void main(String[] args) {
		new JPFCoreRunner();
	}

	public JPFCoreRunner() {
		System.out.println("JPFCoreRunner.JPFCoreRunner()");
		LinkedList<String> commands = new LinkedList<>();
		commands.add("C:\\Program Files\\Java\\jdk1.8.0_31\\bin\\java");
//		commands.add("C:\\Program Files\\Java\\jdk1.7.0_75\\bin\\java");
//		commands.add("-Xms7g");
		commands.add("-Xmx7g");
//		commands.add("-XX:+UseConcMarkSweepGC");
//		commands.add("-XX:+UseParNewGC");
//		commands.add("-XX:-UseParallelGC");
		commands.add("-jar");
		commands.add("C:\\Users\\meinicke\\workspaceJPFBDD\\jpf-core\\build\\RunJPF.jar");
		
		commands.add("+classpath=C:\\Users\\meinicke\\git\\VarexJ\\VarexJSmallScaleEvaluation\\bin\\;C:\\Users\\meinicke\\workspaceJPFBDD\\jpf-core\\build\\jpf.jar");
//		commands.add("+search.class=.search.DFSearch");
//		commands.add("+search.multiple_errors=true");
//		commands.add("inc.IncJPF_Core");
		commands.add("phil.DiningPhilosophersCore");
		commands.add("");
		for (int complexity = 1; complexity <= 100; complexity++) {
			commands.removeLast();
			commands.add("" + complexity);
			for (int round = 0; round < 2; round++) {
				process(commands);
			}
		}
	}

	private void process(List<String> commands) {
		for (String s : commands) {
			System.out.print(s);
			System.out.print(" ");
		}
		System.out.println();
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
