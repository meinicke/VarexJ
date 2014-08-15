package cmu.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * Compares the traces of the variability-aware approach with brute force.
 * Brute force traces have to be at a trace file in /traces  
 * 
 * @author Jens Meinicke
 *
 */
public class TraceComparator {

	private static Set<FeatureExpr> falseCtx = new HashSet<>();
	private static Set<FeatureExpr> validCtx = new HashSet<>();
	private static String lastInstruction;

	/** 
	 * Contains all instructions of the variability-aware approach.
	 */
	private static List<Tuple<FeatureExpr, String>> trace = new ArrayList<>(100000);

	public static void putInstruction(final FeatureExpr ctx, final String newInstr) {
		trace.add(new Tuple<>(ctx, newInstr));

	}

	public static void compare() {
		File traceFolder = new File("traces");
		try {
			for (File child : traceFolder.listFiles()) {
				String fileName = child.getName();
				System.out.println("Compare traces of " + fileName);
				boolean error = false;
			
				try (BufferedReader reader = new BufferedReader(new FileReader(child))) {
					final FeatureExpr ctx = createFeatureExpr(reader.readLine());
					System.out.println("Configuration: " + ctx);
					System.out.println("===================================");
 
					int vaIndex = 0;
					int bfIndex = 0;
					String expected = "";
					while (true) {
						expected = reader.readLine();
						
						if (expected == null) {
							break;
						}
						if (expected.isEmpty()) {
							continue;
						}

						while (true) {
							// skip invalid instructions
							FeatureExpr next = trace.get(vaIndex).x;
							if (falseCtx.contains(next)) {
								vaIndex++;
								continue;
							}
							if (validCtx.contains(next)) {
								break;
							}
							if (Conditional.isContradiction(next.and(ctx))) {
								falseCtx.add(next);
								vaIndex++;
								continue;
							}
							validCtx.add(next);
							break;
						}
						String va = trace.get(vaIndex).y;

						String nomalizedVA = removeLine(va);
						String normalizedExpected = removeLine(expected);
						if (!nomalizedVA.equals(normalizedExpected)) {

							if (!error) {
								System.out.println(lastInstruction);
								System.out.println();
								System.out.println("================ERROR==================");
								System.out.println();
							}

							System.out.println(bfIndex + " Expected: " + expected + "\tBut was:  " + va + " " + trace.get(vaIndex).x);
							error = true;
							System.out.println("Traces do NOT match!");
							System.out.println("===================================");
							System.out.println();
							break;
						} else {
							lastInstruction = bfIndex + " " + va;
							error = false;
						}
						vaIndex++;
						bfIndex++;
					}
					if (!error) {
						String instructions = toSeparatedNumber(bfIndex);
						System.out.println("Traces match! (" + instructions + " instructions)");
						System.out.println("===================================");
						System.out.println();
					}
				}
				falseCtx.clear();
				validCtx.clear();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String toSeparatedNumber(int bfIndex) {
		String number = ""; 

		while (bfIndex > 1000) {
			number = "." + addZeros(bfIndex % 1000) + number;
			bfIndex = bfIndex / 1000;
		}
		number = bfIndex + number;		
		return number;
	}
	
	private static String addZeros(int number) {
		if (number < 10) {
			return "00" + number;
		}
		if (number < 100) {
			return "0" + number;
		}
		return number + "";
	}

	private static String removeLine(String va) {
		return va.split("[:]")[0];
	}

	private static FeatureExpr createFeatureExpr(String fileName) {
		String[] features = fileName.split("[&]");
		FeatureExpr ctx = FeatureExprFactory.True();
		for (String f : features) {
			boolean selection = !f.startsWith("!");

			FeatureExpr feature = FeatureExprFactory.createDefinedExternal("CONFIG_" + f.replace("!", ""));
			if (selection) {
				ctx = ctx.and(feature);
			} else {
				ctx = ctx.andNot(feature);
			}
		}
		return ctx;
	}
	
	static class Tuple<X, Y> { 
		  final X x; 
		  final Y y; 
		  Tuple(X x, Y y) { 
		    this.x = x; 
		    this.y = y; 
		  } 
		}
}
