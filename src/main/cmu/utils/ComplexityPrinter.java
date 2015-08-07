package cmu.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class ComplexityPrinter {

	static {
		File results = new File("complex.csv");
		try {
			if (!results.exists()) {
				results.createNewFile();
			} else {
				results.delete();
				results.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	static PrintWriter out; 
//	static {
//		reset();
//	}
	
	public static void addComplex(int complexity, String instruction) {
		if (out != null) {
			out.print(complexity);
			out.print(';');
			out.println(instruction);
		}
	}


	public static void reset() {
		File results = new File("complex.csv");
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(results, true)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			if (!results.exists()) {
				results.createNewFile();
			} else {
				results.delete();
				results.createNewFile();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void write() {
		out.flush();
		out.close();
		out = null;
	}
}
