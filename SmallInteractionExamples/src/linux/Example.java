package linux;

import gov.nasa.jpf.annotation.Conditional;

public class Example {

	@Conditional
	static boolean a = true;

	int field = 1;

	void method() {
		field = 2;
	}


	public static void main(String[] args) {
		Example e = new Example();
		if (a) {
			e.method();
		}
		System.out.println(e.field);//  why is field a 1, 0
	}
}
