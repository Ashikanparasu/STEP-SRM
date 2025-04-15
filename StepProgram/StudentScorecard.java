import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        if (numStudents <= 0) {
            System.out.println("Please enter a positive number of students.");
            scanner.close();
            return;
        }

        int[][] studentScores = generateScores(numStudents, random);
        double[][] studentResults = calculateResults(studentScores);
        displayScorecard(studentScores, studentResults);

        scanner.close();
    }

    public static int[][] generateScores(int numStudents, Random random) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(90) + 10;
            scores[i][1] = random.nextInt(90) + 10;
            scores[i][2] = random.nextInt(90) + 10;
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (average * 100) / 100;

            results[i][0] = roundToTwoDecimal(total);
            results[i][1] = roundToTwoDecimal(average);
            results[i][2] = roundToTwoDecimal(percentage);
        }
        return results;
    }

    public static double roundToTwoDecimal(double value) {
        return Math.round(value * 100.0) / 100.0;
    }

    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\n+------------+---------+-----------+--------+---------+------------+");
        System.out.println("| Student ID | Physics | Chemistry | Math   | Total   | Percentage |");
        System.out.println("+------------+---------+-----------+--------+---------+------------+");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("| %-10d | %-7d | %-9d | %-6d | %-7.2f | %-10.2f |\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2], results[i][0], results[i][2]);
        }

        System.out.println("+------------+---------+-----------+--------+---------+------------+");

        double overallTotalSum = 0;
        for (double[] result : results) {
            overallTotalSum += result[0];
        }
        double overallAverage = roundToTwoDecimal(overallTotalSum / (scores.length * 3));
        double overallPercentage = roundToTwoDecimal((overallAverage * 100) / 100);

        System.out.println("\nOverall Average Score: " + overallAverage);
        System.out.println("Overall Percentage: " + overallPercentage + "%");
    }
}