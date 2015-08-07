package nesting2;
import gov.nasa.jpf.bdd.TrackWithBDD;
import gov.nasa.jpf.vm.Verify;

public class NestVoidJPF_BDD {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new NestVoidJPF_BDD(Integer.parseInt(args[0]));
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
	@TrackWithBDD static boolean a11 = Verify.getBoolean();
	@TrackWithBDD static boolean a12 = Verify.getBoolean();
	@TrackWithBDD static boolean a13 = Verify.getBoolean();
	@TrackWithBDD static boolean a14 = Verify.getBoolean();
	@TrackWithBDD static boolean a15 = Verify.getBoolean();
	@TrackWithBDD static boolean a16 = Verify.getBoolean();
	@TrackWithBDD static boolean a17 = Verify.getBoolean();
	@TrackWithBDD static boolean a18 = Verify.getBoolean();
	@TrackWithBDD static boolean a19 = Verify.getBoolean();
	@TrackWithBDD static boolean a20 = Verify.getBoolean();
	@TrackWithBDD static boolean a21 = Verify.getBoolean();
	@TrackWithBDD static boolean a22 = Verify.getBoolean();
	@TrackWithBDD static boolean a23 = Verify.getBoolean();
	@TrackWithBDD static boolean a24 = Verify.getBoolean();
	@TrackWithBDD static boolean a25 = Verify.getBoolean();
	@TrackWithBDD static boolean a26 = Verify.getBoolean();
	@TrackWithBDD static boolean a27 = Verify.getBoolean();
	@TrackWithBDD static boolean a28 = Verify.getBoolean();
	@TrackWithBDD static boolean a29 = Verify.getBoolean();
	@TrackWithBDD static boolean a30 = Verify.getBoolean();
	@TrackWithBDD static boolean a31 = Verify.getBoolean();
	@TrackWithBDD static boolean a32 = Verify.getBoolean();
	@TrackWithBDD static boolean a33 = Verify.getBoolean();
	@TrackWithBDD static boolean a34 = Verify.getBoolean();
	@TrackWithBDD static boolean a35 = Verify.getBoolean();
	@TrackWithBDD static boolean a36 = Verify.getBoolean();
	@TrackWithBDD static boolean a37 = Verify.getBoolean();
	@TrackWithBDD static boolean a38 = Verify.getBoolean();
	@TrackWithBDD static boolean a39 = Verify.getBoolean();
	@TrackWithBDD static boolean a40 = Verify.getBoolean();
	@TrackWithBDD static boolean a41 = Verify.getBoolean();
	@TrackWithBDD static boolean a42 = Verify.getBoolean();
	@TrackWithBDD static boolean a43 = Verify.getBoolean();
	@TrackWithBDD static boolean a44 = Verify.getBoolean();
	@TrackWithBDD static boolean a45 = Verify.getBoolean();
	@TrackWithBDD static boolean a46 = Verify.getBoolean();
	@TrackWithBDD static boolean a47 = Verify.getBoolean();
	@TrackWithBDD static boolean a48 = Verify.getBoolean();
	@TrackWithBDD static boolean a49 = Verify.getBoolean();
	@TrackWithBDD static boolean a50 = Verify.getBoolean();
	@TrackWithBDD static boolean a51 = Verify.getBoolean();
	@TrackWithBDD static boolean a52 = Verify.getBoolean();
	@TrackWithBDD static boolean a53 = Verify.getBoolean();
	@TrackWithBDD static boolean a54 = Verify.getBoolean();
	@TrackWithBDD static boolean a55 = Verify.getBoolean();
	@TrackWithBDD static boolean a56 = Verify.getBoolean();
	@TrackWithBDD static boolean a57 = Verify.getBoolean();
	@TrackWithBDD static boolean a58 = Verify.getBoolean();
	@TrackWithBDD static boolean a59 = Verify.getBoolean();
	@TrackWithBDD static boolean a60 = Verify.getBoolean();
	@TrackWithBDD static boolean a61 = Verify.getBoolean();
	@TrackWithBDD static boolean a62 = Verify.getBoolean();
	@TrackWithBDD static boolean a63 = Verify.getBoolean();
	@TrackWithBDD static boolean a64 = Verify.getBoolean();
	@TrackWithBDD static boolean a65 = Verify.getBoolean();
	@TrackWithBDD static boolean a66 = Verify.getBoolean();
	@TrackWithBDD static boolean a67 = Verify.getBoolean();
	@TrackWithBDD static boolean a68 = Verify.getBoolean();
	@TrackWithBDD static boolean a69 = Verify.getBoolean();
	@TrackWithBDD static boolean a70 = Verify.getBoolean();
	@TrackWithBDD static boolean a71 = Verify.getBoolean();
	@TrackWithBDD static boolean a72 = Verify.getBoolean();
	@TrackWithBDD static boolean a73 = Verify.getBoolean();
	@TrackWithBDD static boolean a74 = Verify.getBoolean();
	@TrackWithBDD static boolean a75 = Verify.getBoolean();
	@TrackWithBDD static boolean a76 = Verify.getBoolean();
	@TrackWithBDD static boolean a77 = Verify.getBoolean();
	@TrackWithBDD static boolean a78 = Verify.getBoolean();
	@TrackWithBDD static boolean a79 = Verify.getBoolean();
	@TrackWithBDD static boolean a80 = Verify.getBoolean();
	@TrackWithBDD static boolean a81 = Verify.getBoolean();
	@TrackWithBDD static boolean a82 = Verify.getBoolean();
	@TrackWithBDD static boolean a83 = Verify.getBoolean();
	@TrackWithBDD static boolean a84 = Verify.getBoolean();
	@TrackWithBDD static boolean a85 = Verify.getBoolean();
	@TrackWithBDD static boolean a86 = Verify.getBoolean();
	@TrackWithBDD static boolean a87 = Verify.getBoolean();
	@TrackWithBDD static boolean a88 = Verify.getBoolean();
	@TrackWithBDD static boolean a89 = Verify.getBoolean();
	@TrackWithBDD static boolean a90 = Verify.getBoolean();
	@TrackWithBDD static boolean a91 = Verify.getBoolean();
	@TrackWithBDD static boolean a92 = Verify.getBoolean();
	@TrackWithBDD static boolean a93 = Verify.getBoolean();
	@TrackWithBDD static boolean a94 = Verify.getBoolean();
	@TrackWithBDD static boolean a95 = Verify.getBoolean();
	@TrackWithBDD static boolean a96 = Verify.getBoolean();
	@TrackWithBDD static boolean a97 = Verify.getBoolean();
	@TrackWithBDD static boolean a98 = Verify.getBoolean();
	@TrackWithBDD static boolean a99 = Verify.getBoolean();
	@TrackWithBDD static boolean a100 = Verify.getBoolean();
	
	public NestVoidJPF_BDD(int max) {


		int current = 0;
		if (current++ == max) return;
		if (a1) {if (current++ == max) return;
		if (a2) {if (current++ == max) return;
		if (a3) {if (current++ == max) return;
		if (a4) {if (current++ == max) return;
		if (a5) {if (current++ == max) return;
		if (a6) {if (current++ == max) return;
		if (a7) {if (current++ == max) return;
		if (a8) {if (current++ == max) return;
		if (a9) {if (current++ == max) return;
		if (a10){if (current++ == max) return;
		if (a11){if (current++ == max) return;
		if (a12){if (current++ == max) return;
		if (a13){if (current++ == max) return;
		if (a14){if (current++ == max) return;
		if (a15){if (current++ == max) return;
		if (a16){if (current++ == max) return;
		if (a17){if (current++ == max) return;
		if (a18){if (current++ == max) return;
		if (a19){if (current++ == max) return;
		if (a20){if (current++ == max) return;
		if (a21){if (current++ == max) return;
		if (a22){if (current++ == max) return;
		if (a23){if (current++ == max) return;
		if (a24){if (current++ == max) return;
		if (a25){if (current++ == max) return;
		if (a26){if (current++ == max) return;
		if (a27){if (current++ == max) return;
		if (a28){if (current++ == max) return;
		if (a29){if (current++ == max) return;
		if (a30){if (current++ == max) return;
		if (a31){if (current++ == max) return;
		if (a32){if (current++ == max) return;
		if (a33){if (current++ == max) return;
		if (a34){if (current++ == max) return;
		if (a35){if (current++ == max) return;
		if (a36){if (current++ == max) return;
		if (a37){if (current++ == max) return;
		if (a38){if (current++ == max) return;
		if (a39){if (current++ == max) return;
		if (a40){if (current++ == max) return;
		if (a41){if (current++ == max) return;
		if (a42){if (current++ == max) return;
		if (a43){if (current++ == max) return;
		if (a44){if (current++ == max) return;
		if (a45){if (current++ == max) return;
		if (a46){if (current++ == max) return;
		if (a47){if (current++ == max) return;
		if (a48){if (current++ == max) return;
		if (a49){if (current++ == max) return;
		if (a50){if (current++ == max) return;
		if (a51){if (current++ == max) return;
		if (a52){if (current++ == max) return;
		if (a53){if (current++ == max) return;
		if (a54){if (current++ == max) return;
		if (a55){if (current++ == max) return;
		if (a56){if (current++ == max) return;
		if (a57){if (current++ == max) return;
		if (a58){if (current++ == max) return;
		if (a59){if (current++ == max) return;
		if (a60){if (current++ == max) return;
		if (a61){if (current++ == max) return;
		if (a62){if (current++ == max) return;
		if (a63){if (current++ == max) return;
		if (a64){if (current++ == max) return;
		if (a65){if (current++ == max) return;
		if (a66){if (current++ == max) return;
		if (a67){if (current++ == max) return;
		if (a68){if (current++ == max) return;
		if (a69){if (current++ == max) return;
		if (a70){if (current++ == max) return;
		if (a71){if (current++ == max) return;
		if (a72){if (current++ == max) return;
		if (a73){if (current++ == max) return;
		if (a74){if (current++ == max) return;
		if (a75){if (current++ == max) return;
		if (a76){if (current++ == max) return;
		if (a77){if (current++ == max) return;
		if (a78){if (current++ == max) return;
		if (a79){if (current++ == max) return;
		if (a80){if (current++ == max) return;
		if (a81){if (current++ == max) return;
		if (a82){if (current++ == max) return;
		if (a83){if (current++ == max) return;
		if (a84){if (current++ == max) return;
		if (a85){if (current++ == max) return;
		if (a86){if (current++ == max) return;
		if (a87){if (current++ == max) return;
		if (a88){if (current++ == max) return;
		if (a89){if (current++ == max) return;
		if (a90){if (current++ == max) return;
		if (a91){if (current++ == max) return;
		if (a92){if (current++ == max) return;
		if (a93){if (current++ == max) return;
		if (a94){if (current++ == max) return;
		if (a95){if (current++ == max) return;
		if (a96){if (current++ == max) return;
		if (a97){if (current++ == max) return;
		if (a98){if (current++ == max) return;
		if (a99){if (current++ == max) return;
		if (a100){if (current++ == max) return;
		
		}}}}}}}}}}
		}}}}}}}}}}
		}}}}}}}}}}
		}}}}}}}}}}
		}}}}}}}}}}
		
		}}}}}}}}}}
		}}}}}}}}}}
		}}}}}}}}}}
		}}}}}}}}}}
		}}}}}}}}}}
	}
}
