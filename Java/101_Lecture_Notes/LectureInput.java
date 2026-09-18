/*
    Lecture note example - Input!!
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        System.out.println("🇲🇽 Welcome to Tigran's Mexican restaurant! 🇲🇽");
        System.out.println("Menu:");

        System.out.print("1. chile y queso tamales - ");
        double item1 = 11.95;
        System.out.println(item1);

        System.out.print("2. choy riso tacos - ");
        double item2 = 9.25;
        System.out.println(item2);

        System.out.print("3. horchata - ");
        double item3 = 5.50;
        System.out.println(item3);

        Scanner sc = new Scanner(System.in);

        System.out.println("How many tamales would you like?");
        int item1quant = sc.nextInt();
        System.out.println("Item 1 total is: " + (item1*item1quant));

        System.out.println("How many tacos would you like?");
        int item2quant = sc.nextInt();
        System.out.println("Item 2 total is: " + (item2*item2quant));

        System.out.println("How many horchatas would you like?");
        int item3quant = sc.nextInt();
        System.out.println("Item 3 total is: " + (item3*item3quant));

        double grandtotal = (item1*item1quant) + (item2*item2quant) + (item3*item3quant);

        System.out.println("How much would you like to tip?");
        double tip = sc.nextDouble();
        tip = tip/100 * grandtotal;
        System.out.println("Your total is: " + (tip + grandtotal));

	}
}
