class ReverseAnArray {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        int[] newArray = ReverseTheArray(array);
        ArrayUtility.printArray(newArray);


    }
    public static int[] ReverseTheArray(int[] arr){
        int i = 0;
        int length = arr.length;
        int[] newArr = new int[length];
        while (i< arr.length){
            newArr[i] = arr[length-1];
            length--;
            i++;
        }
        return newArr;
    }




    /*public static void reverse(int[] arr){
        int i = 0;
        while (i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1 ) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }

     */
}
