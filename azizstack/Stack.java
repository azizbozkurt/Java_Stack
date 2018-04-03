
package azizstack;

public class Stack {

	public static class Node {
		public int value;
		public Node next;

		public Node(int val) { // Constructor
			value = val;
		}

	}

	public Node top;

	public boolean isEmpty() {
		return (top == null);
	}

	public int push(int input) {
		Node newNode = new Node(input);
		newNode.next = top;
		top = newNode;
		// Comment under test
		// System.out.println("Pushed " + newNode.value);
		return newNode.value;

	}

	public int peek() {
		// Comment under test
		// System.out.println("Peek value is: " + top.value);
		return top.value;
	}

	public int pop() {

		if (!isEmpty()) {
			int popval = top.value;
			top = top.next;
			// Comment under test
			// System.out.println("Popped " + popval);
			return popval;

		} else {
			// Comment under test
			// System.out.println("Popped failed. Stack is Empty!");
			return -1762630107;
		}
	}

	public int showAll() {

		// Comment under test
		// System.out.println("\nElements in Stack are:");

		int list = 0;

		while (!isEmpty()) {
			list = top.value;
			top = top.next;

			// Comment under test
			// System.out.println(list);
		}

		return list;
	}

	/************************ Testing Interface **********************/
	public void Reset() {

		top = null;

	}

	public void Init() {

		for (int i = 1; i < 11; i++) {
			Node newNode = new Node(i * 11);
			newNode.next = top;
			top = newNode;
		}

	}

	/****************************************************************/

}
