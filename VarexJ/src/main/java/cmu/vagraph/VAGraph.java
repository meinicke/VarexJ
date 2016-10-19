package cmu.vagraph;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;

public class VAGraph {
	
	public static Set<VANode> frames = new HashSet<>();
	
	public static VANode rootNode;
	
	public VAGraph(@NonNull VANode rootNode) {
		this.rootNode = rootNode;
	}
	
	@Override
	public String toString() {
		return rootNode.toString();
	}
	
	public static void print() {
		System.out.println("\nVAGraph, size = "  + rootNode.getSize(new String[]{"java."}));
		System.out.println();
		rootNode.print(0, new String[]{"java."});
	}
	
	
	
//	public static void main(String[] args) {
//		VAGraph graph = new VAGraph();
//		graph.rootNode = new VANode("A", FeatureExprFactory.True());
//		VANode child = new VANode("AB", FeatureExprFactory.createDefinedExternal("X"));
//		graph.rootNode.addChild(child);
//		graph.rootNode.addChild(new VANode("AC", FeatureExprFactory.createDefinedExternal("Y")));
//		graph.print();
//	}
//	
//	@Test
//	public void testName() throws Exception {
//		main(null);
//	}
}
