package coverage;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 * Data structure to represent the coverage for lines.
 * @author Jens Meinicke
 *
 */
public class CoverageMiguel {

	private final Map<String, Map<String, Map<Integer, Interaction>>> coverage;
	private String type;
	private int baseValue = 0;
	private int minInteraction;
	
	public CoverageMiguel() {
		coverage = new TreeMap<>();
	}
	
	public void setType(String text) {
		type = text;
	}
	
	public String getType() {
		return type;
	}
	
	public void setLineCovered(final String fileName, String methodName, int line, final int interaction, final Object content, String name) {
		final Map<String,Map<Integer,Interaction>> fileCoverage;
		if (coverage.containsKey(fileName)) {
			fileCoverage = coverage.get(fileName);
		} else {
			fileCoverage = new TreeMap<>();
			coverage.put(fileName, fileCoverage);
		}
		
		Map<Integer, Interaction> methodCoverage;
		if (fileCoverage.containsKey(methodName)) {
			methodCoverage = fileCoverage.get(methodName);
		} else {
			methodCoverage = new TreeMap<>();
			fileCoverage.put(methodName, methodCoverage);
		}
		
		if (!methodCoverage.containsKey(line)) {
			final Interaction value = new Interaction(line, interaction, content);
			value.setName(name);
			methodCoverage.put(line, value);
		} else {
			final Interaction current = methodCoverage.get(line);
			current.setInteraction(interaction);
			current.setText(content);
		}
	}
	
	public Collection<String> getFiles() {
		return coverage.keySet();
	}
	
	public Interaction getCoverage(String file, String method, Integer line) {
		if (coverage.containsKey(file) && coverage.get(file).containsKey(method)) {
			return coverage.get(file).get(method).get(line);
		}
		return null; 
	}
	
	public Map<String, Map<Integer, Interaction>> getCoverage(String file) {
		if (coverage.containsKey(file)) {
			return coverage.get(file);
		}
		return Collections.emptyMap();
	}
	
	public void deleteMinInteraction() {
		System.err.println("CoverageMiguel.deleteMinInteraction() not implemented");
//		if (minInteraction <= -1) {
//			return;
//		}
//		for (Map<Integer, Interaction> interactions : coverage.values()) {
//			List<Integer> removeThese = new LinkedList<>(); 
//			for (Entry<Integer, Interaction> i : interactions.entrySet()) {
//				if (i.getValue().getInteraction() <= minInteraction) {
//					removeThese.add(i.getKey());
//				}
//			}
//			for (Integer remove : removeThese) {
//				interactions.remove(remove);
//			}
//		}
	}
	
	public void clear() {
		coverage.clear();
	}
	
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		for (Entry<String, Map<String, Map<Integer, Interaction>>> fileCoverage : coverage.entrySet()) {
			builder.append("FILE: ");
			builder.append(fileCoverage.getKey());
			builder.append("\n");
			for (Entry<String, Map<Integer, Interaction>> methodCoverage : fileCoverage.getValue().entrySet()) {
				builder.append("METHOD: ");
				builder.append(methodCoverage.getKey());
				builder.append("\n");
				Map<Integer, Interaction> c = methodCoverage.getValue();
				for (Interaction interaction : c.values()) {
					builder.append(interaction);
					builder.append("\n");
				}
				builder.append("---------------------");
			}
		}
		
		return builder.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CoverageMiguel) {
			CoverageMiguel other = (CoverageMiguel) obj;
			return coverage.equals(other.coverage);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return coverage.hashCode();
	}

	public int getBaseValue() {
		return baseValue;
	}

	public void setBaseValue(int baseValue) {
		this.baseValue = baseValue;
	}

	public void setMinInteraction(int minInteraction) {
		this.minInteraction = minInteraction;
	}
}
