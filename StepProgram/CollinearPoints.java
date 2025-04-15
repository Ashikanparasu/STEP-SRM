public class CollinearPoints {

    public static boolean areCollinearSlope(Point p1, Point p2, Point p3) {
        double slope12;
        double slope23;

        if (p2.x - p1.x == 0) {
            if (p3.x - p2.x == 0) {
                return true;
            } else {
                return false;
            }
        } else if (p3.x - p2.x == 0) {
            return false;
        } else {
            slope12 = (double) (p2.y - p1.y) / (p2.x - p1.x);
            slope23 = (double) (p3.y - p2.y) / (p3.x - p2.x);
            return Math.abs(slope12 - slope23) < 1e-9;
        }
    }

    public static boolean areCollinearArea(Point p1, Point p2, Point p3) {
        double area = 0.5 * Math.abs(p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y));
        return area < 1e-9;
    }

    public static void main(String[] args) {
        Point pointA = new Point(2, 4);
        Point pointB = new Point(4, 6);
        Point pointC = new Point(6, 8);

        if (areCollinearSlope(pointA, pointB, pointC)) {
            System.out.println("Points " + pointA + ", " + pointB + ", and " + pointC + " are collinear (using slope).");
        } else {
            System.out.println("Points " + pointA + ", " + pointB + ", and " + pointC + " are not collinear (using slope).");
        }

        if (areCollinearArea(pointA, pointB, pointC)) {
            System.out.println("Points " + pointA + ", " + pointB + ", and " + pointC + " are collinear (using area).");
        } else {
            System.out.println("Points " + pointA + ", " + pointB + ", and " + pointC + " are not collinear (using area).");
        }

        Point pointD = new Point(1, 1);
        Point pointE = new Point(2, 3);
        Point pointF = new Point(4, 1);

        if (areCollinearSlope(pointD, pointE, pointF)) {
            System.out.println("Points " + pointD + ", " + pointE + ", and " + pointF + " are collinear (using slope).");
        } else {
            System.out.println("Points " + pointD + ", " + pointE + ", and " + pointF + " are not collinear (using slope).");
        }

        if (areCollinearArea(pointD, pointE, pointF)) {
            System.out.println("Points " + pointD + ", " + pointE + ", and " + pointF + " are collinear (using area).");
        } else {
            System.out.println("Points " + pointD + ", " + pointE + ", and " + pointF + " are not collinear (using area).");
        }
    }
}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}