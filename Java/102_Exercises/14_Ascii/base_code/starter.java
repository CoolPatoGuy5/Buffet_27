/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		System.out.println("Please choose an exhibit:");
		System.out.println("1. weapons");
		System.out.println("2. food");
		System.out.println("3. animals");
      Scanner sc = new Scanner(System.in);
	  String exhibit = sc.nextLine();
	  String section = sc.nextLine();

	  if(exhibit.equals("weapons")){
		System.out.println("Please pick a weapon to view");
		System.out.println("1. sword");
		System.out.println("2. bow & arrow");
      if(section.equals("sword")){
	 System.out.println("                    /¯¯\\");
	 System.out.println("                   \\__/");
	 System.out.println("                     ||");
	 System.out.println("                     ||");
	 System.out.println("                    |  |");
	 System.out.println("                    |  |");
	 System.out.println("                    |  |");
	 System.out.println("                    |  |");
	 System.out.println("                    |  |");
	 System.out.println("                    |  |");
	 System.out.println("                 .--.----.--.");
	 System.out.println("              .-----\\__/-----.");
	 System.out.println("      ___---¯¯////¯¯|\\/|¯¯\\\\\\\\¯¯---___");
	 System.out.println("   /¯¯ __O_--////   |  |   \\\\\\\\--_O__ ¯¯\\");
	 System.out.println("  | O?¯      ¯¯¯    |  |    ¯¯¯      ¯?O | ");
	 System.out.println("  |  '    _.-.      |  |      .-._    '  |");
	 System.out.println("  |O|    ?..?      ./  \\.      ?..?    |O|");
	 System.out.println("  | |     '?. .-.  | /\\ |  .-. .?'     | |");
	 System.out.println("  | ---__  ¯?__?  /|\\¯¯/|\\  ?__?¯  __--- |");
	 System.out.println(" |O     \\         ||\\/ |         /     O|");
	 System.out.println(" |       \\  /¯?_  ||   |  _?¯\\  /       |");
	 System.out.println("  |       / /    - ||   | -    \\ \\       |");
	 System.out.println("  |O   __/  | __   ||   |   __ |  \\__   O|");
	 System.out.println("  | ---     |/  -_/||   |\\_-  \\|     --- | ");
	 System.out.println(" |O|            \\ ||   | /            |O|  ");
     System.out.println(" \\ '              ||   |        ^~DLF ' /");
	 System.out.println(" \\O\\    _-¯?.    ||   |    .?¯-_    /O/");
	 System.out.println("  \\ \\  /  /¯¯¯?  ||   |  ?¯¯¯\\  \\  / /");
	 System.out.println("   \\O\\/   |      ||   |      |   \\/O/");
	 System.out.println("     \\     |      ||   |      |     /");
	 System.out.println("      \\__  |      ||   |      |  __/");
	 System.out.println("          '._O'.__/||   |\\__.'O_.'");
	 System.out.println("             '._ O ||   | O _.'");
	 System.out.println("                '._||   |_.'");
	 System.out.println("                   ||   |");
	 System.out.println("                   ||   |");
	 System.out.println("                   | \\/ |");
	 System.out.println("                   |  | |");
	 System.out.println("                   \\ |/");
	 System.out.print("                      \\/");



	  }
	  else if(section.equals("bow & arrow")){
     System.out.println("       (");
	 System.out.println("       \\");
	 System.out.println("         )");
	 System.out.println("  ##--------->");
	 System.out.println("         )");
	 System.out.println("        /");
	 System.out.print("         (");
  


	  }
	  }

	  else if(exhibit.equals("food")){
		System.out.println("Please pick a food piece.");
		System.out.println("1. ice cream");
		System.out.println("2. grapes");
      if(section.equals("ice cream")){

		System.out.println("            _.-.");
		System.out.println("          ,'/ //\\");
		System.out.println("          /// // /)");
		System.out.println("         /// // //|");
		System.out.println("        /// // ///");
		System.out.println("       /// // ///");
		System.out.println("      (`: // ///");
		System.out.println("       `;`: ///");
		System.out.println("       / /:`:/");
		System.out.println("      / /  `'");
		System.out.println("     / /");
		System.out.println("    (_/ ");
  

	  }
      else if(section.equals("grapes")){
System.out.println("   /");
System.out.println(" ()()");
System.out.println("()()()");
System.out.println(" ()()");
System.out.println("  ()");

	  }

	  }
      
	  else if(exhibit.equals("animals")){
     System.out.println("Please pick an animal to view.");
	 System.out.println("1. Duck");
	 System.out.println("2. Dog ");
if(section.equals("Duck")){
	System.out.println("  __");
	System.out.println("<(o )___");
	System.out.println(" ( ._> /");
	System.out.println("  `---'  ");
}

else if(section.equals("Dog")){

	System.out.println("       __");
	System.out.println("  (___()'`;");
	System.out.println("  /,____/`");
	System.out.println("  \\\\ \\\\");
	    
}

	  }

	  else{
     System.out.println("SECURITY! GET THEM OUT OF HERE!");
	  }
	  

		
		
	}
}
