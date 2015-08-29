package cmu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/**
 * @author: chupanw
 */
public class BruteForceRunner {
    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            runPrevaylerNumberKeeper();
//        }
        runJetty(30);
    }


    public static void runJetty(int times) {
        HashSet<Integer> set = new HashSet<>();
//        Integer[] randomArray = new Integer[times];
        Integer[] randomArray = new Integer[]{
            69, 65, 78, 79, 75, 15, 16, 87, 82, 25,
            93, 27, 91, 31, 33, 101, 36, 111, 108, 109,
            107, 44, 51, 117, 52, 126, 56, 122, 62, 60
        };
//        Random rand = new Random(System.nanoTime());
//        while (set.size() != times) {
//            set.add(rand.nextInt(128));
//        }
//        set.toArray(randomArray);
//        writeSample(randomArray);
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < times; i++) {
                String[] args = int2Args(randomArray[i], 7);
//                VarexJRunner.main(args);
            JVMRunner.main(args);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String[] int2Args(Integer x, Integer length) {
        String[] args = new String[length];
        for (int i = length-1; i >=0 ; i--) {
            if (x % 2 == 0) {
                args[i] = "false";
            }
            else {
                args[i] = "true";
            }
            x /= 2;
        }
        return args;
    }

    public static void runPrevaylerNumberKeeper() {
        String[] stringArgs = new String[8];
        ArrayList<String> args = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            args.add(toBooleanString(i));
            for (int j = 0; j < 2; j++) {
                args.add(toBooleanString(j));
                for (int k = 0; k < 2; k++) {
                    args.add(toBooleanString(k));
                    for (int l = 0; l < 2; l++) {
                        args.add(toBooleanString(l));
                        for (int m = 0; m < 2; m++) {
                            args.add(toBooleanString(m));
                            for (int n = 0; n < 2; n++) {
                                args.add(toBooleanString(n));
                                for (int o = 0; o < 2; o++) {
                                    args.add(toBooleanString(o));
                                    for (int p = 0; p < 2; p++) {
                                        args.add(toBooleanString(p));
//                                        VarexJRunner.main(args.toArray(stringArgs));
                                        JVMRunner.main(args.toArray(stringArgs));
                                        args.remove(7);
                                    }
                                    args.remove(6);
                                }
                                args.remove(5);
                            }
                            args.remove(4);
                        }
                        args.remove(3);
                    }
                    args.remove(2);
                }
                args.remove(1);
            }
            args.remove(0);
        }
    }

    public static String toBooleanString(int x) {
        if (x == 0) {
            return "false";
        }
        else {
            return "true";
        }
    }

    public static void writeSample(Integer[] array) {
        File f = new File("VarexJSample");
        try {
            FileWriter writer = new FileWriter(f);
            for (int i = 0; i < array.length; i++) {
                writer.write(array[i] + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
