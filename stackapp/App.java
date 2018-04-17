
package stackapp;

import azizstack.Stack;
import java.util.Scanner;

public class App {

	public void Menu() {
		System.out.println("+***********************************************************************+");
		System.out.println("|	 		 Stack implemented with Linked List		|");
		System.out.println("|					MENU			 	|");
		System.out.println("+***********************************************************************+");
		Stack stack = new Stack();
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("Press 1 to Push");
			System.out.println("Press 2 to Pop");
			System.out.println("Press 3 to Peek");
			System.out.println("Press 4 to Show All");
			System.out.println("Press 0 to Exit\n");

			int userChoice = -1; 
			userChoice = scan.nextInt();

			switch (userChoice) {
			case (1):
				int value;
				System.out.println("Please enter the value to be pushed:");
				value = scan.nextInt();
				stack.push(value);
				System.out.println("Push succesful. Pushed " + value + "\n");
				break;

			case (2):
				int popvalue = stack.pop();
				if (popvalue == -1762630107)
					System.out.println("Popped failed. Stack is Empty!\n");
				else
					System.out.println("Popping succesful. Popped " + popvalue + "\n");
				break;

			case (3):
				int peekvalue = stack.peek();
				if (peekvalue == -1762630107)
					System.out.println("No element to peek. Stack is Empty!\n");
				else
					System.out.println("Peek value is: " + peekvalue + "\n");
				break;

			case (4):
				int probe = stack.peek();
				if (probe == -1762630107) {
					System.out.println("No elements to show. Stack is Empty!\n");
				} else {
					System.out.println("Elements in Stack are:");
					int list = -1;
					while (!stack.isEmpty()) {
						list = stack.pop();
						System.out.println(list);
					}
					System.out.println();
				}
				break;

			case (0):
				System.exit(0);

			default:
				System.out.println("Invalid choice! Please try again with a valid choice. Its not that hard :D \n");
				break;
			}
		}
	}

	public static void main(String[] args) {

		App app = new App();
		app.Menu();

	}
}
