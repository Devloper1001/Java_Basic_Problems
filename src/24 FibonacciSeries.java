import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("PLEASE ENTER YOUR NUMBER :");
        int num = input.nextInt();
        fibonacci(num);

    }
    public static void fibonacci(int number){
        if (number < 0) return ;
        System.out.print("0 ");

        if (number == 0) return;
        System.out.print("1 ");

        int first = 0 , second = 1;
        while (first + second <= number){
            int third = first + second ;
            System.out.print(third+" ");
            first = second;
            second = third;
        }




    }
}
