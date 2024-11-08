import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList <Integer> (5);

        numbers.add(32);
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(100);
        Collections.sort(numbers);
        System.out.println(numbers);

        System.out.print("Enter kth Value : ");
        int kth = sc.nextInt();
        System.out.println();

        System.out.println("Kth Value : " + numbers.get(kth-1));

    }
}

