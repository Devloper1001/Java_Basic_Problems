class NewReverseClass {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        reverse(array);
        ArrayUtility.printArray(array);
    }
    public static void reverse(int[] arr){
        int i = 0;
        while (i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1 ) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }

}
