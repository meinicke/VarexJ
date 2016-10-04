package linux;

import gov.nasa.jpf.annotation.Conditional;

/**
 * http://vbdb.itu.dk/#bug/linux/60e233a

 * @author Jens Meinicke
 *
 */
public class Linux4 {

	@Conditional
	public static boolean configHotplug = false;
	
	/**
	 * buffer for the variables
	 */
	public final static int UEVENT_BUFFER_SIZE = 2_048;

	private static char[] buf = new char[UEVENT_BUFFER_SIZE];
	
	private static int buflen = 0;


	public static boolean addUeventVar() {
		if(configHotplug) {
			int len = sprintf(buf, buflen, "MODALIAS=");
			buflen += len + 1;
			return false;
		} else {
			return false;
		}
	}

	public static int inputAddUeventModaliasVar() {
		if(addUeventVar()) {
			return -1;
		}
		buf[buflen - 1] = 'x';
		return 0;
	}

	public static void main(String[] args) {
		inputAddUeventModaliasVar();
		System.out.println(new String(buf));
	}
	
	public static int sprintf(char[] string, int pos, String content) {
		try {
			System.arraycopy(content.toCharArray(), 0, string, pos, content.length());
			return content.length();
		} catch (Exception e) {
			return -1;
		}
	}
}


