package cmu.vagraph.export;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedList;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.One;
import cmu.vagraph.GraphOperation;
import cmu.vagraph.VAGraph;
import cmu.vagraph.VANode;
import cmu.vagraph.operations.IfOperation;
import cmu.vagraph.operations.InvokeOperation;
import cmu.vagraph.operations.Operation;
import de.fosd.typechef.featureexpr.FeatureExpr;

public class GrapVizExportTrace {

	private String fileName;
	private VAGraph graph;

	public GrapVizExportTrace(String fileName, VAGraph graph) {
		this.fileName = fileName;
		this.graph = graph;// .getSlice(574);
		// this.graph = graph.getSlice(573);//example
		// this.graph = graph.getSlice(579);//linux1
		// this.graph = graph.getSlice(574);//linux2
	}

	public void write() {
		File file = new File(fileName);
		System.out.println("Create file: " + file.getAbsolutePath());

		VANode node = graph.rootNode;
		try (PrintWriter pw = new PrintWriter(file)) {
			pw.println("digraph tree");
			pw.println("{");
			pw.println("graph [ordering=\"out\"];");

			pw.println("node [style=\"rounded,filled\", width=0, height=0, shape=box, concentrate=true]");

//			pw.println("rankdir=\"LR\";");
			pw.println();
			print(null, node, pw);
			while (!clusters.isEmpty()) {
				clusters.pop();
				pw.println('}');
			}
			pw.println("}");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static String[] filter = new String[] { "java." };

	private static final String getPointString(GraphOperation node) {
		return '\"' + node.toGraphString() + "point\"";
	}

	private static final String getDirString(GraphOperation node) {
		return '\"' + node.toGraphString() + "dir\"";
	}

	private static final String getString(GraphOperation node) {
		return '\"' + node.toGraphString() + node.getID() + "\"";
	}
	
	private LinkedList<VANode> clusters = new LinkedList<>();

	private Conditional<GraphOperation> print(Conditional<GraphOperation> parent, GraphOperation node, PrintWriter pw) {
		if (node instanceof InvokeOperation) {
			return parent;
		}
		
		String nodeCall = getString(node);
		if (nodeCall.startsWith("\"get this")) {
			return parent;
		}
		
		
		{
			VANode currentCluster = clusters.peek();
			VANode parentNode;
			if (node instanceof VANode) {
				parentNode = ((VANode) node).parent;
			} else {
				parentNode = ((Operation) node).getNode();
			}
			while (currentCluster != parentNode && !clusters.isEmpty()) {
				clusters.pop();
				currentCluster = clusters.peek();
				pw.println('}');
			}
		}
		
		if (node instanceof VANode) {
			pw.println(nodeCall + " [fillcolor=\"#ffffff\"]");
		} 

		if (parent != null) {
			parent.mapf(node.getCtx(), (FeatureExpr ctx, GraphOperation p) -> {
				pw.print(getString(p));
				pw.print(" -> ");
				pw.print(nodeCall);
				pw.println();
				if (!Conditional.isTautology(ctx)) {
					pw.print("[label=\"");
					pw.print(Conditional.getCTXString(ctx));
					pw.print('\"');
					pw.print(", color=\"red\"");
					pw.println("]");
				}
			});
		}
		
		if (node instanceof VANode) {
//			pw.println(nodeCall + " [fillcolor=\"#ffffff\"]");
			pw.println("subgraph cluster" + node.getID() + " {");
			clusters.push((VANode) node);
			if (node instanceof IfOperation) {
				pw.println("label = \"IF" + ((VANode) node).methodInfo.getName() + '\"');
			} else {
				pw.println("label = \"" + ((VANode) node).methodInfo.getName() + '\"');
			}
		} else {
//			VANode currentCluster = clusters.peek();
//			VANode parentNode = ((Operation)node).getNode();
//			while (currentCluster != parentNode && !clusters.isEmpty()) {
//				currentCluster = clusters.pop();
//				pw.println('}');
//			}
		}
		
//		pw.println('}');

		Conditional<GraphOperation> previous = new One<>(node);
		for (GraphOperation child : node.getChildren()) {
			if (!isFiltered(child)) {
				previous = ChoiceFactory.create(child.getCtx(), print(previous.simplify(child.getCtx()), child, pw), previous).simplify();

			}
		}
		return previous;
	}

	private boolean isFiltered(GraphOperation child) {
		if (child instanceof VANode) {
			for (String f : filter) {
				if (((VANode) child).methodInfo.getFullName().startsWith(f)) {
					return true;
				}
			}
		}
		return false;
	}
}
