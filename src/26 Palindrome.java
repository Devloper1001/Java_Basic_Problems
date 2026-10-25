import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("WELCOME TO PALINDROME CHECKER PROGRAM..... ");
        System.out.println();
        System.out.print("PLEASE ENTER YOUR NUMBER :");
        int num = input.nextInt();
        if (reverse(num)){
            System.out.println();
            System.out.println("YOUR NUMBER IS PALINDROME ");
        }else {
            System.out.println();
            System.out.println("YOUR NUMBER IS NOT PALINDROME");
        }

    }

    public static boolean reverse(int number){
        int mult = 0 ;
        int numberCopy = number;
        while (number>0){
            int mode = number%10;
            mult = mult * 10 + mode;
            number/=10;
            //System.out.println("reverse number"+mult);
        }
        return numberCopy == mult;
    }
}
