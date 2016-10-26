package cmu.vagraph.operations;

import java.util.List;

import cmu.vagraph.GraphOperation;
import cmu.vagraph.VANode;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;

public abstract class Operation implements GraphOperation {

	public Instruction instruction;
	protected VANode node;
	FeatureExpr ctx;
	
	public VANode getNode() {
		return node;
	}
	
	public abstract List<Integer> getReferences();

	@Override
	public FeatureExpr getCtx() {
		return ctx;
	}
	
	static int ID = 0;
	private final int id = ID++;
	
	@Override
	public int getID() {
		return id;
	}
}
