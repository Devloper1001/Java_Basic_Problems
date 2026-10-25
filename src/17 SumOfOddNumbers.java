import java.util.Scanner;

class SumOfOddNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome\n");
        System.out.println("ENTER YOUR NUMBER :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("sum = "+SumOfOddNumber(num));
    }
    public static int SumOfOddNumber(int number){
        int i = 1;
        int cal ;
        int sum =0;
        while (i<=number){
            cal = i%2;
            if (cal!=0){
                System.out.println(i);
                sum = i + sum;
            }
        i++;

        }
        return sum;

    }
}
