package linux;

import gov.nasa.jpf.annotation.Conditional;

public class IfElseTest {

	@Conditional
	static boolean a = true;
	
	Direction dir = Direction.UP;

	enum Direction { UP, DOWN }


	public static void main(String[] args) {
		IfElseTest e = new IfElseTest();
		if (a) {
			e.dir = Direction.DOWN;
		} else {
			e.dir = Direction.DOWN;
		}
	}
}
