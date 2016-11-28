package varexj.trace.view.editparts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import cmu.vatrace.Method;
import cmu.vatrace.Statement;
import cmu.vatrace.Trace;

/**
 * 
 * @author Jens Meinicke
 *
 */
public class TraceEditPartFactory implements EditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof Trace) {
			return new TraceEditPart((Trace) model);
		}
		if (model instanceof Method) {
			return new MethodEditPart((Method) model);
		}
		if (model instanceof Statement) {
			return new StatementEditPart((Statement) model);
		}
		if (model == null) {
			System.err.println("null argument");
			return null;
		}
		System.err.println(model.getClass() + " has no corresponding edit part");
		return null;
	}

}
