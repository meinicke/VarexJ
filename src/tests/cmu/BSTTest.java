package cmu;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

public class BSTTest extends TestJPF {
	static String[] JPF_CONFIGURATION = new String[]{"+invocation=true", /*"+search.class=.search.RandomSearch",*/ "+choice=TreeChoice"};

	@Test
	public void randomTest() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			BST bst = new BST();
			final int N = 20;
			for (int i = 0; i < N; i++) {
				boolean add = new Choice().add;
				int value = Verify.getInt(1, N);
//				int value = new IntChoice(N).value;
				if (add) {
					bst.add(value);
				} else {
					bst.remove(value);
				}
				System.out.print("");
			}
		}
	}
	
}

class Choice {
	@Conditional
	boolean add = true;
}

class IntChoice {
	@Conditional
	boolean b = true;
	
	public int value = 0;
	public IntChoice(int i) {
		if (i == 1) {
			value =  b ? 1 : 0;
			return;
		}
		if (b) {
			value = i; 
		} else  {
			value = new IntChoice(i - 1).value;
		}
	}
}

/**
 * BST node
 */
class Node {
  public int value;
  public Node left, right;

  public Node(int x) {
    value = x;
    left = null;
    right = null;
  }
}

/**
 *
 * @author Mithun Acharya
 * Taken from Tao Xie's CSC 591t class
 * In fact, this is same as issta2006.BinTree.BinTree.java
 */
class BST {
  private Node root;

  public BST() {
    root = null;
  }

  public void add(int x) {
	  Node current = root;

	if (root == null) {
	  root = new Node(x);
	  return;
	}

    while (current.value != x) {
	  if (x < current.value) {
	    if (current.left == null) {
	      current.left = new Node(x);
		}
	    else {
		  current = current.left;
		}
	  }
	  else {
	    if (current.right == null) {
		  current.right = new Node(x);
		}
	    else {
		  current = current.right;
		}
	  }
	}
  }


  public boolean find(int x) {
    Node current = root;

    while (current != null) {
      if (current.value == x) {
	    return true;
	  }
	  if (x < current.value) {
        current = current.left;
	  }
	  else {
        current = current.right;
	  }
	}
	return false;
  }


  public boolean remove(int x) {
    Node current = root;

    Node parent = null;
    boolean branch = true; // true =left, false =right

    while (current != null) {
	  if (current.value == x) {
        Node bigson = current;
        while (bigson.left != null || bigson.right != null) {
		  parent = bigson;
          if (bigson.right != null) {
            bigson = bigson.right;
			branch = false;
		  }
          else {
			bigson = bigson.left;
			branch = true;
			}
		}

        // System.out.println("Remove: current "+current.value+" parent
        // "+parent.value+" bigson "+bigson.value);
        if (parent != null) {
          if (branch) {
          parent.left = null;
		  }
          else {
		    parent.right = null;
		  }
	    }

	    if (bigson != current) {
	      current.value = bigson.value;
	    }

	    return true;
	  }

	  parent = current;
	  // if (current.value <x ) { // THERE WAS ERROR
	  if (current.value > x) {
	    current = current.left;
	    branch = true;
	  }
	  else {
	    current = current.right;
	    branch = false;
	  }
    }
    return false;
  }
}
