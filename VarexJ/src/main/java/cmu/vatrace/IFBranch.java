package cmu.vatrace;

import java.io.PrintWriter;

import gov.nasa.jpf.jvm.bytecode.IfInstruction;

public class IFBranch extends Statement {

	private IFBranch(Object op, Method m) {
		super(op, m);
	}
	
	public IFBranch(IfInstruction op, Method m) {
		super(op, m);
	}
	
	@Override
	public void printLabel(PrintWriter out) {
		out.print(getID());
		out.print("[label=\"");
		out.print(((IfInstruction)op).getClass().getSimpleName());
		out.println("\",shape=Mdiamond]");
	}
}
