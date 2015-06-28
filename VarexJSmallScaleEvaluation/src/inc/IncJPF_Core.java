package inc;
import gov.nasa.jpf.vm.Verify;

public class IncJPF_Core {

	public static void main(String[] args) {
		new IncJPF_Core(Integer.parseInt(args[0]));
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
	

	public IncJPF_Core(int max) {
		int i = 0;
		
		int current = 0;
		if (a1 = gb()) {i++;}if (current++ >= max) return;
		if (a2 = gb()) {i++;}if (current++ >= max) return;
		if (a3 = gb()) {i++;}if (current++ >= max) return;
		if (a4 = gb()) {i++;}if (current++ >= max) return;
		if (a5 = gb()) {i++;}if (current++ >= max) return;
		if (a6 = gb()) {i++;}if (current++ >= max) return;
		if (a7 = gb()) {i++;}if (current++ >= max) return;
		if (a8 = gb()) {i++;}if (current++ >= max) return;
		if (a9 = gb()) {i++;}if (current++ >= max) return;
		if (a10 = gb()) {i++;}if (current++ >= max) return;
		
		if (a11 = gb()) {i++;}if (current++ >= max) return;
		if (a12 = gb()) {i++;}if (current++ >= max) return;
		if (a13 = gb()) {i++;}if (current++ >= max) return;
		if (a14 = gb()) {i++;}if (current++ >= max) return;
		if (a15 = gb()) {i++;}if (current++ >= max) return;
		if (a16 = gb()) {i++;}if (current++ >= max) return;
		if (a17 = gb()) {i++;}if (current++ >= max) return;
		if (a18 = gb()) {i++;}if (current++ >= max) return;
		if (a19 = gb()) {i++;}if (current++ >= max) return;
		if (a20 = gb()) {i++;}if (current++ >= max) return;
	}

	private boolean gb() {
		return Verify.getBoolean();
	}
	
}
