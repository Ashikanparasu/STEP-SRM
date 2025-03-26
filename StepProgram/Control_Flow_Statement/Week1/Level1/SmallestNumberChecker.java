import java.util.Scanner;

class SmallestNumberChecker{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter The First Number : ");
        int number1 = input.nextInt();

        System.out.print("Enter The Second Number : ");
        int number2 = input.nextInt();

        Sysem.out.print("Enter The Third Number : ");
        int number2 = input.nextInt();

        boolean isSmallest = (number1 <= number2) && (number1 <= number3);

        System.out.println("Is the first number the Smallest? " + isSmallest);

        input.close();

    }
}