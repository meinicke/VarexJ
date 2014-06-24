package gov.nasa.jpf.vm;

/**
 * 
 * @author Jens
 *
 */
public class Stack {
	
	public int top;
	private Entry[] slots;
	
	public Stack(int nLocals, int nOperands) {
		top = nLocals-1;
		slots = new Entry[nLocals + nOperands];
	}

	public void setRef(int index, boolean ref) {
		if (slots[index] != null) {
			slots[index].isRef = ref;
		}
	}

	public boolean hasAnyRef() {
		for (Entry e : slots) {
			if (e != null && e.isRef) {
				return true;
			}
		}
		return false;
	}

	public int[] getSlots() {
		int[] clone = new int[slots.length];
		for (int i = 0; i < slots.length; i++) {
			if (slots[i] != null) {
				clone[i] = slots[i].value;
			}
		}
		return clone;
	}

	public void duplicateIndex(int index, int offset, boolean direction) {
		if (direction) {
			if (slots[index] == null) {
				slots[top + offset] = null;
			} else {
				slots[top + offset] = slots[index].copy();// copy might be unnecessary
			}
		} else {
			if (slots[top + offset] == null) {
				slots[index] = null;
			} else {
				slots[index] = slots[top + offset].copy();// copy might be unnecessary
			}
		}
	}

	public void duplicate(int sourceOffset, int targetOffset) {
		slots[top + targetOffset] = slots[top + sourceOffset].copy();// copy might be unnecessary
	}

	public Integer get(int index) {
		if (index < 0) {
			return -1;
		}
		if (slots[index] != null) {
			return slots[index].value;
		}
		return 0;
	}

	public Stack(int size) {
		slots = new Entry[size];
	}

	public Integer peek(int offset) {
		if (top < offset) {
			return -1;
		}
		if (slots[top - offset] == null) {
			return 0;
		}
		return slots[top - offset].value;
	}

	public Integer pop() {
		Integer res = slots[top] == null ? 0 : slots[top].value;
		slots[top] = null;
		top--;
		return  res;
	}

	public void push(Integer value, boolean isRef) {
		slots[++top] = new Entry(value, isRef);
	}
	
	public boolean isRef(int offset) {
		if (slots[top - offset] == null) {
			return false;
		}
		return slots[top - offset].isRef;
	}

	public boolean isRefIndex(int index) {
		if (slots[index] != null) {
			return slots[index].isRef;
		}
		return false;
	}
	
	public void set(int offset, int value, boolean isRef) {
		slots[top - offset] = new Entry(value, isRef);
	}
	
	public void setIndex(int index, Integer value, boolean isRef) {
		slots[index] = new Entry(value, isRef);
	}
	
	Stack copy() {
		Stack clone = new Stack(slots.length);
		clone.top = top;
		for (int i = 0; i < slots.length; i++) {
			if (slots[i] != null) {
				clone.slots[i] = slots[i].copy();
			}
		}
		return clone;
	}
	
	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append('{');
		int i = 0;
		for (Entry e : slots) {
			if (i == top) {
				string.append(" =>");
			}
			if (e == null) {
				string.append(" 0 ");
			} else {			
				string.append(e);
			}
			if (i == top) {
				string.append("<= ");
			}
			i++;
		}
		string.append('}');
		return string.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Stack) {
			for (int i = 0; i < slots.length; i++) {
				if (((Stack) o).slots[i] == null) {
					if (slots[i] == null) {
						continue;
					} else {
						return false;
					}
				}
				if (!((Stack) o).slots[i].equals(slots[i])) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
}

class Entry {
	boolean isRef = false;
	Integer value;
	Integer attr;
	
	public Entry(Integer value) {
		this.value = value;
	}
	
	Entry copy() {
		return new Entry(value, isRef);
	}

	public Entry(Integer value, boolean isRef) {
		this(value);
		this.isRef = isRef;
	}
	
	@Override
	public String toString() {
		if (isRef) {
			return " <" + value + "> ";
		}
		return " [" + value + "] ";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof Entry) {
			return ((Entry) o).value.equals(value) && ((Entry)o).isRef == isRef;
		}
		return false;
	}
}