import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int sumOfNaturalNumbers(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a number greater than 0.");
        } else {
            int result = sumOfNaturalNumbers(n);
            System.out.println("The sum of the first " + n + " natural numbers is: " + result);
        }

        scanner.close();
    }
}
