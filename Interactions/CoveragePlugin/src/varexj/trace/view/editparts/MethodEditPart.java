/* FeatureIDE - A Framework for Feature-Oriented Software Development
 * Copyright (C) 2005-2016  FeatureIDE team, University of Magdeburg, Germany
 *
 * This file is part of FeatureIDE.
 * 
 * FeatureIDE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * FeatureIDE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FeatureIDE.  If not, see <http://www.gnu.org/licenses/>.
 *
 * See http://featureide.cs.ovgu.de/ for further information.
 */
package varexj.trace.view.editparts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.Request;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import cmu.vatrace.Method;
import cmu.vatrace.MethodElement;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.MethodInfo;
import varexj.trace.view.figures.MethodFigure;

/**
 * TODO description
 * 
 * @author Jens Meinicke
 */
public class MethodEditPart extends AbstractTraceEditPart {

	private final static int BORDER_MARGIN = 10;

	public MethodEditPart(Method method) {
		super();
		setModel(method);
	}

	@Override
	protected IFigure createFigure() {
		return new MethodFigure((Method) getModel());
	}

	@Override
	protected List getModelChildren() {
		List children = new ArrayList();
		for (MethodElement child : ((Method) getModel()).getChildren()) {
			children.add(child);
		}
		return children;
	}

	@Override
	public void layout() {
		final IFigure methodFigure = getFigure();
		Rectangle bounds = methodFigure.getBounds();
		final Point referencePoint = bounds.getTopLeft();
		int h = 40;

		MethodElement previous = null;
		AbstractTraceEditPart previousFigure = null;
		for (Object object : getChildren()) {
			if (object instanceof AbstractTraceEditPart) {
				AbstractTraceEditPart childEditPart = (AbstractTraceEditPart) object;

				MethodElement model = (MethodElement) childEditPart.getModel();
				FeatureExpr ctx = model.getCTX();
				if (previous != null) {
					FeatureExpr prevctx = previous.getCTX();
					if (!prevctx.equivalentTo(ctx)) {
						if (prevctx.and(ctx).isSatisfiable()) {
							// True -> a

							// move to left
							childEditPart.layout();
							childEditPart.getFigure().translateToRelative(referencePoint);

							childEditPart.getFigure().setLocation(new Point(-(childEditPart.getFigure().getBounds().width + BORDER_MARGIN), h));
							h = childEditPart.getFigure().getBounds().bottom() + BORDER_MARGIN * 4;
							previous = model;
							previousFigure = childEditPart;
							continue;
						} else {
							// a -> -a
							childEditPart.layout();
							childEditPart.getFigure().translateToRelative(referencePoint);
							h = previousFigure.getFigure().getBounds().y;
							childEditPart.getFigure().setLocation(new Point(previousFigure.getFigure().getBounds().right() + BORDER_MARGIN, h));
							h = childEditPart.getFigure().getBounds().bottom() + BORDER_MARGIN * 4;
							previous = model;
							previousFigure = childEditPart;
							continue;
						}
					}
				}

				childEditPart.layout();
				childEditPart.getFigure().translateToRelative(referencePoint);
				childEditPart.getFigure().setLocation(new Point(-childEditPart.getFigure().getBounds().width / 2, h));
				h += childEditPart.getFigure().getSize().height;
				h += BORDER_MARGIN * 4;

				previous = model;
				previousFigure = childEditPart;
			}
		}

		// move all to scope
		int minX = 0;
		for (Object object : getChildren()) {
			if (object instanceof AbstractGraphicalEditPart) {
				bounds = ((AbstractGraphicalEditPart) object).getFigure().getBounds();
				minX = Math.min(bounds.x, minX);
			}
		}

		for (Object object : getChildren()) {
			if (object instanceof AbstractGraphicalEditPart) {
				Point location = ((AbstractGraphicalEditPart) object).getFigure().getBounds().getTopLeft();
				((AbstractGraphicalEditPart) object).getFigure().setLocation(new Point(BORDER_MARGIN + location.x - minX, location.y));
			}
		}

		int maxW = bounds.width;
		int maxH = bounds.height;
		for (Object object : getChildren()) {
			if (object instanceof AbstractGraphicalEditPart) {
				bounds = ((AbstractGraphicalEditPart) object).getFigure().getBounds();
				maxW = Math.max(maxW, bounds.right());
				maxH = Math.max(bounds.bottom(), maxH);
			}
		}
		Rectangle oldbounds = methodFigure.getBounds();
		int newHeight = maxH - oldbounds.getTop().y;

		bounds = new Rectangle(oldbounds.x, oldbounds.y, maxW + BORDER_MARGIN, newHeight + BORDER_MARGIN);

		methodFigure.setBounds(bounds);
	}

	public Method getMethodModel() {
		return (Method) getModel();
	}

	@Override
	public void performRequest(Request request) {
		if ("open".equals(request.getType())) {
			final Method method = getMethodModel();
			final int lineNumber = method.getLineNumber();
			MethodInfo mi = method.getMethodInfo();
			EditorHelper.open(mi, lineNumber);
		}
		super.performRequest(request);
	}

}