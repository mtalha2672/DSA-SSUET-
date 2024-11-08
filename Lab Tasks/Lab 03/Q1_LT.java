import java.util.*;
public class Q1_LT {

    public void displayNumber(int n){
        if (n != 0){
            System.out.println(n);
            displayNumber(n-1);
        } else {
            System.out.println(0);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int user = sc.nextInt();
        Q1_LT obj = new Q1_LT();
        obj.displayNumber(user);
    }
}

