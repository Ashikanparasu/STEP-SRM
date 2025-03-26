import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numEmployees = 10;
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;
        
        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("Enter details for Employee " + i + ":");
            System.out.print("Enter salary: ");
            double salary = scanner.nextDouble();
            System.out.print("Enter years of service: ");
            double years = scanner.nextDouble();
            
            double bonus;
            if (years > 5) {
                bonus = 0.05 * salary;
            } else {
                bonus = 0.02 * salary;
            }
            double newSalary = salary + bonus;
            
            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalary;
            
            System.out.println("Employee " + i + ": Old Salary = " + salary + ", Bonus = " + bonus + ", New Salary = " + newSalary);
        }
        
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        scanner.close();
    }
}
