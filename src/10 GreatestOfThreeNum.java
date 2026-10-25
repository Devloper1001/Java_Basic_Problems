/* GREATEST OF THREE NUMBER

 */

import java.util.Scanner;

class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER YOUR THREE NUMBER.....");
        System.out.print("\nENTER YOUR FIRST NUMBER :");
        int num1 = input.nextInt();
        System.out.print("ENTER YOUR SECOND NUMBER :");
        int num2 = input.nextInt();
        System.out.print("ENTER YOUR THIRD NUMBER :");
        int num3 = input.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("\nFIRST NUMBER IS GREATEST");
        } else if (num2>num1 && num2>num3) {
            System.out.println("\nSECOND IS NUMBER GREATEST");

        }else {
            System.out.println("\nTHIRD NUMBER IS GREATEST");
        }

    }
}
