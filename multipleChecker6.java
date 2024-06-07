import java.util.Scanner;

public class multipleChecker6 {

     public static boolean isMultiple(int first, int second) {
        if (second == 0) {
            throw new IllegalArgumentException("Second integer (divisor) cannot be zero.");
        }
        return first % second == 0;
     }
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int first = scanner.nextInt();


        System.out.print("Enter the second integer: ");
        int second = scanner.nextInt();


        try {
            boolean result = isMultiple(first, second);
            System.out.println(first + " is " + (result ? "" : "not ") + "a multiple of " + second);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}