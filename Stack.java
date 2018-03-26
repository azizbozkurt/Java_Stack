public class Stack {

	private static class Node {
		private	int value;
		private	Node next;
	
		private Node(int val) {		//Constructor
		value = val;
		}

	}


	private Node top;


	public boolean isEmpty() {
		return (top == null);
	}


	public void push(int input) {
		Node newNode = new Node(input);
		newNode.next = top;
		top = newNode;
		System.out.println("Pushed " + newNode.value);
	
	}


	public int peek() {
		System.out.println("Peek value is: " + top.value);
		return top.value;
	}


}
