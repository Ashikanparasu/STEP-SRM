import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer (n): ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (positive integer).");
        } else {
          
            int formulaSum = n * (n + 1) / 2;

          
            int forSum = 0;
            for (int i = 1; i <= n; i++) {
                forSum += i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forSum);

   
        input.close();
    }
}