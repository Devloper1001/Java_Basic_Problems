import java.util.Arrays;

class PalindromeOrNot {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int [] reverse = ReverseAnArray.ReverseTheArray(arr);
        if(Arrays.equals(arr,reverse)){
            System.out.println("yes it is palindrome");
        }else {
            System.out.println("it is not palindrome");
        }
        boolean isPalin = palindrome(arr);
        if (isPalin){
            System.out.println("your array is palindrome");
        }else{
            System.out.println("your array is not palindrom");
        }
    }
    public static boolean palindrome(int[] arr){
        int i = 0;
        while (i<arr.length/2){
            if (arr[i] != arr[(arr.length -1) - i]){
                return false;
            }
            i++;
        }
        return true;
    }
       // int[] reverseArray = ReverseAnArray.ReverseTheArray(arr);
        /*int i = 0,j = 0;
        int[] arrayCopy = new int[arr.length];
        while (i< arr.length){
            arrayCopy[j] = reverseArray[i];
            System.out.println(arrayCopy[j]);
            i++;
            j++;
        }


        int i = 0,j = 0;
        int[] arrayCopy = new int[arr.length];
        while (i< arr.length){
            arrayCopy[j] = arr[i];
            System.out.println(arrayCopy[j]);
            i++;
            j++;
        }



        if (arrayCopy == reverseArray){
            return true;
        }


        //return false;


    }

         */



}
