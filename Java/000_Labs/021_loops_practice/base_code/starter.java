/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		System.out.println("I have chosen an integer (x) from 1-1000.");
		System.out.println("Your goal is to guess that number.");
        int x = (int)(Math.random()*1001);
		Scanner sc = new Scanner (System.in);


		int y = sc.nextInt();


        while(y != x){

		if(y > x){
		System.out.println("Your guess is wrong!");
		System.out.println("x is lower than the number you chose.");
		}
        
        sc.nextInt();

		if(y < x){
			System.out.println("Your guess is wrong!");
			System.out.println("x is higher than the number you chose.");
		}

        sc.nextInt();

		if(y == x){
		    System.out.println("You are correct!");
		    System.out.print("Congratulations!");
			break;
		}			
		}
	}
}
