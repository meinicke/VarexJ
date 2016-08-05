import java.io.File;

import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;
import org.prevayler.demos.demo1.NumberKeeper;
import org.prevayler.demos.demo1.PrimeCalculator;
import org.prevayler.foundation.monitor.Log4jMonitor;
import org.prevayler.foundation.serialization.XStreamSerializer;

import gov.nasa.jpf.annotation.Conditional;

public class RunNumberKeeper {

//	@Conditional
	public static boolean USE_LOG4J_MONITOR = true;
	@Conditional
	public static boolean USE_NULL_MONITOR = true;
//	@Conditional
	public static boolean USE_BROKEN_CLOCK = true;
//	@Conditional
	public static boolean USE_PAUSABLE_CLOCK = true;
	//	@Conditional // TODO not working for tutorialTest()
	public static boolean USE_XSTREAM = true;
//	@Conditional
	public static boolean USE_TRANSIENT_MODE = true;
//	@Conditional
	public static boolean USE_JOURNAL_DISK_SYNC = true;
//	@Conditional
	public static boolean FILE_AGE_THREASHOLD = true;
	//	@Conditional // TODO not working
	static boolean FILE_SIZE_THREASHOLD = true;
	//  @Conditional // TODO not working
	static boolean USE_XSTREAM_JOURNAL = true;
	//	@Conditional // TODO not working
	static boolean USE_FILTERING = true;
	private static String NUMBER_KEEPER = "NumberKeeper";

	public static void main(String[] args) {
		RunNumberKeeper run = new RunNumberKeeper();
		try {
			run.runNumberKeeper();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void runNumberKeeper() throws Exception {
		// clean up
		deleteDirectory("NumberKeeper");

		// delete old counts
		String folderName = clearTempFolder(NUMBER_KEEPER);

		final NumberKeeper numberKeeper = new NumberKeeper();
		// final Prevayler prevayler =
		// PrevaylerFactory.createPrevayler(numberKeeper, folderName);
		PrevaylerFactory factory = new PrevaylerFactory();
		factory.configurePrevalentSystem(numberKeeper);
		factory.configurePrevalenceDirectory(folderName);

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

	protected String getClassPath() {
		return "lib/Prevayler.jar;lib/prevayler-factory-2.5.jar;lib/prevayler-core-2.5.jar;lib/commons-jxpath-1.3.jar;lib/prevayler-log4j-2.7-SNAPSHOT.jar;lib/prevayler-xstream-2.7-SNAPSHOT.jar;lib/log4j-1.2.15.jar;lib/xstream-1.4.7.jar;lib/kxml2-2.3.0.jar";
	}

	protected String getModelFile() {
		return "";
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

		factory.configureTransactionFiltering(USE_FILTERING);
		factory.configureTransientMode(USE_TRANSIENT_MODE);
		factory.configureJournalDiskSync(USE_JOURNAL_DISK_SYNC);

		if (FILE_AGE_THREASHOLD) {
			factory.configureJournalFileAgeThreshold(100);
		}
		if (FILE_SIZE_THREASHOLD) {
			factory.configureJournalFileSizeThreshold(100);
		}
		if (USE_XSTREAM_JOURNAL) {
			factory.configureJournalSerializer(new XStreamSerializer());
		} else {
			factory.configureJournalSerializer(new JavaSerializer());
		}
	}

	void deleteDirectory(String name) {
		File dir = new File(name);
		if (dir.exists() && dir.isDirectory()) {
			File[] list = dir.listFiles();
			assert list != null;
			for (File file : list) {
				if (file.isDirectory()) {
					deleteDirectory(file.getAbsolutePath());
				} else {
					file.delete();
				}
			}
		}
	}
}
