import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        
        // Prime numbers are greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to number/2
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit loop early if a divisor is found
                }
            }
        }
        
        // Print result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }
}
