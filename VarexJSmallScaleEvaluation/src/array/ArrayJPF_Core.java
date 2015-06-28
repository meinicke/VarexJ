package array;
import gov.nasa.jpf.vm.Verify;

public class ArrayJPF_Core {

	public static void main(String[] args) {
		new ArrayJPF_Core(Integer.parseInt(args[0]));
	}
//
//	static boolean a1 = true;
//	static boolean a2 = true;
//	static boolean a3 = true;
//	static boolean a4 = true;
//	static boolean a5  = true;
//	static boolean a6  = true;
//	static boolean a7  = true;
//	static boolean a8  = true;
//	static boolean a9  = true;
//	static boolean a10 = true;
//	static boolean a11 = true;
//	static boolean a12 = true;
//	static boolean a13 = true;
//	static boolean a14 = true;
//	static boolean a15  = true;
//	static boolean a16  = true;
//	static boolean a17  = true;
//	static boolean a18  = true;
//	static boolean a19  = true;
//	static boolean a20 = true;
//	static boolean a21 = true;
//	static boolean a22 = true;
//	static boolean a23 = true;
//	static boolean a24 = true;
//	static boolean a25  = true;
//	static boolean a26  = true;
//	static boolean a27  = true;
//	static boolean a28  = true;
//	static boolean a29  = true;
//	static boolean a30 = true;
//	

	int[] array;
	public ArrayJPF_Core(int max) {
		array = new int[max + 1];
		int i = 0;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
		if (gb()) {array[i] = 1;} if (i++ >= max) return;
	}

	private boolean gb() {
		return Verify.getBoolean();
	}
	
}
