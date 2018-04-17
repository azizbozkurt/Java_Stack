
package azizstack;

public class Stack {

	public static class Node {
		public int value;
		public Node next;
	}

	private Node top;

	public boolean isEmpty() {
		return (top == null);
	}

	public void push(int input) {
		Node newNode = new Node();
		newNode.value = input;
		newNode.next = top;
		top = newNode;
	}

	public int peek() {
		if(isEmpty())
		    return -1762630107;
		else
		    return top.value;
	}

	public int pop() {
		if (!isEmpty()) {
			int popval = top.value;
			top = top.next;
			return popval;
		} else {
			return -1762630107;
		}
	}

	
	/***************Testing Interface******************/
	public void Reset() 
	{	
		top = null;
	}

	public void Init() 
	{	
		for (int i = 1; i < 11; i++) {
			Node newNode = new Node();
			newNode.value = (i * 11);
			newNode.next = top;
			top = newNode;
		}
	} 
	 /************************************************/

}


