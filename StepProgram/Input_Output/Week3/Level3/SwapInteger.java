import java.util.Scanner;

class SwapInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int number3 = number1;
        number1 = number2;

        System.out.println("The swapped number are"+ number1+ " and "+ number3);  
    }}