/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Box star");
		System.out.println("Please enter an integer for the box width.");
		int width = sc.nextInt();
		System.out.println("Please enter an integer for the box height.");
		int height = sc.nextInt();

		int count = 0;
		while(count != height){

			int y = 0;
		while(width != y){

			System.out.print("*");
			y++;
			
		}
		System.out.println();
		count++;
		}

	}
}
