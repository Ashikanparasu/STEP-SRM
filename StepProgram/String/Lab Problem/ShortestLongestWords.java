import java.util.Scanner;

public class ShortestLongestWords {

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
    
    public static int getLength2DArray(String[][] arr) {
        int len = 0;
        try {
            while (true) {
                String[] dummy = arr[len];
                len++;
            }
        } catch (IndexOutOfBoundsException e) {
        }
        return len;
    }

    public static int[] findShortestLongest(String[][] wordLengthArr) {
        int shortestIndex = 0;
        int longestIndex = 0;

        int size = getLength2DArray(wordLengthArr);

        for (int i = 1; i < size; i++) {
            int currentLength = Integer.parseInt(wordLengthArr[i][1]);
            int shortestLength = Integer.parseInt(wordLengthArr[shortestIndex][1]);
            int longestLength = Integer.parseInt(wordLengthArr[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }

        return new int[] {shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String inputText = sc.nextLine();

        String[] words = splitIntoWords(inputText);
        String[][] wordLengths = wordLengthArray(words);
        int[] shortestLongestIndices = findShortestLongest(wordLengths);

        System.out.println("Shortest word: " + wordLengths[shortestLongestIndices[0]][0]);
        System.out.println("Longest word: " + wordLengths[shortestLongestIndices[1]][0]);

        sc.close();
    }
}
