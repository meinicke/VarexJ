package varexj.trace.view.figures;

import org.eclipse.draw2d.AbstractConnectionAnchor;
import org.eclipse.draw2d.geometry.Point;

import cmu.vatrace.Statement;

public class SourceAnchor extends AbstractConnectionAnchor {

	private Statement statement;

	public SourceAnchor(StatementFigure owner, Statement statement) {
		super(owner);
		this.statement = statement;
	}

	@Override
	public Point getLocation(Point ref) {
		return getOwner().getBounds().getBottom();
	}

}
