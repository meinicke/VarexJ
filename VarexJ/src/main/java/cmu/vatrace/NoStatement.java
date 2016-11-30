package cmu.vatrace;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.bdd.BDDFeatureExprFactory;
import gov.nasa.jpf.vm.Instruction;

public class NoStatement extends Statement {

	private String name;

	private NoStatement(Instruction op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}

	public NoStatement(String name) {
		this(null, null, BDDFeatureExprFactory.True());
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
