class IsShorted {
    public static void main(String[] args) {
        int [] arr = ArrayUtility.inputArray();
        if (increasing(arr) || (decreasing(arr))){
            System.out.println("your array is shorted ");
        }else {
            System.out.println("array is not shorted");
        }
    }
    public static boolean increasing(int [] arr){
        int i = 1;
        while(i< arr.length){
            if (arr[i-1]>arr[i] && arr[i-1]!=arr[i]){
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean decreasing(int [] arr){
        int i = 1;
        while(i< arr.length){
            if (arr[i-1]<arr[i] && arr[i-1]!=arr[i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
