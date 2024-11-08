public class Q1 {
    public static void main(String[] args) {

        String s1 = "1";
        String s2 = "2";
        String s3 = "3";
        String s4 = "4";
        String s5 = "5";


        String S1 = new String("1");
        String S2 = new String("2");
        String S3 = new String("3");
        String S4 = new String("4");
        String S5 = new String("5");

        // Before intern method

        boolean result = s1 == S1;
        System.out.println(result);

        // After intern method

        S1 = S1.intern();
        S2 = S2.intern();
        S3 = S3.intern();
        S4 = S4.intern();
        S5 = S5.intern();

        result = s1 == S1;
        System.out.println(result);

        // For String immutability

        // Before Modification
        System.out.println(s1);

        s1 = s1.concat("number"); // Hence string are immutable, this will create a new copy
                                     //  of s1 along with the modification
        // After Modification
        System.out.println(s1);
    }
}


