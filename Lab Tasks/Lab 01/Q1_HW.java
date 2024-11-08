public class Q1_HW {
    public static void main(String[] args) {
        int num1 = 23;
        Integer num2 = num1;
        System.out.println("Auto Boxing Implemented : " + num2);

        // Different Methods of Wrapper Class

        String a = Integer.toString(12);
        System.out.println(a);
        int b = Integer.parseInt(a);
        System.out.println(b);
        int max = Integer.max(23, 78);
        System.out.println("Maximum Number : " + max);
        int min = Integer.min(23, 78);
        System.out.println("Minimum Number : " + min);
        int comparizaon = Integer.compare(23,23);
        System.out.println("Compare Number Result : " + comparizaon);
    }
}

