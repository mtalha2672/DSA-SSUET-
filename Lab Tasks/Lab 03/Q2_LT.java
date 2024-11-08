import java.util.*;

public class Q2_LT {

    public String reverse(String str,int howManyTimes){
         if (howManyTimes <= str.length()-1){
            return reverse(str, howManyTimes +1)+str.charAt(howManyTimes);
        } else {
             return "";
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        Q2_LT obj = new Q2_LT();
        String name = sc.nextLine();
        int howManyTimes = 0;
        System.out.println("Reversed Name : "+obj.reverse(name, howManyTimes));

    }
}


