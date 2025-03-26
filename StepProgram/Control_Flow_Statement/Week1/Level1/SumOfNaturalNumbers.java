import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (positive integer).");
        } else {
           
            int formulaSum = n * (n + 1) / 2;

            
            int whileSum = 0;
            int i = 1;
            while (i <= n) {
                whileSum += i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);

        }
        input.close();
    }
}