
package stackapp;

import azizstack.Stack;

public class App {

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push(99);
		stack.push(88);
		stack.push(77);
		stack.push(66);
		stack.push(55);
		stack.push(44);
		stack.push(33);
		stack.push(22);
		stack.push(11);

		stack.peek();

		stack.pop();
		stack.pop();

		stack.peek();

		stack.showAll();

	}
}
