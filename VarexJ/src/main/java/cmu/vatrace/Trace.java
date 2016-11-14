package cmu.vatrace;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.vatrace.Statement.Shape;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.bdd.BDDFeatureExprFactory;

public class Trace {
	private Statement START, END;
	
	private Conditional<Statement> lastStatement;

	private List<Edge> edges = new ArrayList<>();
	
	Method main;

	public Trace() {
		START = new Statement("Start", null, BDDFeatureExprFactory.True());
		START.setShape(Shape.Msquare);
		
		END = new Statement("End", null, BDDFeatureExprFactory.True());
		END.setShape(Shape.Msquare);
	}

	public void setMain(Method main) {
		this.main = main;
	}

	public void print(PrintWriter pw, String[] filter) {
		pw.println("digraph G {");
		pw.println("graph [ordering=\"out\"];");
		pw.println("node [style=\"rounded,filled\", width=0, height=0, shape=box, concentrate=true]");
		
		main.filterExecution(
//				new ReferenceFilter(656)
//				new NameFilter("approx"),
//				new NameFilter("RANGE_OF_CELL"),
//				new NameFilter("MAX_VALUE"),
//				new NameFilter("MIN_VALUE"),
//				new NameFilter("bitsPerDimension")
//				new NameFilter("size")
				
//				new 	new Not(newNameFilter("methaneLevelCritical","pumpRunning"),
//				new And(new InteractionFilter(),
//					 NameFilter("modCount","elementData","size")))
		);
		
		int size = main.size();
		System.out.println("Size: " + size);
		addStatement(START);
		main.traverseStatements(this);
		addStatement(END);
		
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
		main.printLabel(pw);
		END.printLabel(pw);
		
		pw.println('}');

	}

	public void addStatement(final Statement statement) {
		if (lastStatement == null) {
			lastStatement = new One<>(statement);
		} else {
			lastStatement.mapf(statement.getCtx(), (FeatureExpr ctx, Statement from) -> {
				if (!Conditional.isContradiction(ctx)) {
					edges.add(new Edge(ctx, from, statement));
				}
			});
			lastStatement = ChoiceFactory.create(statement.getCtx(), new One<>(statement), lastStatement).simplify();
		}
	}

	public boolean hasMain() {
		return main != null;
	}
}
