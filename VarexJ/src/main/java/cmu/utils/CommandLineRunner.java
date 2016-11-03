package cmu.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * Run the given commands on the command line.
 * 
 * @author Jens Meinicke
 *
 */
public class CommandLineRunner {

	private CommandLineRunner() {
	}

	public static void process(String... commands) {
		try {
			ProcessBuilder processBuilder = new ProcessBuilder(commands);
			Process process = processBuilder.start();
			try (BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
					BufferedReader error = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
				while (true) {
					try {
						String line;
						while ((line = input.readLine()) != null) {
							System.out.println(line);
						}
						while ((line = error.readLine()) != null) {
							System.err.println(line);
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
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
