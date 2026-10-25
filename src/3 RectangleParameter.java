/*                        PROBLEM :- 3

//WRITE A PROGRAM TO CALCULATE PARAMETER OF A RECTANGLE

 */
import java.util.Scanner;

class Probleam3{
    public static void main(String[] args) {
       // System.out.println("Rectangle Parameter Calculation Start..... ");
        Scanner input = new Scanner(System.in);
       /* System.out.print("PLEAS ENTER THE LENGTH OF RECTANGLE :");
        int x = input.nextInt();
        System.out.print(",NOW ENTER THE BREADTH OF RECTANGLE :");
        int y = input.nextInt();
        int z = 2*(x+y);
        System.out.println("AREA OF RECTANGLE = " +z);

        */

        System.out.println("WELCOME TO PARAMETER CALCULATOR .....");
        System.out.println("\n\nPLEAS ENTER ALL FOUR SIDES OF RECTANGLE :");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();

        double area = a+b+c+d;

        System.out.print("RESULT : "+ area);
    }

}
