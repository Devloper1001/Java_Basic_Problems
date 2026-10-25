class SumOfDiagonalElements {
    public static void main(String[] args) {
        int[][] array = ArrayUtility.input2DArray();
        long sum = SumOfDiagonals(array);
        System.out.println("Sum of your diagonals :" +sum);

    }public static long SumOfDiagonals(int[][] arr){
        long leftDiagonal = SumOfLeftDiagonals(arr);
        long rightDiagonal = SumOfRightDiagonals(arr);
        long sum = leftDiagonal+rightDiagonal;

        if (arr.length % 2 != 0){
            int centElm = arr.length/2;
            sum = sum - arr[centElm][centElm];
        }

        return sum;

    }public static long SumOfLeftDiagonals(int[][] arr){
        int i = 0;
        int sum = 0;
        while (i< arr.length){
            sum = arr[i][i] + sum;
            i++;
        }

        return sum;

    }public static long SumOfRightDiagonals(int[][] arr){
        int i = 0;
        int j = 0;int sum = 0;
        while (i< arr.length){
            int ind = arr.length -1 - i;
            sum = arr[i][ind] + sum;
            i++;
        }

        return sum;
    }
}