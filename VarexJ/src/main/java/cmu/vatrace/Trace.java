package cmu.vatrace;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.vatrace.filters.And;
import cmu.vatrace.filters.ExceptionFilter;
import cmu.vatrace.filters.InteractionFilter;
import cmu.vatrace.filters.NameFilter;
import cmu.vatrace.filters.Not;
import cmu.vatrace.filters.Or;
import cmu.vatrace.filters.ReferenceFilter;
import cmu.vatrace.filters.StatementFilter;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

public class Trace {
	private Statement START, END;
	
	private Conditional<Statement> lastStatement;

	private List<Edge> edges = new ArrayList<>();
	
	Method main;

	public Trace() {
		START = new NoStatement("Start");
		START.setShape(Shape.Msquare);
		
		END = new NoStatement("End");
		END.setShape(Shape.Msquare);
	}

	public void setMain(Method main) {
		this.main = main;
	}
	
	public static StatementFilter filter = 
			new Or(
//					new NameFilter("interpolatedDerivatives" , "previousState"),
//					new ReferenceFilter(888),
//					new NameFilter("tMin", "tb"),
					new InteractionFilter(2),
					new ExceptionFilter(), 
					new StatementFilter() {
				
				@Override
				public boolean filter(Statement s) {
					return s instanceof IFBranch;
				}
			});
	
	public static void filterExecution(Method m) {
		if (m == null || m.size() == 0) {
			return;
		}
		m.filterExecution(filter);
	}

	public void print(PrintWriter pw, String[] filter) {
		filterExecution(main);
		System.out.println("Number of nodes: " + main.size());
		
		pw.println("digraph G {");
		pw.println("graph [ordering=\"out\"];");
		pw.println("node [style=\"rounded,filled\", width=0, height=0, shape=box, concentrate=true]");
		
		addStatement(START);
		main.addStatements(this);
		addStatement(END);
		
		highlightNotTautology();
		highlightExceptionContext();
		
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

	private void highlightExceptionContext() {
		FeatureExpr ctx = main.accumulate(Method.ExceptionContextAccumulator, FeatureExprFactory.False());
		// highlight exception trace
		highlightContext(ctx, NodeColor.firebrick1, 2);
	}

	public void highlightContext(FeatureExpr ctx, NodeColor color, int width) {
		for (Edge e : edges) {
			if (e.ctx.and(ctx).isSatisfiable()) {
				e.setWidth(width);
				e.setColor(color);
				e.from.setWidth(width);
				e.to.setWidth(width);
			}
		}
	}

	private void highlightNotTautology() {
		// highlight ctx
		for (Edge e : edges) {
			if (!e.ctx.isTautology()) {
				e.setColor(NodeColor.darkorange);
			}
		}
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
			lastStatement.mapf(statement.getCTX(), (FeatureExpr ctx, Statement from) -> {
				if (!Conditional.isContradiction(ctx)) {
					edges.add(new Edge(ctx, from, statement));
				}
			});
			lastStatement = ChoiceFactory.create(statement.getCTX(), new One<>(statement), lastStatement).simplify();
		}
	}

	public boolean hasMain() {
		return main != null;
	}
	
	public Method getMain() {
		return main;
	}
	
	public Statement getSTART() {
		return START;
	}
	
	public Statement getEND() {
		return END;
	}
	
	public List<Edge> getEdges() {
		return edges;
	}
}
