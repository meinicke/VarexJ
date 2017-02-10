package jean;

import gov.nasa.jpf.annotation.Conditional;

public class Netpoll {

	@Conditional
	static boolean blue = true;
	@Conditional
	static boolean yellow = true;
	@Conditional
	static boolean green = true;

	
	boolean IPV4_SUPPORT = true;
	
	private String netpollSetup() {
		String errMessage = null;
		
		boolean type = true;
		if (yellow) {
			type = false;
		}
		
		if (blue) {
			if (type) {
				errMessage = "Destination address required";
				return errMessage;
			}
		}
		
		if (green) {
			if (IPV4_SUPPORT) {
				return errMessage;
			}
		}
		
		return "done";
	}
	
	public static void main(String[] args) {
		Netpoll netpoll = new Netpoll();
		netpoll.netpollSetup();
	}
}
