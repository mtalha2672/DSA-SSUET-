import java.util.Scanner;

public class Q3_HW{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid number : ");
        int num = sc.nextInt();
        Integer Num = num; // Auto Boxing

        // Absolute Value
        Integer absolute = Math.abs(Num);
        System.out.println("Absolute Value of the number is : "+absolute);

        // Square Root
        Double squareRoot = Math.sqrt(Num);
        System.out.println("Sqare Root of the number is : "+squareRoot);

        // Power

        System.out.println("Enter a valid number for power : ");
        int pow = sc.nextInt();
        Integer Pow = pow;      // Auto boxing
        Double power = Math.pow(Num,pow);
        System.out.println("Power of the number is : "+power);

    }
}
