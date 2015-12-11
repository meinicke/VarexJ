package coverage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;


public class CoverageTest {
	
	private static final Coverage EXMAPLE_COVERAGE = new Coverage();
	private static final Collection<Interaction> EXAMPLE_COVERED_LINES = new TreeSet<>();
	private static final String EXAMPLE_FILE_NAME = "test.java";
	
	private static final Set<Interaction> EXAMPLE_COVERED_LINES_2 = new TreeSet<>();
	private static final String EXAMPLE_FILE_NAME_2 = "test2.java";
	static {
		EXAMPLE_COVERED_LINES.add(new Interaction(1 , 0, "A"));
		EXAMPLE_COVERED_LINES.add(new Interaction(4 , 0, "B"));
		EXAMPLE_COVERED_LINES.add(new Interaction(15, 0, "C"));
		
		for (int i = 100; i < 200; i++) {
			EXAMPLE_COVERED_LINES.add(new Interaction(i, 1, "D"));
		}
		
		EXAMPLE_COVERED_LINES_2.add(new Interaction(6, 0, "E"));
		EXAMPLE_COVERED_LINES_2.add(new Interaction(7, 0, "F"));
		EXAMPLE_COVERED_LINES_2.add(new Interaction(8, 0, "G"));
		
		EXMAPLE_COVERAGE.setType("TYPE");
		EXMAPLE_COVERAGE.setBaseValue(1);
		for (Interaction interaction : EXAMPLE_COVERED_LINES) {
			EXMAPLE_COVERAGE.setLineCovered(EXAMPLE_FILE_NAME, interaction.getLine(), interaction.getInteraction(), interaction.getText());
		}
		for (Interaction interaction : EXAMPLE_COVERED_LINES_2) {
			EXMAPLE_COVERAGE.setLineCovered(EXAMPLE_FILE_NAME_2, interaction.getLine(), interaction.getInteraction(), interaction.getText());
		}
	}
	
	@Test
	public void testCoverage() throws Exception {
		Collection<Interaction> savedCoverage = EXMAPLE_COVERAGE.getCoverage(EXAMPLE_FILE_NAME);
		assertTrue(setEquals(EXAMPLE_COVERED_LINES, savedCoverage));
		
		Collection<Interaction> savedCoverage_2 = EXMAPLE_COVERAGE.getCoverage(EXAMPLE_FILE_NAME_2);
		assertTrue(setEquals(EXAMPLE_COVERED_LINES_2, savedCoverage_2));
	}
	
	private boolean setEquals(Collection<Interaction> set1, Collection<Interaction> set2) {
		return set1.containsAll(set2) && set2.containsAll(set1);
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
			coverage.setLineCovered(fileName, line, 0, "A");
			coverage2.setLineCovered(fileName, line, 0, "A");
		}
		assertEquals(coverage, coverage2);
		
		coverage.setLineCovered("test2.java", 2, 0, "A");
		assertNotEquals(coverage, coverage2);
		
		coverage2.setLineCovered("test2.java", 2, 0, "A");
		assertEquals(coverage, coverage2);
		
		coverage2.setLineCovered("test2.java", 3, 0, "A");
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
		assertEquals(EXMAPLE_COVERAGE.getType(), rwCoverage.getType());
		assertEquals(EXMAPLE_COVERAGE.getBaseValue(), rwCoverage.getBaseValue());
	}
	
	@Test
	public void testNullPointer() throws Exception {
		assertTrue(EXMAPLE_COVERAGE.getCoverage("NO FILE").isEmpty());
	}
	
	
	@Test
	public void overrideTest() throws Exception {
		Coverage coverage = new Coverage();
		coverage.setLineCovered(EXAMPLE_FILE_NAME, 0, 0, "TRUE");
		
		for (Interaction element: coverage.getCoverage(EXAMPLE_FILE_NAME)) {
			assertEquals(element, new Interaction(0, 0, "TRUE"));
		}
		
		coverage.setLineCovered(EXAMPLE_FILE_NAME, 0, 1, "A");
		
		for (Interaction element: coverage.getCoverage(EXAMPLE_FILE_NAME)) {
			assertEquals(element, new Interaction(0, 1, "A"));
		}
		
		coverage.setLineCovered(EXAMPLE_FILE_NAME, 0, 0, "TRUE");
		
		for (Interaction element: coverage.getCoverage(EXAMPLE_FILE_NAME)) {
			assertEquals(element, new Interaction(0, 1, "A"));
		}
	}
	
	@Test
	public void stringtest() throws Exception {
		String a = "a";
		String b = "a";
		System.out.println(a == b);
		String a1 = ("b" + a);
		String b1 = ("b" + b);
		System.out.println(a1 == b1);
		a1 = a1.intern();
		b1 = b1.intern();
		System.out.println(a1 == b1);
	}
	
	
}
