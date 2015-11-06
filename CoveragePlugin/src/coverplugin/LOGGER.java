package coverplugin;

/**
 * A colorful logger.
 * @author Jens Meinicke
 *
 */
public class LOGGER {

	public enum COLOR {
		BLACK(0), RED(1), GREEN(2), YELLOW(3), BLUE(4), MAGENTA(5);

		private int numVal;

		COLOR(int numVal) {
			this.numVal = numVal;
		}

		public int getValue() {
			return numVal;
		}
	}

	public static void log(COLOR color, String message) {
		System.out.println("\u001b[1;3" + color.getValue() + "m" + message + "\u001b[0m");
	}
	
	public static void log(COLOR color, Object obj) {
		log(color, obj.toString());
	}

}
