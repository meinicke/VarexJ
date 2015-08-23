package cmu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: chupanw
 */
public class VarexJRunner{
    public static void main(String[] args) {
        System.out.println("SUT: cmu.PrevaylerRunner");
        System.out.println("args: ");
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println("\n");
        new VarexJRunner(args);
    }

    public VarexJRunner(String[] SUTArgs) {
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

//		commands.add("-Xgc: parallel");
//		commands.add("-XXaggressive");

        commands.add("-jar");
        commands.add("build/RunJPF.jar");
//        commands.add("-show");
        commands.add("+nhandler.delegateUnhandledNative");
        commands.add("+native_classpath=lib/*;build/classes/;build/peers/;");
        commands.add("+search.class=.search.RandomSearch");
        commands.add("+classpath=build/jpf.jar;"
                        + "build/tests;"
                    + "lib/Prevayler.jar;lib/prevayler-factory-2.5.jar;lib/prevayler-core-2.5.jar;lib/commons-jxpath-1.3.jar;lib/prevayler-log4j-2.7-SNAPSHOT.jar;lib/prevayler-xstream-2.7-SNAPSHOT.jar;lib/log4j-1.2.15.jar;lib/xstream-1.4.7.jar;lib/kxml2-2.3.0.jar"
        );

//		commands.add("+featuremodel=C:\\Users\\meinicke\\workspace\\ElevatorChanged\\model.dimacs");
//		commands.add("+interaction=local2");
//		commands.add("+interaction=composedContext");
//		commands.add("+interaction=interaction");
//		commands.add("+interaction=local");
//		commands.add("+interaction=feature");
        commands.add("+choice=TreeChoice");
//		commands.add("+minInteraction=1");
        commands.add("cmu.PrevaylerRunner");
        for (String s : SUTArgs) {
            commands.add(s);
        }
//        commands.add("-c");
//        commands.add("checks.xml");
//		commands.add("-o");
//		commands.add("results.xml");
//		commands.add("C:\\Users\\meinicke\\git\\VarexJ\\src\\main\\gov\\nasa\\jpf\\vm\\ThreadInfo.java");
//        commands.add("E:\\ZeugVon145\\Programs\\Elevator\\src\\ElevatorSystem\\Elevator.java");
//		commands.add("C:\\Users\\meinicke\\workspace\\CheckStyleRunner\\src\\Main.java");
        process(commands);
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

