import java.util.Scanner;

class DeleteFromArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] arr = ArrayUtility.inputArray();

        System.out.println("Enter the number which you want to delete ");
        int numToDelete = input.nextInt();

        int[] array = newArr(arr,numToDelete);
        ArrayUtility.printArray(array);




    }
    public static int[] newArr(int[] arr ,int  numberToDelete){

        int occ = NumberOfOccurrenceInArray.occurrence(arr,numberToDelete);
        //System.out.println(occ);
        if (occ==0){
            return arr;
        }
        int newSize = arr.length - occ;
        //System.out.println(newSize);
        int[] newArr = new int[newSize];

        int i = 0;
        int j = 0;

        while (i<arr.length){
            if(arr[i] != numberToDelete){
                newArr[j] = arr[i];
                //System.out.println(newArr[j]);
                j++;
            }
            i++;
        }

        return newArr;
    }
}
