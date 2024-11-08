import java.util.*;
public class Q4_HT {
    public int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        Q4_HT obj = new Q4_HT();
        int gcd = obj.GCD(a,b);
        System.out.println("The GCD of " + a + " and " + b + " is " + gcd);
    }
}

