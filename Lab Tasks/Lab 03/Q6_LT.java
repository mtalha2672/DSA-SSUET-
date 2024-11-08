import java.util.*;

public class Q6_LT {
    int count = 0;

    public void countDigits(int numberlength,int n) {
        if (n <= numberlength) {
            count++;
            countDigits(numberlength,n+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Q6_LT q = new Q6_LT();

        System.out.print("Enter a number : ");
        String number = sc.nextLine();
        int howManyTimes = 0;
        int numberLength = number.length() - 1;
        q.countDigits(numberLength, howManyTimes);
        System.out.println("The digit count of the provided numbers are : "+q.count);

    }
}


