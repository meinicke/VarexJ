package linux;

import gov.nasa.jpf.annotation.Conditional;

public class OverrideTest {

	@Conditional
	static boolean a = true;
	@Conditional
	static boolean b = true;

	int MYfield = 1;

	void method() {
		MYfield = 2;
	}


	public static void main(String[] args) {
		if (a) {
			OverrideTest t = new OverrideTest();
			t.method();
		}
		
		if (b) {
			OverrideTest t = new OverrideTest();
			t.method();
			t.method();
		}
	}
}
