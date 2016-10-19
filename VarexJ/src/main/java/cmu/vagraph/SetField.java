package cmu.vagraph;

import gov.nasa.jpf.vm.Instruction;

public class SetField implements Operation {

	int reference;
	String fieldName;
	Object newValue;
	VANode node;
	Instruction instruction;

	public SetField(int reference, String fieldName, Object newValue, VANode vaNode, Instruction instruction) {
		this.reference = reference;
		this.fieldName = fieldName;
		this.newValue = newValue;
		this.node = vaNode;
		this.instruction = instruction;
	}

	@Override
	public String toString() {
		String sourceFileName = instruction.getMethodInfo().getSourceFileName();
		sourceFileName = sourceFileName.substring(sourceFileName.indexOf('/') + 1);
		String eclipseReference = ", at " + instruction.getMethodInfo().getClassName() + '.' + instruction.getMethodInfo().getName() + "(" + sourceFileName + ":" + instruction.getLineNumber() + ")";
		return "SetField [reference=" + reference + ", fieldName=" + fieldName + ", newValue=" + newValue + ", node=" + node + eclipseReference;
	}

	
}
