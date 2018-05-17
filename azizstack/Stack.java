
package azizstack;

public class Stack {

	public static class Node {
		public char value;
		public Node next;
	}

	private Node top;

	public void push(char input) {
		Node newNode = new Node();
		newNode.value = input;
		newNode.next = top;
		top = newNode;
	}

	public char peek() throws NullPointerException {
		    return top.value;
	}

	public char pop() throws NullPointerException {
			char popval = top.value;
			top = top.next;
			return popval;
		}
	}
