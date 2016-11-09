package cmu.vatrace;

public final class TraceUtils {
	
	private TraceUtils() {}

	public static final String toShortID(int i) {
		if (i < 0) {
			return "";
		}
		final int rem = i % 62;
		final char letter;
		if (rem < 10) {
			letter = Integer.toString(rem).charAt(0);
		} else if (rem < 36) {
			letter = (char) ('a' + (rem - 10));
		} else {
			letter = (char) ('A' + (rem - 36));
		}
		return toShortID(i / 62 - 1) + letter;
	}
}
