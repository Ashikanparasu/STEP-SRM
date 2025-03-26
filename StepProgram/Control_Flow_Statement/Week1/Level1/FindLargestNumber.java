import java.util.Scanner;

class FindLargestNumber{

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The First Number : ");
        int number1 = input.nextInt();

        System.out.print("Enter The Second Number : ");
        int number2 = input.nextInt();

        System.out.print("Enter The Third Number : ");
        int number3 = input.nextInt();

        boolean isNumber1Largest = (number1 >= number2) && (number1 >= number3);
        boolean isNumber2Largest = (number2 >= number1) && (number2 >= number3);
        boolean isNumber3Largest = (number3 >= number1) && (number3 >= number2);

        System.out.println("Is the first number the largest? " + isNumber1Largest);
        System.out.println("Is the second number the largest? " + isNumber2Largest);
        System.out.println("Is the third number the largest? " + isNumber3Largest);

        input.close();

    }
}