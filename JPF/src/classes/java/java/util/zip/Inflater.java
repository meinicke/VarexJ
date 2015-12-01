package java.util.zip;

/**
 * Native class for the Inflater.
 * All methods are applied to a HostJVM object.
 */
public class Inflater {
	private static final byte[] defaultBuf = new byte[0];
	private ZStreamRef zsRef;
	private byte[] buf = defaultBuf;
	private int off, len;
	private boolean finished;
	private boolean needDict;
	private long bytesRead;
	private long bytesWritten;

	public Inflater(boolean nowrap) {
		initialize(nowrap);
	}

	private native void initialize(boolean nowrap);

	public Inflater() {
		this(false);
	}

	public native void setInput(byte[] b, int off, int len);

	public void setInput(byte[] b) {
		setInput(b, 0, b.length);
	}

	public native void setDictionary(byte[] b, int off, int len);

	public void setDictionary(byte[] b) {
		setDictionary(b, 0, b.length);
	}

	public native int getRemaining();

	public native boolean needsInput();

	public native boolean needsDictionary();

	public native boolean finished();

	public native int inflate(byte[] b, int off, int len) throws DataFormatException;

	public int inflate(byte[] b) throws DataFormatException {
		return inflate(b, 0, b.length);
	}

	public native int getAdler();

	public native int getTotalIn();

	public native long getBytesRead();

	public int getTotalOut() {
		return (int) getBytesWritten();
	}

	public native long getBytesWritten();

	public native void reset();

	public native void end();

	protected void finalize() {
		end();
	}

	native boolean ended();
}
