import java.util.Scanner;
 class TriangularCalculation{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();
        double totalDistance = 5000; // 5 km in meters

        // Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Calculate the number of rounds
        double rounds = totalDistance / perimeter;

        System.out.println("The total number of rounds the athlete will run is: "+ rounds);
    }}