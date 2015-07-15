package array;

import gov.nasa.jpf.symbc.Symbolic;
import gov.nasa.jpf.vm.Verify;

public class ArraySE {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new ArraySE().run(Integer.parseInt(args[0]));
	}

	@Symbolic("true") static boolean a1 ;
	@Symbolic("true") static boolean a2 ;
	@Symbolic("true") static boolean a3 ;
	@Symbolic("true") static boolean a4 ;
	@Symbolic("true") static boolean a5 ;
	@Symbolic("true") static boolean a6 ;
	@Symbolic("true") static boolean a7 ;
	@Symbolic("true") static boolean a8 ;
	@Symbolic("true") static boolean a9 ;
	@Symbolic("true") static boolean a10 ;
	@Symbolic("true") static boolean a11 ;
	@Symbolic("true") static boolean a12 ;
	@Symbolic("true") static boolean a13 ;
	@Symbolic("true") static boolean a14 ;
	@Symbolic("true") static boolean a15 ;
	@Symbolic("true") static boolean a16 ;
	@Symbolic("true") static boolean a17 ;
	@Symbolic("true") static boolean a18 ;
	@Symbolic("true") static boolean a19 ;
	@Symbolic("true") static boolean a20 ;
	@Symbolic("true") static boolean a21 ;
	@Symbolic("true") static boolean a22 ;
	@Symbolic("true") static boolean a23 ;
	@Symbolic("true") static boolean a24 ;
	@Symbolic("true") static boolean a25 ;
	@Symbolic("true") static boolean a26 ;
	@Symbolic("true") static boolean a27 ;
	@Symbolic("true") static boolean a28 ;
	@Symbolic("true") static boolean a29 ;
	@Symbolic("true") static boolean a30 ;
	
	int[] array;
	public void run(int max) {
			array = new int[max + 1];
			int i = 0;
			if (i == max) return;
			if (a1) {array[i] = 1;} if (++i == max) return;
			if (a2) {array[i] = 1;} if (++i == max) return;
			if (a3) {array[i] = 1;} if (++i == max) return;
			if (a4) {array[i] = 1;} if (++i == max) return;
			if (a5) {array[i] = 1;} if (++i == max) return;
			if (a6) {array[i] = 1;} if (++i == max) return;
			if (a7) {array[i] = 1;} if (++i == max) return;
			if (a8) {array[i] = 1;} if (++i == max) return;
			if (a9) {array[i] = 1;} if (++i == max) return;
			if (a10){array[i] = 1;} if (++i == max) return;
			if (a11){array[i] = 1;} if (++i == max) return;
			if (a12){array[i] = 1;} if (++i == max) return;
			if (a13){array[i] = 1;} if (++i == max) return;
			if (a14){array[i] = 1;} if (++i == max) return;
			if (a15){array[i] = 1;} if (++i == max) return;
			if (a16){array[i] = 1;} if (++i == max) return;
			if (a17){array[i] = 1;} if (++i == max) return;
			if (a18){array[i] = 1;} if (++i == max) return;
			if (a19){array[i] = 1;} if (++i == max) return;
			if (a20){array[i] = 1;} if (++i == max) return;
			if (a21){array[i] = 1;} if (++i == max) return;
			if (a22){array[i] = 1;} if (++i == max) return;
			if (a23){array[i] = 1;} if (++i == max) return;
			if (a24){array[i] = 1;} if (++i == max) return;
			if (a25){array[i] = 1;} if (++i == max) return;
			if (a26){array[i] = 1;} if (++i == max) return;
			if (a27){array[i] = 1;} if (++i == max) return;
			if (a28){array[i] = 1;} if (++i == max) return;
			if (a29){array[i] = 1;} if (++i == max) return;
			if (a30){array[i] = 1;} if (++i == max) return;
	}
	
}
