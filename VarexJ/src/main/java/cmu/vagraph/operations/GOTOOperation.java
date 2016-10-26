package cmu.vagraph.operations;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import cmu.vagraph.GraphOperation;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;

public class GOTOOperation extends Operation {

	private int target;

	public GOTOOperation(FeatureExpr ctx, Instruction instruction, int target) {
		this.ctx = ctx;
		this.instruction = instruction;
		this.target = target;
	}

	@Override
	public void print(int i, String[] filter) {
		System.out.println(ctx + " " + instruction + " : " + target);
	}

	@Override
	public GraphOperation getSimpleTrace(Set<GraphOperation> nodes) {
		return this;
	}

	@Override
	public List<Integer> getReferences() {
		return Arrays.asList(0);
	}

	@Override
	public String toGraphString() {
		return "GOTO";
	}

	
}
