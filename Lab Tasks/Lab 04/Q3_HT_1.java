import java.util.*;

public class Q3_HT_1 {

    public static void sort(int[] nums, int target) {
        Arrays.sort(nums);
        int[] combinations = new int[nums.length];
        combination(nums, target, 0, 0, combinations);
    }

    public static void combination(int[] nums,
               int total, int start, int combinationIndex, int[] combination) {

        if (total < 0) {
            return;
        }
        if (total == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < combinationIndex; i++) {
                sb.append(combination[i]);
                if (i < combinationIndex - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");

            System.out.println(sb.toString());
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (nums[i] > total) {
                break;
            }

            combination[combinationIndex] = nums[i];
            combination(nums, total - nums[i], i + 1,
                    combinationIndex + 1, combination);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,3,4,6,7};
        int total = 7;
        sort(nums,total);
    }
}
