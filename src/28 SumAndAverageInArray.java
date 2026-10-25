class SumAndAverageInArray {
    public static void main(String[] args) {
        /*int[] arr = {20,30,40,50};
        int sum = sum(arr);
        System.out.println("\nSUM OF ARRAY :"+sum);
        int avg = average(arr);
        System.out.println("\nAVERAGE OF ARRAY  :"+avg);
         */
        int[] array = ArrayUtility.inputArray();
        int sum = Sum(array);
        int avg = Average(array);

        System.out.println("sum of array :"+sum);
        System.out.println("average of array :"+avg);

    }
    public static int Sum(int[] array){
        int i = 0;
        int sum = 0;
        int var;
        while (i < array.length ){
            var = array[i];
            sum = sum + var;
            i++;
        }
        return sum;
    }
    public static int Average(int[] array){
        int digit = array.length;
        int i = 0;
        int var;
        int sum = 0;
        int avg = 0;
        while (i < array.length){
            var = array[i];
            sum = sum + var;
            avg = sum/digit;
            i++;
        }
        return avg;
    }


}
