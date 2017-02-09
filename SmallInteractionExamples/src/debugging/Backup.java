package debugging;

import gov.nasa.jpf.annotation.Conditional;

public class Backup {

	@Conditional
	static boolean patch = true;
	@Conditional
	static boolean backupOption = true;

	private String fileName;
	boolean readHeaderPrimitive() {
		fileName = patch ? "dir" : "dir2";
		if (patch) {
			return false;
		}
		return true;
	}
	
	boolean extractDir (String fileName) {
		boolean  tmp =  mkdir(fileName);
		
		boolean status = tmp;
		
		if (status) {
			// things
		}
		return status;
	}
	
	void extractArchive() {
		// ...
		boolean status = extractDir(fileName);
		if (status && backupOption) {
			undoLastBackup();
		}
		
	}

	private void undoLastBackup() {
		throw new RuntimeException("undo backup");
	}

	private boolean mkdir(String fileName) {
		return !fileName.equals("dir");
	}
	
	public static void main(String[] args) {
		Backup backup = new Backup();
		backup.readHeaderPrimitive();
		backup.extractArchive();
	}
}
