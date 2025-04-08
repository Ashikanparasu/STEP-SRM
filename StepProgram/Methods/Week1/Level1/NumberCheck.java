import java.util.Scanner;

public class NumberCheck {

    public static int checkNumber(int num) {
        return (num > 0) ? 1 : (num < 0 ? -1 : 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int result = checkNumber(number);

        if(result == 1) {
            System.out.println("The number is positive.");
        } else if(result == -1) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
