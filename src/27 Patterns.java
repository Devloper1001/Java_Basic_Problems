import java.util.Scanner;

class Patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("WELCOME TO PATTERN CREATOR PROGRAM,............,");
        System.out.println();
        System.out.print("PLEASE ENTER NUMBER OF ROWS :");
        int numberOfRows = input.nextInt();
        //pattern1(numberOfRows);
        //System.out.println();
        //pattern2(numberOfRows);
        //System.out.println();
        pattern3(numberOfRows);

    }
    public static void pattern1(int number){
        System.out.println("HERE IS THE RIGHT HALF PYRAMID");
        int i = 0;
        while (i<number){
            System.out.print("*");
            int num = 0;
            while (num<i){
                System.out.print(" *");
                num++;
            }
            i++;
            System.out.println();
        }
    }
    public static void pattern2(int number){
        System.out.println("HERE IS THE REVERSE RIGHT HALF PYRAMID");
        int i = number;
        while (i > 0){
            int num = 0;
            while (num < i) {
                System.out.print("* ");
                num++;
            }

            i--;
            System.out.println();
        }
    }
    public static void pattern3(int number){
        int i = 1;
        while (i > number){
            System.out.print(" ");
            i--;
            int num = 0;
            while (num < i){
                System.out.print("*");
                num++;
            }
        }
    }
}
