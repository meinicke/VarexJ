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
	
//	static int complMax = 0;
//	static double complSum = 0;
//	static double featureSum = 0;
	
	static int pointer = 0;
	static final double samples = 1000;
	
	static int maxOverhead = 0;
	static int maxFeature = 0;
	static int maxInteractionDegree = 0;
	
	public static void addComplex(int overhead, int interactionDegree, String instruction, FeatureExpr ctx, MethodInfo mi, ThreadInfo ti) {
//		if (overhead > 20) {
//		if (out != null) {
//			out.print(overhead);
//			out.print(';');
//			out.print(interactionDegree);
//			out.print(';');
//			out.print(ctx.collectDistinctFeatures().size());
//			out.print(';');
//			out.print(ctx.toString());
//			out.print(';');
//			out.print(instruction);
//			out.println();
//		}
//			out.print(';');
//			out.print(mi.getClassName()+ " # " + mi.getName());
//			out.println();
//			System.out.println(overhead + " " + instruction + " @ " + mi.getClassName()+ " # " + mi.getName());
			
//			StackFrame frame = ti.getTopFrame();
			
//			printTrace(frame);
//			System.out.println("--------------------------");
//		}
		
//		
		pointer++;
		if (overhead > maxOverhead ) {
			maxOverhead = overhead;
		}
		if (ctx.collectDistinctFeatures().size() > maxFeature ) {
			maxFeature = ctx.collectDistinctFeatures().size();
		}
		
		if (interactionDegree > maxInteractionDegree) {
			maxInteractionDegree  = interactionDegree;
		}
		
		if (pointer >= samples) {
			pointer = 0;
			line++;
			if (line > 1_000_000) {
				write();
				line = 0;
				results = new File("complex" + fileid++ + ".csv");
				reset();
			}
			
			if (out != null) {
				out.print(maxOverhead);
				out.print(';');
				out.print(maxInteractionDegree * -1);
				out.print(';');
				out.print(maxFeature * -1);
				out.println();
				
				maxOverhead = 0;
				maxInteractionDegree = 0;
				maxFeature = 0;
				
			}
		}
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
//		complMax = 0;
//		complSum = 0;
		maxFeature = 0;
//		featureSum = 0;
		maxInteractionDegree = 0;
		maxOverhead = 0;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(results, true)));
//			out.print("effort");
//			out.print(';');
//			out.print("interactionDegree");
//			out.print(';');
//			out.print("ctx.size()");
//			out.println();
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
		System.out.println("ComplexityPrinter.write()");
		if (out != null) {
			out.flush();
			out.close();
			out = null;
		}
	}
}
