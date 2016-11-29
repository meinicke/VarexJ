package varexj.trace.view;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import varexj.trace.view.editparts.TraceEditPart;

public class LayoutManager {

	
	public void layout(EditPart contents) {
		layout((AbstractGraphicalEditPart) contents);
	}
	
	public void layout(AbstractGraphicalEditPart editPart) {
		if (editPart instanceof TraceEditPart) {
			((TraceEditPart) editPart).layout();
		}
	}

}
