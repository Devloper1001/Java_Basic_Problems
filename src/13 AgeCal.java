import java.util.Scanner;

class AgeCal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPLEASE ENTER YOUR AGE :");
        int age = input.nextInt();

        if(age>=65){
            System.out.println("YOU ARE A SENIOR CITIZEN");
        } else if (age>=20) {
            System.out.println("YOU ARE ADULT");
        } else if (age>=13) {
            System.out.println("YOU ARE A TEENAGER ");
        }else {
            System.out.println("YOU ARE A CHILDz");
        }


    }
}
