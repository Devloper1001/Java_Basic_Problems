/*                            PROBLEM :- 7
CREATE A PROGRAM TO CONVERT FAHRENHEIT TO DEGREE CELSIUS

 */


import java.util.Scanner;

class Problem7 {
    public static void main(String[] args) {

        //C = (F-32)5/9
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR VALUE WHICH YOU WANTS TO CONVERT INTO CELSIUS :");
        double F = input.nextDouble();

        double celsius = (F-32)*5/9;

        System.out.println("YOUR VALUE CONVERTED INTO CELSIUS :" +celsius);
    }
}
