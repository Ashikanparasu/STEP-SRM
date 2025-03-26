import java.util.Scanner;

public class StudentGradeCalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of students: ");
        int n = scanner.nextInt();
        
        double[][] studentMarks = new double[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.println((j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths") + " marks: ");
                    studentMarks[i][j] = scanner.nextDouble();
                } while (studentMarks[i][j] < 0);
            }
            
            percentages[i] = (studentMarks[i][0] + studentMarks[i][1] + studentMarks[i][2]) / 3.0;
            
            if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        
        System.out.println("\nStudent Grades:");
        System.out.println("Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(studentMarks[i][0] + "        " + studentMarks[i][1] + "        " + studentMarks[i][2] + "        " + percentages[i] + "        " + grades[i]);
        }
        
        scanner.close();
    }
}
