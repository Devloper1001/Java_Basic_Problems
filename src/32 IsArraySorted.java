class IsArraySorted {
    public static void main(String[] args) {
        int[] array = ArrayUtility.inputArray();
        System.out.println("ARRAY ELEMENTS ENTERED BY YOU");
        int i = 0;
        while (i< array.length){
            System.out.print(array[i]+" ");
            i++;
        }
        if (isSorted(array) || SortedOrNot(array)){
            System.out.println("\nYOUR ARRAY IS SHORTED ");
        }else{
            System.out.println("\nYOUR ARRAY IS NOT SHORTED ");
        }


    }
    public static boolean isSorted(int[] arr){
        int i =1;
        int j = 0;
        int stor = 0;
        while(i<arr.length){
            if(arr[j] < arr[i]){             // EQUALITY STATEMENTS ARE MISSING
               // stor = arr[i];
            }else {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
    public static boolean SortedOrNot(int[] arr){
        int i = 1;
        int j = 0;
        while (i<arr.length){
            if (arr[j] > arr[i]){

            }else {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}
