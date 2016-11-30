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

import org.eclipse.draw2d.ConnectionAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.Request;
import org.eclipse.swt.SWT;

import cmu.vatrace.Edge;
import cmu.vatrace.Shape;
import cmu.vatrace.Statement;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import varexj.trace.view.figures.IfBranchFigure;
import varexj.trace.view.figures.SquareFigure;
import varexj.trace.view.figures.StatementFigure;

/**
 * TODO description
 * 
 * @author Jens Meinicke
 */
public class StatementEditPart extends AbstractTraceEditPart {

	private ConnectionAnchor sourceAnchor = null;
	private ConnectionAnchor targetAnchor = null;
	
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
		final Shape shape = model.getShape();
		if (shape == null) {
			StatementFigure statementFigure = new StatementFigure(model);
			sourceAnchor = statementFigure.getSourceAnchor();
			targetAnchor = statementFigure.getTargetAnchor();
			statementFigure.setAntialias(SWT.ON);
			return statementFigure;
		}
		
		switch (shape) {
		case Mdiamond:
			IfBranchFigure ifBranchFigure = new IfBranchFigure(model);
			sourceAnchor = ifBranchFigure.getSourceAnchor();
			targetAnchor = ifBranchFigure.getTargetAnchor();
			ifBranchFigure.setAntialias(SWT.ON);
			return ifBranchFigure;
		case Msquare:
			SquareFigure boxFigure = new SquareFigure(model);
			boxFigure.setAntialias(SWT.ON);
			sourceAnchor = boxFigure.getSourceAnchor();
			targetAnchor = boxFigure.getTargetAnchor();
			return boxFigure;
		default:
			throw new RuntimeException("shape not supported: " + shape);
		}
		
	}

	public ConnectionAnchor getSourceAnchor() {
		return sourceAnchor;
	}
	
	public ConnectionAnchor getTargetAnchor() {
		return targetAnchor;
	}
	
	@Override
	protected List<Edge> getModelTargetConnections() {
		List<Edge> connections = new ArrayList<>();
		for (Edge edge : JPF.vatrace.getEdges()) {
			if (edge.getTo() == getModel()) {
				connections.add(edge);
			}
		}
		return connections;
	}

	@Override
	public void layout() {
		
	}
	
	public Statement getStatementModel() {
		return (Statement) getModel();
	}
	
	@Override
	public void performRequest(Request request) {
		if ("open".equals(request.getType())) {
			final Statement statement = getStatementModel();
			Instruction instruction = statement.getInstruction();
			if (instruction != null) {
				EditorHelper.open(instruction.getMethodInfo(), instruction.getLineNumber());
			} else {
				MethodInfo method = statement.getMethod().getMethodInfo();
				EditorHelper.open(method, method.getLineNumber(0));
			}
			
			
		}
		super.performRequest(request);
	}
	
}
