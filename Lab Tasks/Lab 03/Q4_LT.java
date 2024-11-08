public class Q4_LT {
    public int arraySum(int[] arr,int n) {
        if (n == 0){
            return arr[0];
        } else {
            return arr[n] + arraySum(arr,n-1);
        }
    }
    public static void main(String[] args) {
        Q4_LT obj = new Q4_LT();
        int array[] = {1,2,3,7,9,22};
        int arrayLen = array.length-1;
        int arraySum = obj.arraySum(array,arrayLen);
        System.out.println("The sum of the arrays elements is " + arraySum);

    }
}

