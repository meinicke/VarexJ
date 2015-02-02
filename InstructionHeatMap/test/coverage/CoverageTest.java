package coverage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;


public class CoverageTest {
	
	private static final Coverage EXMAPLE_COVERAGE = new Coverage();
	private static final Set<Interaction> EXAMPLE_COVERED_LINES = new HashSet<>();
	private static final String EXAMPLE_FILE_NAME = "test.java";
	
	private static final Set<Interaction> EXAMPLE_COVERED_LINES_2 = new HashSet<>();
	private static final String EXAMPLE_FILE_NAME_2 = "test2.java";
	static {
		EXAMPLE_COVERED_LINES.add(new Interaction(1 , 0));
		EXAMPLE_COVERED_LINES.add(new Interaction(4 , 0));
		EXAMPLE_COVERED_LINES.add(new Interaction(15, 0));
		
		for (int i = 100; i < 200; i++) {
			EXAMPLE_COVERED_LINES.add(new Interaction(i, 0));
		}
		
		EXAMPLE_COVERED_LINES_2.add(new Interaction(6, 0));
		EXAMPLE_COVERED_LINES_2.add(new Interaction(7, 0));
		EXAMPLE_COVERED_LINES_2.add(new Interaction(8, 0));
		
		for (Interaction interaction : EXAMPLE_COVERED_LINES) {
			EXMAPLE_COVERAGE.setLineCovered(EXAMPLE_FILE_NAME, interaction.getLine(), interaction.getInteraction());
		}
		for (Interaction interaction : EXAMPLE_COVERED_LINES_2) {
			EXMAPLE_COVERAGE.setLineCovered(EXAMPLE_FILE_NAME_2, interaction.getLine(), interaction.getInteraction());
		}
	}

	@Test
	public void testCoverage() throws Exception {
		Set<Interaction> savedCoverage = EXMAPLE_COVERAGE.getCoverage(EXAMPLE_FILE_NAME);
		assertEquals(EXAMPLE_COVERED_LINES, savedCoverage);
		
		Set<Interaction> savedCoverage_2 = EXMAPLE_COVERAGE.getCoverage(EXAMPLE_FILE_NAME_2);
		assertEquals(EXAMPLE_COVERED_LINES_2, savedCoverage_2);
	}
	
	@Test
	public void coverageEqualsTest() {
		final String fileName = "test.java";
		
		Set<Integer> coveredLines = new HashSet<>();
		coveredLines.add(1);
		coveredLines.add(4);
		coveredLines.add(15);
		
		Coverage coverage = new Coverage();
		Coverage coverage2 = new Coverage();
		for (int line : coveredLines) {
			coverage.setLineCovered(fileName, line, 0);
			coverage2.setLineCovered(fileName, line, 0);
		}
		assertEquals(coverage, coverage2);
		
		coverage.setLineCovered("test2.java", 2, 0);
		assertNotEquals(coverage, coverage2);
		
		coverage2.setLineCovered("test2.java", 2, 0);
		assertEquals(coverage, coverage2);
		
		coverage2.setLineCovered("test2.java", 3, 0);
		assertNotEquals(coverage, coverage2);
	}
	
	@Test
	public void testReaderWriter() throws Exception {
		XMLWriter writer = new XMLWriter(EXMAPLE_COVERAGE);
		final String content = writer.write();
		
		XMLReader reader = new XMLReader();
		final Coverage rwCoverage = reader.readXML(content);
		
		assertEquals(EXMAPLE_COVERAGE, rwCoverage);
	}
	
	@Test
	public void testIO() throws Exception {
		File file = new File("coverage.xml");
		XMLWriter writer = new XMLWriter(EXMAPLE_COVERAGE);
		writer.writeToFile(file);
		
		XMLReader reader = new XMLReader();
		final Coverage rwCoverage = reader.readFromFile(file);
		
		assertEquals(EXMAPLE_COVERAGE, rwCoverage);
	}
	
	@Test
	public void testNullPointer() throws Exception {
		assertTrue(EXMAPLE_COVERAGE.getCoverage("NO FILE").isEmpty());
	}
	
}
