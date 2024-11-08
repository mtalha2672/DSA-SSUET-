import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector <Integer> numbers = new Vector <Integer>(10);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter a number: ");
            numbers.add(sc.nextInt());
        }
        System.out.println("The Vector elements are : "+ numbers);
        System.out.println();

        // For sum

        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum =  sum + numbers.get(i);
        }
        System.out.println("The sum of numbers are : "+ sum);

        // For maximum number

        Collections.sort(numbers);
        System.out.println("Maximum Number : " + numbers.get(numbers.size()-1));

    }
}

