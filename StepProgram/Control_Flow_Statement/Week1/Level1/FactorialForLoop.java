import java.util.Scanner;

public class FactorialForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = input.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else if (num == 0) {
            System.out.println("The factorial of 0 is 1.");
        } else {
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("The factorial of " + num + " is " + fact);
        }
        input.close();
    }
}