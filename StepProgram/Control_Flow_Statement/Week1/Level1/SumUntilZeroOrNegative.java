import java.util.Scanner;

public class SumUntilZeroOrNegative {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;

        System.out.println("Enter numbers to sum (enter 0 or a negative number to stop):");

        while (true) { 
            double num = input.nextDouble();

            if (num == 0 || num < 0) {
                break; 
            }

            total += num;
        }

        System.out.println("The sum of the numbers is: " + total);
        input.close();
    }
}