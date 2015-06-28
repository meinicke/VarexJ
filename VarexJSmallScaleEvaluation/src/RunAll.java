import java.io.File;


public class RunAll {
	public static void main(String[] args) {
		JPFCoreRunner.main(null);
		File results = new File("result.txt");
		results.renameTo(new File("resultsCore.txt"));
		JPFBDDRunner.main(null);
		results.renameTo(new File("resultsBDD.txt"));
		VarexJRunner.main(null);
	}
}
