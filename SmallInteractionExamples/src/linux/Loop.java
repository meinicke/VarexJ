package linux;

import gov.nasa.jpf.annotation.Conditional;

public class Loop {

	@Conditional
	static boolean a = true;

	public static void main(String[] args) {
		Loop e = new Loop();

		e.runLoop();
	}

	int field = 0;

	private void runLoop() {
		for (int i = 0; i < 4; i++) { 
			field = i;
		}
	}
}
