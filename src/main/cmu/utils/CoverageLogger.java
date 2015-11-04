package cmu.utils;

import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.vm.ClassInfo;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StackFrame;

/**
 * Util class for the coverage of interactions.
 * 
 * @author Jens Meinicke
 *
 */
public class CoverageLogger {

	/**
	 * Packages to propagate.
	 */
	final static String[] propagatePackages = {"java", "gov.nasa.jpf", "sun"};
	
	/**
	 * Logs the given interaction.<br>
	 * If the interaction appears in external classes (java.*, gov.nasa.jpf.*, sun.*) then the interaction is propagated to the callee.
	 * 
	 * @param frame The current stack frame.
	 * @param interaction The degree of the interaction.
	 * @param content The content to print.
	 * @param ctx The context of the interation.
	 */
	public static void logInteraction(StackFrame frame, int interaction, Object content, FeatureExpr ctx) {
		if (frame == null) {
			return;
		}
		MethodInfo methodInfo = frame.getMethodInfo();
		for (String propClass : propagatePackages) {
			if (methodInfo.getFullName().startsWith(propClass)) {
				logInteraction(frame.getPrevious(), interaction, content, ctx);
				break;
			}
		}
		ClassInfo classInfo = methodInfo.getClassInfo();
		String file = classInfo.getSourceFileName();
		if (file == null) {
			return;
		}
		file = file.substring(file.lastIndexOf('/') + 1);
		JPF.COVERAGE.setLineCovered(file, frame.getPC().simplify(ctx).getValue().getLineNumber(), interaction,
				content);
	}
	
}
