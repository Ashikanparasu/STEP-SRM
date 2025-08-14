import java.util.Scanner;

public class WordLengthSplitter {

    public static String[] splitIntoWords(String text) {
        int wordCount = 0;
        boolean inWord = false;
        for (int i = 0; i < getLength(text); i++) {
            char ch = text.charAt(i);
            if (ch != ' ' && !inWord) {
                inWord = true;
                wordCount++;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        int start = -1;
        for (int i = 0; i <= getLength(text); i++) {
            if (i < getLength(text) && text.charAt(i) != ' ' && start == -1) {
                start = i;
            }
            if ((i == getLength(text) || text.charAt(i) == ' ') && start != -1) {
                words[index++] = substringCustom(text, start, i);
                start = -1;
            }
        }
        return words;
    }

    public static int getLength(String s) {
        int len = 0;
        try {
            while (true) {
                s.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return len;
    }

    public static String substringCustom(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }

    public static String[][] wordLengthArray(String[] words) {
        String[][] result = new String[getLengthArray(words)][2];
        for (int i = 0; i < getLengthArray(words); i++) {
            result[i][0] = words[i];
            int lengthOfWord = getLength(words[i]);
            result[i][1] = String.valueOf(lengthOfWord);
        }
        return result;
    }

    public static int getLengthArray(String[] arr) {
        int len = 0;
        try {
            while (true) {
                String dummy = arr[len];
                len++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String inputText = sc.nextLine();
        String[] words = splitIntoWords(inputText);
        String[][] wordLengths = wordLengthArray(words);
        System.out.println("\nWord\tLength");
        System.out.println("--------------");
        for (int i = 0; i < getLengthArray(wordLengths); i++) {
            String word = wordLengths[i][0];
            int length = Integer.parseInt(wordLengths[i][1]);
            System.out.println(word + "\t" + length);
        }
        sc.close();
    }
}
