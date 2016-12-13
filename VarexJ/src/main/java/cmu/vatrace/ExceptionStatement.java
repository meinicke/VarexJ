package cmu.vatrace;

import cmu.conditional.Conditional;
import cmu.varviz.trace.Method;
import cmu.varviz.trace.NodeColor;
import cmu.varviz.trace.Statement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;

public class ExceptionStatement extends Statement {
	
	public String cname;
	private Conditional<String> details;

	public ExceptionStatement(Instruction op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}
	
	public ExceptionStatement(Instruction op, String cname, Conditional<String> causeDetails, Method method, FeatureExpr ctx) {
		this(op, method, ctx);
		this.cname = cname;
		this.details = causeDetails;
		setColor(NodeColor.firebrick1);
	}

	@Override
	public String toString() {
		if (details == null) {
			return cname;
		}
		return cname + ':';
	}
	
	@Override
	public Conditional<String> getValue() {
		if (details == null) {
			return null;
		}
		return details.map(d -> d == null ? null : d.replaceAll("\"", "-"));
	}
}
