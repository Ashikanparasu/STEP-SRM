import java.util.Scanner;

public class SumUntilZeroWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double num;

        System.out.println("Enter numbers to sum (enter 0 to stop):");

       
        num = input.nextDouble();

        while (num != 0) {
            total += num;

          
            num = input.nextDouble();
        }

        System.out.println("The sum of the numbers is: " + total);
        input.close();
    }
}