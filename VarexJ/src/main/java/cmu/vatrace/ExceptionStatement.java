package cmu.vatrace;

import org.eclipse.jdt.annotation.NonNull;

import de.fosd.typechef.featureexpr.FeatureExpr;

public class ExceptionStatement extends Statement {
	
	public String cname;
	private String details;

	public ExceptionStatement(@NonNull Object op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}
	
	public ExceptionStatement(String cname, String details, Method method, FeatureExpr ctx) {
		this(null, method, ctx);
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
