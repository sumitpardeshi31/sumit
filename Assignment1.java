import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter numerical grade: ");
        double numericalGrade = scanner.nextDouble();
        char letterGrade = numericalToLetterGrade(numericalGrade);


        System.out.println("Letter grade: " + letterGrade);

        scanner.close();
    }

   {
        if (grade >= 90) {
            return 'A';
        } else if (grade >= 80) {
            return 'B';
        } else if (grade >= 70) {
            return 'C';
        } else if (grade >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
