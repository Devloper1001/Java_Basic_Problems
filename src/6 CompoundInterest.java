/*                        PROGRAM :-6

CREATE A PROGRAM TO CALCULATE COMPOUND INTEREST

 */

import java.util.Scanner;

class Problem6 {

    //P(1+R/100)^T-P

    public static void main(String[] args) {
        System.out.println("CALCULATING COMPOUND INTEREST...");
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER TOTAL PRINCIPAL :");
        double P = input.nextDouble();
        System.out.print("ENTER ENTER RATE :");
        double R = input.nextDouble();
        System.out.print("ENTER TOTAL TIME PERIOD :");
        double T = input.nextDouble();

        //P(1+R/100)^T-P

        double amount = P * Math.pow((1 + R / 100.0), T);
        double compoundInterest = amount - P ;



        System.out.println("YOUR TOTAL AMOUNT ="+amount);
        System.out.println("TOTAL COMPOUND INTEREST ="+compoundInterest);





    }

}
