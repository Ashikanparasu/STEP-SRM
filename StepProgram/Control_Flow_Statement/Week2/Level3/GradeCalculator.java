import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter marks for Physics: ");
        double physics = scanner.nextDouble();
        
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = scanner.nextDouble();
        
        System.out.print("Enter marks for Maths: ");
        double maths = scanner.nextDouble();
        
        scanner.close();
        
        double average = (physics + chemistry + maths) / 3;
        
        System.out.printf("Average Marks: %.2f\n", average);
        
        if (average >= 80) {
            System.out.println("Grade: A (Level 4, above agency-normalized standards)");
        } else if (average >= 70) {
            System.out.println("Grade: B (Level 3, at agency-normalized standards)");
        } else if (average >= 60) {
            System.out.println("Grade: C (Level 2, below, but approaching agency-normalized standards)");
        } else if (average >= 50) {
            System.out.println("Grade: D (Level 1, well below agency-normalized standards)");
        } else if (average >= 40) {
            System.out.println("Grade: E (Level 1-, too below agency-normalized standards)");
        } else {
            System.out.println("Grade: R (Remedial standards)");
        }
    }
}
