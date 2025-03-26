import java.util.Scanner;
class Division{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int mod = number1 % number2;
        int div = number1 / number2;
        
        System.out.println("The Quotient is "+ div +" and Reminder is "+ mod + " of two number "+ number1+ " and " + number2);
    }
}
