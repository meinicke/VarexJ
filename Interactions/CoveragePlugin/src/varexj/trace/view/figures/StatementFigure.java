package varexj.trace.view.figures;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

import cmu.vatrace.Method;
import cmu.vatrace.MethodElement;
import cmu.vatrace.Statement;
import coverageplugin.Constants;

/**
 * TODO description
 * 
 * @author Jens Meinicke
 *
 */
public class StatementFigure extends Figure {

	private Statement statement;
	private final Label label = new Label();
	private static final int BORDER_MARGIN = 10;
	private static final int MIN_WIDTH = 20;
	private static final int BORDER_WIDTH = 2;
	
	public StatementFigure(Statement statement) {
		super();
		this.statement = statement;
		this.setLayoutManager(new FreeformLayout());
		setName(statement.toString());
		setBackgroundColor(Constants.WHITE);
		setBorder(new LineBorder(Constants.BLACK , BORDER_WIDTH));
		this.add(label);
		this.setOpaque(true);
	}

	private void setName(String name){
		label.setText(name);
		Dimension labelSize = label.getPreferredSize();
		
		if (labelSize.width < MIN_WIDTH)
			labelSize.width = MIN_WIDTH;
				
		label.setSize(labelSize);

		Rectangle bounds = getBounds();
		bounds.setSize(labelSize.expand(BORDER_MARGIN * 2, BORDER_MARGIN * 2));
		setBounds(bounds);
		label.setLocation(new Point(BORDER_MARGIN, BORDER_MARGIN));
	}
}
