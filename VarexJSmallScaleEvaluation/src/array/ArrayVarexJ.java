package array;
import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.vm.Verify;

public class ArrayVarexJ {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new ArrayVarexJ(Integer.parseInt(args[0]));
	}

//	@Conditional public  static boolean a1 = true;
//	@Conditional public  static boolean a2 = true;
//	@Conditional public  static boolean a3 = true;
//	@Conditional public  static boolean a4 = true;
//	@Conditional public  static boolean a5 = true;
//	@Conditional public  static boolean a6 = true;
//	@Conditional public  static boolean a7 = true;
//	@Conditional public  static boolean a8 = true;
//	@Conditional public  static boolean a9 = true;
//	@Conditional public  static boolean a10 = true;
//	@Conditional public  static boolean a11 = true;
//	@Conditional public  static boolean a12 = true;
//	@Conditional public  static boolean a13 = true;
//	@Conditional public  static boolean a14 = true;
//	@Conditional public  static boolean a15 = true;
//	@Conditional public  static boolean a16 = true;
//	@Conditional public  static boolean a17 = true;
//	@Conditional public  static boolean a18 = true;
//	@Conditional public  static boolean a19 = true;
//	@Conditional public  static boolean a20 = true;
//	@Conditional public  static boolean a21 = true;
//	@Conditional public  static boolean a22 = true;
//	@Conditional public  static boolean a23 = true;
//	@Conditional public  static boolean a24 = true;
//	@Conditional public  static boolean a25 = true;
//	@Conditional public  static boolean a26 = true;
//	@Conditional public  static boolean a27 = true;
//	@Conditional public  static boolean a28 = true;
//	@Conditional public  static boolean a29 = true;
//	@Conditional public  static boolean a30 = true;
//	@Conditional public  static boolean a31 = true;
//	@Conditional public  static boolean a32 = true;
//	@Conditional public  static boolean a33 = true;
//	@Conditional public  static boolean a34 = true;
//	@Conditional public  static boolean a35 = true;
//	@Conditional public  static boolean a36 = true;
//	@Conditional public  static boolean a37 = true;
//	@Conditional public  static boolean a38 = true;
//	@Conditional public  static boolean a39 = true;
//	@Conditional public  static boolean a40 = true;
//	@Conditional public  static boolean a41 = true;
//	@Conditional public  static boolean a42 = true;
//	@Conditional public  static boolean a43 = true;
//	@Conditional public  static boolean a44 = true;
//	@Conditional public  static boolean a45 = true;
//	@Conditional public  static boolean a46 = true;
//	@Conditional public  static boolean a47 = true;
//	@Conditional public  static boolean a48 = true;
//	@Conditional public  static boolean a49 = true;
//	@Conditional public  static boolean a50 = true;
//	@Conditional public  static boolean a51 = true;
//	@Conditional public  static boolean a52 = true;
//	@Conditional public  static boolean a53 = true;
//	@Conditional public  static boolean a54 = true;
//	@Conditional public  static boolean a55 = true;
//	@Conditional public  static boolean a56 = true;
//	@Conditional public  static boolean a57 = true;
//	@Conditional public  static boolean a58 = true;
//	@Conditional public  static boolean a59 = true;
//	@Conditional public  static boolean a60 = true;
//	@Conditional public  static boolean a61 = true;
//	@Conditional public  static boolean a62 = true;
//	@Conditional public  static boolean a63 = true;
//	@Conditional public  static boolean a64 = true;
//	@Conditional public  static boolean a65 = true;
//	@Conditional public  static boolean a66 = true;
//	@Conditional public  static boolean a67 = true;
//	@Conditional public  static boolean a68 = true;
//	@Conditional public  static boolean a69 = true;
//	@Conditional public  static boolean a70 = true;
//	@Conditional public  static boolean a71 = true;
//	@Conditional public  static boolean a72 = true;
//	@Conditional public  static boolean a73 = true;
//	@Conditional public  static boolean a74 = true;
//	@Conditional public  static boolean a75 = true;
//	@Conditional public  static boolean a76 = true;
//	@Conditional public  static boolean a77 = true;
//	@Conditional public  static boolean a78 = true;
//	@Conditional public  static boolean a79 = true;
//	@Conditional public  static boolean a80 = true;
//	@Conditional public  static boolean a81 = true;
//	@Conditional public  static boolean a82 = true;
//	@Conditional public  static boolean a83 = true;
//	@Conditional public  static boolean a84 = true;
//	@Conditional public  static boolean a85 = true;
//	@Conditional public  static boolean a86 = true;
//	@Conditional public  static boolean a87 = true;
//	@Conditional public  static boolean a88 = true;
//	@Conditional public  static boolean a89 = true;
//	@Conditional public  static boolean a90 = true;
//	@Conditional public  static boolean a91 = true;
//	@Conditional public  static boolean a92 = true;
//	@Conditional public  static boolean a93 = true;
//	@Conditional public  static boolean a94 = true;
//	@Conditional public  static boolean a95 = true;
//	@Conditional public  static boolean a96 = true;
//	@Conditional public  static boolean a97 = true;
//	@Conditional public  static boolean a98 = true;
//	@Conditional public  static boolean a99 = true;
//	@Conditional public  static boolean a100 = true;
	
	boolean[] array;
	public ArrayVarexJ(int max) {
		array = new boolean[max + 1];
		
		
		for (int i = 0; i < max; i++) {
			array[i] = getBoolean();
		}
//		for (int i = 0; i < max; i++) {
//			System.out.println(array[i]);
//		}
		
	}
	
	boolean getBoolean() {
		return new C().b;
	}
	
	class C{
		@Conditional 
		boolean b = true;
	}
//		if (a1) {array[i] = 1;} if (++i == max) return;
//		if (a2) {array[i] = 1;} if (++i == max) return;
//		if (a3) {array[i] = 1;} if (++i == max) return;
//		if (a4) {array[i] = 1;} if (++i == max) return;
//		if (a5) {array[i] = 1;} if (++i == max) return;
//		if (a6) {array[i] = 1;} if (++i == max) return;
//		if (a7) {array[i] = 1;} if (++i == max) return;
//		if (a8) {array[i] = 1;} if (++i == max) return;
//		if (a9) {array[i] = 1;} if (++i == max) return;
//		if (a10){array[i] = 1;} if (++i == max) return;
//		if (a11){array[i] = 1;} if (++i == max) return;
//		if (a12){array[i] = 1;} if (++i == max) return;
//		if (a13){array[i] = 1;} if (++i == max) return;
//		if (a14){array[i] = 1;} if (++i == max) return;
//		if (a15){array[i] = 1;} if (++i == max) return;
//		if (a16){array[i] = 1;} if (++i == max) return;
//		if (a17){array[i] = 1;} if (++i == max) return;
//		if (a18){array[i] = 1;} if (++i == max) return;
//		if (a19){array[i] = 1;} if (++i == max) return;
//		if (a20){array[i] = 1;} if (++i == max) return;
//		if (a21){array[i] = 1;} if (++i == max) return;
//		if (a22){array[i] = 1;} if (++i == max) return;
//		if (a23){array[i] = 1;} if (++i == max) return;
//		if (a24){array[i] = 1;} if (++i == max) return;
//		if (a25){array[i] = 1;} if (++i == max) return;
//		if (a26){array[i] = 1;} if (++i == max) return;
//		if (a27){array[i] = 1;} if (++i == max) return;
//		if (a28){array[i] = 1;} if (++i == max) return;
//		if (a29){array[i] = 1;} if (++i == max) return;
//		if (a30){array[i] = 1;} if (++i == max) return;
//		if (a31){array[i] = 1;} if (++i == max) return;
//		if (a32){array[i] = 1;} if (++i == max) return;
//		if (a33){array[i] = 1;} if (++i == max) return;
//		if (a34){array[i] = 1;} if (++i == max) return;
//		if (a35){array[i] = 1;} if (++i == max) return;
//		if (a36){array[i] = 1;} if (++i == max) return;
//		if (a37){array[i] = 1;} if (++i == max) return;
//		if (a38){array[i] = 1;} if (++i == max) return;
//		if (a39){array[i] = 1;} if (++i == max) return;
//		if (a40){array[i] = 1;} if (++i == max) return;
//		if (a41){array[i] = 1;} if (++i == max) return;
//		if (a42){array[i] = 1;} if (++i == max) return;
//		if (a43){array[i] = 1;} if (++i == max) return;
//		if (a44){array[i] = 1;} if (++i == max) return;
//		if (a45){array[i] = 1;} if (++i == max) return;
//		if (a46){array[i] = 1;} if (++i == max) return;
//		if (a47){array[i] = 1;} if (++i == max) return;
//		if (a48){array[i] = 1;} if (++i == max) return;
//		if (a49){array[i] = 1;} if (++i == max) return;
//		if (a50){array[i] = 1;} if (++i == max) return;
//		if (a51){array[i] = 1;} if (++i == max) return;
//		if (a52){array[i] = 1;} if (++i == max) return;
//		if (a53){array[i] = 1;} if (++i == max) return;
//		if (a54){array[i] = 1;} if (++i == max) return;
//		if (a55){array[i] = 1;} if (++i == max) return;
//		if (a56){array[i] = 1;} if (++i == max) return;
//		if (a57){array[i] = 1;} if (++i == max) return;
//		if (a58){array[i] = 1;} if (++i == max) return;
//		if (a59){array[i] = 1;} if (++i == max) return;
//		if (a60){array[i] = 1;} if (++i == max) return;
//		if (a61){array[i] = 1;} if (++i == max) return;
//		if (a62){array[i] = 1;} if (++i == max) return;
//		if (a63){array[i] = 1;} if (++i == max) return;
//		if (a64){array[i] = 1;} if (++i == max) return;
//		if (a65){array[i] = 1;} if (++i == max) return;
//		if (a66){array[i] = 1;} if (++i == max) return;
//		if (a67){array[i] = 1;} if (++i == max) return;
//		if (a68){array[i] = 1;} if (++i == max) return;
//		if (a69){array[i] = 1;} if (++i == max) return;
//		if (a70){array[i] = 1;} if (++i == max) return;
//		if (a71){array[i] = 1;} if (++i == max) return;
//		if (a72){array[i] = 1;} if (++i == max) return;
//		if (a73){array[i] = 1;} if (++i == max) return;
//		if (a74){array[i] = 1;} if (++i == max) return;
//		if (a75){array[i] = 1;} if (++i == max) return;
//		if (a76){array[i] = 1;} if (++i == max) return;
//		if (a77){array[i] = 1;} if (++i == max) return;
//		if (a78){array[i] = 1;} if (++i == max) return;
//		if (a79){array[i] = 1;} if (++i == max) return;
//		if (a80){array[i] = 1;} if (++i == max) return;
//		if (a81){array[i] = 1;} if (++i == max) return;
//		if (a82){array[i] = 1;} if (++i == max) return;
//		if (a83){array[i] = 1;} if (++i == max) return;
//		if (a84){array[i] = 1;} if (++i == max) return;
//		if (a85){array[i] = 1;} if (++i == max) return;
//		if (a86){array[i] = 1;} if (++i == max) return;
//		if (a87){array[i] = 1;} if (++i == max) return;
//		if (a88){array[i] = 1;} if (++i == max) return;
//		if (a89){array[i] = 1;} if (++i == max) return;
//		if (a90){array[i] = 1;} if (++i == max) return;
//		if (a91){array[i] = 1;} if (++i == max) return;
//		if (a92){array[i] = 1;} if (++i == max) return;
//		if (a93){array[i] = 1;} if (++i == max) return;
//		if (a94){array[i] = 1;} if (++i == max) return;
//		if (a95){array[i] = 1;} if (++i == max) return;
//		if (a96){array[i] = 1;} if (++i == max) return;
//		if (a97){array[i] = 1;} if (++i == max) return;
//		if (a98){array[i] = 1;} if (++i == max) return;
//		if (a99){array[i] = 1;} if (++i == max) return;
//		if (a100){array[i] = 1;} if (++i == max) return;
//	}
	
}
