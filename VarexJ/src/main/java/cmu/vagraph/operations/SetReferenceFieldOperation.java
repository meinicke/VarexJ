package cmu.vagraph.operations;

import cmu.vagraph.VANode;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;

public class SetReferenceFieldOperation extends ReferencesFieldOperation {

	public SetReferenceFieldOperation(int reference, String fieldName, Object newValue, VANode vaNode, Instruction instruction, FeatureExpr ctx) {
		super(reference, fieldName, newValue, vaNode, instruction, ctx);
	}
	
}
