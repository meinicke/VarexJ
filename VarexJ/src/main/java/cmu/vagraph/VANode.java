package cmu.vagraph;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;

public class VANode {

	public final FeatureExpr ctx;
	public VANode parent;
	MethodInfo methodInfo;
	private Instruction instruction;
	
	public void setParent(VANode parent) {
		this.parent = parent;
		parent.children.add(this);
	}
	
	public void setInstruction(Instruction instruction) {
		this.instruction = instruction;
	}

	private VANode(@NonNull MethodInfo methodInfo, @NonNull FeatureExpr ctx, VANode parent) {
		this.methodInfo = methodInfo;
		this.ctx = ctx;
		this.parent = parent;
	}

	public VANode(@NonNull MethodInfo methodInfo, Instruction instruction, FeatureExpr ctx, VANode currentNode) {
		this(methodInfo, ctx, currentNode);
		this.instruction = instruction;
	}

	public VANode(MethodInfo callee, FeatureExpr ctx2) {
		this.methodInfo = callee;
		ctx = ctx2;
	}

	Collection<VANode> children = new ArrayList<>();

	public void addChild(VANode vaNode) {
		children.add(vaNode);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
//		String sourceFileName = instruction.getMethodInfo().getSourceFileName();
//		if (sourceFileName != null) {
//			sourceFileName = sourceFileName.substring(sourceFileName.lastIndexOf('/') + 1);
//		}
//		sb.append(instruction.getMethodInfo().getName() + "---");
//		sb.append(instruction.getMethodInfo().getClassName() + '(' + sourceFileName + ":" + instruction.getLineNumber() + ')');
//		sb.append(" -" + Conditional.getCTXString(ctx) + "-> ");
		sb.append(methodInfo.getName());
		return sb.toString();
	}
	
	static int margin1 = 80;
	static int margin2 = 150;
	
	public void print(int depth, String... filter) {
		for (String f : filter) {
			if (methodInfo.getFullName().startsWith(f)) {
				System.out.println("...");
				return;
			}
		}
		
		String line = "";
		if (instruction != null) {
			String sourceFileName = instruction.getMethodInfo().getSourceFileName();
			sourceFileName = sourceFileName.substring(sourceFileName.indexOf('/') + 1);
			line = "at " + instruction.getMethodInfo().getClassName() + '.' + instruction.getMethodInfo().getName() + "(" + sourceFileName + ":" + instruction.getLineNumber() + ")";
		}
		
		String output = depth + "\t" + new String(new char[depth]) + methodInfo.getFullName();
		if (output.length() >= margin1) {
			margin1 = output.length() + 20; 
		}
		String outputLine = new String(new char[margin1 - output.length()]) + line;
		if (output.length() + outputLine.length() >= margin2) {
			margin2 = output.length() + outputLine.length() + 20; 
		}
		String outputCTX = new String(new char[margin2 - (output.length() + outputLine.length())])+ Conditional.getCTXString(ctx);
		System.out.println(output + outputLine + outputCTX + setFields);
		
		for (VANode vaNode : children) {
			vaNode.print(depth + 1, filter);
		}
	}
	
	String thisString = "";
	
	void makeString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this);

		String child = null;
		int loops = 1;
		for (VANode vaNode : children) {
			vaNode.makeString();
			if (child == null) {
				child = vaNode.thisString;
				continue;
			}
			if (child.equals(vaNode.thisString)) {
				loops++;
				continue;
			} else { 
				if (loops > 1) {
					sb.append("\n>>>>>>>>>>>>>>>>>>>>>>>>");
				}
				sb.append("\n " + loops + "x ");
				sb.append(child);
				if (loops > 1) {
					sb.append("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				}
				loops = 1;
				child = vaNode.thisString;
			}
		}
		if (child != null) {
			if (loops > 1) {
				sb.append("\n>>>>>>>>>>>>>>>>>>>>>>>>");
			}
			sb.append("\n " + loops + "x ");
			sb.append(child);
			if (loops > 1) {
				sb.append("\n<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			}
		}
		thisString = sb.toString();
	}
	
	public void print(int times, int depth) {
		makeString();
		System.out.println("     " + thisString);
	}

	@Override
	public boolean equals(Object obj) {
		return this.toString().equals(obj.toString());
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		VANode other = (VANode) obj;
//		if (children == null) {
//			if (other.children != null)
//				return false;
//		} else if (!children.equals(other.children))
//			return false;
//		if (ctx == null) {
//			if (other.ctx != null)
//				return false;
//		} else if (!ctx.equals(other.ctx))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
	}

	// TODO what to do here
	List<String> setFields = new ArrayList<>();
	
	public void addSetField(String name) {
		setFields.add(name);	
	}

	public int getSize(String[] filter) {
		for (String f : filter) {
			if (methodInfo.getFullName().startsWith(f)) {
				return 0;
			}
		}
		int size = 1;
		for (VANode child : children) {
			size += child.getSize(filter);
		}
		return size;
	}

}
