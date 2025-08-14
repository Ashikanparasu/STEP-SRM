import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacterFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String unique = findUniqueCharacters(input);
        System.out.println("Unique characters: " + unique);
        sc.close();
    }

    private static String findUniqueCharacters(String str) {
        Set<Character> seen = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            seen.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : seen) {
            sb.append(c);
        }
        return sb.toString();
    }
}
