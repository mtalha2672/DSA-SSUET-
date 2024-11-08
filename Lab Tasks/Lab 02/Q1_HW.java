import java.util.*;
public class Q1_HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<Integer>(5);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number : ");
            numbers.add(sc.nextInt());
        }
        // Sorting
        Collections.sort(numbers);
        System.out.println("Sorted Vector : " + numbers);

        // Smallest number
        System.out.println("Smallest Number : " + numbers.getFirst());

        // Largest number
        System.out.println("Largest Number : " + numbers.getLast());
    }
}

