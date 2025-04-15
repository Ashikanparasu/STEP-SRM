import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];
        double m = (y2 - y1) / (x2 - x1); // Slope (m)
        double b = y1 - m * x1;           // Y-intercept (b)

        equation[0] = m;
        equation[1] = b;

        return equation;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coordinates of first point (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates of second point (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance between the points: " + distance);

        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);
    }
}
