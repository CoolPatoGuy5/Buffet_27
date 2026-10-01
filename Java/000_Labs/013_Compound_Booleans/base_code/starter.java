/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt();		
		int y = sc.nextInt();
		int z = sc.nextInt();

		if(x > y){
        if(x > z){
			System.out.println("The largest number is: " + x);
		}
		}
		else if(y > x){
			if(y > z){
				System.out.println("The largest number is: " + y);
			}
		}
		else if(z > x){
              if(z > y){
				System.out.println("The largest number is: " + z);
				}
		}
		
	}
}
