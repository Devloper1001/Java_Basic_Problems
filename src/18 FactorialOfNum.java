import java.util.Scanner;

class FactorialOfNum {
    public static void main(String[] args) {
        System.out.println("WELCOME");
        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE ENTER NUMBER :");
        int num = input.nextInt();
        System.out.println(FactorialOfNumber(num));
    }
    public static int FactorialOfNumber(int number){
        int i = 1;
        int mult = 1;
        while (i<=number){
            mult = i*mult;
            i++;
        }
        return mult;
    }
}
