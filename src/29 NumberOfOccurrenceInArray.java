import java.util.Scanner;

class NumberOfOccurrenceInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = ArrayUtility.inputArray();
        System.out.print("ENTER YOUR NUMBER WHICH YOU WANT TO CHECK :");
        int num = input.nextInt();
        int methodCall = occurrence(array,num);
        System.out.println("YOUR NUMBER IS OCCUR "+methodCall+" TIMES");



    }
    public static int occurrence(int[] array , int number){
        int numCopy = number;
        int i = 0;
        int count = 0;
        while (i < array.length){
            if (array[i] == numCopy){
                count++;

            }

            i++;
        }
        return count;
    }
}
