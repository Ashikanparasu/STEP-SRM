import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter employee's years of service: ");
        int yearsOfService = scanner.nextInt();

        if (yearsOfService > 5) {
            double bonusPercentage = 0.05; 
            double bonusAmount = salary * bonusPercentage;
            System.out.println("Bonus Amount: " + bonusAmount);
        } else {
            System.out.println("Employee is not eligible for a bonus.");
        }

        scanner.close();
    }
}