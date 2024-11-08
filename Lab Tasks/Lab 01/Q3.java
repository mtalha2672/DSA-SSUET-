public class Q3 {
    public static void main(String[] args) {

        String s1 = "Welcome";
        String s2 = "To";
        String s3 = "SirSyed";
        String s4 = "University";
        String s5 = "Karachi";

        // Concatenation

        String Concatenated = s1 + s2 + s3 + s4 + s5;
        System.out.println("Concatenated String : "+ Concatenated);

        // Upper Case

        System.out.println("Upper Case: "+s4.toUpperCase());

        // Substring

        String s6 = Concatenated.substring(8);
        System.out.println("Substring: "+s6);
    }
}


