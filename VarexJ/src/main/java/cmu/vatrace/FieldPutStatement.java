package cmu.vatrace;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import org.eclipse.jdt.annotation.NonNull;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.FieldInfo;
import scala.collection.Iterator;

public class FieldPutStatement extends Statement {

	private Conditional<Integer> oldValue;
	private Conditional<Integer> newValue;
	private FieldInfo fi;
	private Conditional<String> newString;
	private Conditional<String> oldString;

	private FieldPutStatement(@NonNull Object op, Method m, FeatureExpr ctx) {
		super(op, m, ctx);
	}

	public FieldPutStatement(Conditional<Integer> oldValue, Conditional<Integer> newValue, Method m, FieldInfo fi, FeatureExpr ctx) {
		this(null, m, ctx);
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.fi = fi;
		this.oldString = oldValue.map(f);
		this.newString = newValue.map(f);

		if (fi.getAnnotation(gov.nasa.jpf.annotation.Conditional.class.getName()) == null) {
			if (oldValue.toMap().size() < newValue.toMap().size()) {
				setColor(NodeColor.darkorange);
			} else if (oldValue.toMap().size() > newValue.toMap().size()) {
				setColor(NodeColor.limegreen);
			}
		}
	}

	private final Function<Integer, String> f = val -> {
		if (fi.isBooleanField()) {
			return Boolean.toString(val == 1);
		}
		if (fi.isReference()) {
			if (val == 0) {
				return "null";
			}
			if (fi.getClassInfo().isEnum()) {
				TraceUtils.enums.put(val, fi.getName());
				return fi.getName();
			}
			if (fi.getTypeClassInfo().isEnum()) {
				return TraceUtils.enums.get(val);
			}
			return '@' + val.toString();
		}
		return val.toString();
	};

	@Override
	public String toString() {
		if (fi.getAnnotation(gov.nasa.jpf.annotation.Conditional.class.getName()) != null) {
			return fi.getFullName() + " = " + newString;
		} else {
			return fi.getFullName() + ": " + oldString + " \u2192 " + newString;
		}
	}

	@Override
	public boolean affectsIdentifier(String fieldName) {
		return fi.getName().equals(fieldName);
	}
	
	@Override
	public boolean affectsref(int ref) {
		if (fi.isReference()) {
			return oldValue.toMap().containsKey(ref) || newValue.toMap().containsKey(ref);
		}
		return false;
	}
	
	@Override
	public boolean isInteraction(int degree) {
		return newValue.toMap().size() >= degree; 
	}
}
