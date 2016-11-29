package varexj.trace.view.figures;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

import cmu.vatrace.Method;
import coverageplugin.Constants;

/**
 * TODO description
 * 
 * @author Jens Meinicke
 *
 */
public class MethodFigure extends Figure {

	private Method method;
	private final Label label = new Label();
	private int height = 20;
	
	public MethodFigure(Method method) {
		super();
		this.method = method;
		this.setLayoutManager(new FreeformLayout());
		this.setName(method.toString());
		setBackgroundColor(Constants.WHITE);
		setBorder(new LineBorder(Constants.BLACK , 2));
		this.add(label);
		this.setOpaque(false);
		Label tooltip = new Label();
		tooltip.setText(method.toString());
		setToolTip(tooltip);
	}

	private void setName(String name){
		label.setText(name);
		Dimension labelSize = label.getPreferredSize();
		label.setLocation(new Point(10,10));
		if (labelSize.width < 100)
			labelSize.width = 100;
		
		if (labelSize.equals(label.getSize()))
			return;
		
		label.setSize(labelSize);

		Rectangle bounds = getBounds();
		int w = 20;
		
		bounds.setSize(labelSize.expand(w, height));

		Dimension oldSize = getSize();
		if (!oldSize.equals(0, 0)) {
			int dx = (oldSize.width - bounds.width) / 2;
			bounds.x += dx;
		}
		setBounds(bounds);
	}
	
}
