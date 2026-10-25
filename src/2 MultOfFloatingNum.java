import java.util.Scanner;

/*                       PROBLEM :- 2

 CREATE A PROGRAM TO FIND PRODUCT OF TWO POINT FLOATING NUMBERS


 */
class Problem2 {
    public static void main(String[] args) {
        /* float A  = (float)2.5;
        float B = 2.5f;
        float X = 5;
        float Y = 6;

        System.out.println(A*B);
        System.out.println(X*Y);

        */

        Scanner input = new Scanner(System.in);
        System.out.print("ENTER YOUR FIRST NUMBER :");
        double first = input.nextDouble();
        System.out.print("ENTER YOUR SECOND NUMBER :");
        double second = input.nextDouble();

        double mult = first * second ;

        System.out.println("\nYOUR RESULT :\t" + mult);



    }
}
