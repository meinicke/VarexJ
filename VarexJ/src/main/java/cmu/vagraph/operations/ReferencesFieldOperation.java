package cmu.vagraph.operations;

import java.util.ArrayList;
import java.util.List;

import cmu.conditional.Conditional;
import cmu.vagraph.VANode;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;

class ReferencesFieldOperation extends FieldOperation {

	public List<Integer> references;
	
	public ReferencesFieldOperation(int reference, String fieldName, Object newValue, VANode vaNode, Instruction instruction, FeatureExpr ctx) {
		super(reference, fieldName, newValue, vaNode, instruction, ctx);
		references = ((Conditional<Integer>)newValue).toList();
	}
	
	@Override
	public List<Integer> getReferences() {
		ArrayList<Integer> refs = new ArrayList<>(references.size() + 1);
		refs.addAll(references);
		refs.addAll(super.getReferences());
		return refs;
	}
}
