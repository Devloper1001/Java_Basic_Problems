import java.util.Scanner;

class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = ArrayUtility.input2DArray();
        System.out.print("Enter the number which you want to search in array :");
        int num = input.nextInt();
        boolean isFind = search(arr,num);
        if (isFind){
            System.out.println("your element is found");
        }else {
            System.out.println("your element is not found");
        }

    }public static boolean search(int[][] array , int searchNum){
        int i = 0 ;
        while (i<array.length){
            int j = 0;
            while (j<array[i].length){
                if (array[i][j] == searchNum){
                    return true;
                }else {
                    j++;
                }
            }
            i++;
        }
        return false;

    }
}
