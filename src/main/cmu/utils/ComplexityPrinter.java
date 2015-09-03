package cmu.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class ComplexityPrinter {

	static int line = 0;
	static int fileid = 0;
	static File results = new File("complex" + fileid++ + ".csv");
	static {
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
	static {
		reset();
	}
	
	static int complMax = 0;
	static double complSum = 0;
	static int featureMax = 0;
	static double featureSum = 0;
	
	static int pointer = 0;
	static final double samples = 100;
	public static void addComplex(int complexity, String instruction, FeatureExpr ctx, MethodInfo mi, ThreadInfo ti) {
		if (complexity > 20) {
			out.print(complexity);
			out.print(';');
			out.print(instruction);
			out.print(';');
			out.print(mi.getClassName()+ " # " + mi.getName());
			out.println();
			System.out.println(complexity + " " + instruction + " @ " + mi.getClassName()+ " # " + mi.getName());
			
			StackFrame frame = ti.getTopFrame();
			
			printTrace(frame);
			System.out.println("--------------------------");
		}
		
		
//		pointer++;
//		if (complexity > complMax ) {
//			complMax = complexity;
//		}
//		complSum += complexity;
//		if (ctx.collectDistinctFeatures().size() > featureMax ) {
//			featureMax = ctx.collectDistinctFeatures().size();
//		}
//		featureSum += ctx.collectDistinctFeatures().size();
//		
//		if (pointer >= samples) {
//			pointer = 0;
//			line++;
//			if (line > 1_000_000) {
//				write();
//				line = 0;
//				results = new File("complex" + fileid++ + ".csv");
//				reset();
//			}
//			
//			if (out != null) {
//				out.print(complMax);
//				out.print(';');
//				out.print(String.valueOf(complSum / samples).replace('.', ','));
//				out.print(';');
//				out.print(featureMax);
//				out.print(';');
//				out.print(String.valueOf(featureSum / samples).replace('.', ','));
//				
//				complMax = 0;
//				complSum = 0;
//				featureMax = 0;
//				featureSum = 0;
////				out.print(complexity);
////				out.print(';');
//				out.print(instruction);
//				out.print(';');
//				out.print(mi.getClassName()+ " # " + mi.getName());
//				out.print(';');
////				out.print(ctx.collectDistinctFeatures().size());
////				out.print(';');
////				out.print(Conditional.getCTXString(ctx));
////				out.println();
//				out.println();
//			}
//		}
	}

	private static void printTrace(StackFrame frame) {
		if (frame != null) {
			MethodInfo mi = frame.getMethodInfo();
			System.out.println(mi.getClassName()+ " # " + mi.getName());
			printTrace(frame.getPrevious());
		}
		
	}

	public static void reset() {
		pointer = 0;
		complMax = 0;
		complSum = 0;
		featureMax = 0;
		featureSum = 0;
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
		if (out != null) {
			out.flush();
			out.close();
			out = null;
		}
	}
}
