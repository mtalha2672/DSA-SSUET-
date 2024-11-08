import java.util.Scanner;

public class Q2_HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = sc.nextLine();
        System.out.println("The input hash code is : " + word.hashCode());
    }
}

