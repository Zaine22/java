import java.util.Scanner;

public class salary5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] basicSalaries = new double[5];
        double[] grossSalaries = new double[5];

       
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter basic salary of employee " + (i + 1) + ": ");
            basicSalaries[i] = scanner.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            double hra, da;
            double basic = basicSalaries[i];

            if (basic <= 10000) {
                hra = basic * 0.20;
                da = basic * 0.80;
            } else if (basic <= 20000) {
                hra = basic * 0.25;
                da = basic * 0.90;
            } else {
                hra = basic * 0.30;
                da = basic * 0.95;
            }

            grossSalaries[i] = basic + hra + da;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Gross salary of employee " + (i + 1) + ": " + grossSalaries[i]);
        }

        scanner.close();
    }
}
