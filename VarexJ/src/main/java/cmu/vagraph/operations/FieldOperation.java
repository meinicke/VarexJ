package cmu.vagraph.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import cmu.conditional.Conditional;
import cmu.vagraph.GraphOperation;
import cmu.vagraph.VANode;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;

public class FieldOperation extends Operation {

	public int reference;
	String fieldName;
	public Object newValue;
	Instruction instruction;
	FeatureExpr ctx;

	public FieldOperation(int reference, String fieldName, Object newValue, VANode vaNode, Instruction instruction, FeatureExpr ctx) {
		this.reference = reference;
		this.fieldName = fieldName;
		this.newValue = newValue;
		this.node = vaNode;
		this.instruction = instruction;
		this.ctx = ctx;
	}

	@Override
	public String toString() {
		String sourceFileName = "null";
		String className = "noClass";
		String methodName = "noMethod";
		int lineNumber = -1;
		if (instruction != null) {
			sourceFileName = instruction.getMethodInfo().getSourceFileName();
			sourceFileName = sourceFileName.substring(sourceFileName.indexOf('/') + 1);
			className = instruction.getMethodInfo().getClassName();
			methodName = instruction.getMethodInfo().getName();
			lineNumber = instruction.getLineNumber();
		}
		String eclipseReference = ", at " + className + '.' + methodName + "(" + sourceFileName + ":" + lineNumber + ")";
		return "if " + Conditional.getCTXString(ctx) + " " + getClass().getSimpleName() + " [reference=" + reference + ", fieldName=" + fieldName + ", newValue=" + newValue + ", node=" + node + eclipseReference;
	}

	@Override
	public void print(int depth, String[] filter) {
		System.out.println(depth + "\t" + new String(new char[depth]) + toString());
	}

	@Override
	public GraphOperation getSimpleTrace(Set<GraphOperation> nodes) {
		((VANode)this.node.getSimpleTrace(nodes)).addChild(this);
		nodes.add(this);
		return this;
	}

	@Override
	public List<Integer> getReferences() {
		return Arrays.asList(reference);
	}
}
