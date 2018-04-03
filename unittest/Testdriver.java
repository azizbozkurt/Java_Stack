
package unittest;

import azizstack.Stack;

public class Testdriver {

	Stack TDS = new Stack(); // Create an object of type Stack

	/*** Test of push function ***/
	public void test_push() {
		// Arrange
		TDS.Reset(); // Empty the stack
		int testvalue = 145;

		// Act
		int pushvalue = TDS.push(testvalue);

		// Assert
		if (pushvalue == testvalue)
			System.out.println("\nPush Test ...Succesful\n");
		else
			System.out.println("\nPush Test **Failed**\n");

	}

	/*** Test of pop function ***/
	public void test_pop() {

		TDS.Reset();
		TDS.Init(); // Fill the stack with 10 elements

		int popvalue = TDS.pop();

		if (popvalue == 110) { // Double condition test
			popvalue = TDS.pop();
			if (popvalue == 99)
				System.out.println("\nPop Test ...Succesful\n");
			else
				System.out.println("\nPop Test **Failed**\n");
		}

	}

	/*** Test of peek function ***/
	public void test_peek() {

		TDS.Reset();
		TDS.Init();

		int peekvalue = TDS.peek();

		if (peekvalue == 110)
			System.out.println("\nPeek Test ...Succesful\n");
		else
			System.out.println("\nPeek Test **Failed\n");

	}

	/*** Test of showAll function ***/
	public void test_showAll() {

		TDS.Reset();
		TDS.Init();

		int showvalue = TDS.showAll();

		if (showvalue == 11)
			System.out.println("\nShowAll Test ...Succesful\n");
		else
			System.out.println("\nShowAll Test **Failed\n");
	}

	/*** Underflow test of the stack ***/
	public void stack_underflow() {
		// Double condition test which is testing underflow
		// for empty stack and filled stack
		TDS.Reset();

		int UFvalue = 0;
		for (int i = 0; i < 15; i++) {
			UFvalue = TDS.pop();
		}

		if (UFvalue == -1762630107) {
			TDS.Init();
			for (int i = 0; i < 15; i++) {
				UFvalue = TDS.pop();
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
		TD.test_showAll();
		TD.stack_underflow();
		TD.test_pop();

	}

}
