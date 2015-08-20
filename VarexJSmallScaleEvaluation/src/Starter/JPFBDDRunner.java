package Starter;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class JPFBDDRunner {

	public static void main(String[] args) {
		new JPFBDDRunner();
	}

	public JPFBDDRunner() {
		System.out.println("JPFBDDRunner.JPFBDDRunner()");
		String[] testClasses = new String[]{
//				nointeraction.NoJPF_BDD.class.getName(),
//				prefix.PrefixJPF_BDD.class.getName(),
//				nesting.NestJPF_BDD.class.getName(), 
//				inc.IncJPF_BDD.class.getName(), 
//				reference.RefBDD.class.getName(),
				explosion.ExplosionJPF_BDD.class.getName()
				};
		for (String test : testClasses) {
			LinkedList<String> commands = new LinkedList<>();
	//		commands.add("C:\\Program Files\\Java\\jre1.8.0_45\\bin\\java");
			commands.add("java");
	//		commands.add("-Xms7g");
			commands.add("-Xmx7g");
	//		commands.add("-XX:+UseConcMarkSweepGC");
	//		commands.add("-XX:+UseParNewGC");
	//		commands.add("-XX:-UseParallelGC");
			commands.add("-jar");
			commands.add("C:\\Users\\meinicke\\workspaceJPFBDD\\jpf-core_old\\build\\RunJPF.jar");
	//		commands.add("+search.class=.search.heuristic.BFSHeuristic");
	//		commands.add("+search.class=.search.DFSearch");
			commands.add("+search.multiple_errors=true");
			commands.add("+classpath=C:\\Users\\meinicke\\git\\VarexJ\\VarexJSmallScaleEvaluation\\bin\\;C:\\Users\\meinicke\\workspaceJPFBDD\\jpf-core_old\\build\\jpf.jar;C:\\Users\\meinicke\\workspaceJPFBDD\\jpf-bdd\\build\\jpf-bdd.jar;C:\\Users\\meinicke\\workspaceJPFBDD\\jpf-bdd\\build\\jpf-bdd-annotations.jar;");
			commands.add("+vm.insn_factory.class=gov.nasa.jpf.bdd.BddInstructionFactory");
	//		commands.add("array.ArrayBDD");
			commands.add(test);
			commands.add("");
			int max = 100;
			if (test.equals(prefix.PrefixJPF_BDD.class.getName())) {
				max = 10;
			}
			
			for (int complexity = 0; complexity <= max; complexity++) {
				commands.removeLast();
				commands.add("" + complexity);
				
				boolean timedOut = false;
				for (int round = 0; round < 3; round++) {
					long start = System.currentTimeMillis();
					process(commands);
					long timeInS = (System.currentTimeMillis() - start) / 1000;
					
					if (timeInS > 120) {
						timedOut = true;
						break;
					}
				}
				if (timedOut) {
					break;
				}
			}
			File resultsFile = new File("JPF.csv");
			resultsFile.renameTo(new File("BDD-" + test + ".csv"));
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
