import java.util.Scanner;

class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER NUMBER :");
        int num = input.nextInt();
        int call = reverse(num);
        System.out.println("REVERSE OF YOUR NUMBER :"+call);
    }
    public static int reverse(int number){
        int newnum = 0;
        while (number>0){
            int digit = number%10;
            newnum = newnum * 10 + digit ;
            number = number/10;
        }
        return newnum;

    }
}
