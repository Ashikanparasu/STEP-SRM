import java.util.Scanner;

public class FeeDiscount {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student fee (INR): ");

        double fee = input.nextDouble();

        System.out.print("Enter the university discount percentage: ");
        
        double discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f%n", discount, finalFee);

    }
}
