package cmu;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chupanw
 */
public class JVMRunner {
    public static void main(String[] args) {
        System.out.println("SUT: cmu.PrevaylerRunner");
        System.out.print("args: ");
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
        new JVMRunner(args);
    }

    public JVMRunner(String[] SUTArgs){
        List<String> commands = new LinkedList<>();
        commands.add("java");
//		commands.add("-Xns2000m");
        commands.add("-Xms8g");
        commands.add("-Xmx8g");
        commands.add("-XX:+UseConcMarkSweepGC");
        commands.add("-XX:+UseParNewGC");
        commands.add("-XX:-UseParallelGC");
//		commands.add("-XX:NewSize=2000m");
//		commands.add("–XX:NewSize=2g");
//		commands.add("–XX:MaxNewSize=2000m");


        commands.add("-cp");
        commands.add("build/tests/:lib/*:");

//        commands.add("+native_classpath=lib/*");
//        commands.add("+search.class=.search.RandomSearch");
//        commands.add("+classpath=build/jpf.jar;"
//                        + "build/tests/;"
//                        + "lib/Prevayler.jar;lib/prevayler-factory-2.5.jar;lib/prevayler-core-2.5.jar;lib/commons-jxpath-1.3.jar;lib/prevayler-log4j-2.7-SNAPSHOT.jar;lib/prevayler-xstream-2.7-SNAPSHOT.jar;lib/log4j-api-2.1.jar;lib/log4j-core-2.1.jar;lib/xstream-1.4.7.jar;lib/kxml2-2.3.0.jar"
//        );

        commands.add("cmu.PrevaylerRunner");
        for (String s : SUTArgs) {
            commands.add(s);
        }
        long start = System.nanoTime();
        process(commands);
        long end = System.nanoTime();
        createOutput((end - start)/1000000);
    }

    private void process(List<String> commands) {
        System.out.println(commands);
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
            out.println(time);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
