package azizstack;


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


	public int push(int input) {
		Node newNode = new Node(input);
		newNode.next = top;
		top = newNode;
		System.out.println("Pushed " + newNode.value);
		return newNode.value;
	
	}


	public int peek() {
		System.out.println("Peek value is: " + top.value);
		return top.value;
	}

	
	public int pop() {
		if (!isEmpty()) {
		int popval = top.value;
		top = top.next;
		System.out.println("Popped " + popval);
		return popval;
		} else {
		System.out.println("Popped failed. Stack is Empty!");
		}
	return 0;
	}


	public void showAll() {
		System.out.println("\nElements in Stack are:"); 

		while (!isEmpty()) {
		//int list = pop();
		int list = top.value;
		top = top.next;
		System.out.println(list);
		}
	}

/************************Testing Interface**********************/
public void Reset() {

	top = null;

}


public void Init() {

	for(int i= 1; i<11; i++) {
		Node newNode = new Node(i*11);
		newNode.next = top;
		top = newNode;
	}

}

	
/****************************************************************/	
	
}
