import java.util.Scanner;

public class CharTypeFinder {

    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch < 'a' || ch > 'z') {
            return "Not a Letter";
        }
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        return "Consonant";
    }

    public static String[][] analyzeString(String text) {
        int length = getLength(text);
        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    public static void displayTable(String[][] arr) {
        System.out.println("Character\tType");
        System.out.println("---------------------");
        for (int i = 0; i < getLength2D(arr); i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }

    public static int getLength(String s) {
        int len = 0;
        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return len;
    }

    public static int getLength2D(String[][] arr) {
        int len = 0;
        try {
            while (true) {
                String[] dummy = arr[len];
                len++;
            }
        } catch (IndexOutOfBoundsException e) {}
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String[][] analysis = analyzeString(input);
        displayTable(analysis);
        sc.close();
    }
}
