package reference;

import gov.nasa.jpf.symbc.Symbolic;
import gov.nasa.jpf.vm.Verify;

public class RefSE {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new RefSE().run(Integer.parseInt(args[0]));
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
	
	int i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30;
	
	public void run(int max) {
		int i = 0;
		if (i == max) return;
		if (a1) {i1  = 1;} if (++i == max) return;
		if (a2) {i2  = 1;} if (++i == max) return;
		if (a3) {i3  = 1;} if (++i == max) return;
		if (a4) {i4  = 1;} if (++i == max) return;
		if (a5) {i5  = 1;} if (++i == max) return;
		if (a6) {i6  = 1;} if (++i == max) return;
		if (a7) {i7  = 1;} if (++i == max) return;
		if (a8) {i8  = 1;} if (++i == max) return;
		if (a9) {i9  = 1;} if (++i == max) return;
		if (a10){i10 = 1;} if (++i == max) return;
		if (a11){i11 = 1;} if (++i == max) return;
		if (a12){i12 = 1;} if (++i == max) return;
		if (a13){i13 = 1;} if (++i == max) return;
		if (a14){i14 = 1;} if (++i == max) return;
		if (a15){i15 = 1;} if (++i == max) return;
		if (a16){i16 = 1;} if (++i == max) return;
		if (a17){i17 = 1;} if (++i == max) return;
		if (a18){i18 = 1;} if (++i == max) return;
		if (a19){i19 = 1;} if (++i == max) return;
		if (a20){i20 = 1;} if (++i == max) return;
		if (a21){i21 = 1;} if (++i == max) return;
		if (a22){i22 = 1;} if (++i == max) return;
		if (a23){i23 = 1;} if (++i == max) return;
		if (a24){i24 = 1;} if (++i == max) return;
		if (a25){i25 = 1;} if (++i == max) return;
		if (a26){i26 = 1;} if (++i == max) return;
		if (a27){i27 = 1;} if (++i == max) return;
		if (a28){i28 = 1;} if (++i == max) return;
		if (a29){i29 = 1;} if (++i == max) return;
		if (a30){i30 = 1;} if (++i == max) return;
	}
	
}
