public class Q1_LT {
    public static void main(String[] args) {
        int[] array1 = {5,2,3,4};
        int[] array2 = {0,6,7,8};
        int looptimes = 0;
        int temp = 0;

        if (array1.length >= array2.length) {
            looptimes = array2.length;
        } else {
            looptimes = array1.length;
        }

        for (int i = 0; i < looptimes; i++) {
            temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        System.out.print("[ ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("]");
        System.out.print("[ ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("]");
    }
}
