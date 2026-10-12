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
			System.out.println("That is not an option.");
			
		}

		String temp = x;
		System.out.println("What would you like to name your character?");
		String name = sc.nextLine();
		System.out.println("You have 20 points to spend on your strengths, " + name + ".");
		System.out.println("How many points would you like to spend on strength? (strength = buff & able to carry heavy items)");
		int y = sc.nextInt();
		int pts = 20;
	

		if(y > pts || y > 10){
			System.out.println("You cannot spend that many points.");
			System.out.println("Please enter a better value.");
			y = sc.nextInt();
			
		}
		int pts2 = 20 - y;

	
		System.out.println("You have " + pts2 + " points left.");

		System.out.println("How many points would you like to spend on dexterity? (dexterity = agile & moves quick)");
		int w = sc.nextInt();
	
		
		if(w > pts2 || w > 10){
			System.out.println("You cannot spend that many points.");
			System.out.println("Please enter a better value.");
            w = sc.nextInt();
			
		}
       int pts3 = pts2 - w;

        
		System.out.println("You have " + pts3 + " points left.");

		System.out.println("How many points would you like to spend on intelligence? (Intelligence = better at magic spells)");
		int u = sc.nextInt();

		if(u > pts3 || u > 10){
		System.out.println("You cannot spend that many points.");
		System.out.println("Please enter a better value.");
        u = sc.nextInt();

		}
		int pts4 = pts3 - u;
		System.out.println("You have " + pts4 + " points left.");

       System.out.println("How many points would you like to spend on charisma? (Charisma = how personable)");
	   int v = sc.nextInt();

	   if(v > pts4 || v > 10){
		System.out.println("You cannot spend that many points.");
        System.out.println("Please enter a better value.");
        v = sc.nextInt();
	   }
	   int pts5 = pts4 - v;
	   System.out.println("You have " + pts5 + " points left");
	   System.out.println("Stats: ");
	   if(pts5 > 0){
       System.out.println("You have " + pts5 + " excess points.");
	   }
	   System.out.println("Your are a " + x + ".");
	   System.out.println("Your characters name is " + name + ".");
	   System.out.println("You have " + y + " points on strength.");
	   System.out.println("You have " + w + " points on dexterity.");
	   System.out.println("You have " + u + " points on intelligence.");
	   System.out.println("You have " + v + " points on charisma.");
       System.out.println("Good luck on your quest, " + name + "!");
	   if(name.equals("Pato")){
	 System.out.println("We have decided to give you godly powers because of the name you have chosen.");
	 System.out.println("Strength: 1000000");
	 System.out.println("Dexterity: 1000000");
	 System.out.println("Intelligence: 1000000");
	 System.out.println("Charisma: 1000000");
	 System.out.println("Now go, wreak havoc across these lands.");
	 System.out.println("🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆🦆");
	   }


	}
}
