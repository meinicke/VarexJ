package cmu.vagraph.operations;

import java.util.List;

import cmu.vagraph.GraphOperation;
import cmu.vagraph.VANode;

public abstract class Operation implements GraphOperation {

	protected VANode node;
	
	public VANode getNode() {
		return node;
	}
	
	public abstract List<Integer> getReferences();

}
