import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO LEAP YEAR CALCULATOR.....");
        System.out.print("ENTER YOUR YEAR :");
        int year = input.nextInt();

        if(year%4==0){
            System.out.println("YEAR ENTER BY YOU IS AN LEAP YEAR ");
        }else {
            System.out.println("YEAR ENTER BY YOU IS NOT AN LEAP YEAR");
        }



        /*if (year%4==0){
            System.out.println("YEAR ENTER BY YOU IS AN LEAP YEAR ");
        } else if (year%400==0) {
            System.out.println("YEAR ENTER BY YOU IS AN LEAP YEAR ");
        } else if ((year%4==0 && year%100!=0) && year%400==0 ) {
            System.out.println("YEAR ENTER BY YOU IS AN LEAP YEAR ");

        }else {
            System.out.println("YEAR ENTER BY YOU IS AN LEAP YEAR ");
        }


         */
    }
}
