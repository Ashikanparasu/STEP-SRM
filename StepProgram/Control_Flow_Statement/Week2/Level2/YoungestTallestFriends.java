import java.util.Scanner;

public class YoungestTallestFriends {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get ages
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();

        // Get heights
        System.out.print("Enter Amar's height (in cm): ");
        double amarHeight = scanner.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double akbarHeight = scanner.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double anthonyHeight = scanner.nextDouble();

        // Find youngest friend
        int youngestAge = amarAge;
        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
        }

        String youngestFriend = "";
        if (youngestAge == amarAge) {
            youngestFriend += "Amar ";
        }
        if (youngestAge == akbarAge) {
            youngestFriend += "Akbar ";
        }
        if (youngestAge == anthonyAge) {
            youngestFriend += "Anthony ";
        }

        System.out.println("Youngest friend(s): " + youngestFriend.trim());

        // Find tallest friend
        double tallestHeight = amarHeight;
        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
        }

        String tallestFriend = "";
        if (tallestHeight == amarHeight) {
            tallestFriend += "Amar ";
        }
        if (tallestHeight == akbarHeight) {
            tallestFriend += "Akbar ";
        }
        if (tallestHeight == anthonyHeight) {
            tallestFriend += "Anthony ";
        }

        System.out.println("Tallest friend(s): " + tallestFriend.trim());

        scanner.close();
    }
}