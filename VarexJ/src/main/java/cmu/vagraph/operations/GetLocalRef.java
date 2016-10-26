package cmu.vagraph.operations;

import cmu.vagraph.VANode;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;

public class GetLocalRef extends ReferencesFieldOperation {

	public GetLocalRef(int reference, String localName, Object newValue, VANode vaNode, Instruction instruction, FeatureExpr ctx) {
		super(reference, localName, newValue, vaNode, instruction, ctx);
	}
	
	@Override
	public String toGraphString() {
		return "get " + fieldName + " = (" + newValue + ")";
	}
	
}
