import java.util.*;
public class Q1_HT {
    public static double calculateSum(double a[]){
        double sum = 0;
        for (int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        return sum;
    }

    public static double calaculateAverage(double sum, double[] a){
        double average = sum/(double) a.length;
        return average;
    }

    public static int[][] split(int[] a, int key){
        int index = -1;
        for (int i=0;i<a.length;i++){
            if(a[i]==key){
                index = i;
                break;
            }
        }
        if (index == -1){
            return null;
        } else {
            int[] splited1 = new int[index + 1];
            for (int i = 0; i < splited1.length; i++) {
                splited1[i] = a[i];
            }
            int[] splited2 = new int[a.length-splited1.length];
            for (int i = 0,j=index+1; i < splited2.length; i++,j++) {
                splited2[i] = a[j];
            }


            int[][] splited = new int[][]{splited1,splited2};
            return splited;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the key : ");
        int key = sc.nextInt();
        int[] array1 = {1,9,65,3,8};
        int[][] splited =split(array1,key);
        if (splited == null) {
            System.out.println("Key not found in array.");
        } else {
            System.out.print("Splited Array 1: [ ");
            for (int i : splited[0]) {
                System.out.print(i + " ");
            }
            System.out.println("]");

            System.out.print("Splited Array 2: [ ");
            for (int i : splited[1]) {
                System.out.print(i + " ");
            }
            System.out.println("]");
        }
    }
}

