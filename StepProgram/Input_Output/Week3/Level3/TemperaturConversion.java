import java.util.Scanner;

class TemperaturConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("The "+celsius +" celsius is " +fahrenheit);

        scanner.close();
    }
}