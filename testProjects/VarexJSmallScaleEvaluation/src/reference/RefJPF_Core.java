package reference;
import gov.nasa.jpf.vm.Verify;

public class RefJPF_Core {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new RefJPF_Core(Integer.parseInt(args[0]));
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
	static boolean a11 = true;
	static boolean a12 = true;
	static boolean a13 = true;
	static boolean a14 = true;
	static boolean a15  = true;
	static boolean a16  = true;
	static boolean a17  = true;
	static boolean a18  = true;
	static boolean a19  = true;
	static boolean a20 = true;
	static boolean a21 = true;
	static boolean a22 = true;
	static boolean a23 = true;
	static boolean a24 = true;
	static boolean a25  = true;
	static boolean a26  = true;
	static boolean a27  = true;
	static boolean a28  = true;
	static boolean a29  = true;
	static boolean a30 = true;
	
	int i1, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, i28, i29, i30;
	public RefJPF_Core(int max) {
		int i = 0;
		if (i == max) return;
		if (a1  = gb()) {i1  = 1;} if (++i == max) return;
		if (a2  = gb()) {i2  = 1;} if (++i == max) return;
		if (a3  = gb()) {i3  = 1;} if (++i == max) return;
		if (a4  = gb()) {i4  = 1;} if (++i == max) return;
		if (a5  = gb()) {i5  = 1;} if (++i == max) return;
		if (a6  = gb()) {i6  = 1;} if (++i == max) return;
		if (a7  = gb()) {i7  = 1;} if (++i == max) return;
		if (a8  = gb()) {i8  = 1;} if (++i == max) return;
		if (a9  = gb()) {i9  = 1;} if (++i == max) return;
		if (a10 = gb()){i10 = 1;} if (++i == max) return;
		if (a11 = gb()){i11 = 1;} if (++i == max) return;
		if (a12 = gb()){i12 = 1;} if (++i == max) return;
		if (a13 = gb()){i13 = 1;} if (++i == max) return;
		if (a14 = gb()){i14 = 1;} if (++i == max) return;
		if (a15 = gb()){i15 = 1;} if (++i == max) return;
		if (a16 = gb()){i16 = 1;} if (++i == max) return;
		if (a17 = gb()){i17 = 1;} if (++i == max) return;
		if (a18 = gb()){i18 = 1;} if (++i == max) return;
		if (a19 = gb()){i19 = 1;} if (++i == max) return;
		if (a20 = gb()){i20 = 1;} if (++i == max) return;
		if (a21 = gb()){i21 = 1;} if (++i == max) return;
		if (a22 = gb()){i22 = 1;} if (++i == max) return;
		if (a23 = gb()){i23 = 1;} if (++i == max) return;
		if (a24 = gb()){i24 = 1;} if (++i == max) return;
		if (a25 = gb()){i25 = 1;} if (++i == max) return;
		if (a26 = gb()){i26 = 1;} if (++i == max) return;
		if (a27 = gb()){i27 = 1;} if (++i == max) return;
		if (a28 = gb()){i28 = 1;} if (++i == max) return;
		if (a29 = gb()){i29 = 1;} if (++i == max) return;
		if (a30 = gb()){i30 = 1;} if (++i == max) return;
	}

	private boolean gb() {
		return Verify.getBoolean();
	}
	
}
