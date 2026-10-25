import java.util.Scanner;

class Bitwise_Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("/n WELCOME TO ODD EVEN CALCULATOR....");
        System.out.print("ENTER YOUR NUMBER :");
        int num1 = input.nextInt();

       if ((num1 & 1) == 1){
           System.out.println("your number is odd");
       }else {
           System.out.println("your number is even");
       }



    }

}
