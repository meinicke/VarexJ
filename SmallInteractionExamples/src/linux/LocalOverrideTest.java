package linux;

import gov.nasa.jpf.annotation.Conditional;

public class LocalOverrideTest {

	@Conditional
	static boolean a = true;
	@Conditional
	static boolean b = true;

	int field = 1;

	void method() {
		field = 2;
	}


	public static void main(String[] args) {
		if (a) {
			LocalOverrideTest t = new LocalOverrideTest();
			t.method();
		}
		
		if (b) {
			LocalOverrideTest t = new LocalOverrideTest();
			t.method();
		}
	}
}
