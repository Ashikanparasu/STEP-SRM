public class NumberCheckerUtility {

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubeOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors) - num;
        return sum == num;
    }

    public static boolean isAbundantNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors) - num;
        return sum > num;
    }

    public static boolean isDeficientNumber(int num) {
        int[] factors = findFactors(num);
        int sum = sumOfFactors(factors) - num;
        return sum < num;
    }

    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int originalNum = num;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == originalNum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 28;

        int[] factors = findFactors(num);
        System.out.println("Factors of " + num + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest factor of " + num + ": " + greatestFactor(factors));
        System.out.println("Sum of factors of " + num + ": " + sumOfFactors(factors));
        System.out.println("Product of factors of " + num + ": " + productOfFactors(factors));
        System.out.println("Product of cube of factors of " + num + ": " + productOfCubeOfFactors(factors));
        System.out.println(num + " is a perfect number: " + isPerfectNumber(num));
        System.out.println(num + " is an abundant number: " + isAbundantNumber(num));
        System.out.println(num + " is a deficient number: " + isDeficientNumber(num));
        System.out.println(num + " is a strong number: " + isStrongNumber(num));
    }
}
