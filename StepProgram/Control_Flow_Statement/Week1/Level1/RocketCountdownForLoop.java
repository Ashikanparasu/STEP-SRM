import java.util.Scanner;

public class RocketCountdownForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting countdown value: ");
        int counter = input.nextInt();

        for (int i = counter; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Launch!");
        input.close();
    }
}