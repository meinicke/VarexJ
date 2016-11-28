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
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import cmu.vatrace.IFBranch;
import cmu.vatrace.Method;
import cmu.vatrace.MethodElement;
import cmu.vatrace.Statement;
import gov.nasa.jpf.jvm.bytecode.IfInstruction;
import varexj.trace.view.figures.IfBranchFigure;
import varexj.trace.view.figures.MethodFigure;
import varexj.trace.view.figures.StatementFigure;

/**
 * TODO description
 * 
 * @author Jens Meinicke
 */
public class StatementEditPart extends AbstractGraphicalEditPart {

	public StatementEditPart(Statement method) {
		super();
		setModel(method);
	}

	public Statement getRoleModel() {
		return (Statement) getModel();
	}

	@Override
	protected IFigure createFigure() {
		Statement model = getRoleModel();
		if (model instanceof IFBranch) {
			return new IfBranchFigure(model);
		}
		return new StatementFigure(model);
	}

	@Override
	protected void createEditPolicies() {
	}

}
