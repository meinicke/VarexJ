package cmu.vagraph;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.eclipse.jdt.annotation.NonNull;

import cmu.conditional.Conditional;
import cmu.vagraph.operations.Operation;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;

public class VANode implements GraphOperation {

	public final FeatureExpr ctx;
	public VANode parent;
	MethodInfo methodInfo;
	private Instruction instruction;
	Collection<GraphOperation> operations = new ArrayList<>();
	
	public void setParent(VANode parent) {
		this.parent = parent;
		parent.operations.add(this);
	}
	
	public void setInstruction(Instruction instruction) {
		this.instruction = instruction;
	}

	private VANode(@NonNull MethodInfo methodInfo, @NonNull FeatureExpr ctx, VANode parent) {
		this.methodInfo = methodInfo;
		this.ctx = ctx;
		this.parent = parent;
	}

	public VANode(@NonNull MethodInfo methodInfo, Instruction instruction, FeatureExpr ctx, VANode currentNode) {
		this(methodInfo, ctx, currentNode);
		this.instruction = instruction;
	}

	public VANode(MethodInfo callee, FeatureExpr ctx2) {
		this.methodInfo = callee;
		ctx = ctx2;
	}


	public void addChild(GraphOperation vaNode) {
		operations.add(vaNode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
//		String sourceFileName = instruction.getMethodInfo().getSourceFileName();
//		if (sourceFileName != null) {
//			sourceFileName = sourceFileName.substring(sourceFileName.lastIndexOf('/') + 1);
//		}
//		sb.append(instruction.getMethodInfo().getName() + "---");
//		sb.append(instruction.getMethodInfo().getClassName() + '(' + sourceFileName + ":" + instruction.getLineNumber() + ')');
//		sb.append(" -" + Conditional.getCTXString(ctx) + "-> ");
		sb.append(methodInfo.getName());
		return sb.toString();
	}
	
	static int margin1 = 80;
	static int margin2 = 150;
	
	public void print(int depth, String... filter) {
		for (String f : filter) {
			if (methodInfo.getFullName().startsWith(f)) {
				System.out.println("...");
				return;
			}
		}
		
		String line = "";
		if (instruction != null) {
			String sourceFileName = instruction.getMethodInfo().getSourceFileName();
			sourceFileName = sourceFileName.substring(sourceFileName.indexOf('/') + 1);
			line = "at " + instruction.getMethodInfo().getClassName() + '.' + instruction.getMethodInfo().getName() + "(" + sourceFileName + ":" + instruction.getLineNumber() + ")";
		}
		
		String output = depth + "\t" + new String(new char[depth]) + methodInfo.getFullName();
		if (output.length() >= margin1) {
			margin1 = output.length() + 20; 
		}
		String outputLine = new String(new char[margin1 - output.length()]) + line;
		if (output.length() + outputLine.length() >= margin2) {
			margin2 = output.length() + outputLine.length() + 20; 
		}
		String outputCTX = new String(new char[margin2 - (output.length() + outputLine.length())])+ Conditional.getCTXString(ctx);
		System.out.println(output + outputLine + outputCTX);
		
		for (GraphOperation vaNode : operations) {
			vaNode.print(depth + 1, filter);
		}
	}
	
	String thisString = "";

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VANode other = (VANode) obj;
		if (ctx == null) {
			if (other.ctx != null)
				return false;
		} else if (!ctx.equals(other.ctx)) {
			return false;
		} else if (methodInfo != other.methodInfo){
			return false;
		} else if (parent == null && other.parent == null){
			return true;
		} else if (!parent.equals(other.parent)) {
			return false;
		}
		return true;
	}
	

	public void addOperation(Operation op) {
		operations.add(op);
		for (Integer ref: op.getReferences()) {
			JPF.vaGraph.addOperation(ref, op);
		}
	}
	
	public int getSize(String[] filter) {
		for (String f : filter) {
			if (methodInfo.getFullName().startsWith(f)) {
				return 0;
			}
		}
		int size = 1;
		for (GraphOperation child : operations) {
			size += child.getSize(filter);
		}
		return size;
	}

	public void printTrace() {
		VANode node = this;
		while (node != null) {
			System.out.println(node.methodInfo.getFullName());
			node = node.parent;
		}
	}
	
	@Override
	public GraphOperation getSimpleTrace(Set<GraphOperation> nodes) {
		VANode parent = this.parent == null ? null : (VANode)this.parent.getSimpleTrace(nodes);
		for (GraphOperation node : nodes) {
			if (node.equals(this)) {
				return node;
			}
		}
		VANode newNode = new VANode(methodInfo, ctx, parent);
		if (parent != null) {
			parent.addChild(newNode);
		}
		nodes.add(newNode);
		return newNode;
	}

}
