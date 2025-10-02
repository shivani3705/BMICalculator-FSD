import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for weight in pounds
        System.out.print("Enter your weight in pounds: ");
        double weightPounds = input.nextDouble();

        // Prompt user for height in inches
        System.out.print("Enter your height in inches: ");
        double heightInches = input.nextDouble();

        // Convert to metric units
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Interpret the result
        if (bmi < 18.5) {
            System.out.println("Interpretation: Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Interpretation: Normal");
        } else if (bmi < 30.0) {
            System.out.println("Interpretation: Overweight");
        } else {
            System.out.println("Interpretation: Obese");
        }

        input.close();
    }
}
