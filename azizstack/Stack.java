
package azizstack;

public class Stack {

	public static class Node {
		public char value;
		public Node next;
	}

	private Node top;

	public boolean isEmpty() {
		return (top == null);
	}

	public void push(char input) {
		Node newNode = new Node();
		newNode.value = input;
		newNode.next = top;
		top = newNode;
	}

	public char peek() {
		if(isEmpty())
		    return ' ';
		else
		    return top.value;
	}

	public char pop() {
		if (!isEmpty()) {
			char popval = top.value;
			top = top.next;
			return popval;
		} else {
			return ' ';
		}
	}

}
