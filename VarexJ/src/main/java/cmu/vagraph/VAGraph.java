package cmu.vagraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cmu.vagraph.operations.Operation;
import cmu.vagraph.operations.SetReferenceFieldOperation;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.MethodInfo;

public class VAGraph {
	
	public Set<VANode> frames = new HashSet<>();
	
	public VANode rootNode;
	
	@Override
	public String toString() {
		return rootNode.toString();
	}
	
	public void print() {
		rootNode.print(0, new String[]{"java."});
		final VAGraph vaGraph = new VAGraph();
		vaGraph.rootNode = (VANode) rootNode.getSimpleTrace(vaGraph.nodes);
		System.out.println("\nVAGraph, size = "  + rootNode.getSize(new String[]{"java."}));
		
		int objID = 573;
		System.out.println("SLICE of: " + objID);
		
		for (GraphOperation o : operations.get(objID)) {
			o.getSimpleTrace(vaGraph.nodes);
		}
		
		vaGraph.rootNode.print(0, new String[]{"java."});
	}
	
	Set<GraphOperation> nodes = new HashSet<>();
	
	public Map<Integer, List<Operation>> operations = new HashMap<>();

	public void addOperation(int reference, Operation operation) {
		if (operations.containsKey(reference)) {
			operations.get(reference).add(operation);
		} else {
			List<Operation> ops = new ArrayList<>();
			ops.add(operation);
			operations.put(reference, ops);
		}
	}

	
	public static void main(String[] args) {
		VAGraph graph = new VAGraph();
		
		graph.rootNode = new VANode(new MethodInfo("A", "", 0), FeatureExprFactory.True());
		graph.rootNode.addChild(new VANode(new MethodInfo("B", "", 0), FeatureExprFactory.createDefinedExternal("X")));
		graph.rootNode.addChild(new VANode(new MethodInfo("B", "", 0), FeatureExprFactory.createDefinedExternal("X")));
		graph.rootNode.addChild(new SetReferenceFieldOperation(1, "field", 2, graph.rootNode, null, FeatureExprFactory.createDefinedExternal("X")));
		graph.rootNode.addChild(new VANode(new MethodInfo("C", "", 0), FeatureExprFactory.createDefinedExternal("Y")));
		graph.print();
	}
}
