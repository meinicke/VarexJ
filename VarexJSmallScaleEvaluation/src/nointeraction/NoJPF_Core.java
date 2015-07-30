package nointeraction;
import gov.nasa.jpf.vm.Verify;

public class NoJPF_Core {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new NoJPF_Core(Integer.parseInt(args[0]));
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
	

	public NoJPF_Core(int max) {
		int current = 0;
		if (current++ == max) return;
		if (a1 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a2 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a3 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a4 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a5 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a6 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a7 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a8 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a9 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a10 = gb()) {System.out.print("");}if (current++ == max) return;
		
		if (a11 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a12 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a13 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a14 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a15 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a16 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a17 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a18 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a19 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a20 = gb()) {System.out.print("");}if (current++ == max) return;
		
		if (a21 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a22 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a23 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a24 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a25 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a26 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a27 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a28 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a29 = gb()) {System.out.print("");}if (current++ == max) return;
		if (a30 = gb()) {System.out.print("");}if (current++ == max) return;
	}

	private boolean gb() {
		return Verify.getBoolean();
	}
	
}
