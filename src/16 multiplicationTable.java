import java.util.Scanner;

class multiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME");
        System.out.println("ENTER YOUR NUMBER :");
        int num = input.nextInt();
        int multiplication;
        int i = 1;
        MultiplicationTable(num);
// SIMPLE TABLE PRINT

        /*while(i<=10){
           multiplication = num * i;
            i++;
            System.out.println(multiplication);



        }

         */
//PRINT MULTIPLICATION TABLE LIKE 2*1=2

        /*while (i<=10){
            multiplication = num*i;
            System.out.println("2*"+i+"="+multiplication);
            i++;
        }

         */
    }
//PRINT TABLE USING FUNCTION

    public static void MultiplicationTable(int num){
        int i = 1;
        int multiplication;
        while (i<=10){
            multiplication = num*i;
            System.out.println("2*"+i+"="+multiplication);
            i++;
        }
    }


}
