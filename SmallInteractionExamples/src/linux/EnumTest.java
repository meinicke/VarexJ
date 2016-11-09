package linux;

import gov.nasa.jpf.annotation.Conditional;

public class EnumTest {

	@Conditional
	static boolean a = true;
	
	Direction dir = Direction.UP;

	enum Direction { UP, DOWN }


	public static void main(String[] args) {
		EnumTest e = new EnumTest();
		if (a) {
			e.dir = Direction.DOWN;
		}
	}
}
