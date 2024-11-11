import java.util.*;

public class Q5_HT {

    public static int[] sortZigZag(int[] a){

        for (int i = 0; i < a.length-1; i++){
            for (int j = 0; j < a.length-1; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        System.out.print("Sorted Array : [ ");
        for(int i: a){
            System.out.print(i+" ");
        }
        System.out.println("]");

        for (int i = 1; i < a.length-1; i+=2){
            int temp1 = a[i];
            a[i] = a[i+1];
            a[i+1] = temp1;
        }

        return a;
    }

    public static void main(String[] args) {
        int[] a = {4,3,8,91,32,1};
        int[] sortedZig = sortZigZag(a);

        System.out.print("Sorted Zig Zag Array : [ ");
        for(int i: sortedZig){
            System.out.print(i+" ");
        }
        System.out.println("]");
    }
}
