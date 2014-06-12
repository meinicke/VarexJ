package gov.nasa.jpf.jvm.bytecode.extended;
import gov.nasa.jpf.jvm.bytecode.PUTSTATIC;
import gov.nasa.jpf.vm.AnnotationInfo;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.sat.SATFeatureExprFactory;

public class VA_PUTSTATIC extends PUTSTATIC {

	
	
	public VA_PUTSTATIC(String fieldName, String clsName, String fieldDescriptor) {
		super(fieldName, clsName, fieldDescriptor);
	}

	@Override
	public Conditional<Instruction> execute(FeatureExpr ctx, ThreadInfo ti) {
		AnnotationInfo[] annotations = getFieldInfo().getAnnotations();
		boolean annotated = false;
		for (AnnotationInfo ai : annotations) {
			if (ai.getName().equals("gov.nasa.jpf.annotation.MyAnnotation")) {
				System.out.println("Found Feature: " + fname);
				annotated = true;
			}
		}
		if (annotated) {
			StackFrame frame = ti.getModifiableTopFrame();
			FeatureExpr feature = SATFeatureExprFactory.createDefinedExternal(fname);
			
			frame.pop(ctx);
//			frame.push(0);
//			frame.push(new One<>(0));
			frame.push(ctx, new Choice<>(feature, new One<>(1), new One<>(0)));
		}
		return super.execute(ctx, ti);
	}

}
