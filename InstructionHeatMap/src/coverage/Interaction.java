package coverage;

/**
 * TODO description
 * @author Jens Meinicke
 *
 */
public class Interaction implements Comparable<Interaction> {
	
	private int line;
	private int interaction;
	
	public Interaction(int line) {
		this.line = line;
	}
	
	public Interaction(int line, int interaction) {
		this.line = line;
		this.interaction = interaction;
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
		return true;
	}


}
