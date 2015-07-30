package prefix;
import gov.nasa.jpf.vm.Verify;

public class PrefixJPF_Core {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new PrefixJPF_Core(Integer.parseInt(args[0]));
	}

	static boolean a1 = true;
	static boolean a2 = true;
	static boolean a3 = true;
	static boolean a4 = true;
	static boolean a5  = true;
	static boolean a6  = true;
	static boolean a7  = true;
	static boolean a8  = true;
	static boolean a9  = true;
	static boolean a10 = true;
	
	int i = 0;
	public PrefixJPF_Core(int value) {
		int current = 0;
		if (value == current) calculate();
		if (a1 = gb()) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a2 = gb()) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a3 = gb()) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a4 = gb()) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a5 = gb()) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a6 = gb()) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if ((a7) = gb()) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a8 = gb()) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a9 = gb()) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a10 = gb()){i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		
	}

	private void calculate() {
		int maxPrefix = 100_000;
		for (int j = 0; j < maxPrefix; j++) {System.out.print("");}
	}

	private boolean gb() {
		return Verify.getBoolean();
	}
	
}
