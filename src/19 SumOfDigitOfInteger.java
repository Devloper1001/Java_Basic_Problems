import java.util.Scanner;

class SumOfDigitOfInteger {
    public static void main(String[] args) {
        System.out.println("WELCOME");
        System.out.println();
        System.out.print("PLEASE ENTER YOUR NUMBER :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = SumOfDigits(num);
        System.out.println("SUM OF DIGITS :"+sum);
    }
    public static int SumOfDigits(int number){
        int sum = 0;
        int reminder;
        int division;
        while(number>0){
            /*reminder = number%10;
            sum = sum + reminder;
            number=number/10;
                                           // BOTH STATEMENTS ARE CORRECT
             */
            sum = sum + (number%10);
            number=number/10;
        }
        return sum;
    }
}
