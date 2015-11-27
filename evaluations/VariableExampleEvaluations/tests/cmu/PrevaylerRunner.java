package cmu;

import cmu.testprograms.PrevaylerTest;

/**
 * @author: chupanw
 */
public class PrevaylerRunner {
    @SuppressWarnings("static-access")
	public static void main(String[] args) throws Exception {
//        JVMPrevaylerTest SUT = new JVMPrevaylerTest();
        PrevaylerTest SUT = new PrevaylerTest();
        for (int i = 0; i < args.length; i++) {
            Boolean val = Boolean.valueOf(args[i]);
            switch (i) {
                case 0: SUT.USE_LOG4J_MONITOR = val;        break;
                case 1: SUT.USE_NULL_MONITOR = val;         break;
                case 2: SUT.USE_BROKEN_CLOCK = val;         break;
                case 3: SUT.USE_PAUSABLE_CLOCK = val;       break;
                case 4: SUT.USE_XSTREAM = val;              break;
                case 5: SUT.USE_TRANSIENT_MODE = val;       break;
                case 6: SUT.USE_JOURNAL_DISK_SYNC = val;    break;
                case 7: SUT.FILE_AGE_THREASHOLD = val;      break;
                default:
                    throw new Exception("Wrong number of arguments: " + i);
            }
        }
        SUT.runNumberKeeper();
    }
}
