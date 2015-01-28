package cmu.testprograms;

import java.io.File;

import org.junit.Ignore;
import org.junit.Test;
import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;
import org.prevayler.demos.demo1.NumberKeeper;
import org.prevayler.demos.demo1.PrimeCalculator;

public class PrevaylerTest extends ATestExample {

	private static String NUMBER_KEEPER = "NumberKeeper";

	@Test
	public void runNumberKeeper() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			// delete old counts
			String folderName = clearTempFolder(NUMBER_KEEPER);
			
			final NumberKeeper numberKeeper = new NumberKeeper();
			final Prevayler prevayler = PrevaylerFactory.createPrevayler(numberKeeper, folderName);
			final PrimeCalculator primeCalculator = new PrimeCalculator(prevayler);
			
			System.out.println("Run the first time");
			primeCalculator.start();
			assertEquals("result of first run was false: " + numberKeeper.lastNumber(), 997, numberKeeper.lastNumber());
			System.out.println();
			System.out.println("Run the second time");
			primeCalculator.start();
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
		return "lib\\Prevayler.jar;lib\\prevayler-factory-2.5.jar;lib\\prevayler-core-2.5.jar;lib\\commons-jxpath-1.3.jar";
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
			org.prevayler.tutorial.Main.main(folderName);
		}
	}

}
