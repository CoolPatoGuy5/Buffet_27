/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

       Scanner sc = new Scanner(System.in);
	   System.out.println("What would you like your name to be?");
	   String name = sc.nextLine();
	   System.out.println("How many times would you like to print your name?");
	   int x = sc.nextInt();
       int y = 0;
       while(5 > 4.99){
       if (y == x){
		break;
	   }
	   System.out.println(name);
	   y = y + 1;
	   }


		
	}
}
