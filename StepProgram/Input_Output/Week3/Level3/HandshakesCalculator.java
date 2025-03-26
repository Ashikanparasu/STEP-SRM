import java.util.Scanner;
class HandshakesCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noofstudents = scanner.nextInt();

        int maxhandshakes = (noofstudents*(noofstudents-1))/2; 

        System.out.println("Possible handshakes "+ maxhandshakes);
    }}
