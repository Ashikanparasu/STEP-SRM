import java.util.Scanner;

public class HandshakeCalculatorMax {
    public static int getMaxHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        int handshakeCount = getMaxHandshakes(numberOfStudents);
        System.out.println("The maximum number of handshakes possible among " + numberOfStudents + " students is: " + handshakeCount);
    }
}
