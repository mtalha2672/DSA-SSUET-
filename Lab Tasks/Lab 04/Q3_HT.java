import java.util.*;

public class Q3_HT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combinations = 0;
        int[] array1 = {6,7,32,65,30,2};
        System.out.print("Enter the target number : ");
        int target = sc.nextInt();
        boolean contains = false;

        for (int i: array1){
            if (i == target){
                contains = true;
                break;
            }
        }

        if (contains){
            int k = 1;
            int[] used = new int[array1.length];

            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1.length; j++) {
                    if (array1[i] + array1[j] == target) {
                        if (array1[i] == 0 || array1[j] == 0){
                            continue;
                        }
                        System.out.println("Combination "+k+": "+array1[i]+" + "+array1[j]+" = "+target);
                        combinations = combinations + 1;
                        array1[j] = 0;
                        k++;
                    }
                }
            }

            if (combinations == 0){
                System.out.println("No combinations found");
            }
        } else {
            System.out.println("Target is not in the array (Invalid)");
        }


    }
}
