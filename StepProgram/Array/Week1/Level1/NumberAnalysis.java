import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println("The number " + numbers[i] + " is positive and even.");
                } else {
                    System.out.println("The number " + numbers[i] + " is positive and odd.");
                }
            } else if (numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        if (numbers[0] > numbers[4]) {
            System.out.println("The first number is greater than the last number.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("The first number is less than the last number.");
        } else {
            System.out.println("The first and last numbers are equal.");
        }
        scanner.close();
    }
}
