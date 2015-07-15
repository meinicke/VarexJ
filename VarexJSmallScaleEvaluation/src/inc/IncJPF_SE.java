package inc;
import gov.nasa.jpf.symbc.Symbolic;
import gov.nasa.jpf.vm.Verify;

public class IncJPF_SE {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new IncJPF_SE(Integer.parseInt(args[0]));
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
	@Symbolic("true") static boolean a11;
	@Symbolic("true") static boolean a12;
	@Symbolic("true") static boolean a13;
	@Symbolic("true") static boolean a14;
	@Symbolic("true") static boolean a15;
	@Symbolic("true") static boolean a16;
	@Symbolic("true") static boolean a17;
	@Symbolic("true") static boolean a18;
	@Symbolic("true") static boolean a19;
	@Symbolic("true") static boolean a20;
	@Symbolic("true") static boolean a21;
	@Symbolic("true") static boolean a22;
	@Symbolic("true") static boolean a23;
	@Symbolic("true") static boolean a24;
	@Symbolic("true") static boolean a25;
	@Symbolic("true") static boolean a26;
	@Symbolic("true") static boolean a27;
	@Symbolic("true") static boolean a28;
	@Symbolic("true") static boolean a29;
	@Symbolic("true") static boolean a30;
	
	public IncJPF_SE(int max) {
		int i = 0;

		int current = 0;
		if (current++ == max) return;
		if (a1) {i++;}if (current++ == max) return;
		if (a2) {i++;}if (current++ == max) return;
		if (a3) {i++;}if (current++ == max) return;
		if (a4) {i++;}if (current++ == max) return;
		if (a5) {i++;}if (current++ == max) return;
		if (a6) {i++;}if (current++ == max) return;
		if (a7) {i++;}if (current++ == max) return;
		if (a8) {i++;}if (current++ == max) return;
		if (a9) {i++;}if (current++ == max) return;
		if (a10){i++;}if (current++ == max) return;
		if (a11){i++;}if (current++ == max) return;
		if (a12){i++;}if (current++ == max) return;
		if (a13){i++;}if (current++ == max) return;
		if (a14){i++;}if (current++ == max) return;
		if (a15){i++;}if (current++ == max) return;
		if (a16){i++;}if (current++ == max) return;
		if (a17){i++;}if (current++ == max) return;
		if (a18){i++;}if (current++ == max) return;
		if (a19){i++;}if (current++ == max) return;
		if (a20){i++;}if (current++ == max) return;
		if (a21){i++;}if (current++ == max) return;
		if (a22){i++;}if (current++ == max) return;
		if (a23){i++;}if (current++ == max) return;
		if (a24){i++;}if (current++ == max) return;
		if (a25){i++;}if (current++ == max) return;
		if (a26){i++;}if (current++ == max) return;
		if (a27){i++;}if (current++ == max) return;
		if (a28){i++;}if (current++ == max) return;
		if (a29){i++;}if (current++ == max) return;
		if (a30){i++;}if (current++ == max) return;
	}
}
