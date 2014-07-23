package gov.nasa.jpf.vm;

/**
 * 
 * @author Jens
 *
 */
public class Stack {

	public int top;
	public Entry[] slots;

	public Stack(int nOperands) {
		top = -1;
		slots = new Entry[nOperands];
	}

	public void clear() {
		top = -1;
		for (int i = 0; i < slots.length; i++) {
			slots[i] = null;
		}
		// slots = new Entry[slots.length]; // alternative
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

	public Integer get(int index) {
		if (index < 0) {
			return -1;
		}
		if (slots[index] != null) {
			return slots[index].value;
		}
		return MJIEnv.NULL;
	}

	public Integer peek(int offset) {
		if (top < offset) {
			return -1;
		}
		if (slots[top - offset] == null) {
			return MJIEnv.NULL;
		}
		return slots[top - offset].value;
	}

	public Integer pop() {
		Integer res = slots[top] == null ? MJIEnv.NULL : slots[top].value;
		slots[top] = null;
		top--;
		return res;
	}

	public Entry popEntry() {
		return slots[top--];
	}

	public void push(Integer value, boolean isRef) {
		slots[++top] = new Entry(value, isRef);
	}

	public boolean isRef(int offset) {
//		 if (top - offset < 0) {
//			 return false;
//		 }
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
//		if (top > -1) {
//			System.arraycopy(slots, 0, clone.slots, 0, top + 1);
//		}
		
		for (int i = 0; i <= top; i++) {
//			if (slots[i] != null) {
				clone.slots[i] = slots[i];
//			} else {
//				break;
//			}
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
				string.append(" null ");
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
			if (((Stack) o).top != top) {
				return false;
			}
			for (int i = top; i >= 0; i--) {
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

	/**
	 * .. A B => .. B A B
	 */
	public void dup_x1() {
		Entry A = slots[top - 1];
		Entry B = slots[top];

		slots[top - 1] = B;
		slots[top] = A;
		slots[top + 1] = B;
		top++;
	}

	/**
	 * .. A B C D => .. C D A B C D
	 */
	public void dup2_x2() {
		Entry A = slots[top - 3];
		Entry B = slots[top - 2];
		Entry C = slots[top - 1];
		Entry D = slots[top];

		slots[top - 3] = C;
		slots[top - 2] = D;
		slots[top - 1] = A;
		slots[top] = B;
		slots[top + 1] = C;
		slots[top + 2] = D;

		top += 2;
	}

	/**
	 * .. A B C => .. B C A B C
	 */
	public void dup2_x1() {
		Entry A = slots[top - 2];
		Entry B = slots[top - 1];
		Entry C = slots[top];

		slots[top - 2] = B;
		slots[top - 1] = C;
		slots[top] = A;
		slots[top + 1] = B;
		slots[top + 2] = C;

		top += 2;

	}

	/**
	 * .. A B => .. A B A B
	 */
	public void dup2() {
		Entry A = slots[top - 1];
		Entry B = slots[top];

		slots[top - 1] = A;
		slots[top] = B;
		slots[top + 1] = A;
		slots[top + 2] = B;

		top += 2;
	}

	/**
	 * .. A => .. A A
	 */
	public void dup() {
		slots[top + 1] = slots[top];
		top++;
	}

	/**
	 * .. A B C => .. C A B C
	 */
	public void dup_x2() {
		Entry A = slots[top - 2];
		Entry B = slots[top - 1];
		Entry C = slots[top];

		slots[top - 2] = C;
		slots[top - 1] = A;
		slots[top] = B;
		slots[top + 1] = C;

		top++;
	}

	/**
	 * .. A B => .. B A
	 */
	public void swap() {
		Entry A = slots[top - 1];
		Entry B = slots[top];

		slots[top - 1] = B;
		slots[top] = A;
	}

	@Override
	public int hashCode() {
		int hash = 7;
		for (Entry e : slots) {
			if (e != null) {
				hash = hash * 31 + e.value;
			}
		}
		return hash;
	}

}

class Entry {
	boolean isRef = false;
	final int value;

	// final Integer attr;

	Entry copy() {
		return new Entry(value, isRef);
	}

	public Entry(int value, boolean isRef) {
		this.value = value;
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
		return ((Entry) o).value == value && ((Entry) o).isRef == isRef;
	}

	@Override
	public int hashCode() {
		return value;
	}
}