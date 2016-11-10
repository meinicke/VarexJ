package cmu.vatrace;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

public class Trace {
	private Statement START;
	Conditional<Statement> currentStatement;

	List<Edge> edges = new ArrayList<>();
	
	Method main;

	public Trace() {
	}

	public void setMain(Method main) {
		this.main = main;
		START = new Statement("Start", null, FeatureExprFactory.True());
	}

	void addEdge(Edge e) {
		edges.add(e);
	}

	public void print(PrintWriter pw, String[] filter) {
		pw.println("digraph G {");

		pw.println("graph [ordering=\"out\"];");
		pw.println("node [style=\"rounded,filled\", width=0, height=0, shape=box, concentrate=true]");
		
		Statement END = new Statement("End", null, FeatureExprFactory.True());

		pw.println("// Edges");
		Edge previous = null;
		for (Edge e : edges) {
			e.print(pw, previous);
			previous = e;
		}
		if (!Conditional.isTautology(previous.ctx)) {
			previous.printLabel(pw);
		}
		pw.println();
		pw.println("// clusters");
		
		START.printLabel(pw);
		pw.println(START.getID() + " [shape=Msquare]");
		
		main.printLabel(pw);
			
		END.printLabel(pw);
		pw.println(END.getID() + " [shape=Msquare]");
		pw.println('}');

	}



	public void addStatement(FeatureExpr ctx, final Statement statement) {
		if (statement.m != null) {
			if (statement.m.mi.getClassName().startsWith("java.") ||
					statement.m.mi.getClassName().startsWith("java.") || 
					statement.m.mi.getClassName().startsWith("gov.") ||
				statement.m.mi.getClassName().startsWith("sun.")) {
				return;
			}
		} else {
			if (statement.toString().startsWith("java.") ||
					statement.toString().startsWith("java.") || 
					statement.toString().startsWith("gov.") ||
				statement.toString().startsWith("sun.")) {
				return;
			}
		}
		if (currentStatement == null) {
			currentStatement = new One<>(statement);
		} else {
			currentStatement.mapf(ctx, new BiConsumer<FeatureExpr, Statement>() {
	
				@Override
				public void accept(FeatureExpr ctx, Statement from) {
					if (!Conditional.isContradiction(ctx)) {
						edges.add(new Edge(ctx, from, statement));
					}
				}
			});
			currentStatement = ChoiceFactory.create(ctx, new One<>(statement), currentStatement).simplify();
		}
	}

	public boolean hasMain() {
		return main != null;
	}
}
