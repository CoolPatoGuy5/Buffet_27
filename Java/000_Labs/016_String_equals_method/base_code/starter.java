/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello there!");
        System.out.println("Would you like to be a Wizard, a Warrior, or a Rogue?");
        String x = sc.nextLine();    

		
		if(x.equals("Wizard")){
			System.out.println("You have chosen to be a Wizard!");
		}
		
		else if(x.equals("wizard")){
				System.out.println("You have chosen to be a Wizard!");
			}

		else if(x.equals("Warrior")){
			System.out.println("You have chosen to be a Warrior!");
			
		}

		else if(x.equals("warrior")){
				System.out.println("You have chosen to be a Warrior!");
			}

        else if(x.equals("Rogue")){
			System.out.println("You have chosen to be a Rogue!");
		}

		else if(x.equals("rogue")){
				System.out.println("You have chosen to be a Rogue!");
		}

		else{
			System.out.println("That is not an option. Please come again later.");
		}
	}
}