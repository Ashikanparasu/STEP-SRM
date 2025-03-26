import java.util.Scanner;


class TravelComputation {
   
   public static void main(String[] args) {
    System scanner = new Scanner(System.in);
      String name = scanner.nextString();
      
      
      String fromCity = scanner.nextString();
      String viaCity = scanner.nextString();
        String toCity = scanner.nextString();

      
      double distanceFromToVia = scanner.nextString();

 
      int timeFromToVia = 4 * 60 + 4;

      
      double distanceViaToFinalCity = scanner.nextString();

     
      int timeViaToFinalCity = 4 * 60 + 25;

      
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      
      int totalTime = timeFromToVia + timeViaToFinalCity;
      System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +" is " + totalDistance + " km and " +"the Total Time taken is " + totalTime + " minutes");
}
}
