import java.util.Scanner;

/* DETERMINE THE GIVEN NUMBER IS EVEN/ODD

 */
class Problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER :");
        int num = input.nextInt();

        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("Odd");
        }
    }

}
