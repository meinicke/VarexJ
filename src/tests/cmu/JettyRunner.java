package cmu;

import cmu.jetty.JettyHelloWorld;

/**
 * @author: chupanw
 */
public class JettyRunner {
    public static void main(String[] args) throws Exception {
        JettyHelloWorld SUT = new JettyHelloWorld();
        for (int i = 0; i < args.length; i++) {
            Boolean val = Boolean.valueOf(args[i]);
            switch (i) {
                case 0: SUT.setStopAtShutdown = val;                        break;
                case 1: SUT.setAllowDuplicateFragmentNames = val;           break;
                case 2: SUT.setConfigurationDiscovered = val;               break;
                case 3: SUT.setCopywebDir = val;                            break;
                case 4: SUT.setDistributuble = val;                         break;
                case 5: SUT.setLogUrlOnStart = val;                         break;
                case 6: SUT.setThrowUnavailableOnStartupException = val;    break;
                default:
                    throw new Exception("Wrong number of arguments: " + i);
            }
        }
        SUT.main(new String[]{});
    }
}
