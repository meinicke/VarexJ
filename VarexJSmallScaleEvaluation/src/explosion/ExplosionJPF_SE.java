package explosion;
import gov.nasa.jpf.symbc.Symbolic;
import gov.nasa.jpf.vm.Verify;

public class ExplosionJPF_SE {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new ExplosionJPF_SE(Integer.parseInt(args[0]));
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
	
	public ExplosionJPF_SE(int max) {
		int i = 0;

		int current = 0;
		if (current == max) return;
		if (a1) {i += Math.pow(2, current);}if (++current == max) return;
		if (a2) {i += Math.pow(2, current);}if (++current == max) return;
		if (a3) {i += Math.pow(2, current);}if (++current == max) return;
		if (a4) {i += Math.pow(2, current);}if (++current == max) return;
		if (a5) {i += Math.pow(2, current);}if (++current == max) return;
		if (a6) {i += Math.pow(2, current);}if (++current == max) return;
		if (a7) {i += Math.pow(2, current);}if (++current == max) return;
		if (a8) {i += Math.pow(2, current);}if (++current == max) return;
		if (a9) {i += Math.pow(2, current);}if (++current == max) return;
		if (a10){i += Math.pow(2, current);}if (++current == max) return;
		if (a11){i += Math.pow(2, current);}if (++current == max) return;
		if (a12){i += Math.pow(2, current);}if (++current == max) return;
		if (a13){i += Math.pow(2, current);}if (++current == max) return;
		if (a14){i += Math.pow(2, current);}if (++current == max) return;
		if (a15){i += Math.pow(2, current);}if (++current == max) return;
		if (a16){i += Math.pow(2, current);}if (++current == max) return;
		if (a17){i += Math.pow(2, current);}if (++current == max) return;
		if (a18){i += Math.pow(2, current);}if (++current == max) return;
		if (a19){i += Math.pow(2, current);}if (++current == max) return;
		if (a20){i += Math.pow(2, current);}if (++current == max) return;
		if (a21){i += Math.pow(2, current);}if (++current == max) return;
		if (a22){i += Math.pow(2, current);}if (++current == max) return;
		if (a23){i += Math.pow(2, current);}if (++current == max) return;
		if (a24){i += Math.pow(2, current);}if (++current == max) return;
		if (a25){i += Math.pow(2, current);}if (++current == max) return;
		if (a26){i += Math.pow(2, current);}if (++current == max) return;
		if (a27){i += Math.pow(2, current);}if (++current == max) return;
		if (a28){i += Math.pow(2, current);}if (++current == max) return;
		if (a29){i += Math.pow(2, current);}if (++current == max) return;
		if (a30){i += Math.pow(2, current);}if (++current == max) return;
	}
}
