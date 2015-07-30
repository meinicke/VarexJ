package prefix;
import Starter.SPLat;
import gov.nasa.jpf.symbc.Symbolic;
import gov.nasa.jpf.vm.Verify;

public class PrefixJPF_SE {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new PrefixJPF_SE(Integer.parseInt(args[0]));
	}

	@Symbolic("true") static boolean a1;
	@Symbolic("true") static boolean a2;
	@Symbolic("true") static boolean a3;
	@Symbolic("true") static boolean a4;
	@Symbolic("true") static boolean a5;
	@Symbolic("true") static boolean a6;
	@Symbolic("true") static boolean a7;
	@Symbolic("true") static boolean a8;
	@Symbolic("true") static boolean a9;
	@Symbolic("true") static boolean a10;
	
	int i = 0;
	public PrefixJPF_SE(int value) {
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
