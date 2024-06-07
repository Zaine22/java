import java.util.Scanner;

public class timeConverter6 {
    
   
    public static int convertToSecond(int hour, int minute) {
        int totalSeconds = (hour * 3600) + (minute * 60);
        return totalSeconds;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of hours: ");
        int hour = scanner.nextInt();

        
        System.out.print("Enter the number of minutes: ");
        int minute = scanner.nextInt();


        int totalSeconds = convertToSecond(hour, minute);
        System.out.println(hour + " hour(s) and " + minute + " minute(s) is equal to " + totalSeconds + " seconds.");

        scanner.close();
    }
}
