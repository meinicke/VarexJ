package coverage;

/**
 * TODO description
 * @author Jens Meinicke
 *
 */
public class Interaction implements Comparable<Interaction> {
	
	private int line;
	private int interaction;
	private String text = "";
	
//	public Interaction(int line, int interaction) {
//		this.line = line;
//		this.interaction = interaction;
//	}
	
	public Interaction(int line, int interaction, String text) {
		this.line = line;
		this.interaction = interaction;
		this.text = text;
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
		if (!text.equals(other.text)) {
			return false;
		}
		return true;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
	
	@Override
	public String toString() {
		return interaction + " @ " + line + " = " + text;
	}


}
