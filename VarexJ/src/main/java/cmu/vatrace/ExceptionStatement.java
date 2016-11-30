package cmu.vatrace;

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;

public class ExceptionStatement extends Statement {
	
	public String cname;
	private String details;

	public ExceptionStatement(Instruction op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}
	
	public ExceptionStatement(Instruction op, String cname, String details, Method method, FeatureExpr ctx) {
		this(op, method, ctx);
		this.cname = cname;
		this.details = details != null ? details.replaceAll("\"", "-") : null;
		setColor(NodeColor.firebrick1);
	}

	@Override
	public String toString() {
		if (details == null) {
			return cname;
		}
		return cname +": " + details;
	}
	
}
