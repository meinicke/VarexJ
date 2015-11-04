package prefix;
import gov.nasa.jpf.bdd.TrackWithBDD;
import gov.nasa.jpf.vm.Verify;

public class PrefixJPF_BDD {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new PrefixJPF_BDD(Integer.parseInt(args[0]));
	}

	@TrackWithBDD static boolean a1 = Verify.getBoolean();
	@TrackWithBDD static boolean a2 = Verify.getBoolean();
	@TrackWithBDD static boolean a3 = Verify.getBoolean();
	@TrackWithBDD static boolean a4 = Verify.getBoolean();
	@TrackWithBDD static boolean a5 = Verify.getBoolean();
	@TrackWithBDD static boolean a6 = Verify.getBoolean();
	@TrackWithBDD static boolean a7 = Verify.getBoolean();
	@TrackWithBDD static boolean a8 = Verify.getBoolean();
	@TrackWithBDD static boolean a9 = Verify.getBoolean();
	@TrackWithBDD static boolean a10 = Verify.getBoolean();
	
	int i = 0;
	public PrefixJPF_BDD(int value) {
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
