package cmu.vatrace;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import cmu.vatrace.filters.Or;
import cmu.vatrace.filters.StatementFilter;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.MethodInfo;

public class Method implements MethodElement {

	private static int ID = 0;
	private final int id = ID++;
	
	private final List<MethodElement> execution = new ArrayList<>();
	final MethodInfo mi;
	private int lineNumber = -1;
	
	public Method(MethodInfo mi) {
		this.mi = mi;
	}
	
	public void addMethodElement(MethodElement e) {
		execution.add(e);
	}
	
	/**
	 * Keeps elements that fulfill any of the filters and<br>
	 * removes all elements that fulfill none.
	 */
	public boolean filterExecution(StatementFilter... filter) {
		return filterExecution(new Or(filter));
	}
	
	public boolean filterExecution(StatementFilter filter) {
		execution.removeIf(e -> !e.filterExecution(filter));
		return !execution.isEmpty();
	}
	
	public void printLabel(PrintWriter pw) {
		pw.println("subgraph \"cluster_" + TraceUtils.toShortID(id) + "\" {");
		pw.println("label = \"" + lineNumber + " " + mi.getFullName() + "\";");
		execution.forEach(e -> e.printLabel(pw));
		pw.println("}");
	}

	public void addStatements(Trace trace) {
		execution.forEach(e -> e.addStatements(trace));
	}
	
	@Override
	public String toString() {
		return mi.getName();
	}

	@Override
	public int size() {
		return accumulate(i -> i + 1, 0);
	}

	public final static BiFunction<Statement, FeatureExpr, FeatureExpr> ExceptionContextAccumulator = (s, ctx) -> {
		if (s instanceof ExceptionStatement) {
			return ctx.or(s.getCtx());
		}
		return ctx;
	};
	
	public <T> T accumulate(Function<T, T> accumulator, T value) {
		return accumulate((unused, v) -> accumulator.apply(v), value); 
	}

	public <T> T accumulate(BiFunction<Statement, T, T> accumulator, T value) {
		for (final MethodElement methodElement : execution) {
			if (methodElement instanceof Statement) {
				value = accumulator.apply((Statement) methodElement, value);
			} else {
				value = ((Method)methodElement).accumulate(accumulator, value);
			}
		}
		return value;
	}

	public void setLine(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public int getLineNumber() {
		return lineNumber;
	}
	
}
