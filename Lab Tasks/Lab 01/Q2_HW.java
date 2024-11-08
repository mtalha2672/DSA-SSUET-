import java.util.Scanner;

public class Q2_HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid number (+ve) : ");
        int nums = sc.nextInt();
        Integer Num = nums;  // Auto Boxing
        String Nums = Integer.toString(Num);
        int evenCount = 0;
        int oddCount = 0;

        if (Num != 0) {
            for (int i = 0; i < Nums.length(); i++) {
                String a = Character.toString(Nums.charAt(i));
                int digit = Integer.parseInt(a);
                Integer A = digit; // Unboxing
                if (A % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }


        System.out.println("The provided number has " + evenCount + " even digit and " + oddCount + " odd digits");

    }
}

