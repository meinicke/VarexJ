package prefix;
import Starter.SPLat;
import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.vm.Verify;

public class PrefixVarexJ {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new PrefixVarexJ(Integer.parseInt(args[0]));
	}

	@Conditional static boolean a1 = true;
	@Conditional static boolean a2 = true;
	@Conditional static boolean a3 = true;
	@Conditional static boolean a4 = true;
	@Conditional static boolean a5 = true;
	@Conditional static boolean a6 = true;
	@Conditional static boolean a7 = true;
	@Conditional static boolean a8 = true;
	@Conditional static boolean a9 = true;
	@Conditional static boolean a10 = true;
	
	int i = 0;
	public PrefixVarexJ(int value) {
		int current = 0;
		if (value == current) calculate();
		if (a1) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a2) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a3) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a4) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a5) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a6) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if ((a7)) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if (a8) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if ((a9)) {i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		if ((a10)){i = i + (int)Math.pow(2, current);}
		++current;
		if (value == current) calculate();
		
	}

	private void calculate() {
		int maxPrefix = 100_000;
		for (int j = 0; j < maxPrefix; j++) {System.out.print("");}
	}
	
}
