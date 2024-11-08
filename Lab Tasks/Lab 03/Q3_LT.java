import java.util.Scanner;

public class Q3_LT {

    public int sum(int n){
        if (n==0) {
            return 0;
        } else {
            return n + sum(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int N = sc.nextInt();
        Q3_LT q = new Q3_LT();
        int sum = q.sum(N);
        System.out.println("The sum of the numbers is : "+sum);
    }
}

