import java.util.Scanner;

class LCMOfTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO  CALCULATE LCM OF TWO NUMBER");
        System.out.println();
        System.out.print("PLEASE ENTER YOUR FIRST NUMBER :");
        int first = input.nextInt();
        System.out.print("PLEASE ENTER YOUR SECOND NUMBER :");
        int second = input.nextInt();
        int result = CalculateLCM(first,second);
        System.out.println(result);
    }
    public static int CalculateLCM(int number1 , int number2){
        int i = 1;
        int mult ;
        int div;
        while (i<=number2){
            mult = number1*i;
            if (mult%number2==0){
                return mult;
            }
            i++;

        }
        return 0;

    }
}
