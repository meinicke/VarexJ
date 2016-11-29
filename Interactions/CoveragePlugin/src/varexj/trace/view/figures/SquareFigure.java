package varexj.trace.view.figures;

import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import cmu.vatrace.NodeColor;
import cmu.vatrace.Statement;
import coverageplugin.Constants;

/**
 * TODO description
 * 
 * @author Jens Meinicke
 *
 */
public class SquareFigure extends RectangleFigure {

	private Statement statement;
	private final Label label = new Label();
	private SourceAnchor sourceAnchor;
	private TargetAnchor targetAnchor;
	private static final int BORDER_MARGIN = 10;
	private static final int MIN_WIDTH = 20;
	private static final int BORDER_WIDTH = 2;
	
	public SquareFigure(Statement statement) {
		super();
		this.statement = statement;
		this.setLayoutManager(new FreeformLayout());
		setName(statement.toString());
		NodeColor color = statement.getColor();
		setBackgroundColor(Constants.getColor(color));
		setBorder(new LineBorder(Constants.BLACK, BORDER_WIDTH));
		
		this.add(label);
		this.setOpaque(true);
		
		sourceAnchor = new SourceAnchor(this, statement);
		targetAnchor = new TargetAnchor(this, statement);
		
	}

	private void setName(String name){
		label.setText(name);
		Dimension labelSize = label.getPreferredSize();
		
		if (labelSize.width < MIN_WIDTH)
			labelSize.width = MIN_WIDTH;
				
		label.setSize(labelSize);

		Rectangle bounds = getBounds();
		Dimension expand = labelSize.expand(BORDER_MARGIN, BORDER_MARGIN);
		int sideLength = Math.max(expand.height, expand.width);
		bounds.setSize(sideLength, sideLength);
		setBounds(bounds);
		label.setLocation(new Point(sideLength / 2 - label.getSize().width / 2, sideLength / 2 - label.getSize().height / 2));
	}

	public SourceAnchor getSourceAnchor() {
		return sourceAnchor;
	}

	public TargetAnchor getTargetAnchor() {
		return targetAnchor;
	}
}
