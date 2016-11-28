package varexj.trace.view;

import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import varexj.trace.view.editparts.MethodEditPart;
import varexj.trace.view.editparts.StatementEditPart;

public class LayoutManager {

	private final static int BORDER_MARGIN = 10;
	public void layout(EditPart contents) {
		layout((AbstractGraphicalEditPart) contents);
	}
	
	public void layout(AbstractGraphicalEditPart method) {
		if (method instanceof StatementEditPart) {
			return;
		}
		List children = method.getChildren();
		IFigure parent = method.getFigure();
		int h = 40;
		for (Object object : children) {
			if (object instanceof AbstractGraphicalEditPart) {
				((AbstractGraphicalEditPart)object).getFigure().translateToRelative(parent.getBounds().getTopLeft());
				layout((AbstractGraphicalEditPart)object);
				((AbstractGraphicalEditPart)object).getFigure().setLocation(new Point(BORDER_MARGIN, h));
				h+= ((AbstractGraphicalEditPart)object).getFigure().getSize().height;
				h += BORDER_MARGIN;
			}
		}
		
		Rectangle bounds = method.getFigure().getBounds();
		
		int maxW = bounds.width;
		int maxH = bounds.height;
		
		for (Object object : children) {
			if (object instanceof AbstractGraphicalEditPart) {
				bounds = ((AbstractGraphicalEditPart)object).getFigure().getBounds();
				maxW = Math.max(maxW, bounds.width);
				maxH = bounds.y + bounds.height;
			}
		}
		Rectangle oldbounds = method.getFigure().getBounds();
		int newHeight = maxH - oldbounds.getTop().y; 
		
		bounds = new Rectangle(oldbounds.x, oldbounds.y, maxW + BORDER_MARGIN * 2, newHeight + BORDER_MARGIN);
		method.getFigure().setBounds(bounds);
		
	}

}
