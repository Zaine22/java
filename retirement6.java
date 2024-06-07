import java.util.Scanner;

public class retirement6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ages = new int[3];


        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of employee " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }


        for (int i = 0; i < 3; i++) {
            if (ages[i] > 60) {
                System.out.println("The employee is retired.");
                break;
            } else {
                System.out.println("The employee is working now.");
            }
        }

        scanner.close();
    }
}
