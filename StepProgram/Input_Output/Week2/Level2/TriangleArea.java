imoprt java.util.Scanner;
class TriangleArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in inches: ");

        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");

        double height = scanner.nextDouble();

        double areaSquareInches = 0.5 * base * height;
        double CM_PER_INCH = 2.54;

        double areaSquareCentimeters = areaSquareInches * CM_PER_INCH * CM_PER_INCH;

        System.out.printf("Area of the triangle in square inches: %.2f\n", areaSquareInches);
        System.out.printf( "Your Height in cm is” +areaSquareCentimeters +”and inches is “+ areaSquareInches);

    }
}
