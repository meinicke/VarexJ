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
import de.ovgu.log.LOGGER;

/**
 * Compares the traces of the variability-aware approach with brute force. Brute
 * force traces have to be at a trace file in /traces
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
	private static final List<Tuple<FeatureExpr, String>> trace = new ArrayList<>(10_000_000);
	
	private static final Set<FeatureExpr> buffer = new HashSet<>();
	
	public static void putInstruction(final FeatureExpr ctx, final String instr) {
		FeatureExpr useCtx = ctx;
		if (buffer.contains(ctx)) {
			for (FeatureExpr bufferCtx : buffer) {
				if (bufferCtx.equivalentTo(ctx)) {
					useCtx = bufferCtx;
					break;
				}
			}
		} else {
			buffer.add(ctx);
		}
		trace.add(new Tuple<>(useCtx, instr.intern()));		
	}
	
	public static void compare() {
		System.out.println("==============================================");
		System.out.println("COMPARE");
		System.out.println("==============================================");

		File traceFolder = new File("traces");
		if (!traceFolder.exists()) {
			LOGGER.logError("no trace folder found!");
			return;
		}
		try {
			for (File child : traceFolder.listFiles()) {
				String fileName = child.getName();
				System.out.println("Compare traces of " + fileName);
				boolean error = false;

				try (BufferedReader reader = new BufferedReader(new FileReader(child))) {
					final FeatureExpr ctx = createFeatureExpr(reader.readLine());
					if (ctx == null) {
						LOGGER.logError("No configuration");
						continue;
					}
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
							if (nomalizedVA.startsWith("SET FILED") && normalizedExpected.startsWith("SET FILED")) {
								System.out.println();
								LOGGER.log(LOGGER.COLOR.YELLOW, "================WARNING==================");
								LOGGER.log(LOGGER.COLOR.YELLOW, lastInstruction);
								LOGGER.log(LOGGER.COLOR.YELLOW, "Line: " + bfIndex);
								LOGGER.log(LOGGER.COLOR.YELLOW, "Expected: " + expected);
								LOGGER.log(LOGGER.COLOR.YELLOW, "But was:  " + va + " " + trace.get(vaIndex).x);
								LOGGER.log(LOGGER.COLOR.YELLOW, "=========================================");

							} else {
								System.out.println(lastInstruction);
								LOGGER.log(LOGGER.COLOR.YELLOW, "================WARNING==============");
								LOGGER.log(LOGGER.COLOR.YELLOW, bfIndex);
								LOGGER.log(LOGGER.COLOR.YELLOW, "Expected: " + expected);
								LOGGER.log(LOGGER.COLOR.YELLOW, "But was:  " + va + " " + trace.get(vaIndex).x);
								LOGGER.log(LOGGER.COLOR.YELLOW, "Line does NOT match! Skipped one line for brute force.");
								LOGGER.log(LOGGER.COLOR.YELLOW, "===================================");
								if (error) {
									break;
								}
								error = true;
								bfIndex++;
								continue;
							}
						} else {
							error = false;
							lastInstruction = bfIndex + " " + expected + " | " + va + " " + trace.get(vaIndex).x;
						}
						vaIndex++;
						bfIndex++;
					}
					if (!error) {
						String instructions = toSeparatedNumber(bfIndex);
						LOGGER.log(LOGGER.COLOR.GREEN, "Traces match! (" + instructions + " instructions)");
						System.out.println("===================================");
					} else {
						LOGGER.logError("Traces do not match!");
						System.out.println("===================================");
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
		return bfIndex + number;
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

	private static FeatureExpr createFeatureExpr(String content) {
		if (content == null) {
			return null;
		}
		String[] features = content.split("[&]");
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

		@Override
		public String toString() {
			return x.toString() + " " + y.toString();
		}
	}

	public static void clear() {
		trace.clear();
		buffer.clear();
	}
}

