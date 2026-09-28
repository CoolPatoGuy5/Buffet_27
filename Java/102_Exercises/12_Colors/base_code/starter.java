/*
 *	Author: random guy in existence that likes patos
 *  Date: 
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int color1 = (int)(Math.random()*256);
        int color2 = (int)(Math.random()*256);
        int color3 = (int)(Math.random()*256);
         getColor(color1,color2,color3);
       
        int ccolor1 = 255-color1;
        int ccolor2 = 255-color2;
        int ccolor3 = 255-color3;
        getColor(ccolor1,ccolor2,ccolor3);

        getColor(color1,color2,color3);

		// Call getColor(#, #, #);
	}

	public static void getColor(int red, int green, int blue){
        String startColor = "\u001B[48;2;" + red + ";" + green + ";" + blue + "m";
        String resetColor = "\u001B[0m";
        String swatch = startColor + "                    " + resetColor;
        System.out.println(swatch);
        
    }
}
