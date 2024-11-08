import java.util.*;
public class Q3_HT {
    public boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            System.out.println("YES");
            return true;
        }
        if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            System.out.println("NOT");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Palindrome Word: ");
        String word = sc.nextLine();
        Q3_HT obj = new Q3_HT();
        obj.isPalindrome(word);
    }
}

