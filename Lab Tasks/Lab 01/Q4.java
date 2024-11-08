import java.util.Scanner;

public class Q4 {

    public String mergeAlternateOrder(String s1, String s2){
        String s3 = "";
        int times = 0;

        if (s1.length() < s2.length()){
            times = s1.length();
        } else if (s2.length() < s1.length()) {
            times = s2.length();
        } else {
            times = s1.length();
        }

        for (int i = 0; i < times; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            s3 = s3 + ((Character.toString(c1))+(Character.toString(c2)));
        }

        if (s1.length() < s2.length()){
            s3 = s3 + s2.substring(times);
        } else if (s2.length() < s1.length()) {
            s3 = s3 + s1.substring(times);
        }
        return s3;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String 1 : ");
        String s1 = sc.nextLine();
        System.out.println("Enter String 2 : ");
        String s2 = sc.nextLine();
        Q4 q = new Q4();
        String s3 = q.mergeAlternateOrder(s1, s2);
        System.out.println("Merged String : "+ s3);
    }
}
