package jean;

import java.util.Random;

import gov.nasa.jpf.annotation.Conditional;

public class Http {

	@Conditional
	static boolean blue = true;
	@Conditional
	static boolean yellow = true;
	@Conditional
	static boolean green = true;	
	
	String subject = null;
	int totalLength = 600;
	final int HTTP_UNAUTHORIZED = 401;
	final int HTTP_NOT_IMPLEMENTED = 501;
	
	String REQUEST_GET = "GET";// blue
	
	private void sendHeaders(int responseNum) {
		int buf = 0;
		if (green) {
			buf = totalLength - responseNum;
			subject = "response header";
		}
		
		if (subject.isEmpty()) {
			subject = "Void response";
		}
		System.out.println("Done");
	}

	@Conditional
	static boolean http_unauthorized = true;
	
	private void handleIncoming(String requestType) {
		if (yellow) {
			if (http_unauthorized) {
				sendHeaders(HTTP_UNAUTHORIZED);
			}
		}
		
		if (blue) {
			if (!requestType.equals(REQUEST_GET)) {
				sendHeaders(HTTP_NOT_IMPLEMENTED);
			}
		}
	}
	
	public static void main(String[] args) {
		Http http = new Http();
		http.handleIncoming("POST");
	}
	
}
