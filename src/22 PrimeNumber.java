import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO PRIME NUMBER CHECKER");
        System.out.println();
        System.out.print("PLEASE ENTER YOUR NUMBER :");
        int num = input.nextInt();
        boolean isprime = isprime(num);

        if (isprime){
            System.out.println("NUMBER IS PRIME ");
        } else {
            System.out.println("NUMBER IS NOT PRIME");
        }


        /*int i = 2;
        while (i<=number){
            if (i<number && number%i==0){
                System.out.println("number is not prime");
                break;

            } else if (i==number && number%i == 0) {
                System.out.println("number is prime ");
                break;
            }
            i++;

        }

         */
    }
    public static boolean isprime(int number){
        int i = 2;
        while (i<number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;

    }
    
}
