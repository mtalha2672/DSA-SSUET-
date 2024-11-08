import java.util.*;

public class Q4_HW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word: ");
        String s1 = sc.nextLine();
        ArrayList<Integer> indexOfVowels = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a') {
                indexOfVowels.add(i);
            } else if (s1.charAt(i) == 'e') {
                indexOfVowels.add(i);
            } else if (s1.charAt(i) == 'i') {
                indexOfVowels.add(i);
            } else if (s1.charAt(i) == 'o') {
                indexOfVowels.add(i);
            } else if (s1.charAt(i) == 'u') {
                indexOfVowels.add(i);
            }
        }
        ArrayList<Integer> reversedIndex = new ArrayList<>(indexOfVowels);
        Collections.reverse(reversedIndex);

        StringBuilder reversed = new StringBuilder(s1);
        for(int i = 0; i < indexOfVowels.size(); i++){
            reversed.setCharAt(indexOfVowels.get(i), s1.charAt(reversedIndex.get(i)));
        }
        System.out.println("Word with reversed vowels: " + reversed);

    }
}
