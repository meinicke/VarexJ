package array;
import gov.nasa.jpf.bdd.TrackWithBDD;
import gov.nasa.jpf.vm.Verify;

public class ArrayBDD {

	public static void main(String[] args) {
		Verify.resetInstructionCounter();
		new ArrayBDD(Integer.parseInt(args[0]));
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
	
	int[] array;
	public ArrayBDD(int max) {
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
