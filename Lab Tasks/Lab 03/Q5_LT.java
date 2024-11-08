import java.util.*;

public class Q5_LT {

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q5_LT q = new Q5_LT();
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int factorial = q.factorial(number);
        System.out.println("Factorial of " + number + " is " + factorial);
    }
}

