class MergeTwoShortedArray {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2 = ArrayUtility.inputArray();
        int[] mergedArr = merge(arr1,arr2);
        ArrayUtility.printArray(mergedArr);

    }
    public static int[] merge(int[] arr1 , int[] arr2){
        int[] newArray = new int[arr1.length+arr2.length];
        int i = 0 , j = 0 , k = 0;                                     //arr1 = 1 3 5 7 9
                                                                      // arr2 = 2 4 6 8 10
        while (i<arr1.length || j < arr2.length ){
            if (j == arr2.length || ( i < arr1.length && arr1[i] < arr2[j])){
                newArray[k] = arr1[i];
                i++;
                k++;
            } else{
                newArray[k] = arr2[j];
                j++;
                k++;
            }
        }
        return newArray ;
    }
}
