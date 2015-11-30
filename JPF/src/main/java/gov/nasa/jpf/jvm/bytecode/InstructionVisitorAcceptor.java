package gov.nasa.jpf.jvm.bytecode;

public interface InstructionVisitorAcceptor {
	public void accept(InstructionVisitor insVisitor);
}