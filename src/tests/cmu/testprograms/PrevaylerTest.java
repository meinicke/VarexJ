package cmu.testprograms;

import java.io.File;
import java.util.Iterator;

import gov.nasa.jpf.annotation.Conditional;
import org.junit.Ignore;
import org.junit.Test;
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
import org.prevayler.tutorial.AddTask;
import org.prevayler.tutorial.RemoveTask;
import org.prevayler.tutorial.Task;
import org.prevayler.tutorial.TaskList;

public class PrevaylerTest extends ATestExample {

	private static String NUMBER_KEEPER = "NumberKeeper";

    @Conditional
    static boolean USE_LOG4J_MONITOR = true;
    @Conditional
    static boolean USE_NULL_MONITOR = false;

    @Conditional
    static boolean USE_BROKEN_CLOCK = true;
    @Conditional
    static boolean USE_PAUSABLE_CLOCK = false;


    //TODO xstream is not working
    static boolean USE_XSTREAM = false;
    @Conditional
    static boolean USE_FILTERING = true;
    @Conditional
    static boolean USE_TRANSIENT_MODE = true;
    @Conditional
    static boolean USE_JOURNAL_DISK_SYNC = true;


	@Test
	public void runNumberKeeper() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			// delete old counts
			String folderName = clearTempFolder(NUMBER_KEEPER);
			
			final NumberKeeper numberKeeper = new NumberKeeper();
//			final Prevayler prevayler = PrevaylerFactory.createPrevayler(numberKeeper, folderName);
            PrevaylerFactory factory = new PrevaylerFactory();
            factory.configurePrevalentSystem(numberKeeper);
            factory.configurePrevalenceDirectory(folderName);

            configureFactory(factory);

            Prevayler prevayler = factory.create();

			final PrimeCalculator primeCalculator = new PrimeCalculator(prevayler);
			
			System.out.println("Run the first time");
			primeCalculator.start();
            System.out.println(prevayler.clock().time());
            assertEquals("result of first run was false: " + numberKeeper.lastNumber(), 997, numberKeeper.lastNumber());
			System.out.println();
			System.out.println("Run the second time");
			primeCalculator.start();
            System.out.println(prevayler.clock().time());
            assertEquals("result of second run was false: " + numberKeeper.lastNumber(), 1997, numberKeeper.lastNumber());
		}
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
				tempFolder = new File(folderName + "_MAP");// some reader/writer seems not to be closed
				if (tempFolder.exists()) {
					for (final File file2 : tempFolder.listFiles()) {
						if (!file2.delete()) {
							throw new RuntimeException("cannot delete file:" + file2);
						}
					}
				}
			}
		}
		return tempFolder.getName();
	}

	@Override
	protected String getClassPath() {
		return "lib/Prevayler.jar;lib/prevayler-factory-2.5.jar;lib/prevayler-core-2.5.jar;lib/commons-jxpath-1.3.jar;lib/prevayler-log4j-2.7-SNAPSHOT.jar;lib/prevayler-xstream-2.7-SNAPSHOT.jar;lib/log4j-api-2.1.jar;lib/log4j-core-2.1.jar;lib/xstream-1.4.7.jar";
	}

	@Override
	protected String getModelFile() {
		return "";
	}

	@Ignore @Test
	public void scalabilityTest() {
		if (verifyNoPropertyViolation(config)) {
			org.prevayler.demos.scalability.Main.main(null);
		}
	}

	@Ignore @Test
	public void jxpathTest() {
		if (verifyNoPropertyViolation(config)) {
			String[] args1 = new String[] { "proj", "100", "learn JXPath" };
			String[] args2 = new String[] { "task", "50", "read docs", "09/21/02 2:00 PM", "09/21/02 3:00 PM", "100" };
			String[] args3 = new String[] { "task", "51", "write code", "09/21/02 3:00 PM", "09/21/02 4:00 PM", "100" };
			String[] args4 = new String[] { "task", "52", "veg out", "09/21/02 4:00 PM", "09/21/02 5:00 PM", "100" };
			String[] args5 = new String[] { "list", "projects" };
			String[] args6 = new String[] { "list", "projects/tasks" };
			String[] args7 = new String[] { "list", "projects/tasks[name='read docs']" };
			org.prevayler.demos.jxpath.Main.main(args1);
			org.prevayler.demos.jxpath.Main.main(args2);
			org.prevayler.demos.jxpath.Main.main(args3);
			org.prevayler.demos.jxpath.Main.main(args4);
			org.prevayler.demos.jxpath.Main.main(args5);
			org.prevayler.demos.jxpath.Main.main(args6);
			org.prevayler.demos.jxpath.Main.main(args7);
		}
	}

	@Test
	public void tutorialTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			String folderName = clearTempFolder("Tutorial");
//			org.prevayler.tutorial.Main.main(folderName);

            // START SNIPPET: creating
            // Create a new prevayler. /tasklist-base is the tx-journal directory.
//            Prevayler prevayler = PrevaylerFactory.createPrevayler(new TaskList(), folderName);

            PrevaylerFactory factory = new PrevaylerFactory();
            factory.configurePrevalentSystem(new TaskList());
            factory.configurePrevalenceDirectory(folderName);

            configureFactory(factory);

            Prevayler prevayler = factory.create();

            TaskList list = (TaskList) prevayler.prevalentSystem();
            // END SNIPPET: creating

            System.out.println("Tasks: " + list.getTasks().size() + ", adding ");

            // START SNIPPET: adding
            Task dishes = (Task) prevayler.execute(new AddTask("do the dishes", Task.MAX_PRIORITY));
            Task dog = (Task) prevayler.execute(new AddTask("walk the dog", Task.MED_PRIORITY));
            Task laundry = (Task) prevayler.execute(new AddTask("do the laundry", Task.MIN_PRIORITY));
            // END SNIPPET: adding

            // START SNIPPET: iterating
            for (Iterator i = list.getTasks().iterator(); i.hasNext();) {
                Task t = (Task) i.next();
                System.out.println("Task: " + t.getDescription() + ", " + t.getPriority());
            }
            // END SNIPPET: iterating

            System.out.println("Tasks: " + list.getTasks().size() + ", removing...");

            System.out.println("Before removing...");

            // START SNIPPET: removing
            prevayler.execute(new RemoveTask(dishes));
            prevayler.execute(new RemoveTask(dog));
            prevayler.execute(new RemoveTask(laundry));
            // END SNIPPET: removing

            System.out.println("After removing...");

            System.out.println("Tasks: " + list.getTasks().size());

            // START SNIPPET: snapshotting
            prevayler.takeSnapshot();
            // END SNIPPET: snapshotting

		}
	}

    public void configureFactory(PrevaylerFactory factory){
        if (USE_LOG4J_MONITOR) {
            factory.configureMonitor(new Log4jMonitor());
        }
        else{
            factory.configureMonitor(new SimpleMonitor());
        }

        if (USE_NULL_MONITOR){
            factory.configureMonitor(new NullMonitor());
        }
        else{
            factory.configureMonitor(new SimpleMonitor());
        }

        if (USE_BROKEN_CLOCK){
            factory.configureClock(new BrokenClock());
        }
        else{
            factory.configureClock(new MachineClock());
        }

        if (USE_PAUSABLE_CLOCK) {
            factory.configureClock(new PausableClock(new MachineClock()));
        }
        else{
            factory.configureClock(new MachineClock());
        }

        if (USE_XSTREAM){
            factory.configureSnapshotSerializer(new XStreamSerializer());
        }
        else{
            factory.configureSnapshotSerializer(new JavaSerializer());
        }

        if(USE_FILTERING){
            factory.configureTransactionFiltering(true);
        }
        else{
            factory.configureTransactionFiltering(false);
        }

        if(USE_TRANSIENT_MODE) {
            factory.configureTransientMode(true);
        }
        else{
            factory.configureTransientMode(false);
        }
        if(USE_JOURNAL_DISK_SYNC){
            factory.configureJournalDiskSync(true);
        }
        else{
            factory.configureJournalDiskSync(false);
        }
    }

}
