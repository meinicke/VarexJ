package cmu.testprograms;

import gov.nasa.jpf.annotation.Conditional;
import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;
import org.prevayler.demos.demo1.NumberKeeper;
import org.prevayler.demos.demo1.PrimeCalculator;
import org.prevayler.foundation.monitor.Log4jMonitor;
import org.prevayler.foundation.monitor.NullMonitor;
import org.prevayler.foundation.monitor.SimpleMonitor;
import org.prevayler.foundation.serialization.JavaSerializer;
import org.prevayler.foundation.serialization.XStreamSerializer;
import org.prevayler.implementation.clock.BrokenClock;
import org.prevayler.implementation.clock.MachineClock;
import org.prevayler.implementation.clock.PausableClock;

import java.io.File;

/**
 * @author: chupanw
 */
public class JVMPrevaylerTest {
    @Conditional
    public static boolean USE_LOG4J_MONITOR = false;
    @Conditional
    public static boolean USE_NULL_MONITOR = false;
    @Conditional
    public static boolean USE_BROKEN_CLOCK = false;
    @Conditional
    public static boolean USE_PAUSABLE_CLOCK = false;
//    @Conditional
    public static boolean USE_XSTREAM = true;
    @Conditional
    public static boolean USE_TRANSIENT_MODE = false;
    @Conditional
    public static boolean USE_JOURNAL_DISK_SYNC = false;
    @Conditional
    public static boolean FILE_AGE_THREASHOLD = true;

    public void runNumberKeeper() throws Exception {
        // clean up
        deleteDirectory("NumberKeeper");

        final NumberKeeper numberKeeper = new NumberKeeper();
        // final Prevayler prevayler =
        // PrevaylerFactory.createPrevayler(numberKeeper, folderName);
        PrevaylerFactory factory = new PrevaylerFactory();
        factory.configurePrevalentSystem(numberKeeper);
        factory.configurePrevalenceDirectory("NumberKeeper");

        configureFactory(factory);

        Prevayler prevayler = factory.create();

        final PrimeCalculator primeCalculator = new PrimeCalculator(
                prevayler);

        System.out.println("Run the first time");
        primeCalculator.start();
        System.out.println(prevayler.clock().time());
        System.out.println();
        System.out.println("Run the second time");
        primeCalculator.start();
        System.out.println(prevayler.clock().time());
    }

    private String clearTempFolder(String folderName) {
        File tempFolder = new File(folderName);
        boolean cleared = true;
        if (tempFolder.exists()) {
            for (final File file : tempFolder.listFiles()) {
                if (!file.delete()) {
                    cleared = false;
                    break;
                }
            }
            if (!cleared) {
                tempFolder = new File(folderName + "_MAP");// some reader/writer
                // seems not to be
                // closed
                if (tempFolder.exists()) {
                    for (final File file2 : tempFolder.listFiles()) {
                        if (!file2.delete()) {
                            throw new RuntimeException("cannot delete file:"
                                    + file2);
                        }
                    }
                }
            }
        }
        return tempFolder.getName();
    }

    void deleteDirectory(String name){
        File dir = new File(name);
        if (dir.exists() && dir.isDirectory()) {
            File[] list = dir.listFiles();
            assert list != null;
            for (File file : list) {
                if (file.isDirectory()) {
                    deleteDirectory(file.getAbsolutePath());
                }
                else {
                    file.delete();
                }
            }
        }
    }

    public void configureFactory(PrevaylerFactory factory) {
        if (USE_LOG4J_MONITOR) {
            factory.configureMonitor(new Log4jMonitor());
        } else if (USE_NULL_MONITOR) {
            factory.configureMonitor(new NullMonitor());
        } else {
            factory.configureMonitor(new SimpleMonitor());
        }

        if (USE_BROKEN_CLOCK) {
            factory.configureClock(new BrokenClock());
        } else if (USE_PAUSABLE_CLOCK) {
            factory.configureClock(new PausableClock(new MachineClock()));
        } else {
            factory.configureClock(new MachineClock());
        }

        if (USE_XSTREAM) {
            factory.configureSnapshotSerializer(new XStreamSerializer());
        } else {
            factory.configureSnapshotSerializer(new JavaSerializer());
        }

        factory.configureTransientMode(USE_TRANSIENT_MODE);
        factory.configureJournalDiskSync(USE_JOURNAL_DISK_SYNC);

        if (FILE_AGE_THREASHOLD) {
            factory.configureJournalFileAgeThreshold(100);
        }
    }
}
