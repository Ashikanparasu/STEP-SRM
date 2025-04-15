import java.util.Arrays;
import java.util.Scanner;

public class DigitUtility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        int digitCount = countDigits(number);
        int[] originalDigits = getDigitsArray(number, digitCount);
        int[] reversedDigits = reverseArray(originalDigits);

        System.out.println("\nNumber of digits: " + digitCount);
        System.out.print("Original digits: ");
        printArray(originalDigits);

        System.out.print("Reversed digits: ");
        printArray(reversedDigits);

        boolean isSame = arraysEqual(originalDigits, reversedDigits);
        boolean isPalindrome = isPalindrome(originalDigits);
        boolean isDuck = isDuckNumber(originalDigits);

        System.out.println("Are both arrays equal? " + isSame);
        System.out.println("Is Palindrome? " + isPalindrome);
        System.out.println("Is Duck Number? " + isDuck);
    }

    public static int countDigits(int number) {
        return Integer.toString(number).length();
    }

    public static int[] getDigitsArray(int number, int size) {
        int[] digits = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void printArray(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
