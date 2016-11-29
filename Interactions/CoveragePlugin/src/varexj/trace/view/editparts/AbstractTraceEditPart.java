package varexj.trace.view.editparts;

import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public abstract class AbstractTraceEditPart extends AbstractGraphicalEditPart {

	@Override
	protected void createEditPolicies() {	}
	
	public abstract void layout();
}
