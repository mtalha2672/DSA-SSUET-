public class Q4_LT {
    public static void main(String[] args) {
        int countEven = 0;
        int countOdd = 0;

        int[] array1 = {1,2,3,4,5};
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("The array has " + countEven +
                " even numbers and "+countOdd + " odd numbers");
    }
}
