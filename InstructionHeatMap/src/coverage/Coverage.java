package coverage;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * 
 * Data structure to represent line coverage
 * @author Jens Meinicke
 *
 */
public class Coverage {

	private final TreeMap<String, Set<Interaction>> coverage;
	
	public Coverage() {
		coverage = new TreeMap<>();
	}
	
	public void setLineCovered(String fileName, Integer line, int interaction) {
		final Set<Interaction> fileCoverage;
		if (coverage.containsKey(fileName)) {
			fileCoverage = coverage.get(fileName);
		} else {
			fileCoverage = new TreeSet<>();
			coverage.put(fileName, fileCoverage);
		}
		
		if (!fileCoverage.contains(new Interaction(line))) {
			fileCoverage.add(new Interaction(line, interaction));
		}
	}
	
//	public void setLinesCovered(String fileName, Integer from, Integer to) {
//		final Set<Integer> fileCoverage;
//		if (coverage.containsKey(fileName)) {
//			fileCoverage = coverage.get(fileName);
//		} else {
//			fileCoverage = new TreeSet<>();
//			coverage.put(fileName, fileCoverage);
//		}
//		for (int line = from; line <= to; line++) {
////			if (!fileCoverage.contains(line)) {
//				fileCoverage.add(line);
////			}
//		}
//	}
	
//	public boolean isLineCovered(String file, Integer line) {
//		if (coverage.containsKey(file)) {
//			final Set<Integer> fileCoverage = coverage.get(file);
//			return fileCoverage.contains(line);
//		}
//		return false;
//	}
//	
	public Set<String> getFiles() {
		return coverage.keySet();
	}
	
	public Set<Interaction> getCoverage(String file) {
		if (coverage.containsKey(file)) {
			return coverage.get(file);
		}
		return Collections.emptySet();
	}
	
	public void clear() {
		coverage.clear();
	}
	
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		for (Entry<String, Set<Interaction>> fileCoverage : coverage.entrySet()) {
			builder.append("FILE: ");
			builder.append(fileCoverage.getKey());
			builder.append("\n");
			int from = Integer.MIN_VALUE;
			int current = Integer.MIN_VALUE;
			for (Interaction interaction : fileCoverage.getValue()) {
				int line = interaction.getLine();
				if (from == Integer.MIN_VALUE) {
					from = line;
					current = line;
					continue;
				}
				if (line <= current + 1) {
					current = line;
					continue;
				}
				if (from == current) {
					builder.append(current);
					builder.append("\n");
				} else {
					builder.append(from);
					builder.append('-');
					builder.append(current);
					builder.append("\n");
				}
				from = line;
				current = line;
			}
			if (from == current) {
				builder.append(current);
				builder.append("\n");
			} else {
				builder.append(from);
				builder.append('-');
				builder.append(current);
				builder.append("\n");
			}
			builder.append("---------------------\n");
		}
		
		return builder.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Coverage) {
			Coverage other = (Coverage) obj;
			return coverage.equals(other.coverage);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return coverage.hashCode();
	}
}
