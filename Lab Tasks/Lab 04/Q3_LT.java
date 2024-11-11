public class Q3_LT {

    public static boolean isPalindrome(String[] str) {
        boolean isPalindrom = true;
        boolean[] isPalindrome = new boolean[str.length];

        for (int k = 0; k < str.length; k++) {
            for (int i = 0, j = str[k].length() - 1; i < str[k].length(); i++, j--) {
                if (str[k].charAt(i) == str[k].charAt(j)) {
                    isPalindrome[k] = true;
                } else {
                    isPalindrome[k] = false;
                }
            }
        }

        for(boolean r: isPalindrome){
            if (r==false){
                isPalindrom = false;
            }
        }
        return isPalindrom;
    }

    public static void main(String[] args) {
        String[] words = {"madam","racecar","dad","mom"};
        System.out.println("All the words provided in the array are palindrome : " +
                isPalindrome(words));

    }
}

