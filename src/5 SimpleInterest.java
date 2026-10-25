/*                   PROBLEM :- 5

  CREATE A PROGRAM TO CALCULATE THE SIMPLE INTEREST ?
*/

import java.util.Scanner;

class Problem5 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("SIMPLE INTEREST .....");

        System.out.print("\nENTER TOTAL AMOUNT :");
        double principle = input.nextDouble();
        System.out.print("NOW ENTER RATE :");
        double rate = input.nextDouble();
        System.out.print("ENTER TOTAL TIME :");
        double time = input.nextDouble();

       /* double a = x*y*z;
        double b = a/100;

        */

        double cal =(principle * rate * time)/100;
        System.out.println("TOTAL :" + cal);

    }

}