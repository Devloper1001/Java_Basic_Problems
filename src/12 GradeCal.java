import java.util.Scanner;

class GradeCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWELCOME ........ HERE IS YOUR GRADES BASED ON YOUR MARKS");
        System.out.print("\nPLEASE ENTER YOUR MARKS :");
        int marks = input.nextInt();

        if(marks>=90){
            System.out.println("GRADE A");
        } else if (marks>=75 ) {
            System.out.println("GRADE B");
        } else if (marks>=60 ) {
            System.out.println("GRADE C");
        } else if (marks>=30 ){
            System.out.println("GRADE D");
        }else{
            System.out.println("GRADE F");
        }
    }
}
