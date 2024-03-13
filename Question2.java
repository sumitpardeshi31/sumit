import java.util.Scanner;

public Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

               if (isLeapYearIfElse(year)) {
            System.out.println(year + " is a leap year (using if-else).");
        } else {
            System.out.println(year + " is not a leap year (using if-else).");
        }
        switch (isLeapYearSwitchCase(year)) {
            case 1:
                System.out.println(year + " is a leap year (using switch-case).");
                break;
            case 0:
                System.out.println(year + " is not a leap year (using switch-case).");
                break;
        }

        scanner.close();
    }

       public static boolean isLeapYearIfElse(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }


