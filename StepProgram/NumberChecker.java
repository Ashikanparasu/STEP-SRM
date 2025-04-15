import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        scanner.close();

        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number, digitCount);

        System.out.println("\nNumber of digits: " + digitCount);
        System.out.print("Digits array: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        System.out.println("\nIs Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(digits, number));

        int[] largestTwo = findTwoLargest(digits);
        System.out.println("Largest digit: " + largestTwo[0]);
        System.out.println("Second largest digit: " + largestTwo[1]);

        int[] smallestTwo = findTwoSmallest(digits);
        System.out.println("Smallest digit: " + smallestTwo[0]);
        System.out.println("Second smallest digit: " + smallestTwo[1]);
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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int[] digits, int number) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    public static int[] findTwoLargest(int[] digits) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > max) {
                secondMax = max;
                max = digit;
            } else if (digit > secondMax && digit != max) {
                secondMax = digit;
            }
        }
        return new int[]{max, secondMax};
    }

    public static int[] findTwoSmallest(int[] digits) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < min) {
                secondMin = min;
                min = digit;
            } else if (digit < secondMin && digit != min) {
                secondMin = digit;
            }
        }
        return new int[]{min, secondMin};
    }
}
