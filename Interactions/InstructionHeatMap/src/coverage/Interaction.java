package coverage;

/**
 * TODO description
 * @author Jens Meinicke
 *
 */
public class Interaction implements Comparable<Interaction> {
	
	private int line;
	private int interaction;
	private Object value = "";
	private String name;
	
//	public Interaction(int line, int interaction) {
//		this.line = line;
//		this.interaction = interaction;
//	}
	
	public Interaction(int line, int interaction, Object text) {
		this.line = line;
		this.interaction = interaction;
		this.value = text;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	public int getInteraction() {
		return interaction;
	}

	public void setInteraction(int interaction) {
		this.interaction = interaction;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Interaction other) {
		return Integer.compare(line, other.line);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + interaction;
		result = prime * result + line;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Interaction other = (Interaction) obj;
		if (interaction != other.interaction)
			return false;
		if (line != other.line)
			return false;
		if (!value.equals(other.value)) {
			return false;
		}
		return true;
	}

	public void setText(Object text) {
		this.value = text;
	}

	public String getText() {
		return value.toString();
	}
	
	public Object getValue() {
		return value;
	}
	
	@Override
	public String toString() {
		return interaction + " @ " + line + " = " + value;
	}


}
