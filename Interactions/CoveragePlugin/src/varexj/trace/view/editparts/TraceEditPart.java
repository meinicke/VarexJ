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

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import cmu.vatrace.Edge;
import cmu.vatrace.Trace;
import coverageplugin.Constants;

/**
 * TODO description
 * 
 * @author Jens Meinicke
 */
public class TraceEditPart extends AbstractGraphicalEditPart {

	private Edge edge;

	public TraceEditPart(Trace model) {
		super();
		setModel(model);
	}

	public Trace getRoleModel() {
		return (Trace) getModel();
	}

	@Override
	protected IFigure createFigure() {
		Figure fig = new FreeformLayer();
		fig.setLayoutManager(new FreeformLayout());
		fig.setBackgroundColor(Constants.WHITE);
		fig.setOpaque(true);
		return fig;
	}
	
	
	@Override
	protected List<?> getModelChildren() {
		Trace t = getRoleModel();
		List<Object> list = new ArrayList<Object>();
		list.add(t.getSTART());
		list.add(t.getMain());
		list.add(t.getEND());
		return list;
	}

	@Override
	protected void createEditPolicies() {
	}
	
}
