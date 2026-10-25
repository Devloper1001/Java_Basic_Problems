import java.util.Scanner;

/* DETERMINE THE NUMBER NEGATIVE,POSITIVE OR ZERO

 */
class Problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO MY PROGRAM........");
        System.out.print("PLEASE ENTER YOUR NUMBER :");
        int num = input.nextInt();

        if(num<0){
            System.out.println("YOU ENTER A NEGATIVE NUMBER");
        } else if (num>0) {
            System.out.println("YOU ENTER A POSITIVE NUMBER");

        }else {
            System.out.println("YOU ENTER ZERO");
        }

    }
}