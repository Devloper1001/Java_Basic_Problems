class MaxAndMinimumElement {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        long max = maximum(arr);
        long min = minimum(arr);
        System.out.println("MAXIMUM 0F YOUR ARRAY IS : "+max);
        System.out.println("MINIMUM 0F YOUR ARRAY IS : "+min);


    }
    public static long maximum(int[] arr){
        if (arr.length == 0){
            return 0;
        }
        int max = arr[0];
        int i = 1;
        while (i<arr.length){
            if (max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }
    public static long minimum(int[] arr){
        if (arr.length == 0){
            return 0;
        }
        int min = arr[0];
        int i = 1;
        while (i<arr.length){
            if (min > arr[i]){
                min = arr[i];
            }
            i++;
        }
        return min;
    }


}
