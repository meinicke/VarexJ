package gov.nasa.jpf.vm.va;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.va.StackHandlerFactory.SHFactory;

public class Store {

	private static boolean verbose = false;

	private static Map<MeasuringStackHandler, List<LogEntry>> entries = new HashMap<>();

	private static List<Measurement> measures = new ArrayList<>();
	
	private Store() {
	}

	public static void add(MeasuringStackHandler handler, String methodName, Method method, Object... args) {
		List<LogEntry> instructions = entries.get(handler);
		if (instructions == null) {
			instructions = new ArrayList<>();
			entries.put(handler, instructions);
		}
		try {
			if (method != null) {
				method = IStackHandler.class.getMethod(method.getName(), method.getParameterTypes());
			}
			instructions.add(new LogEntry(methodName, method, args));
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
	}

	public static void print() {
		try (PrintWriter writer = new PrintWriter("stacklog.csv", "UTF-8")){
			writer.print(';');
			for (SHFactory factory : StackHandlerFactory.SHFactory.values()) {
				writer.print(factory);
				writer.print(';');
			}
			writer.println();
			
			System.out.println("reexecute stack operations");
			for (List<LogEntry> entry : entries.values()) {
				if (verbose) {
					System.out.println(entry.get(0).methodName);
					for (LogEntry logEntry : entry) {
						System.out.println(logEntry.stackInstruction + Arrays.toString(logEntry.args));
					}
					System.out.println();
				}

				Object[] initArgs = entry.get(0).args;

				Measurement measurement = new Measurement(entry.get(0).methodName);
				measures.add(measurement);
				for (SHFactory factory : StackHandlerFactory.SHFactory.values()) {
					StackHandlerFactory.setFactory(factory);
					IStackHandler checkStack = StackHandlerFactory.createStack2((FeatureExpr) initArgs[0],
							(int) initArgs[1], (int) initArgs[2]);
					
					long start = System.nanoTime();
					for (LogEntry logEntry : entry) {
						if (logEntry.stackInstruction == null) {
							// case constructor
							continue;
						}
						try {
							if (verbose) {
								System.out.print("invoke: " + logEntry.stackInstruction.getName());
								System.out.println(" args: " + Arrays.toString(logEntry.args));
							}
							logEntry.stackInstruction.invoke(checkStack, logEntry.args);
						} catch (SecurityException | IllegalAccessException | InvocationTargetException e) {
							start = 0;
							break;
						}
					}
					long end = System.nanoTime();
					long duration = (end - start);
					
					measurement.time[factory.ordinal()] = duration;
				}
			}
			
			System.out.println("Order measurements");
			Collections.sort(measures, new Comparator<Measurement>() {

				@Override
				public int compare(Measurement o1, Measurement o2) {
					return Long.compare(o1.time[SHFactory.Hybid.ordinal()], o2.time[SHFactory.Hybid.ordinal()]);
				}
			});
			
			System.out.println("Print measurements");
			for (Measurement measurement : measures) {
				writer.println(measurement.toString());
			}
		} catch (FileNotFoundException | UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}

	}

	private static class LogEntry {
		String methodName;
		Method stackInstruction;
		Object[] args;

		public LogEntry(String methodName, Method method, Object[] args) {
			this.methodName = methodName;
			this.stackInstruction = method;
			this.args = args;
		}

	}
	
	static class Measurement {
		
		String methodName;
		
		long[] time = new long[3];
		public Measurement(String methodName) {
			this.methodName = methodName;
		}
		
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append(methodName);
			for (int i = 0; i < time.length; i++) {
				builder.append(';');
				builder.append(time[i]);
			}
			return builder.toString();
		}
	}
}
