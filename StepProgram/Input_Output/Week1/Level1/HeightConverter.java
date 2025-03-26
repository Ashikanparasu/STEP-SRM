import java.util.Scanner;

class HeightConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        
        double heightCm = scanner.nextDouble();

        final double CM_PER_INCH = 2.54;
        final double INCHES_PER_FOOT = 12;

        double heightInches = heightCm / CM_PER_INCH;

        int feet = (int) (heightInches / INCHES_PER_FOOT);

        double remainingInches = heightInches % INCHES_PER_FOOT;

        // Print the result
        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", heightCm, feet, remainingInches);

    }
}
