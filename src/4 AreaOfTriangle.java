/*                   PROBLEM :- 4

// CREATE A PROGRAM TO CALCULATE AREA OF TRIANGLE ?


 */

import java.util.Scanner;

class Problem4 {
    public static void main(String[] args) {
        System.out.println("area of triangle....");
        Scanner input = new Scanner (System.in);
        System.out.print("PLEAS ENTER BREADTH OF TRIANGLE :");
        int x = input.nextInt();
        System.out.print("NOW ENTER HEIGHT OF TRIANGLE :");
        int y = input.nextInt();
          /*
        int z = 1/2;
        int a = x*y;
        int b = z*a;*/
        int c = x*y;
        float d = 0.5f;
        System.out.println("AREA OF TRIANGLE ="+ d*c );

    }

}
