import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);


        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal weight";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        // Printing the BMI and category
        System.out.println("Your BMI is: " + bmi);
        System.out.println("Category: " + category);

        scanner.close();
    }
}
