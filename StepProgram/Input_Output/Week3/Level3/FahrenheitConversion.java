import java.util.Scanner;

class FahrenheitConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double Fahrenheit= scanner.nextDouble();


        double celsius = (Fahrenheit-32)*5/9;

        System.out.println("The "+Fahrenheit+" fahrenheit is " + celsius+" celsius");

        scanner.close();
    }
}