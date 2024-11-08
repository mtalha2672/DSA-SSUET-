import java.util.Scanner;

public class Q5_HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longestWordIndex = 0;
        System.out.println("Enter a sentence : ");
        String[] words = sc.nextLine().split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= (words[longestWordIndex]).length()) {
                longestWordIndex = i;
            } else {
                longestWordIndex = 0;
            }
        }
        System.out.println("The Longest word from sentence is : " + words[longestWordIndex]);
    }
}
