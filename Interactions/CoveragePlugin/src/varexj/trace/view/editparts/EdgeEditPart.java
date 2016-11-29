package varexj.trace.view.editparts;

import org.eclipse.draw2d.ConnectionAnchor;
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
import cmu.vatrace.Statement;
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
		Statement from = edge.getFrom();
		Statement to = edge.getTo();
		StatementEditPart source = (StatementEditPart) getViewer().getEditPartRegistry().get(from);
		StatementEditPart target = (StatementEditPart) getViewer().getEditPartRegistry().get(to);

		setSource(source);
		setTarget(target);

		PolylineConnection figure = new PolylineConnection();
		figure.setSourceAnchor(getSourceConnectionAnchor());
		figure.setTargetAnchor(getTargetConnectionAnchor());
		figure.setForegroundColor(Constants.getColor(edge.getColor()));
		figure.setLineWidth(edge.getWidth());
		if (!Conditional.isTautology(edge.getCtx())) {
			createLabel(edge, figure);
		}

		PolygonDecoration decoration = new PolygonDecoration();
		PointList decorationPointList = new PointList();
		decorationPointList.addPoint(0, 0);
		decorationPointList.addPoint(-2, 1);
		decorationPointList.addPoint(-2, -1);
		decoration.setTemplate(decorationPointList);
		
		decoration.setForegroundColor(Constants.getColor(edge.getColor()));
		
		figure.setTargetDecoration(decoration);

		return figure;
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
	protected ConnectionAnchor getSourceConnectionAnchor() {
		Edge edge = (Edge) getModel();
		Statement from = edge.getFrom();
		StatementEditPart source = (StatementEditPart) getViewer().getEditPartRegistry().get(from);
		return source.getSourceAnchor();
	}

	@Override
	protected ConnectionAnchor getTargetConnectionAnchor() {
		Edge edge = (Edge) getModel();
		Statement to = edge.getTo();
		StatementEditPart target = (StatementEditPart) getViewer().getEditPartRegistry().get(to);
		return target.getTargetAnchor();
	}

}
