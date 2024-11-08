import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        ArrayList <Integer> numbers1 = new ArrayList<Integer>(5);
        ArrayList <Integer> numbers2 = new ArrayList<Integer>(5);
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);

        numbers2.add(6);
        numbers2.add(7);
        numbers2.add(8);
        numbers2.add(9);
        numbers2.add(10);

        ArrayList <Integer> merged = new ArrayList<Integer>(numbers1);
        merged.addAll(numbers2);

        System.out.println("Merged ArrayList : " + merged);
    }
}



