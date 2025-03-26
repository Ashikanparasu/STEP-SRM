import java.util.Scanner;

class DistanceConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

     double FEET_PER_YARD = 3;
      double YARDS_PER_MILE = 1760;

        double distanceInYards = distanceInFeet / FEET_PER_YARD;

        double distanceInMiles = distanceInYards / YARDS_PER_MILE;

        System.out.println("Distance in yards: "+ distanceInYards);
        System.out.println("Distance in miles: "+ distanceInMiles);

        
    }
}

