public class FindEarthVolume {

    public static void main(String args) {

        double earthRadiusKm = 6378;

        double earthRadiusMiles = earthRadiusKm * 0.621371;

        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(earthRadiusMiles, 3);

        System.out.printf("The volume of Earth in cubic kilometers is %.2f%n", volumeKm3);
        System.out.printf("The volume of Earth in cubic miles is %.2f%n", volumeMiles3);
    }
}
