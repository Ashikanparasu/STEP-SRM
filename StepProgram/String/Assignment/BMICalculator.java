import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class BMICalculator {
    private static final int TEAM_SIZE = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double[][] weightHeightData = readWeightHeightInputs(sc, TEAM_SIZE);
            String[][] bmiReport = computeBmiReport(weightHeightData);
            printReport(bmiReport);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input. Please enter numbers only.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Unexpected error: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }

    private static double[][] readWeightHeightInputs(Scanner sc, int count) {
        double[][] data = new double[count][2];
        for (int i = 0; i < count; i++) {
            System.out.print("Person " + (i + 1) + " - Enter weight (kg): ");
            double weight = sc.nextDouble();
            System.out.print("Person " + (i + 1) + " - Enter height (cm): ");
            double height = sc.nextDouble();
            if (weight <= 0 || height <= 0) {
                throw new IllegalArgumentException("Height and Weight must be positive values.");
            }
            data[i][0] = weight;
            data[i][1] = height;
        }
        return data;
    }

    private static String[][] computeBmiReport(double[][] data) {
        String[][] report = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = calculateBmi(weight, height);
            String status = determineBmiStatus(bmi);
            report[i][0] = String.format(Locale.US, "%.2f", weight);
            report[i][1] = String.format(Locale.US, "%.1f", height);
            report[i][2] = String.format(Locale.US, "%.2f", bmi);
            report[i][3] = status;
        }
        return report;
    }

    private static double calculateBmi(double weightKg, double heightCm) {
        double heightMeters = heightCm / 100.0;
        return weightKg / (heightMeters * heightMeters);
    }

    private static String determineBmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25.0) return "Normal";
        if (bmi < 30.0) return "Overweight";
        return "Obese";
    }

    private static void printReport(String[][] report) {
        System.out.printf("%-10s %-10s %-10s %-12s%n", "Weight", "Height", "BMI", "Status");
        System.out.println("---------------------------------------------");
        for (String[] row : report) {
            System.out.printf("%-10s %-10s %-10s %-12s%n", row[0], row[1], row[2], row[3]);
        }
    }
}
