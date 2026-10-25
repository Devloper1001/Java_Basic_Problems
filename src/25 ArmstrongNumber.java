import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER :");
        int num = input.nextInt();
        boolean result = isArmstrong(num);
        //System.out.println("Final number"+result);
        if (result){
            System.out.println();
            System.out.println("YOUR NUMBER IS ARMSTRONG");
        }else {
            System.out.println();
            System.out.println("YOUR NUMBER IS NOT ARMSTRONG");
        }
    }
    public static boolean isArmstrong(int number){
        int i;
        int result1 = 0;
        int result;
        int addResult;
        int lastDigit;
        int numberCopy = number;
        while (number>0){
            lastDigit = number%10;
            //System.out.println("last digit"+lastDigit);
            number/=10;
            result = pow(lastDigit,numberOfDigits(numberCopy));
            result1 = result1+result;
            //System.out.println("Final number"+ result1);


        }
        return result1 == numberCopy;

    }
    public static int pow(int num1, int power) {
        int result = 1;
        int i = power;
        while (i>0) {
            result *=num1;
            i--;
        }
        //System.out.println("POWER :"+result);
        return result;
    }

    public static int numberOfDigits(int number){
        int numberOfDigits = 0;
        int i = 0;
        while (number>0){
            i++;
            numberOfDigits = i;
            number/=10;
        }
        //1System.out.println("Number of digits "+numberOfDigits);
        return numberOfDigits;
    }
}
