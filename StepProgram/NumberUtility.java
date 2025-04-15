import java.util.Scanner;

public class NumberUtility {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number, digitCount);

        System.out.println("\nNumber of digits: " + digitCount);
        System.out.print("Digits array: ");
        printArray(digits);

        int digitSum = sumOfDigits(digits);
        int squareSum = sumOfSquares(digits);
        boolean isHarshad = isHarshadNumber(number, digitSum);
        int[][] frequency = digitFrequency(digits);

        System.out.println("Sum of digits: " + digitSum);
        System.out.println("Sum of squares of digits: " + squareSum);
        System.out.println("Is Harshad number: " + isHarshad);

        System.out.println("Digit frequencies:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " -> " + frequency[i][1] + " time(s)");
            }
        }
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

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshadNumber(int number, int digitSum) {
        return number % digitSum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; // digit
            freq[i][1] = 0; // frequency
        }

        for (int digit : digits) {
            freq[digit][1]++;
        }

        return freq;
    }

    public static void printArray(int[] array) {
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
