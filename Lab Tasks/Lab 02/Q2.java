import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> words = new ArrayList <String>(5);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a word: ");
            words.add(sc.nextLine());
        }
        System.out.println();

        boolean condition = true;

        while(condition){
            System.out.println("Press \"1\" : For displaying all the words");
            System.out.println("Press \"2\" : For displaying the longest word");
            System.out.println("Press \"3\" : For Exit");
            System.out.println();
            int user = sc.nextInt();
            System.out.println();
            int longestWordIndex = 0;
            switch (user){
                case 1:
                    for (int i = 0, j=1; i < 5; i++,j++) {
                        System.out.println("Word : "+words.get(i));
                    }
                    System.out.println();
                    break;
                case 2:
                    for (int i = 0; i < words.size(); i++) {
                        if (words.get(i).length() >= (words.get(longestWordIndex).length())) {
                            longestWordIndex = i;
                        }
                    }
                    System.out.println("The Longest word is : " + words.get(longestWordIndex));
                    break;
                case 3:
                    condition = false;
            }
        }
    }
}
