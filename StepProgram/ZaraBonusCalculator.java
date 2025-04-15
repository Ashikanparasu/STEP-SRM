import java.util.Random;

public class ZaraBonusCalculator {

    public static void main(String[] args) {
        int[][] employeeData = new int[10][2];
        double[][] updatedData = new double[10][3];

        generateEmployeeData(employeeData);
        calculateNewSalaryAndBonus(employeeData, updatedData);
        displaySummary(employeeData, updatedData);
    }

    public static void generateEmployeeData(int[][] employeeData) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = random.nextInt(90000) + 10000;
            employeeData[i][1] = random.nextInt(20) + 1;
        }
    }

    public static void calculateNewSalaryAndBonus(int[][] employeeData, double[][] updatedData) {
        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];  // Change to double
            int yearsOfService = employeeData[i][1];
            double bonus = 0.0;

            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05;
            } else {
                bonus = oldSalary * 0.02;
            }

            double newSalary = oldSalary + bonus;

            updatedData[i][0] = oldSalary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
    }

    public static void displaySummary(int[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        double totalBonus = 0.0;

        System.out.println("\nEmployee Salary and Bonus Details:");
        System.out.println("----------------------------------------------------------");
        System.out.println("Employee | Old Salary | Years of Service | Bonus | New Salary");

        for (int i = 0; i < 10; i++) {
            double oldSalary = updatedData[i][0];  // Change to double
            double bonus = updatedData[i][1];
            double newSalary = updatedData[i][2];
            int yearsOfService = employeeData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.println((i + 1) + "        | " + oldSalary + "      | " + yearsOfService + "             | " + bonus + "  | " + newSalary);
        }

        System.out.println("----------------------------------------------------------");
        System.out.println("Total    | " + totalOldSalary + "     | N/A             | " + totalBonus + "  | " + totalNewSalary);
    }
}
