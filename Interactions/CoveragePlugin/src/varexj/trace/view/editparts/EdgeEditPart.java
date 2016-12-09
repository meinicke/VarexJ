package varexj.trace.view.editparts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MidpointLocator;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.swt.graphics.Color;

import cmu.conditional.Conditional;
import cmu.vatrace.Edge;
import coverageplugin.Constants;

/**
 * TODO description
 * 
 * @author Jens Meinicke
 *
 */
public class EdgeEditPart extends AbstractConnectionEditPart {

	public EdgeEditPart(Edge edge) {
		super();
		setModel(edge);
	}

	@Override
	protected IFigure createFigure() {
		Edge edge = (Edge) getModel();
		PolylineConnection figure = new PolylineConnection();
		
		figure.setForegroundColor(Constants.getColor(edge.getColor()));
		figure.setLineWidth(edge.getWidth());

		PolygonDecoration decoration = new PolygonDecoration();
		PointList decorationPointList = new PointList();
		decorationPointList.addPoint(0, 0);
		decorationPointList.addPoint(-2, 1);
		decorationPointList.addPoint(-2, -1);
		decoration.setTemplate(decorationPointList);
		decoration.setForegroundColor(Constants.getColor(edge.getColor()));
		figure.setTargetDecoration(decoration);

		if (!Conditional.isTautology(edge.getCtx())) {
			createLabel(edge, figure);
		}
		
		return figure;
	}
	
	@Override
	protected void refreshVisuals() {
		Edge edge = (Edge) getModel();
		StatementEditPart source = (StatementEditPart) getViewer().getEditPartRegistry().get(edge.getFrom());
		setSource(source);
		StatementEditPart target = (StatementEditPart) getViewer().getEditPartRegistry().get(edge.getTo());
		setTarget(target);
	}

	private void createLabel(Edge edge, PolylineConnection figure) {
		MidpointLocator sourceEndpointLocator = new MidpointLocator(figure, 0);
		Label label = new Label(Conditional.getCTXString(edge.getCtx()));
		label.setForegroundColor(Constants.BLACK);
		label.setBackgroundColor(new Color(null, 239, 242, 185));
		figure.add(label, sourceEndpointLocator);
		label.setOpaque(true);
		label.setBorder(new LineBorder(Constants.BLACK));
	}

	@Override
	protected void createEditPolicies() {

	}
	
	@Override
	public void deactivate() {
		getFigure().setVisible(false);
	}

}
