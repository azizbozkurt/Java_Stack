
package unittest;

import azizstack.Stack;

public class Testdriver {

	/*** Test of push function ***/
	public void test_push() {
		// Arrange
		Stack tStack = new Stack();			// Create an empty stack
		int testvalue = 145;

		// Act
		tStack.push(testvalue);
		int peekvalue = tStack.peek();

		// Assert
		if (peekvalue == testvalue)
			System.out.println("\nPush Test ...Succesful\n");
		else
			System.out.println("\nPush Test **Failed**\n");

	}

	/*** Test of pop function ***/
	public void test_pop() {

		Stack tStack = new Stack();
		for (int i = 1; i < 11; i++) {		// Fill the stack with 10 elements
			tStack.push(i);
		}
				
		int popvalue = tStack.pop();

		if (popvalue == 10) { 				// Double condition test
			popvalue = tStack.pop();
			if (popvalue == 9)
				System.out.println("\nPop Test ...Succesful\n");
			else
				System.out.println("\nPop Test **Failed**\n");
		} else {
			System.out.println("\nPop Test ***Failed***\n");
		}
	}

	/*** Test of peek function ***/
	public void test_peek() {

		Stack tStack = new Stack();
		for (int i = 1; i < 11; i++) {
			tStack.push(i);
		}

		int peekvalue = tStack.peek();

		
		if (peekvalue == 10)
			System.out.println("\nPeek Test ...Succesful\n");
		else
			System.out.println("\nPeek Test **Failed\n");

	}

	/*** Underflow test of the stack ***/
	public void stack_underflow() {
		// Double condition test which is testing underflow
		// for empty stack and filled stack

		Stack tStack = new Stack();

		int UFvalue = 0;
		for (int i = 0; i < 15; i++) {
			UFvalue = tStack.pop();
		}

		if (UFvalue == -1762630107) {
			for (int i = 1; i < 11; i++) {
				tStack.push(i);
			}
			
			for (int i = 0; i < 15; i++) {
				UFvalue = tStack.pop();
			}
			
			if (UFvalue == -1762630107)
				System.out.println("\nStack Underflow Test ...Succesful\n");
			else
				System.out.println("\nStack Underflow Test **Failed\n");
		} else
			System.out.println("\nStack Underflow Test **Failed\n");
	}
	

	public static void main(String[] args) {

		Testdriver TD = new Testdriver();

		System.out.println("\n*****Initializing Test of Stack Implementation***** \n");

		TD.test_push();
		TD.test_peek();
		TD.stack_underflow();
		TD.test_pop();
		
	}
	
}
