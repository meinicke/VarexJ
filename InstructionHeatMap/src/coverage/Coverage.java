package coverage;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * 
 * Data structure to represent the coverage for lines.
 * @author Jens Meinicke
 *
 */
public class Coverage {

	private final TreeMap<String, Map<Integer, Interaction>> coverage;
	private String type;
	private int baseValue = 0;
	private int minInteraction;
	
	public Coverage() {
		coverage = new TreeMap<>();
	}
	
	public void setType(String text) {
		type = text;
	}
	
	public String getType() {
		return type;
	}
	
	public void setLineCovered(final String fileName, int line, final int interaction, final Object text) {
		setLineCovered(fileName, line, interaction, text, false);
	}
		
	public void setLineCovered(final String fileName, int line, final int interaction, final Object text, boolean force) {
		final Map<Integer, Interaction> fileCoverage;
		if (coverage.containsKey(fileName)) {
			fileCoverage = coverage.get(fileName);
		} else {
			fileCoverage = new TreeMap<>();
			coverage.put(fileName, fileCoverage);
		}
		
		if (!fileCoverage.containsKey(line)) {
			fileCoverage.put(line, new Interaction(line, interaction, text));
		} else {
			final Interaction current = fileCoverage.get(line);
			if (force || current.getInteraction() <= interaction) {
				current.setInteraction(interaction);
				current.setText(text);
			}
		}
	}
	
	public Collection<String> getFiles() {
		return coverage.keySet();
	}
	
	public Interaction getCoverage(String file, Integer line) {
		if (coverage.containsKey(file)) {
			return coverage.get(file).get(line);
		}
		return null; 
	}
	
	public Collection<Interaction> getCoverage(String file) {
		if (coverage.containsKey(file)) {
			return coverage.get(file).values();
		}
		return Collections.emptySet();
	}
	
	public void deleteMinInteraction() {
		if (minInteraction <= -1) {
			return;
		}
		for (Map<Integer, Interaction> interactions : coverage.values()) {
			List<Integer> removeThese = new LinkedList<>(); 
			for (Entry<Integer, Interaction> i : interactions.entrySet()) {
				if (i.getValue().getInteraction() <= minInteraction) {
					removeThese.add(i.getKey());
				}
			}
			for (Integer remove : removeThese) {
				interactions.remove(remove);
			}
		}
	}
	
	public void clear() {
		coverage.clear();
	}
	
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		for (Entry<String, Map<Integer, Interaction>> fileCoverage : coverage.entrySet()) {
			builder.append("FILE: ");
			builder.append(fileCoverage.getKey());
			builder.append("\n");
			
			Map<Integer, Interaction> c = fileCoverage.getValue();
			for (Interaction interaction : c.values()) {
				builder.append(interaction);
				builder.append("\n");
			}
			builder.append("---------------------");
				
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
