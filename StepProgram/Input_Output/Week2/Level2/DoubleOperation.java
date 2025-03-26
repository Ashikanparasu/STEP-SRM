import java.util.Scanner;
class DoubleOperation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        
        Double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");

        Double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");

        Double c = scanner.nextDouble();

        Double result1 = a + (b * c); 
        Double result2 = (a * b) + c; 
        Double result3 = c + (a / b);
        Double result4 = (a % b) + c; 

        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

    }
}
