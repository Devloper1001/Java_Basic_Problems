import java.util.Scanner;

class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO GCD CALCULATOR");
        System.out.println();
        System.out.print("PLEASE ENTER YOUR FIRST NUMBER :");
        int first = input.nextInt();
        System.out.print("PLEASE ENTER YOUR SECOND NUMBER :");
        int second = input.nextInt();
        int result = greatestCommonDivisor(first,second);
        System.out.println("YOUR GREATEST COMMON DIVISOR IS :"+result);
    }


    public static int greatestCommonDivisor(int first , int second){
        int gcd = 1;
        int i = 2;
        int callMethod2 = least(first,second);
        while(i<=callMethod2){
            if (first%i==0 && second%i==0){
                gcd = i;
            }
            i++;
        }

        return gcd;
    }


    public static int least(int num1 , int num2){
        if (num1<num2){
            return num1;
        }else{

            return num2;
        }
    }
}
