import java.util.Scanner;

public class FootballTeamStats {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height (in cm) of 11 players (between 150 and 250):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = scanner.nextInt();

            while (heights[i] < 150 || heights[i] > 250) {
                System.out.print("Invalid input. Please enter a height between 150 and 250: ");
                heights[i] = scanner.nextInt();
            }
        }

        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\nPlayer heights:");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println("\n\nTotal height sum: " + sum + " cm");
        System.out.println("Mean height: " + mean + " cm");
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tallest + " cm");

        scanner.close();
    }

    public static int findSum(int[] array) {
        int sum = 0;
        for (int height : array) {
            sum += height;
        }
        return sum;
    }

    public static double findMean(int[] array) {
        return (double) findSum(array) / array.length;
    }

    public static int findShortest(int[] array) {
        int min = array[0];
        for (int height : array) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    public static int findTallest(int[] array) {
        int max = array[0];
        for (int height : array) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }
}
