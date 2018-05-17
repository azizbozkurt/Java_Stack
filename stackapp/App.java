
package stackapp;

import azizstack.Stack;

import java.util.InputMismatchException;
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
			try {
				userChoice = scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Dont try to hack the code! Invalid choice! Please choose options 0-4.");
				break;
			}
			

			switch (userChoice) {
			case (1):
				char value;
				System.out.println("Please enter the value to be pushed:");
				value = scan.next().charAt(0);
				stack.push(value);
				System.out.println("Push succesful. Pushed " + value + "\n");
				break;

			case (2):
				try {
					char popvalue = stack.pop();
					System.out.println("Popping succesful. Popped " + popvalue + "\n");
				} catch (NullPointerException e) {
					System.out.println("No elements to Pop. Stack is Empty!\n");
				}
				break;

			case (3):
				try {
					char peekvalue = stack.peek();
					System.out.println("Peek value is: " + peekvalue + "\n");
				} catch (NullPointerException e) {
					System.out.println("No element to Peek. Stack is Empty!\n");
				}
				break;

			case (4):
				try {
					char probe = stack.peek();
					System.out.println("Elements in Stack are:");
					char list = ' ';
					while (true) {
						list = stack.pop();
						System.out.println(list);
					}
				} catch (NullPointerException e) {
					System.out.println("No elements left to Show. Stack is Empty!\n");
				}
				System.out.println();
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
