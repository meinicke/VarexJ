package cmu.vatrace;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.vatrace.Statement.Shape;
import cmu.vatrace.filters.And;
import cmu.vatrace.filters.InteractionFilter;
import cmu.vatrace.filters.NameFilter;
import cmu.vatrace.filters.Not;
import cmu.vatrace.filters.Or;
import cmu.vatrace.filters.ReferenceFilter;
import cmu.vatrace.filters.StatementFilter;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
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
		
		System.out.println();
		System.out.print("Filter " + main.size() + " -> ");
		
		main.filterExecution(
				new Or(
						new StatementFilter() {
							
							@Override
							public boolean filter(Statement s) {
								return s instanceof IFBranch;
							}
						},
					new And(
						new Not(new NameFilter("table", "modCount", "size")),
						new Not(new NameFilter("branchTokenTypes", "cacheKey")),
//					new ContextFilter(executivefloor),
						new Or(
//						new NameFilter("floorButtons"))
//						new ExceptionFilter(),
						new InteractionFilter(4)
//						iffilter
					)))
//				new ReferenceFilter(656)
//				new NameFilter("approx"),
//				new NameFilter("RANGE_OF_CELL"),
//				new NameFilter("MAX_VALUE"),
//				new NameFilter("MIN_VALUE"),
//				new NameFilter("bitsPerDimension")
//				new NameFilter("size")
				
//				new NameFilter("methaneLevelCritical","pumpRunning"),
				
				// elevator
//				ELEVATOR_FILTER
		);
		System.out.println(main.size());
		
		addStatement(START);
		main.addStatements(this);
		addStatement(END);
		
		// highlight ctx
		for (Edge e : edges) {
			if (!e.ctx.isTautology()) {
				e.setColor(NodeColor.darkorange);
			}
		}
		FeatureExpr ctx = main.accumulate(Method.ExceptionContextAccumulator, FeatureExprFactory.False());
		// highlight exception trace
		for (Edge e : edges) {
			if (e.ctx.and(ctx).isSatisfiable()) {
				e.setWidth(2);
				e.setColor(NodeColor.firebrick1);
				e.from.setWidth(2);
				e.to.setWidth(2);
			}
		}
		
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

	private static final StatementFilter[] ELEVATOR_FILTER = new StatementFilter[] {
			new NameFilter("floorButtons"), 
			new ReferenceFilter(685) {//floorButtons
				@Override
				public boolean filter(Statement s) {
					if (s instanceof ArrayLoadStatement) {
						return true;
					}
					return super.filter(s);
				}
			},
			new And(new InteractionFilter(1),
					new Not(new NameFilter("modCount","elementData","size")))
	};

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
