/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
      
        

		System.out.println("Enter 2 numbers to create a range for your random number.");
		System.out.print("Please enter an integer: ");

        int num1 = sc.nextInt();

		System.out.println("Please enter another integer (bigger than the first): ");

		int num2 = sc.nextInt();

		System.out.println("Your range is " + num1 + " to " + num2 + ".");

		int numb1 = (int)(Math.random()*(num2-num1)+num1);
		int numb2 = (int)(Math.random()*(num2-num1)+num1);
		int numb3 = (int)(Math.random()*(num2-num1)+num1);
		int numb4 = (int)(Math.random()*(num2-num1)+num1);
		int numb5 = (int)(Math.random()*(num2-num1)+num1);
		System.out.println();
        System.out.println(numb1 + ", " + numb2 + ", " + numb3 + ", " + numb4 + ", " + numb5);

	}
}
