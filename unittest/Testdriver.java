package unittest;

import azizstack.Stack;

public class Testdriver {
	
Stack ttt = new Stack();


	public void test_push() {
		//Arrange
		ttt.Reset();
		int testvalue = 145;

		//Act
		int pushvalue = ttt.push(testvalue);

		//Assert
		if (pushvalue == testvalue)
		System.out.println("\nPush Test ...Succesful\n");
		else
		System.out.println("\nPush Test **Failed**\n");

		}



	public void test_pop() {

	ttt.Reset();
	ttt.Init();

	int popvalue = ttt.pop();

	if (popvalue == 110) {
		popvalue = ttt.pop();
		if (popvalue == 99)
			System.out.println("\nPop Test ...Succesful\n");
		else
			System.out.println("\nPop Test **Failed**\n");
	}

        }



	public void test_peek() {
	
	ttt.Reset();
	ttt.Init();

	int peekvalue = ttt.peek();

	if(peekvalue == 110)
		System.out.println("\nPeek Test ...Succesful\n");
	else
		System.out.println("\nPeek Test **Failed\n");

	}
	


	public static void main(String[] args) {

	Testdriver TD = new Testdriver();

	System.out.println("\nSTARTING TEST of STACK Implementation \n");
	
	TD.test_push();
	TD.test_pop();
	TD.test_peek();

	}

}


