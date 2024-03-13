import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a number representing a weekday (1-7): ");
        int dayNumber = scanner.nextInt();

        String weekdayName;
        switch (dayNumber) {
            case 1:
                weekdayName = "Sunday";
                break;
            case 2:
                weekdayName = "Monday";
                break;
            case 3:
                weekdayName = "Tuesday";
                break;
            case 4:
                weekdayName = "Wednesday";
                break;
            case 5:
                weekdayName = "Thursday";
                break;
            case 6:
                weekdayName = "Friday";
                break;
            case 7:
                weekdayName = "Saturday";
                break;
            default:
                weekdayName = "Invalid day number";
        }


        System.out.println("Weekday: " + weekdayName);

        scanner.close();
    }
}
