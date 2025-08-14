import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String reversed = reverse(input);
        System.out.println("Reversed string: " + reversed);
        sc.close();
    }

    private static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
