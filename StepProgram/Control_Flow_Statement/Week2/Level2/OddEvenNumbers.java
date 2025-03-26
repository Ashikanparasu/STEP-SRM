import java.util.Scanner;

public class OddEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Odd numbers:");
            for (int i = 1; i <= number; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("\nEven numbers:");
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
            
        }

        scanner.close();
    }
}