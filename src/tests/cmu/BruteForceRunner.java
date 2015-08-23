package cmu;

import java.util.ArrayList;

/**
 * @author: chupanw
 */
public class BruteForceRunner {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            runPrevaylerNumberKeeper();
        }
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
}
