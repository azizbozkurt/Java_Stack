
package azizstack;

/**
 * <h3> Class including the stack functionality </h3>
 * @author ABXGD2
 */
public class Stack {
	
	/**
	 * <h3> Class including linked list functionality </h3>
	 */
	public static class Node {
		public char value;
		public Node next;
	}

	private Node top;
	
	/**
	 * Push method pushes a arbitrary char into the stack
	 */
	public void push(char input) {
		Node newNode = new Node();
		newNode.value = input;
		newNode.next = top;
		top = newNode;
	}
	
	/**
	 * Peek method shows the top value in the stack
	 */
	public char peek() throws NullPointerException {
		    return top.value;
	}
	
	/**
	 * Pop method removes the top value from the stack
	 */
	public char pop() throws NullPointerException {
			char popval = top.value;
			top = top.next;
			return popval;
		}
	}
