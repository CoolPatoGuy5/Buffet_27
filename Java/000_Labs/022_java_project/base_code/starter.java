/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
       System.out.println("Welcome to our casino.");
	   System.out.println("If 2 numbers match, double your money. If 3 numbers match, triple your money.");
	   System.out.println("Would you like to gamble? It's very fun and worthwhile. (Yes/yes/Y/y)");
	   System.out.println("If at any point you want to stop gambling your life away, say No/no/N/n");
	   Scanner sc = new Scanner(System.in);
	   String gamble = sc.nextLine();
       int money = 100;
	   while(money > 0){
	   if((gamble.equals("Yes")) || (gamble.equals("yes")) || (gamble.equals("Y")) || (gamble.equals("y"))){
       System.out.println("Would you like to wager?");
	   System.out.println("You have $" + money + " left");
	   
	   int wager1 = sc.nextInt();
	   int wager2 = 
	   int x = (int)(Math.random()*10);
	   int y = (int)(Math.random()*10);
	   int z = (int)(Math.random()*10);
	   System.out.println("| " + x + " | " + y + " | " + z + " |");
	   if((x == y) || (y == z) || (x == z)){
	   wager = wager * 2;
	   System.out.println("Congratulations! You doubled your money!");
	   System.out.println("Would you like to gamble again?");
	   String gamble2 = sc.nextLine();
	   }
	   else if(x != y || x != z || y != z){
		wager = 
	   }
	   else if((gamble.equals("No")) || (gamble.equals("no")) || (gamble.equals("N")) || (gamble.equals("n"))){
		System.out.println("Come back soon!");
		System.out.println("Or we will find you!");
		System.out.print(":3");
		break;
	   }
	   }




	   }
}
}