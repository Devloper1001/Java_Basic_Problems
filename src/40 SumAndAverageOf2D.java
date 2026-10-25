class SumAndAverageOf2D {
    public static void main(String[] args) {
        int[][] arr = ArrayUtility.input2DArray();
        int sum = sum(arr);
        System.out.println("sum of your array elements :"+sum);
        int avg = average(arr);
        System.out.println("Average of your array elements :"+avg);

    }
    public static int sum(int[][] array){
        int i = 0;
        int store = 0;
        while (i<array.length){
            int j = 0;
            while (j<array[i].length){
                store = array[i][j]+store;       // (store+=array[i][j]);
                j++;
            }
            i++;
        }
        return store;
    }
    public static int average(int[][] array){
        int i = 0;
        int store = 0;
        int count = 0;
        int Average = 0;
        while (i<array.length){
            int j = 0;
            while (j<array[i].length){
                store = array[i][j]+store;       // (store+=array[i][j]);
                j++;
                count++;
            }
            i++;
        }
        Average = store/count;
        return Average;
    }
}
