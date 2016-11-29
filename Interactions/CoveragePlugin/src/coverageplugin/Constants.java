package coverageplugin;

import org.eclipse.swt.graphics.Color;

import cmu.vatrace.NodeColor;

public interface Constants {

	Color BLACK = new Color(null, 0, 0, 0);
	Color WHITE = new Color(null, 255, 255, 255);
	Color GRAY = new Color(null, 240, 240, 240);

	Color red = new Color(null, 255, 0, 0);
	Color darkorange = new Color(null, 255, 165, 0);
	Color limegreen = new Color(null, 124, 252, 0);
	Color firebrick1 = red;
	Color tomato = red;

	static Color getColor(NodeColor c) {
		if (c == null) {
			return GRAY;
		}
		switch (c) {
		case black:
			return BLACK;
		case darkorange:
			return darkorange;
		case firebrick1:
			return firebrick1;
		case limegreen:
			return limegreen;
		case red:
			return red;
		case tomato:
			return tomato;
		case white:
			return WHITE;
		default:
			break;
		}
		return GRAY;
	}
}
