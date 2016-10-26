package cmu.vagraph.operations;

import cmu.vagraph.VANode;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;

public class SetFieldOperation extends FieldOperation {

	public SetFieldOperation(int reference, String fieldName, Object newValue, VANode vaNode, Instruction instruction, FeatureExpr ctx) {
		super(reference, fieldName, newValue, vaNode, instruction, ctx);
	}
	
	@Override
	public String toGraphString() {
		return "set " + fieldName + " => (" + newValue + ")";
	}
	
}
