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
import java.io.IOException;
import java.nio.file.Files;

public class RunNumberKeeper {

//	@Conditional
	public static boolean USE_LOG4J_MONITOR = false;
	@Conditional
	public static boolean USE_NULL_MONITOR = true;
//	@Conditional
	public static boolean USE_BROKEN_CLOCK = false;
//	@Conditional
	public static boolean USE_PAUSABLE_CLOCK = false;
	//	@Conditional // TODO not working for tutorialTest()
	public static boolean USE_XSTREAM = false;
//	@Conditional
	public static boolean USE_TRANSIENT_MODE = false;
//	@Conditional
	public static boolean USE_JOURNAL_DISK_SYNC = false;
//	@Conditional
	public static boolean FILE_AGE_THREASHOLD = false;
	//	@Conditional // TODO not working
	static boolean FILE_SIZE_THREASHOLD = false;
	//  @Conditional // TODO not working
	static boolean USE_XSTREAM_JOURNAL = false;
	//	@Conditional // TODO not working
	static boolean USE_FILTERING = false;
	private static String NUMBER_KEEPER = "NumberKeeper";

//	BROKEN_CLOCK
//	PAUSABLE_CLOCK
//	XSTREAM
//	TRANSIENT_MODE
//	JOURNAL_DISK_SYNC
	
	public static void main(String[] args) {
		
		if (args.length > 0) {
			int i = 0;
			USE_LOG4J_MONITOR = Boolean.valueOf(args[i++]);
			USE_NULL_MONITOR = Boolean.valueOf(args[i++]);
			USE_BROKEN_CLOCK = Boolean.valueOf(args[i++]);
			USE_PAUSABLE_CLOCK = Boolean.valueOf(args[i++]);
			USE_XSTREAM = Boolean.valueOf(args[i++]);
//			USE_TRANSIENT_MODE = Boolean.valueOf(args[i++]);
//			USE_JOURNAL_DISK_SYNC = Boolean.valueOf(args[i++]);
//			FILE_AGE_THREASHOLD = Boolean.valueOf(args[i++]);
//			FILE_SIZE_THREASHOLD = Boolean.valueOf(args[i++]);
		}
		deleteDirectory(NUMBER_KEEPER);
		NUMBER_KEEPER = "NumberKeeper";
		RunNumberKeeper run = new RunNumberKeeper();
		try {
			run.runNumberKeeper();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void runNumberKeeper() throws Exception {
		// clean up
		deleteDirectory(NUMBER_KEEPER);

		// delete old counts
//		String folderName = new File(NUMBER_KEEPER);//clearTempFolder(NUMBER_KEEPER);

		final NumberKeeper numberKeeper = new NumberKeeper();
		// final Prevayler prevayler =
		// PrevaylerFactory.createPrevayler(numberKeeper, folderName);
		PrevaylerFactory factory = new PrevaylerFactory();
		factory.configurePrevalentSystem(numberKeeper);
		factory.configurePrevalenceDirectory(NUMBER_KEEPER);
		
		configureFactory(factory);

		Prevayler prevayler = factory.create();
		
		final PrimeCalculator primeCalculator = new PrimeCalculator(prevayler);

		System.out.println("Run the first time");
		primeCalculator.start();
		System.out.println(prevayler.clock().time());
		System.out.println();
		System.out.println("Run the second time");
		primeCalculator.start();
		System.out.println(prevayler.clock().time());
		prevayler.close();
		deleteDirectory(NUMBER_KEEPER);
	}

	private String clearTempFolder(String folderName) {
		File tempFolder = new File(folderName);
		boolean cleared = true;
		if (tempFolder.exists()) {
			for (final File file : tempFolder.listFiles()) {
				try {
					System.out.println(file);
					Files.delete(file.toPath());
				} catch (IOException e) {
					e.printStackTrace();
				}
//				if (!file.delete()) {
//					cleared = false;
//				}
			}
//			if (!cleared) {
//				tempFolder = new File(folderName + "_MAP");// some reader/writer
//				// seems not to be
//				// closed
//				if (tempFolder.exists()) {
//					for (final File file2 : tempFolder.listFiles()) {
//						if (!file2.delete()) {
//							throw new RuntimeException("cannot delete file:"
//									+ file2);
//						}
//					}
//				}
//			}
		}
		return tempFolder.getName();
	}

//	protected String getClassPath() {
//		return "lib/Prevayler.jar;lib/prevayler-factory-2.5.jar;lib/prevayler-core-2.5.jar;lib/commons-jxpath-1.3.jar;lib/prevayler-log4j-2.7-SNAPSHOT.jar;lib/prevayler-xstream-2.7-SNAPSHOT.jar;lib/log4j-1.2.15.jar;lib/xstream-1.4.7.jar;lib/kxml2-2.3.0.jar";
//	}

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

	static void deleteDirectory(String name) {
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
