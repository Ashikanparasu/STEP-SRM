import java.util.Scanner; 

class MileToKilometerConverter{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mile1= 1.6;

        double km = input.nextInt();

        double Mile = mile1* km;

        System.out.println( "The total miles is " + Mile + "mile for the given " + km +"km");
    }
}
